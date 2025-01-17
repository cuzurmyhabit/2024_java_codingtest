package WVH_1418;

import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class cir extends Shape {
    private double radius;

    public cir(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "반지름 " + radius + "인 원의 면적은 " + area();
    }
}

class rec extends Shape {
    private double width;
    private double height;

    public rec(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }

    public String toString() {
        return "가로 " + width + "이고 세로 " + height + "인 사각형의 면적은 " + area();
    }
}

class Sector extends Shape {
    private double radius;

    public Sector(double radius) {
        this.radius = radius;
    }

    double area() {
        return 0.5 * Math.PI * radius * radius;  // 90도 부채꼴 면적
    }

    public String toString() {
        return "반지름 " + radius + "인 부채꼴의 면적은 " + area();
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] shapes = new Shape[7];
        int cnt = 0;

        while (cnt < 7) {
            System.out.print("도형 선택(1: 원, 2: 사각형, 3: 부채꼴) : ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("반지름 입력: ");
                double radius = sc.nextDouble();
                
                shapes[cnt] = new cir(radius);
            } 
            else if (choice == 2) {
                System.out.print("가로 입력: ");
                double width = sc.nextDouble();
                
                System.out.print("세로 입력: ");
                double height = sc.nextDouble();
                
                shapes[cnt] = new rec(width, height);
            } 
            else if (choice == 3) {
                System.out.print("반지름 입력: ");
                double radius = sc.nextDouble();
                
                shapes[cnt] = new Sector(radius);
            } 
            else {
                System.out.println("잘못된 선택입니다. 다시 입력하세요.");
                continue;
            }

            System.out.println(shapes[cnt]);
            cnt++;
        }

    }
}
