package com.dicoding.picodiploma.manutdplayer.model;



import androidx.annotation.NonNull;



import android.view.View;
import android.widget.AdapterView;

import androidx.recyclerview.widget.RecyclerView;

public class ItemClickSupport {
    private final RecyclerView recyclerView;
    private OnItemClickListener onItemClickListener;
    private OnItemLongClickListener onItemLongClickListener;
    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mOnClickListener != null) {
                RecyclerView.ViewHolder holder = recyclerView.getChildViewHolder(v);
                onItemClickListener.onItemClicked(recyclerView, holder.getAdapterPosition(), v);
            }
        }
    };

    private View.OnLongClickListener mOnLongClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            if (mOnLongClickListener != null) {
                RecyclerView.ViewHolder holder = recyclerView.getChildViewHolder(v);
                return onItemLongClickListener.onLongClicked(recyclerView, holder.getAdapterPosition(), v);

            }

            return false;
        }
    };

    private RecyclerView.OnChildAttachStateChangeListener attachStateChangeListener = new RecyclerView.OnChildAttachStateChangeListener() {
        @Override
        public void onChildViewAttachedToWindow(@NonNull View view) {
            if (mOnClickListener != null) {
                view.setOnClickListener(mOnClickListener);
            } else if (mOnLongClickListener != null) {
                view.setOnLongClickListener(mOnLongClickListener);
            }
        }

        @Override
        public void onChildViewDetachedFromWindow(@NonNull View view) {

        }
    };



    private ItemClickSupport(RecyclerView recyclerView1) {
        recyclerView = recyclerView1;
        recyclerView.setTag(R.id.item_click_support, this);
        recyclerView.addOnChildAttachStateChangeListener(attachStateChangeListener);

    }

    public static ItemClickSupport addTo(RecyclerView recyclerView2) {
        ItemClickSupport iSup = (ItemClickSupport) recyclerView2.getTag(R.id.item_click_support);
        if (iSup == null) {
            iSup = new ItemClickSupport(recyclerView2);

        }
        return iSup;


    }

    private void detach(RecyclerView rv) {
        rv.removeOnChildAttachStateChangeListener(attachStateChangeListener);
        rv.setTag(R.id.item_click_support, null);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        onItemClickListener = listener;

    }


    public void setOnItemLongClickListener(OnItemLongClickListener listener) {
        onItemLongClickListener = listener;

    }


    public interface OnItemClickListener {
        void onItemClicked(RecyclerView recyclerView, int position, View v);

    }


    public interface OnItemLongClickListener {
        boolean onItemLongClicked(RecyclerView recyclerView, int position, View v);

        boolean onLongClicked(RecyclerView recyclerView, int adapterPosition, View v);

    }


}




