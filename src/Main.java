import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        String Weight = "";
        String Height = "";
        boolean Errored = false;
        while(!Weight.equals("cancelar") && !Height.equals("cancelar"))
        {
            String[] UserHWInputs = InputProcessor.GetUserWeightHeight(Errored); // Returns array with user-given weight and height strings
            Weight = UserHWInputs[0];
            Height = UserHWInputs[1];
            Double[] WeightHeight = InputProcessor.GetDoubles(Weight, Height); // Returns weight and height converted to double, if they couldn't be converted, they're just 0.0
            if(WeightHeight[0] == 0.0 && WeightHeight[1] == 0.0) Errored = true; // If it couldn't be converted, error
            else
            {
                double IMC = IMC_calculator.calculate(WeightHeight);
                String IMClass = IMClassifier.Classify(IMC);
                System.out.println("You are in the " + IMClass + " class.");
                Errored = false;
            }
        }
    }
}
