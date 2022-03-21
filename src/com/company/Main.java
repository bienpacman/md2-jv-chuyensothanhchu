//package com.company;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Number");
//        int number = scanner.nextInt();
//        String number1 = "";
//        String number2 = "";
//
//
//        switch (number) {
//            case 1 :
//                number1 = "one" ;
//                break;
//            case 2:
//                number1 = "two";
//                break;
//            case 3:
//                number1 = "three";
//                break;
//                case 4 :
//                    number1 = "for";
//                break;
//                case 5:
//                    number1 = "five";
//                break;
//                case 6:
//                    number1 = "six";
//                break;
//                case 7:
//                    number1 = "seven";
//                break;
//                case 8:
//                    number1 = "eight";
//                break;
//                case 9:
//                    number1 = "nine";
//                break;
//        }
//        System.out.println(number1);
//
//        switch (number){
//            case 10 :
//                number2 = "ten";
//                break;
//                case 11 :
//                number2 = "eleven";
//                break;
//                case 12 :
//                number2 = "twelve";
//                break;
//                case 13 :
//                number2 = "thirteen";
//                break;
//                case 14 :
//                number2 = "fourteen";
//                break;
//                case 15 :
//                number2 = "fifteen";
//                break;
//                case 16 :
//                number2 = "sixteen";
//                break;
//                case 17 :
//                number2 = "seventeen";
//                break;
//                case 18 :
//                number2 = "einghtteen";
//                break;
//                case 19 :
//                number2 = "nineteen";
//                break;
//
//        }
//        System.out.println(number2);
//    }
//}
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần dịch ");
        int number = scanner.nextInt();
        System.out.println("hàng đơn vị là : " + number % 10);
        int unit = number % 10;
        String readUnit = "";
        switch (unit) {
            case 1:
                readUnit = "one";
                break;
            case 2:
                readUnit = "two";
                break;
            case 3:
                readUnit = "three";
                break;
            case 4:
                readUnit = "four";
                break;
            case 5:
                readUnit = "five";
                break;
            case 6:
                readUnit = "six";
                break;
            case 7:
                readUnit = "seven";
                break;
            case 8:
                readUnit = "eight";
                break;
            case 9:
                readUnit = "nine";
                break;
        }
        int dozens1 = number % 100;
        String dozensUnit = "";
        switch (dozens1) {
            case 10:
                dozensUnit = "ten";
                break;
            case 11:
                dozensUnit = "eleven";
                break;
            case 12:
                dozensUnit = "twelve";
                break;
            case 13:
                dozensUnit = "thirteen";
                break;
            case 14:
                dozensUnit = "fourteen";
                break;
            case 15:
                dozensUnit = "fifteen";
                break;
            case 16:
                dozensUnit = "sixteen";
                break;
            case 17:
                dozensUnit = "seventeen";
                break;
            case 18:
                dozensUnit = "eighteen";
                break;
            case 19:
                dozensUnit = "nineteen";
                break;
        }

        System.out.println("hàng chục là " + (number % 100 - unit) / 10);
        int dozens = (number % 100 - unit) / 10;
        String dozensUnit1 = "";
        switch (dozens) {
            case 2:
                dozensUnit1 = "twenty";
                break;
            case 3:
                dozensUnit1 = "thirty";
                break;
            case 4:
                dozensUnit1 = "forty";
                break;
            case 5:
                dozensUnit1 = "fifty";
                break;
            case 6:
                dozensUnit1 = "sixty";
                break;
            case 7:
                dozensUnit1 = "seventy";
                break;
            case 8:
                dozensUnit1 = "eighty";
                break;
            case 9:
                dozensUnit1 = "ninety";
                break;
        }
        System.out.println("số hằng trăm " + (number-(number%100)));
        int hundreds = number-(number%100);
        String hundredsUnit = "";
        switch (hundreds) {
            case 100:
                hundredsUnit = "one hundred";
                break;
            case 200:
                hundredsUnit = "two hundred";
                break;
            case 300:
                hundredsUnit = "three hundred";
                break;
            case 400:
                hundredsUnit = "four hundred";
                break;
            case 500:
                hundredsUnit = "five hundred";
                break;
            case 600:
                hundredsUnit = "six hundred";
                break;
            case 700:
                hundredsUnit = "seven hundred";
                break;
            case 800:
                hundredsUnit = "eight hundred";
                break;
            case 900:
                hundredsUnit = "nine hundred";
                break;
        }
        if (number < 10) {
            System.out.println("dịch là " + readUnit);
        } else if (number < 20) {
            System.out.println("dịch là " + dozensUnit);
        } else if (number < 100) {
            System.out.println("dịch là " + dozensUnit1 + " " + readUnit);
        } else if (number < 110) {
            System.out.println("dịch là " + hundredsUnit + " " + dozensUnit1 + " " + readUnit);
        } else if (number < 120) {
            System.out.println("dịch là " + hundredsUnit + " " + dozensUnit);
        } else if (number < 1000) {
            System.out.println("dịch là " + hundredsUnit + " " + dozensUnit1 + " " + readUnit);
        }
    }
}