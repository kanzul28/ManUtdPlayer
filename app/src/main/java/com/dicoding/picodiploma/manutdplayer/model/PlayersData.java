package com.dicoding.picodiploma.manutdplayer.model;

import java.util.ArrayList;
import java.util.Collection;



public class PlayersData {
    private static String[] playernames={
            "David De Gea",
            "Sergio Romero",
            "Victor Lindelof",
            "Harry Maguire",
            "Aaron Wan Bissaka",
            "Daniel James",
            "Paul Pogba",
            "Juan Mata",
            "Anthony Martial",
            "Marcus Rashford"

    };

    private static String[] playerDetails={
            "Marvelous and talented, David de Gea is a Spanish professional soccer player who was born on 7 November 1990 in Madrid, Spain. He plays as the goalkeeper for Premier League Club Manchester United and his National team Spain.",
            "Sergio Germán Romero (Spanish pronunciation: [ˈseɾxjo xeɾˈman roˈmeɾo]; born 22 February 1987) is an Argentine professional footballer who plays as a goalkeeper for English Premier League club Manchester United and the Argentina national team.\n" +
                    "\n" +
                    "He made his debut with Racing Club in the Argentine Primera División in 2007 and then transferred to Dutch club AZ at the end of the season. He won the Eredivisie in 2009 and two years later joined Italian side Sampdoria. In 2013, he joined Monaco on a season-long loan. He joined Manchester United in July 2015.\n" +
                    "\n" +
                    "Romero is the most capped goalkeeper in the history of the Argentine national team,[3] playing over 90 times since his debut in 2009. He has represented Argentina at two World Cups and at three Copa América tournaments, finishing as runner-up in the 2014 FIFA World Cup, as well as in the 2015 and the 2016 Copa América tournaments. He also was part of the team that won gold at the 2008 Olympics.",
            "Lindelof started his professional career at Swedish club Vasteras SK in 2009 following a stint in the youth team.\n" +
                    "\n" +
                    "Victor completed a move to Portuguese side Benfica in 2011 where he blossomed into one of Europe’s most promising centre-halves.\n" +
                    "\n" +
                    "The Swedish defender won three Portuguese titles and three Portuguese Cups during six seasons at Benfica.\n" +
                    "\n" +
                    "Lindelof completed a £30m move to Manchester United in the 2017 summer transfer window.\n" +
                    "\n" +
                    "\n" +
                    "He made his debut for the Sweden national team in a 2-1 loss to Turkey on 26 March 2014.",
            "Jacob Harry Maguire (born 5 March 1993) is an English professional footballer who plays as a centre-back for Premier League club Manchester United and the England national team.\n" +
                    "\n" +
                    "Born in Sheffield, he came through the youth system at Sheffield United before graduating to the first team in 2011. He totalled 166 professional games for the Blades and was their Player of the Year three consecutive times, also featuring in the PFA Team of the Year for League One as many times. In 2014, he transferred to Hull City for £2.5 million, who loaned him to Wigan Athletic in 2015. He joined Leicester City in 2017 for an initial fee of £12 million. Two years later, he moved to Manchester United for a fee believed to be £80 million, a world-record fee for a defender.\n" +
                    "\n" +
                    "Maguire played one match for England under-21 in 2012. In October 2017, he made his senior debut, and he was chosen for the 2018 FIFA World Cup squad.",
            "Aaron Wan-Bissaka (born 26 November 1997) is a professional footballer who plays as a right-back for Premier League club Manchester United and the England under-21 national team.\n" +
                    "\n" +
                    "Wan-Bissaka began his career with Crystal Palace and was named as the club's Player of the Year for the 2018–19 season. In 2019, he moved to Manchester United for an initial fee of £45 million, with another £5 million due in potential bonuses.\n" +
                    "\n" +
                    "He is of Congolese descent and made one appearance for DR Congo U20s in 2015. He has gone on to represent the country of his birth, England, at under-20 and under-21 levels.",
            "Daniel Owen James (born 10 November 1997) is a professional footballer who plays as a winger for Premier League club Manchester United and the Wales national team.",
            "Paul Labile Pogba (French pronunciation: \u200B[pɔl pɔgba]; born 15 March 1993) is a French professional footballer who plays for Premier League club Manchester United and the French national team. He operates primarily as a central midfielder, but can also be deployed as an attacking midfielder, defensive midfielder, and deep-lying playmaker.",
            "Juan Manuel Mata García (Spanish pronunciation: [xwam ˈmata]; born 28 April 1988) is a Spanish professional footballer who plays as a midfielder for Premier League club Manchester United and the Spain national team. He mostly plays as a central attacking midfielder, but he can also play on the wing.",
            "Anthony Jordan Martial (French pronunciation: \u200B[maʁsjal]; born 5 December 1995) is a French professional footballer who plays as a forward for Premier League club Manchester United and the France national team. He was the recipient of the 2015 Golden Boy Award for the best under-21 player in Europe.",
            "Marcus Rashford (born 31 October 1997) is an English professional footballer who plays as a forward for Premier League club Manchester United and the England national team."





    };

    private static int[] playerImages ={
            R.drawable.de_gea,
            R.drawable.sergio_romero,
            R.drawable.victor_lindelof,
            R.drawable.harry_maguire,
            R.drawable.wan_bissaka,
            R.drawable.daniel_james,
            R.drawable.paul_pogba,
            R.drawable.juan_mata,
            R.drawable.anthony_martial,
            R.drawable.marcus_rashford


    };

    static ArrayList<Player> getListData() {
        ArrayList<Player> list = new ArrayList<>();
        for (int position = 0; position < playernames.length; position++) {
            Player player = new Player();
            player.setName(playernames[position]);
            player.setDetail(playerDetails[position]);
            player.setPhoto(playerImages[position]);
            list.add(player);

        }
        return list;


    }
}
