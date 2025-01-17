public class SpringSeason {
    public static void main(String[] args) {
        // Check if two arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        // Parse the input arguments to string and integer
        String month = args[0]; // String month
        int day = Integer.parseInt(args[1]); // Integer day

        // Check if the given date falls within the Spring Season (March 20 to June 20)
        if ((month.equalsIgnoreCase("March") && day >= 20 && day <=31) || 
            (month.equalsIgnoreCase("April")) || 
            (month.equalsIgnoreCase("May")) || 
            (month.equalsIgnoreCase("June") && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
