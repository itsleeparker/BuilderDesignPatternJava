//######## A Sports Director class responible for creating the car object

public class SportsDirector {
    private CarBuilder builder = null;
    SportsDirector(CarBuilder b){
        this.builder = b;
    }

    public void Produce(){
        this.builder.setSeats(2);       //Sports car seats
        this.builder.setEngine("V8 Engine Classic"); //Engine setup
        this.builder.setType("Sports");
    }
}
