public class Builder implements  CarBuilder{
    private Car car = null;
    public  Builder(){
        this.reset();
    }

    public void reset(){
        this.car = new Car();
    }

    @Override
    public void setSeats(Number Seats) {
        this.car.Seats = Seats;
    }

    @Override
    public void setType(String Type) {
        this.car.Type = Type;
    }

    @Override
    public void setEngine(String EngineName) {
        this.car.Engine = EngineName;
    }

    public Car getProduct(){
        Car product = this.car;
        this.reset();
        return product;
    }
}
