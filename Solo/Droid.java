package Solo;
public class Droid {
    String name;
    int batteryLevel;
    public Droid(String name){
        this.name = name;
        batteryLevel=100;
    }

    public String toString(){
        return "Greeting: My name is " + name;
    }

    public void performTask(String task) {
        if (batteryLevel > 10){
            System.out.println(name + " is performing task: " + task);
            batteryLevel-=10;
        } else {
            System.out.println("Not enough battery life to perform this task.");
        }
    }

    public void energyReport(){
        System.out.println("Battery Level: " + batteryLevel);
    }

    public void recharge(){
        batteryLevel=100;
        System.out.println("Battery recharged!");
    }

    public static void main(String[] args){
        Droid codey = new Droid("Codey");
        codey.performTask("vacumn");
        codey.performTask("Pick up groceries");
        codey.energyReport();
        codey.recharge();
        codey.energyReport();
    }
}
