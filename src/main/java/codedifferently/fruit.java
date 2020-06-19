package codedifferently;

public class fruit {
    
  private String type;
    private int energy;

    public fruit(String type, int energy)
    {
        this.type = type;
       this.energy = energy;


    }
//we have made the variables private
    public String gettype(){

        return this.type;
    }

    public int getenergy(){

        return this.energy;
    }
}