import java.lang.Math;

public class BMI {
    private double Weight;
    private double Height;
    private double bmiValue;
    private String interpretation;

    BMI(double weight, double height) {
        this.Weight = weight * 0.45359237;
        this.Height = height * 0.0254;
    }

    double getBmiValue() {
        this.bmiValue = this.Weight / Math.pow(this.Height, 2);
        return this.bmiValue;
    }

    String getInterpretation() {
        if (this.bmiValue < 18.5) {
            return "Underweight";
        } else if (18.5 <= this.bmiValue && this.bmiValue < 25) {
            return "Normal";
        } else if (25 <= this.bmiValue && this.bmiValue < 30) {
            return "Overweight";
        } else if (30 <= this.bmiValue) {
            return "Obese";
        }
        return "None";
    }

}

