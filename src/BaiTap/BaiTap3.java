package BaiTap;
import java.util.Scanner;
public class BaiTap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập số cần đổi");
        int number = scanner.nextInt();
        if (number < 10 && number > 0) {
            switch (number) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("out of ability");
            }
        }
        if (number < 20 && number >= 10){
            String chuc = "teen";
        switch (number){
            case 10:
                System.out.println("ten");
                break;
            case 11:
                System.out.println("eleven");
                break;
            case 12:
                System.out.println("twelve");
                break;
            case 13:
                System.out.println("thir" + chuc);
                break;
            case 14:
                System.out.println("four" + chuc);
                break;
            case 15:
                System.out.println("fif" + chuc);
                break;
            case 16:
                System.out.println("six" + chuc);
                break;
            case 17:
                System.out.println("seven " + chuc);
                break;
            case 18:
                System.out.println("eight" + chuc);
                break;
            case 19:
                System.out.println("twenty");
                break;
        }
        }
    }
}
