package Solo;
//Class that takes 2 parameters, total days and total rides expecting. outputs your best option financially

public class TransitCalculator {
    int ridesExpecting;
    int daysOnTransit;

    //Variables subject to change
    double singleRide = 2.75;
    double days7Unlimited = 33.00;
    double days30Unlimited = 127.00;

    // Constructor
    public TransitCalculator(int days, int rides){
      daysOnTransit = days;
      ridesExpecting = rides;
    }

    //Returns total for each ride if purchasing 7 day pass
    public double unlimited7Price(){
      double totalCost = 0;
      for (int d=0; d<daysOnTransit; d+=7){
        totalCost+=days7Unlimited;
      }
      return totalCost / ridesExpecting;
    }
    //Returns total for each ride if purchasing 30 day pass
    public double unlimited30Price(){
      double totalCost = 0;
      for (int d=0; d<daysOnTransit; d+=30){
        totalCost+=days30Unlimited;
      }
      return totalCost / ridesExpecting;
    }
    //Returns total if only purchasing a single ticket each ride.
    public double singleRidePrice(){
      return ridesExpecting * singleRide;
    }
    //Returns an array of all 3 prices above
    public double[] getRidePrices(){
      double[] arr = {singleRidePrice(), unlimited7Price(), unlimited30Price()};
      return arr;
    }
    //Returns which option is your best choice
    public String getBestFare(){
        double[] arr = getRidePrices();
        double lowest = arr[0];
        int pos=0;

        for (double num : arr) {
            if (num < lowest){
                lowest=num;
            }
        }

        for (int i=0; i<arr.length; i++){
            if (arr[i]==lowest){
                pos=i;
            }
        }
        switch(pos){
            case 0:
                return "Cheapest option is single tickets at for a total of " + lowest;
            case 1:
                return "Cheapest option is 7 day pass for a total of " +lowest + " per ride";
            default:
                return "Cheapest option is 30 pass for a total of "+ lowest + " per ride";
        }
    }

  public static void main(String[] args){
    TransitCalculator TC = new TransitCalculator(5,12);
    System.out.println(TC.singleRidePrice());
    System.out.println(TC.unlimited7Price());
    System.out.println(TC.unlimited30Price());
    System.out.println(TC.getBestFare());
  }
}