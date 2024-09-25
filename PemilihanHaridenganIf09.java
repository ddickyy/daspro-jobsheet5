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
    
        switch (dayName) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "weekday";
                break;
            case 6:
            case 7:
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";
        }
        System.out.println(dayName + " is a " + dayType);
        }
    }