package codedifferently;

public class human {
  
    private String firstname;
    private String lastname;
    static int maxenergy  = 100;
    private int energy;

    public human(String firstname, String lastname){
       this.firstname=firstname;
        this.lastname=lastname;
        this.energy= 50;

    }

//if else statement
    public void eat(fruit fruit) {

      if (this.energy + fruit.getenergy() <= maxenergy)

         this.energy = this.energy + fruit.getenergy();
      
      else

         this.energy=maxenergy;
         System.out.println("we are full of energy");
      
    }

 public void work(int hours){

    int energyspent = hours* 10;

    if(this.energy - energyspent< 0){

      System.out.print("energy too low, try to grab a bite and get this done later");
    }
    else{
    this.energy = this.energy - energyspent;
    }
 }

 //get method

 public int getEnergy(){

    return this.energy;


 }

 public String getfirstname(){
    return this.firstname;
 }
 public String getlastname(){
   return this.lastname;
}

}