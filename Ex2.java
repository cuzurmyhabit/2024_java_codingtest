package WVH_1418;

import java.util.Scanner;

class Rectangle {
    private double r;
    private double angle = 90.0;

    public Rectangle(double r) {
        this.r = r;
    }

    public double area() {
        return (Math.PI * r * r * angle) / 360.0;
    }

    public double perimeter() {
        return 2 * r + (2 * Math.PI * r * angle) / 360.0;
    }

    public double getR() {
        return r;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("생성할 부채꼴의 갯수를 입력하시오. : ");
        int count = sc.nextInt();

        Rectangle[] Rectangle = new Rectangle[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번 부채꼴 ");
            System.out.print("반지름 입력 : ");
            double r = sc.nextDouble();
            Rectangle[i] = new Rectangle(r);
        }

        for (int i = 0; i < count; i++) {
            double area = Rectangle[i].area();
            double perimeter = Rectangle[i].perimeter();
            System.out.println("반지름 " + Rectangle[i].getR() + "인 부채꼴의 면적 : " + area + ", 둘레 : " + perimeter);
        }
    }
}
