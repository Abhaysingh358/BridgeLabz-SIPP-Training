package Methods;

public class OTP {

    public static int otp() {
        boolean[] used = new boolean[10]; 
        StringBuilder sb = new StringBuilder();

        while (sb.length() < 6) {
            int digit = (int)(Math.random() * 10);
            if (!used[digit]) {
                used[digit] = true;
                sb.append(digit);
            }
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(otp());
        }
    }
}
