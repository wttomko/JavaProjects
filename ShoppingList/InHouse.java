package ShoppingList;
import java.util.*;

public class InHouse {
    ArrayList<String> inHouse = new ArrayList<>();
    String name;

    public InHouse(String name){
        this.name=name;
    }

    public void display(){
        for (String item : inHouse){
            System.out.println(item);
        }
    }

    public String checkFor(String item){
        if (inHouse.contains(item)){
            int amount = 0;
            for (int i=0; i<inHouse.size(); i++){
                if (inHouse.get(i)==item){
                    amount++;
                }
            }
            return "You have " + amount + item + "(s) available";
        } else {
            return "You do not have any " + item + "(s)";
        }
    }

    public void add(String item){
        inHouse.add(item);
    }

    public void remove(String item){
        inHouse.remove(item);
    }
}
