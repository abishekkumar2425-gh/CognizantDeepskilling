class Shape{
    void draw(){
        System.out.println("Drawing a shape");
    }
    void erase(){
        System.out.println("Erasing a shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a circle");
    }
    void erase(){
        System.out.println("Erasing a circle");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing a triangle");
    }
    void erase(){
        System.out.println("Erasing a triangle");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Drawing a square");
    }
    void erase(){
        System.out.println("Erasing a square");
    }
}

class Shapes{
    public static void main(String args[]){
      Shape c=new Circle();
      Shape t=new Triangle();
      Shape s=new Square();
      c.draw();
      c.erase();
      t.draw();
      t.erase();
      s.draw();
      s.erase();
    }
}