package Lab3;

public class c_Double
{
    public static void main(String[] args)
    {
        Double object = Double.valueOf(9.99);
        Double o_string = Double.parseDouble("9.99");

        byte o_byte =  object.byteValue();
        short o_short = object.shortValue();
        int o_int = object.intValue();
        long o_long = object.longValue();
        float o_float = object.floatValue();
        double o_double = object.doubleValue();
        boolean o_bolean = object > 0 ? true: false;

        System.out.println(object);

        String d = Double.toString(3.14);

        System.out.println(d);
    }
}