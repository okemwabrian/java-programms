public class PowerCalculator {

    // Function to calculate power
    public static double calculatePower(double voltage, double current) {
        return voltage * current;
    }

    public static void main(String[] args) {
        double voltage = 230.0; // Example voltage in volts
        double current = 5.0;   // Example current in amperes

        double power = calculatePower(voltage, current);
        System.out.println("Power: " + power + " Watts");
    }
}
