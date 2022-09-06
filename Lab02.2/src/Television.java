public class Television{

     String brand;
     int volume;
     String display_ON;

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
    this.volume = volume;
  }

  public void setBrand(String brand) {
    this.brand = brand;
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

  public void Television( String brand_name, int volume_state){
    brand = brand_name;
    volume = volume_state;
    toStringOn();
    getVolume();
    getBrand();
    if (volume_state == 0) {
      printStream(toStringOff());
    }
    else
    {
      printStream(toStringOn());
    }




    }

    public void turnOn(){
        boolean isConnected = verifyInternetConnection();
        System.out.println("The"+brand+"television is on,with a volume of"+volume);
    }

    void turnOff(){
        System.out.println("The"+brand+"television is OFF");
    }

//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }




    }
