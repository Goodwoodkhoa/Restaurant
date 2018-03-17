public class Register {
    public static double calculator(double answer, double b, String operator) {

        if (operator.equals("add")) {
            answer = answer + b;
        } else if (operator.equals("subtract")) {
            answer = answer - b;
        } else if (operator.equals("divide")) {
            answer = answer / b;
        } else if (operator.equals("multiply")) {
            answer = answer * b;
        }


        return answer;
    }

}
