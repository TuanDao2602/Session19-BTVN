package bai1;

import java.util.Scanner;

public class ClassNameExampleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 tên lớp ");
        String className = sc.nextLine();
        ClassNameExample classNameExample=new ClassNameExample();
        boolean isvalid = classNameExample.validate(className);
       if (isvalid){
           System.out.println("định dạng đúng");
       }else {
           System.out.println("định dạng sai");
       }
    }
}
