public class OTPGenerator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
	
        // To get a 6-digit OTP, multiply it by 1000000 and cast it to an integer
        return (int) (Math.random() * 900000) + 100000; 
    }

    //checking if all the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {  
                    return false; 
                }
            }
        }
        return true;  
    }

    public static void main(String[] args) {
	
        // Array to hold OTP numbers generated 10 times
        int[] otps = new int[10];

        // Generate 10 OTP numbers
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check if all OTPs are unique
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are duplicated.");
        }
    }
}
