//######## A Sports Director class responible for creating the car object

public class Director {
    private CarBuilder builder = null;
    Director(){
    }

    //use to set the new builder in case of new builder methods are implemented
    public void setBuilder(CarBuilder b){
        this.builder = b;
    }
    public void ProduceSportsCar(){
        this.builder.reset();           //Get a new car
        this.builder.setSeats(2);       //Sports car seats
        this.builder.setEngine("V8 Engine Classic"); //Engine setup
        this.builder.setType("Sports");
    }

    public void ProduceSUV(){
        this.builder.reset();
        this.builder.setType("SUV");
        this.builder.setSeats(7);
        this.builder.setEngine("Hudson 8000");
    }

}
