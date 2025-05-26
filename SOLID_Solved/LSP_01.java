package SOLID;

public class LSP_01 {

   
    public static abstract class Shape {
        public abstract int getArea();
    }

    
    public static class Rectangle extends Shape {
        protected int width;
        protected int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public int getArea() {
            return width * height;
        }
    }


    public static class Square extends Shape {
        private int side;

        public Square(int side) {
            this.side = side;
        }

        public void setSide(int side) {
            this.side = side;
        }

        @Override
        public int getArea() {
            return side * side;
        }
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Shape square = new Square(5);
        System.out.println("Square Area: " + square.getArea());
    }
}
