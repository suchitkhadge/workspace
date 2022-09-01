public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.brand = " TCL ";
    tv1.volume = 50;
    tv1.turnOn();
    tv1.turnOff();

    Television tv2 = new Television();
    tv2.brand = " Samsung ";
    tv2.volume = 75;
    tv2.turnOff();
    tv2.turnOn();

  }
}
