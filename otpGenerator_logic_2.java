import java.util.Scanner;
public class otpGenerator_logic_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("OTP Generator logic 2");
        int otp = (int)(Math.random() * ((99 - 11)+1)) + 11; //here, it will give 4 Digits, you can change it according to your need ;)
        if (otp>=11)
            otp=otp*112;
        System.out.println("The OTP is: " + otp);
        System.out.println("Please Enter OTP: ");
        int otp_in = sc.nextInt();
        if (otp_in==otp) {
            boolean b = true;
            System.out.println("Authentication Successful!");
        }
        else
        {
            boolean b = false;
            System.out.println("Authentication Failed!");
        }


    }
}
