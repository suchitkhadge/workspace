public class TelevisionValidationTest {

  public static void main(String[] args) {

    Television tv = new Television();

    tv.setVolume(10);
    tv.setVolume(-1);
    tv.getVolume();
    System.out.println(tv.getVolume());
    System.out.println(DisplayType.LED);

    tv.setBrand("sony");
    tv.setBrand("TLG");
    tv.getBrand();
    System.out.println(tv.getBrand());



  }

}
