//############ BUILDER PATTERNS
//############ Wap to build a car  , this car can be Sports or normal car
//############ Use a bilder pattern to build the car and provide the directory whereever possible


public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        Director dir  = new Director();
        dir.setBuilder(builder);            //Instantiate the Director with builder method

        Car sportsCar = null;
        Car SUVcar = null;

        System.out.println("####### CAR  BUILDER ########");
        System.out.println("Bulding a sports car");

        //Build a sports car
        dir.ProduceSportsCar();
        sportsCar = builder.getProduct();

        System.out.println("Bulding a SUV car");
        //Build a SUV car
        dir.ProduceSUV();
        SUVcar = builder.getProduct();

        //display output
        System.out.println("Sports Car  : ");
        sportsCar.getInfo();

        System.out.println("Suv Car  : ");
        SUVcar.getInfo();

    }
}