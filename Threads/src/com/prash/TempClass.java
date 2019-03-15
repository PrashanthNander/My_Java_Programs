package com.prash;

import java.util.HashMap;
import java.util.Map;

public class TempClass {
    TempClass() {
        System.out.println("Parent Constructor called");
    }

    public void mdisplay() {
        System.out.println("Parent display Method invoked");
    }
}

class Test extends TempClass {
    Test() {
        System.out.println("Test Constructor invoked");
    }
    Test(String val) {
        System.out.println("Parameterized Test Constructor with value =" + val);
    }

    public void display() {
        System.out.println("Test Display Method invoked");
    }


    static {
        System.out.println("I am a static block");
    }

    {
        System.out.println("I am a anonymous block");
    }

//    public static void main(String[] args) {
//        Test a = new Test();
////        TempClass obj = new TempClass();
//        System.out.println("==========");
//        a.display();
//        a.mdisplay();
//        Test oj = new Test("Hello");
//
//        String str = "My name is     Sparshsa";
//
//        String arr[] = str.split(" ");
//        for (String val: arr) {
//            System.out.println("==" + val);
//        }
//        System.out.println("Words==" + arr.length);
//
//        StringBuffer sb=new StringBuffer("Hello");
//        sb.replace(1,3,"Java");
//        System.out.println(sb);//prints HJavalo
//    }
}
class MultiThread extends Thread{
    public void run() {
        for(int i = 0; i < 4; i ++ ){
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MultiThread m1 = new MultiThread();
        MultiThread m2 = new MultiThread();
        m1.start();
        m2.start();

        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+"_"+m.getValue());
        }
    }
}