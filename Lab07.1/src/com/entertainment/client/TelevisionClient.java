package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionClient{
//

    public static void main(String []args){

//        com.entertainment.Television tv1=  new com.entertainment.Television();
//    tv1.brand="TCL";
//    tv1.volume=50;
//    tv1.turnOn();
//    tv1.turnOff();

//        tv1.setBrand("TCL");
//        tv1.setVolume(50);
//        System.out.println(tv1.toStringOn());
//        System.out.println(tv1.toStringOff());
////
//
//        com.entertainment.Television tv2=new com.entertainment.Television();
//        tv2.setBrand("Samsung");
//        tv2.setVolume(100);
//        System.out.println(tv2.toStringOn());
//        System.out.println(tv2.toStringOff());

        Television my_television1 = new Television("LG");
//        System.out.printf(" %d television instances created \n", com.entertainment.Television.getInstanceCount());
        my_television1.setBrand("Sony");
        my_television1.setVolume(85);
        my_television1.setDisplay(DisplayType.CRT);
        System.out.println(my_television1.toStringOn());
        my_television1.turnOff();

        my_television1.setDisplay(DisplayType.OLED);
        System.out.println(my_television1.toStringOn());
        my_television1.turnOff();
//        System.out.printf(" %d television instances created \n", com.entertainment.Television.getInstanceCount());

//        com.entertainment.Television my_television3 = new com.entertainment.Television("Vizio", 99);
//        System.out.printf(" %d television instances created \n", com.entertainment.Television.getInstanceCount());

//        my_television1.com.entertainment.Television("Toshiba", 75);
//        my_television1.com.entertainment.Television("Samsung", 100);
//        my_television1.com.entertainment.Television("TCL", 0);
    }

}
