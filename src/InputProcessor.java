import java.util.Scanner;

public class InputProcessor
{
    public static Double[] GetDoubles(String Weight, String Height)
    {
        try
        {
            double DoubleWeight = Double.parseDouble(Weight);
            double DoubleHeight = Double.parseDouble(Height);
            return new Double[]{DoubleWeight, DoubleHeight};
        }
        catch(Exception e)
        {
            return new Double[]{0.0, 0.0};
        }
    }

    public static String[] GetUserWeightHeight(boolean Errored)
    {
        String Weight;
        String Height;
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("======================================================");
        if(Errored)
        {
            System.out.println("Please input some actual numbers this time.");
        }
        System.out.println("Please type your weight using a dot as a decimal point, in Kilograms: ");
        Weight = MyScanner.nextLine();
        System.out.println("Please type your height using a dot as a decimal point, in Meters: ");
        Height = MyScanner.nextLine();
        System.out.println("======================================================");
        return new String[]{Weight, Height};
    }
}
