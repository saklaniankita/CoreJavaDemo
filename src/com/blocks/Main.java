package com.blocks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Don't alter anything here.
        Scanner inp = new Scanner(System.in);
        String S = inp.nextLine();
        int L = inp.nextInt();
        inp.nextLine();
        int R = inp.nextInt();
        inp.nextLine();
        inp.close();
        
        System.out.println(solve(S,L,R));
        /**************************************/
    }
    
    //complete the function below
    
    public static String solve(String s, int L, int R)
    {
        String s1 = s.substring(L,R+1);
        String s2 = new StringBuffer(s1).reverse().toString();
        return new StringBuffer(s).replace(L, R +1, s2).toString();


    }
}