class Main{ 
      
    public static void main (String[] args) { 
      
        // creating an inatance of class Sedan  
        // doing some operations  
        Sedan Sedan= new Sedan();
        //Sedan.changeGear(2); 
        Sedan.accelerate(3); 
        System.out.println("Sedan present state :"); 
        Sedan.printStates();
        
        Sedan.stop(1); 
          
        System.out.println("Sedan present state :"); 
        Sedan.printStates(); 
          
       
    } 
} 