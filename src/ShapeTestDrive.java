public class ShapeTestDrive {
    public static void main(String[]args){


        Rectangle rectangle =  new Rectangle(2,3);
        System.out.println("Area of Rectangle");
        rectangle.printArea();
        System.out.println("Perimeter of Rectangle");
        rectangle.printPerimeter();

        Square square=new Square(5);
        System.out.println("Area of Square");
        square.printArea();
        System.out.println("Perimeter of Square");
        square.printPerimeter();

        for(int i=0;i<10;i++){
            System.out.println("Area of square "+(i+1));
            Square square1=new Square(10+i);
            square1.printArea();
        }
    }
}
