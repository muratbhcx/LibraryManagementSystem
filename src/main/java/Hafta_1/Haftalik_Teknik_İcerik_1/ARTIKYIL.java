package Hafta_1.Haftalik_Teknik_İcerik_1;

import java.util.Scanner;

public class ARTIKYIL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yıl Giriniz : ");
        int year = scanner.nextInt();
        if (year % 100 == 0 ) {
            if (year % 400 == 0) {
                System.out.println(year + " bir artık yıldır !");
            } else {
                System.out.println(year + " bir artık yıl değildir !");
            }
            }else if (year % 4 == 0) {
            System.out.println(year + " bir artık yıldır !");
        }else {
            System.out.println(year + " bir artık yıl değildir !");
        }
            }
            }













