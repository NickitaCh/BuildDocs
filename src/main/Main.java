package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ваш код получающий параметры с консоли
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите высоту ромба: ");
        int height = scan.nextInt();
        System.out.print("Введите ширину ромба: ");
        int width = scan.nextInt();
        Main.printDiamond(height, width);
    }

    private static void printDiamond(int height, int width) {
        //Код печатающий ромб
        int hCenter = height / 2;
        int wCenter = width / 2;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i <= hCenter) {
                    int x = width;
                    if ((j >= wCenter - i && j == wCenter + i) || (j <= wCenter + i && j == wCenter - i) || (j == --x && i == hCenter) || (j == 0 && i == hCenter)) {
                        System.out.print("#");
                    } else
                        System.out.print(" ");
                } else {
                    if ((j >= wCenter + i - height + 1 && j == wCenter - i + height - 1) || (j <= wCenter - i + height - 1 && j == i - wCenter)) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(" ");
        }
    }
}