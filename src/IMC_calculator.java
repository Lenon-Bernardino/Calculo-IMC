public class IMC_calculator {
    public static double calculate(Double[] WeightHeight)
    {
        return WeightHeight[0]/Math.pow(WeightHeight[1], 2);
    }
}
