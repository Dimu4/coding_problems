package com.example.borysgurtovyi.codinginterviewprep;

/**
 * Created by idorovskikh on 3/10/18.
 */

public class JudgeCircle {

    public boolean judgeCircle(String moves) {
        int hor = 0;
        int vert = 0;
        for(int i =0; i< moves.length();i++) {
            char ch = moves.charAt(i);
            switch (ch) {
                case 'R':
                    hor++;
                    break;
                case 'L':
                    hor--;
                    break;
                case 'U':
                    vert++;
                    break;
                case 'D':
                    vert--;
                    break;
            }
        }
        return hor == 0 && vert == 0;
    }

}
