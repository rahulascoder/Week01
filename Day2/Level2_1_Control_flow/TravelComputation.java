import java.util.Scanner;

class TravelComputation {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      //Name of the person traveling
      System.out.print("Enter the name of the person traveling: ");
      String name = sc.nextLine();

      //Cities name
      System.out.print("Enter the fromCity: ");
      String fromCity = sc.nextLine();
      System.out.print("Enter the viaCity: ");
      String viaCity = sc.nextLine();
      System.out.print("Enter the toCity: ");
      String toCity = sc.nextLine();

      //Distances between cities
      System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in km): ");
      double distanceFromToVia = sc.nextDouble();
      System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in km): ");
      double distanceViaToFinalCity = sc.nextDouble();

      //Travel times
      System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (in minutes): ");
      int timeFromToVia = sc.nextInt();
      System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (in minutes): ");
      int timeViaToFinalCity = sc.nextInt();

      //Total distance and total time
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
      int totalTime = timeFromToVia + timeViaToFinalCity;

      //Displaying travel details
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes.");

      sc.close();
   }
}
