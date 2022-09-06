
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

        Television my_television1 = new Television("Vizio");
        System.out.printf("%d television instances created%n", Television.getInstanceCount());
//        my_television1.setBrand("TCL");
        my_television1.setVolume(85);
        System.out.println(my_television1.toStringOn());
        my_television1.turnOff();

        Television my_television2 = new Television("Toshiba", 125);
        my_television2.turnOff();
        System.out.printf("%d television instances created%n", Television.getInstanceCount());

        Television my_television3 = new Television("LG", 99);
        System.out.printf("%d television instances created%n", Television.getInstanceCount());

//        my_television1.Television("Toshiba", 75);
//        my_television1.Television("Samsung", 100);
//        my_television1.Television("TCL", 0);
    }

}
