package com.company;


public class Main {

    public static void main(String[] args) {
       myMethod(9);
       myMethod(25);
       myMethod(102);
    }
    public static void myMethod(int a){
        int b = 3;
        int c = a % b;
        if (c == 0){
            System.out.println(true); }
        else {
            System.out.println(false); }
        }


}
