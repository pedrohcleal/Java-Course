package entities;
public class Rectangle {
    public double Width;
    public double Height;
    public double area(){
        return Width * Height;
    }
    public double Perimeter(){
        return 2 * (Width + Height);
    }
    public double Diagonal(){
        return Math.sqrt((Math.pow(Width,2))
                + (Math.pow(Height,2)));
    }
    public String toString(){
        return "Area= " + String.format("%.2f", area())
                + "\nPerimeter= "
                +  String.format("%.2f", Perimeter())
                + "\nDiagonal= "
                + String.format("%.2f", Diagonal());
    }
}
