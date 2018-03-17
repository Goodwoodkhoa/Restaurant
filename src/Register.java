import java.util.List;

enum Operators {
    ADD {
        public double calculate(double a, double b) { return a + b; }
    },
    SUBTRACT {
        public double calculate(double a, double b) { return a - b; }
    },
    DIVIDE {
        public double calculate(double a, double b) { return a / b; }        
    }, 
    MULTIPLY {
        public double calculate(double a, double b) { return a * b; }
    };

    public abstract double calculate(double a, double b);
}

public class Register {

    private static Register register;
    private static double taxRate;

    private Register() {}

    public static Register getInstance() {
        if (register == null) {
            register = new Register();
        }
        return register;
    }

    public void setTaxRate(double taxRate) {
        Register.taxRate = taxRate;
    }

    protected double calculate(double a, double b, Operators operator) {
        return operator.calculate(a, b);
    }

    public double calculateTotal(List<Food> orders) {
        double preTaxTotal = 0.0;
        for (Food o : orders) {
            preTaxTotal = calculate(preTaxTotal, o.getPrice(), Operators.ADD);
        }

        return calculate(preTaxTotal, taxRate, Operators.MULTIPLY);
    }
}
