package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class IdGenerator {

    private static ArrayList<Integer> myId = new ArrayList<Integer>() ;
    private static int count = 0 ;


    public static void generator (){

        for ( int i = 1234 ; i < 9999 ; i++){
            myId.add(i);
        }
        Collections.shuffle(myId);

    }

    public static Integer id(){

        return myId.get(count++);
    }

}
