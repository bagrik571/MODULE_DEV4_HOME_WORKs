public class ConsoleShapePrinter implements ShapePrinter{

    private ShapeInfoCollector collector = new ShapeInfoCollector();
    @Override
    public void print(Shape shape, ShapeCharacteristics[] characteristics) {
        System.out.println(collector.getInfo(characteristics, shape));
    }
    }

