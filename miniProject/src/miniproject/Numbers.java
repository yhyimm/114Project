

// public interface operations 
// {
    
//     public void add();
//     public void subtract();
//     public void multiply();


// }

public class Numbers implements operations 
{
    String inputString;
    String outputString;
    double num1 = 0;
    double num2 = 0;
    double multresult = 0;
    double addresult = 0;
    double subresult = 0;
    double result = 0;
    StringBuilder sb = new StringBuilder();

    Numbers(String inputString, String outputString) {
        this.inputString = inputString;
        this.outputString = outputString;
    }

    // public void operation() {
    //     String[] splittedInput = inputString.split(" ");

    //     int i = 0;
    //     while (i < splittedInput.length - 1) {
    //         num1 = Double.parseDouble(splittedInput[i]);
    //         num2 = Double.parseDouble(splittedInput[i + 1]);

    //         add();
    //         result += addresult;

    //         if (result == Double.parseDouble(outputString)) {
    //             break;
    //         }
    //         subtract();
    //         result -= subresult;
    //         if (result == Double.parseDouble(outputString)) {
    //             break;
    //         }
    //         multiply();
    //         result *= multresult;
    //         if (result == Double.parseDouble(outputString)) {
    //             break;
    //         }

    //         i++;
    //     }
    // }

    public void add() {
        sb.append("(").append(num1).append(" + ").append(num2).append(") ");
        addresult = num1 + num2;
    }

    public void subtract() {
        sb.append("(").append(num1).append(" - ").append(num2).append(") ");
        subresult = num1 - num2;
    }

    public void multiply() {
        sb.append("(").append(num1).append(" * ").append(num2).append(") ");
        multresult = num1 * num2;
    }

    public String toString() {
        sb.append("= ").append(result);
        return sb.toString();
    }
}
