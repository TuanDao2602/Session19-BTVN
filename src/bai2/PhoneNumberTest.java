package bai2;

import java.util.Scanner;

public class PhoneNumberTest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào số điên thoại để kiểm tra");
        String phoneNumber = scanner.nextLine();
        PhoneNumber phoneNumber1 =new PhoneNumber();
        boolean valide =phoneNumber1.validate(phoneNumber);
        if (valide){
            System.out.println("nhập chính xác");

        }else {
            System.out.println("nhập sai");
        }
    }
}
