import java.util.Scanner;
public class otpGenerator_logic_1 {
    public static void main(String[] args) {
        System.out.println("OTP Generation System");
        Scanner sc = new Scanner(System.in);
        boolean b = false;
        int otp = (int)(Math.random() * ((9999 - 1111)+1)) + 1111;
        System.out.println("OTP IS:" + otp);
        System.out.println("Enter OTP");
        int otp_in = sc.nextInt();
        if (otp_in==otp) {
            b = true;
            System.out.println("Authentication Successful!!");
        }
        else{
            b=false;
            System.out.println("Authentication Failed");
        }

    }
}
