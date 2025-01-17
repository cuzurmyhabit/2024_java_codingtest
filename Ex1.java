package WVH_1418;

import java.util.Random;

class Point {
    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }
}

class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void print() {
        System.out.printf("점의 좌표 <%d,%d>인 반지름 %d인 원의 넓이 : %.3f%n", 
                          center.getX(), center.getY(), radius, area());
    }

}

public class Ex1 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int x = rand.nextInt(51);
        int y = rand.nextInt(51);
        
        int radius = rand.nextInt(15) + 1;
        
        Point p = new Point(x, y);
        
        Circle cir = new Circle(p, radius);
        
        cir.print();
    }
}

