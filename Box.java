class Box {
    private int width;
    private int hieght;
    private int breadth;

    Box() {
        width = 10;
        hieght = 20;
        breadth = 30;
    }

    int getwidth() {
        return width;
    }

    int gethieght() {
        return hieght;
    }

    int getbreadth() {
        return breadth;
    }

    public void sethieght(int h) {
        hieght = h;
    }

    public void setwidth(int w) {
        width = w;

    }

    public void setbreadth(int b) {
        breadth = b;

    }

    int volume(int x, int y, int z) {
        return x * y * z;
    }

   int volume(double x, double y, double z) {
       return x * y * z;
   }

    int volume() {
        return this.width * this.hieght * this.breadth;
    }

}
public class Box {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setbreadth(10);
        b1.sethieght(20);
        b1.setwidth(30);
        System.out.println("Without Arguments : Volume of Box1 = " + b1.volume());
        System.out.println("With Int Arguments : Volume of Box1 = " + b1.volume(1, 5, 45));
        System.out.println("With Double Agrguments : Volume of Box1 = " + b1.volume(1.05, 15.6, 5.5));
    }
}
