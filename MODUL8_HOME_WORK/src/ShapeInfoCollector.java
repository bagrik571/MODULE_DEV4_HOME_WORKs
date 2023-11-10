public class ShapeInfoCollector {
    public String getInfo(ShapeCharacteristics[] characteristics, Shape s) {
        if (characteristics.length > ShapeCharacteristics.values().length) {
            throw new IllegalArgumentException("there is only " + ShapeCharacteristics.values().length + " characteristics but you trying to pass more");
        }
        StringBuilder sb = new StringBuilder();
        if (isExists(characteristics, ShapeCharacteristics.NAME)) {
            sb.append("Shape name is ");
            sb.append(s.getName());
        }
        if (isExists(characteristics, ShapeCharacteristics.COLOR)) {
            sb.append(". ");
            sb.append("Color is ");
            sb.append(s.getColor());
        }
        if (isExists(characteristics, ShapeCharacteristics.AREA)) {
            sb.append(". ");
            sb.append("Shape area is ");
            sb.append(s.getArea());
        }
        return sb.toString();
    }

    public boolean isExists(ShapeCharacteristics[] characteristics, ShapeCharacteristics characteristic) {
        for (ShapeCharacteristics sc : characteristics) {
            if (sc == characteristic) {
                return true;
            }
        }
        return false;
    }
}

