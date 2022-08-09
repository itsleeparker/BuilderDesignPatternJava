public class Car {
    public Number Seats;
    public String Engine;
    public String Type;

    public  Car(){};
    public  void getInfo(){
            System.out.println("The Car is a " + this.Type + " of car");
            System.out.println("The Car has " + this.Seats  + " number of seats");
            System.out.println("The Car Engine is  " + this.Engine);
    }
}
