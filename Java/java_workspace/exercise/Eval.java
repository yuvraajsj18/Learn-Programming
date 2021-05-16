import java.util.Stack;

class Eval {
  public static void main(String[] args) {
    System.out.println(eval("1.2+4.2*5.5+1"));
  }

  private static Float eval(String query) {
        Stack<Float> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        int queryLength = query.length();
        for (int i = 0; i < queryLength; i++) {
            char symbol = query.charAt(i);
            
            if (symbol >= '0' && symbol <= '9') {
                String number = "";
                while (i < queryLength && !isOperator(symbol)) {
                    number += query.charAt(i);
                    i++;
                    if (i < queryLength)
                        symbol = query.charAt(i);
                }
                operands.push(Float.parseFloat(number));
                i--;    // adjust i for next loop update so that operator is read next
            }
            else if (isOperator(symbol)) {
                if (operators.empty()) {
                    operators.push(symbol);
                }
                else if ((symbol == '*' || symbol == '/'))
                {
                    char last_operator = operators.peek();

                    if (last_operator == '*') {
                        float num2 = operands.pop();
                        float num1 = operands.pop();
                        operands.push(num1 * num2);
                        operators.pop();
                    }
                    else if (last_operator == '/') {
                        float num2 = operands.pop();
                        float num1 = operands.pop();
                        operands.push(num1 / num2);
                        operators.pop();
                    }

                    operators.push(symbol);
                }
                else if (symbol == '+' || symbol == '-') {
                    char last_operator = operators.peek();

                    if (last_operator == '+') {
                        float num2 = operands.pop();
                        float num1 = operands.pop();
                        operands.push(num1 + num2);
                        operators.pop();
                    }
                    else if (last_operator == '-') {
                        float num2 = operands.pop();
                        float num1 = operands.pop();
                        operands.push(num1 - num2);
                        operators.pop();
                    }
                    else if (last_operator == '/') {
                        float num2 = operands.pop();
                        float num1 = operands.pop();
                        operands.push(num1 / num2);
                        operators.pop();
                    }
                    else if (last_operator == '*') {
                        float num2 = operands.pop();
                        float num1 = operands.pop();
                        operands.push(num1 * num2);
                        operators.pop();
                    }

                    operators.push(symbol);
                }
            }
            else {
                throw new ArithmeticException("Invalid Input");
            }
        }

        while (!operators.empty()) {
            float num2 = operands.pop();
            float num1 = operands.pop();
            char operator = operators.pop();

            switch (operator) {
                case '+':
                    operands.push(num1 + num2);
                    break;
                case '-':
                    operands.push(num1 - num2);
                    break;
                case '/':
                    operands.push(num1 / num2);
                    break;
                case '*':
                    operands.push(num1 * num2);
                    break;
            }
        }

        return operands.empty() ? 0.0f : operands.pop();
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '/' || ch == '*';
    }

}