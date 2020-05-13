public class Player {
    
    // attributes
    private String name;
    private String nationality;
    public double salary;
    
    // methods
    
    public Player(String name,String nationality,double salary){
        this.name=name;
        this.nationality=nationality;
        this.salary=salary;
    }
    
    public void printPlayer(){
        System.out.println(name);
        System.out.println(nationality);
        System.out.println(salary);
    }

    //setters and getters

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setNationality(String nationality){
        this.nationality=nationality;
    }

    public String getNationality(){
        return this.nationality;
    }
}