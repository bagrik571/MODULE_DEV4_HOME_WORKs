public class Triangle extends Shape{
    private String name;
    private String color;
    private int area;

    public Triangle(String name, String color, int area) {
        this.name = name;
        this.color = color;
        this.area = area;

    }

    @Override
    public String getName() {
        return name
                ;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getArea() {
        return area;
    }
}
