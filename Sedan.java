public class Sedan extends Vehicle implements Automobile {
    // to increase speed 
    public void accelerate(int increment){ 
          
        speed = speed + increment; 
    } 
      
    // to decrease speed 
    public void stop(int decrement){ 
          
        speed = speed - decrement; 
    }
    public void gas(int capacity){
        tank = capacity;
    }
      
    public void printStates() { 
         System.out.println("speed: " + speed); 
    }

    @Override
    void gas() {
        // TODO Auto-generated method stub

    }

    @Override
    void stop() {
        // TODO Auto-generated method stub

    }

    @Override
    void accelerate() {
        // TODO Auto-generated method stub

    }
}