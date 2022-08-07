public class IMClassifier {
    public static String Classify(double IMC)
    {
        String[] IMClasses = {"Underweight", "Normal weight", "Overweight", "Obesity I", "Obesity II", "Obesity III"};
        Double[] IMCThresholds = {18.5, 24.9, 29.9, 34.9, 39.9};
        String IMClass = "";

        for(int i = 0; i < 6; i++) // Iterate through IMC classes
        {
            if(i != 5 && i != 0) // If it's neither the last nor the first
            {
                if(IMC > IMCThresholds[i-1] && IMC <= IMCThresholds[i]) // If IMC is bigger than the lower threshold and smaller than the current
                {
                    IMClass = IMClasses[i];
                }
            }
            else if(i == 5) // If it's the last
            {
                if(IMC > IMCThresholds[i-1]) // Check only if it's bigger than the previous one
                {
                    IMClass = IMClasses[i];
                }
            }
            else { // If it's the first
                if(IMC <= IMCThresholds[i]) // Check only if it's smaller than the first one
                {
                    IMClass = IMClasses[i];
                }
            }
        }

        return IMClass;
    }
}
