public class Square extends Rectangle {
    int s;

    Square(int s) {
        super(s, s);
        this.s = s;
    }

    void printPerimeter() {
        System.out.println(4*s);
    }
}
