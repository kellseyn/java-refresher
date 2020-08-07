package refresher.java;

public class Stove {
    private String cookingTemp;

    public Stove(String cookingTemp) {
        this.cookingTemp = cookingTemp;
    }

    public String getCookingTemp() {
        return cookingTemp;
    }

   public void cook(){
       System.out.println("Stove -> cooking");
   }
}
