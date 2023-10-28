import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings= new ArrayList<>();

    void prepare(){
        System.out.println("prparing"+name);
        System.out.println("tossing dough ....");
        System.out.println("adding sauce...");
        System.out.println("adding toppings:");
        for (int i=0;i<toppings.size();i++){
            System.out.println(" "+toppings.get(i));
        }
    }
    void bake(){
        System.out.println("bake for 25 min at 350");
    }
    void cut(){
        System.out.println("sutting pizza into diagonale slice ");
    }
    void box(){
        System.out.println("place pizza in official pizzastore box");
    }
    public  String getName() {
        return name;
    }
}
