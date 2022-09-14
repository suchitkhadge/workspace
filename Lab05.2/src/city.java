public class city {

  public static void main(String[] args) {


  String city1 = "new york";
  String city2 = "new york";
System.out.println(city1.equals(city2)); // correct way to compare (true)
System.out.println(city1 == city2); // wrong way to compare (true)
  // YOU GOT LUCKY ON THIS ONE - but software development shouldn't rely on luck
  String newCity1 = city1.substring(0,3); // "new"
  String newCity2 = city2.substring(0,3); // "new"
System.out.println(newCity1.equals(newCity2)); // correct way to compare (true)
System.out.println(newCity1 == newCity2); // wrong

}}
