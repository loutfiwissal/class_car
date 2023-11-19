public class Main2 {
    public static void main(String[] args) {
        Car firsteCar = new Car();

        firsteCar.name = "Mercedes";

        firsteCar.color = "Black";

        firsteCar.model = "S63";

        firsteCar.nitro_speed = true;
        
        firsteCar.speed = 62;

        //method to provide Car information:
        firsteCar.information();
    }
}