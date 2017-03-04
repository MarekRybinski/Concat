package com.sdajava.export;

public class Main {
    public static String funkcja(int index, String ...others){
        return others[index];
    }

    public static void main(String[] args) {
        System.out.println( funkcja(3, "Kot", "Pies", "Kura", "1212"));


    }
}
