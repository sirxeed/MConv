/**
 * Created by Андрій on 19.06.2017.
 */
public class WeightCalculator {

    enum UnitsWeight {KILOGRAM, GRAM, MILIGRAM, POUND, CARAT, OUNCE}
    private UnitsWeight unitsWeight;
    private double gram;

    WeightCalculator(double value, enum units) {
        unitsWeight = this.units;
        value = this.value;
    }

}
