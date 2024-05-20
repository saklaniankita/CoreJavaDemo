package com.collections.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author ankita
 */
public class TestGenerics {
    public static void main(String[] args) {
        Object obj = new Object();

        List<Object> objList = new ArrayList<Object>();
        objList.add("xyz");

        List<String> stringList = new ArrayList<String>();
        stringList.add("abc");

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);

        test1(obj);
        test1(objList);
        test1(stringList);
        test1(intList);

        test2(objList);
        test2(stringList);
        test2(intList);

        test3(objList);
       // test3(stringList);  //CTE test3 accepts list of only Object type
       // test3(intList);   //CTE  test3 accepts list of only Object type

        test4(objList);
        test4(stringList);
        test4(intList);

        test5(objList);
    }

    static void test1(Object obj){   //This method accepts Object and its subclasses
        System.out.println("I accept Object and its subclasses");
    }

    static void test2(List list){   //This  method accepts List of any type
        System.out.println("I accept list of any type");
    }

    static void test3(List<Object> obj){   //This method accepts List of type Object only
        System.out.println("I accept only Object");
    }

    static void test4(List<? extends Object> list){   //This  method accepts List of Object an dits subclasses.
        System.out.println("I accept Object and anything that extends Object class");
        //list.add();   //You can not add to a list with generic <? extends E>
    }

    static void test5(List<? super Integer> list){   //This  method accepts List of Object an dits subclasses.
        System.out.println("I accept Integer and its super classes");
        list.add(5);    //it is OK to add to a list with generic <? super E>
    }
}
