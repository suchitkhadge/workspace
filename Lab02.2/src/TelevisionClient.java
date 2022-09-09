
    public class TelevisionClient{
//

    public static void main(String []args){

//        Television tv1=  new Television();
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
//        Television tv2=new Television();
//        tv2.setBrand("Samsung");
//        tv2.setVolume(100);
//        System.out.println(tv2.toStringOn());
//        System.out.println(tv2.toStringOff());

        Television my_television1 = new Television("LG");
//        System.out.printf(" %d television instances created \n", Television.getInstanceCount());
        my_television1.setBrand("Sony");
        my_television1.setVolume(85);
        my_television1.setDisplay(DisplayType.CRT);
        System.out.println(my_television1.toStringOn());
        my_television1.turnOff();

        my_television1.setDisplay(DisplayType.OLED);
        System.out.println(my_television1.toStringOn());
        my_television1.turnOff();
//        System.out.printf(" %d television instances created \n", Television.getInstanceCount());

//        Television my_television3 = new Television("Vizio", 99);
//        System.out.printf(" %d television instances created \n", Television.getInstanceCount());

//        my_television1.Television("Toshiba", 75);
//        my_television1.Television("Samsung", 100);
//        my_television1.Television("TCL", 0);
    }

}
