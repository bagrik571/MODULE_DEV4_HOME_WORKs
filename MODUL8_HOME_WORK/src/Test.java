public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle", "Red", 25);
        Shape cone = new Cone("Cone", "Blue", 105);
        Shape oval = new Oval("Oval", "Pink", 44);
        Shape quad = new Quad("Quad", "Black", 69);
        Shape triangle = new Triangle("Triangle", "White", 58);
        ShapeCharacteristics[] characteristics = {ShapeCharacteristics.COLOR, ShapeCharacteristics.NAME, ShapeCharacteristics.AREA};

        ShapePrinter sp = new ConsoleShapePrinter();
        sp.print(circle, characteristics);
        sp.print(cone, characteristics);
        sp.print(oval, characteristics);
        sp.print(quad, characteristics);
        sp.print(triangle, characteristics);
    }
}