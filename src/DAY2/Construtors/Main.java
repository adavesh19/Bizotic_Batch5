package DAY2.Construtors;

import java.util.Scanner;

class Shape {
    int length, breadth, height, radius;

    Shape() {

    }

    Shape(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    Shape(int radius) {
        this.radius = radius;
    }

    Shape(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    // AREA FINDING FOR THE 3- SHAPES
    public Integer CubeArea() {
        return length * breadth * height;
    }

    public float SphereArea() {
        return (float) (4 * Math.PI * radius * radius);
    }

    public float CylinderArea() {
        return (float) (Math.PI * radius * radius * height);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("1.Cube");
        System.out.println("2.Sphere");
        System.out.println("3.Cylinder");
        System.out.println("Enter the choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("length");
                int L = sc.nextInt();
                System.out.println("Breadth");
                int B = sc.nextInt();
                System.out.println("height");
                int H = sc.nextInt();
                Shape cube = new Shape(L, B, H);
                System.out.println("AreaOfCube: " + cube.CubeArea());
                break;
            case 2:
                System.out.println("Radius");
                int R = sc.nextInt();
                Shape sphere = new Shape(R);
                System.out.println("AreaOfSphere: " + sphere.SphereArea());
                break;
            case 3:
                System.out.println("Radius");
                int r = sc.nextInt();
                System.out.println("Height");
                int h = sc.nextInt();

                Shape cylinder = new Shape(r, h);
                System.out.println("AreaOfCylinder: " + cylinder.CylinderArea());
                break;
            default:
                break;
        }

    }

}
