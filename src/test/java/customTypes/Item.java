package customTypes;

public class Item {

    String name;
    Double price;

    public Item(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public Double getPrice(){
        return this.price;
    }
}
