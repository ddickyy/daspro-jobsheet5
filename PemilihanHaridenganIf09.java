import java.util.Scanner;
/**
 * PemilihanHaridenganIf09
 */
public class PemilihanHaridenganIf09 {

    
    public static void main(String[] args) {
    
        Scanner hari = new Scanner (System.in);
        String dayType;
        int dayName;
    
        System.out.print("Input day name with number: ");
        dayName = hari.nextInt();
    
        if (dayName >= 1 && dayName <=5) {
            dayType = "weekday";
        } else if (dayName >= 6 && dayName <= 7) {
            dayType = "weekend";
        } else {
            dayType = "invalid number";
        }

        System.out.println(dayName + " is a " + dayType);
        }
    }