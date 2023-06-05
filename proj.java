package academy.devonline.java.basic.section01_setup.section06_setup;

import java.util.Arrays;
import java.util.Scanner;

public class proj {
    public static void main(String[] args) {
        System.out.println(
                " 1.WhatIsArray\n"+
                " 2.NewArray \n "+
                "3.DisplayArray \n "+
                "4.ArrayElment\n "+
                "5.ArrayLength \n "+
                "6.ArrayErrors \n "+
                "7.ArrayIterator \n "

        );
        System.out.println("Ведите чесло:");
        var user = new Scanner(System.in).nextInt();
        var  WhatIsArray = 1;
        var NewArray = 2;
        var DisplayArray =3;
        var ArrayElment = 4;
        var ArrayLength = 5;
        var ArrayErrors =6;
        var ArrayIterator =7;
        if (user == 1) {
            //"страничка 1 "
            var a = 1;
            var b = 2;
            var c = 3;
            var e = 4;
            var t = 5;

            int[] array = {1, 2, 3, 4, 5};
            System.out.println();
           //" конец"

        } else if (user ==2) {
             //"страничка 1 "
            int[]arrayint = {1,2,3,4,5};
            double[] arrayduuble ={1.,2.,3.,4.,5.};
            boolean[]arrayboolean = {true,false,true,false};
            char[]arraychar = {'1','2','3','4','5'};
            String[]arraystring = {"1","2","3","4","5"};
            //" конец"
        } else if (user == 3) {
            //"страничка 3 " /
            int [] array = {1,2,3,4,5};
            int [] arra = new int[5];
            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.toString(arra));
            // /" конец"
        }
        else if (user == 4) {
            //"страничка 4 " /
            int [] array = {8,2,3,4,5};
            System.out.println(Arrays.toString(array));
            System.out.println(array[0]);
            array[0]=45;
            System.out.println(Arrays.toString(array));
            System.out.print(array[0]+" ");
            System.out.print(array[1]+" ");
            System.out.print(array[2]+" ");
            System.out.print(array[3]+" ");
            System.out.print(array[4]+" ");

            // /" конец"
        }else if (user == 5) {
            //"страничка 5 " /
                int [] array = {1,2,67};
            System.out.println(Arrays.toString(array));
            System.out.println(array.length);
            System.out.println(array[array.length -1]);
            // /" конец"
        }else if (user == 6) {
            //"страничка 6 " /
            int [] array = {1,2,3,4,5};
            System.out.println(array[4]);
            System.out.println(array.length);
            // /" конец"
        }else if (user == 7) {
            //"страничка 7 " /
            int [] array = {1,2,3,4,5};
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
            for (int elemet : array) {
                System.out.print(elemet+" ");
            }
            // /" конец"
        }





    }
}
