package InteratorAndCombination;

public class MenuItem{
    String name;
    String describtion;
    boolean vegetation;
    double price;

    public MenuItem(String name,String describtion,boolean vegetation,double price){
        this.name = name;
        this.describtion=describtion;
        this.price = price;
        this.vegetation = vegetation;
    }

    public String getName() {
        return name;
    }

    public String getDescribtion() {
        return describtion;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetation(){
        return vegetation;
    }
}
