public class Rectangle {
    int length,breadth;

    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void printArea(){
        System.out.println(length*breadth);
    }

    void printPerimeter(){
        System.out.println(2*(length+breadth));
    }
}
