package com.codewars.task1;

public class Kata {
    public static String rps(String p1 , String p2) {
        String p1Won="Player 1 won!";
        String p2Won="Player 2 won!";
        String draw="Draw!";
        if (p1.equals(p2)) {
           return draw;
        }
        if(p1.equals("scissors")&&p2.equals("paper"))
        {
            return p1Won;
        }
        if(p1.equals("scissors")&&p2.equals("rock")){
            return p2Won;
        }
        if(p1.equals("rock")&&p2.equals("paper")){
            return p2Won;
        }
        if(p1.equals("rock")&&p2.equals("scissors")){
            return p1Won;
        }
        if(p1.equals("paper")&&p2.equals("rock")){
            return p1Won;
        }
        if(p1.equals("paper")&&p2.equals("scissors")){
            return p2Won;
        }
return null;
    }

}
