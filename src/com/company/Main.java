package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen 1.Sayıyı Giriniz:");
        a = inp.nextInt();

        System.out.println("Lütfen 2.Sayıyı Giriniz:");
        b = inp.nextInt();

        System.out.println("Lütfen 3.Sayıyı Giriniz:");
        c = inp.nextInt();

        if (a < b && a < c) {
            if (b < c) System.out.println("Sıralama Şekli:"+a+"<"+b+"<"+c);

            else System.out.println("Sıralama Şekli:"+a+"<"+c+"<"+b);
        }
        else if (b < a && b < c) {
            if (a < c) System.out.println("Sıralama Şekli :"+b+"<"+a+"<"+c);
            else System.out.println("Sıralama Şekli :"+b+"<"+c+"<"+a);
        }
        else if (c<a && c<b){
           if(b<a) System.out.println("Sıralama Şekli : "+c+"<"+b+"<"+a);
           else System.out.println("Sıralama Şekli : "+c+"<"+a+"<"+b);
        }

    }
}
