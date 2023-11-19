public class Car {
    String name ;

    String color ;

    String model ;

    boolean nitro_speed;

    short speed ;


    //method to provide Car information:
    void information(){
        System.out.println ("The car name : "+name) ;

        System.out.println ( "His color : "+color) ;

        System.out.println ( "Model : "+model) ;

        System.out.println ( "Is it nitro speed ?"+nitro_speed ) ;
        
        System.out.println( "His speed : "+speed+" mph ") ;

    }
}
