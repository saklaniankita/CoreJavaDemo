package com.abstractclass;


/**
 * This class does not implement the interface method but still no compilation error.
 * Because it is an abstract class. And an abstract class can leave the methods unimplemented
 * 
 * @author Ankita
 *
 */
public abstract class MyAbstractClass implements Runnable{
 public void m1(){
     int x = 20;
     m2(10);
 }

  public void m2(int b){
     boolean c;
     //more code
     m3();
  }

  public void m3() {
      Account a = new Account();
    }
}

 class Account {
    int p;
    int q;
}



