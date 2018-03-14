public class Register {
    public static void calculator(int total, int b, String operator) {
        String add, subtract, divide, multiply;
        int result = 0;

        if (operator.equals("add")) {
            total = total + b;
        } else if (operator.equals("subtract")) {
            total = total - b;
        } else if (operator.equals("divide")) {
            total = total / b;
        } else if (operator.equals("multiply")) {
            total = total * b;
        }


        System.out.println(result);
    }
}
