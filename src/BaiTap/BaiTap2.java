package BaiTap;
import java.util.Scanner;
public class BaiTap2 {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập giá USD: ");
        USD = scanner.nextDouble();
        double doi = USD * VND;
        System.out.println("Giá trị VND: " + doi);

    }
}
