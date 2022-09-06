public class Television{

     private String brand;
     private int volume;
     String display_ON;
     public static final int MIN_VOLUME = 0;
     public static final int MAX_VOLUME = 100;
     public static int instanceCount = 0;

  //Constructor with no arguments
  public Television(){
    instanceCount++;
  }

  //Constructor with one String argument
  public Television(String brand){
    this();
    setBrand(brand);
    getVolume();
    toStringOn();
    if (getVolume() == 0) {
      printStream(toStringOff());
    } else {
      printStream(toStringOn());
    }
  }

  //Constructor with all arguments
  public Television( String brand_name, int volume_state) {
    this(brand_name);
    setVolume(volume_state);
    toStringOn();
    getVolume();
    getBrand();
    if (volume_state == 0) {
      printStream(toStringOff());
    } else {
      printStream(toStringOn());
    }
  }


  private boolean verifyInternetConnection() {
    return true;
  }

  public String getBrand(){
    return brand;
  }

  public int getVolume(){
    return volume;
  }

  public void setVolume(int volume) {
    if (volume < MIN_VOLUME || volume > MAX_VOLUME){
      System.out.printf("%d is invalid; volume must be between %d and %d (inclusive).%n",volume, MIN_VOLUME, MAX_VOLUME);
    }else {
         this.volume = volume;
    }

  }

  public void setBrand(String brand) {
    this.brand = brand;
  }


  public static int getInstanceCount() {
    return instanceCount;
  }

  public String toStringOn(){
    return " The television brand " + getBrand() + ", is ON with a volume of " + getVolume();
  }

  public String toStringOff(){
    return " The television brand " + getBrand() + ", is OFF";
  }

  public void printStream(String display_ON){
    this.display_ON = display_ON;
    System.out.println(display_ON);
  }

  public void turnOn(){
        boolean isConnected = verifyInternetConnection();
        System.out.println("The"+brand+"television is on,with a volume of"+volume);
    }
  public void turnOff(){
        System.out.println(" The "+brand+" television is OFF");
    }

//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }


    }
