class shape {
    void draw() {
        System.out.println("draw whatever you want");
    }
    void erease() {
        System.out.println("erease the part from here");
    }
}
class circle extends shape {
    void draw() {
        System.out.println("draw a circle");
    }
    void erease() {
        System.out.println("erease a part of the shape");
    }
}
class triangle extends shape {
    void draw() {
        System.out.println("draw a triangle");
    }
    void erease() {
        System.out.println("erease a part of shape");
    }
}
class square extends shape {
    void draw() {
        System.out.println("draw a square");
    }
    void erease() {
        System.out.println("erease a part of shape");
    }
}
public class find_shape{

    public static void main() {
        circle obj1 = new circle();
        circle obj2 = new circle();
        obj1.draw();
        obj2.erease();
        triangle obj3 = new triangle();
        triangle obj4 = new triangle();
        obj3.draw();
        obj4.erease();
        square obj5 = new square();
        square obj6 = new square();
        obj5.draw();
        obj6.erease();
    }
}
