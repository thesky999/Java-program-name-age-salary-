public class PlayerSystem {

    public static void main(String[] args) {
    
        
        System.out.println(" ------- Player System -------");
        
        //create an object
        Player one = new Player("Some Guy","USA",0);
        
        //assign values to the attr
        //display the values (use the method)

       //Player one = new Player();
       //one.setName("Some Guy");
       //one.setNationality("USA");
       //one.salary= 0;

       Player messi = new Player("Lionel Messi","Argentina",14578939.23);
        //Player messi = new Player(); // object
        //messi.setName("Lionel Messi");
        //messi.setNationality("Argentina");
        //messi.salary= 14578939.23;
        
        one.printPlayer();
        messi.printPlayer();
        //System.out.println(messi.name);
        //System.out.println(messi.nationality);
        //System.out.println(messi.salary);
    }
    
}
