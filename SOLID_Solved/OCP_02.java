package SOLID;


public class OCP_02 {

    public static abstract class Shape {
        public abstract double getArea();
    }

    public static class Square extends Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }
    }

    public static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

   
    public static class AreaCalculator {
        public double getArea(Shape shape) {
            return shape.getArea();
        }
    }
}
