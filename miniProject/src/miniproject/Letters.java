

package miniproject;



public class Letters implements operations{

    String inputString;
    String outputString;
    Letters(String inputString, String outputString){
        this.inputString = inputString;
        this.outputString = outputString;
       
    }


    public String Operation (){
        String [] splittedInput = inputString.split("");
        String [] splittedOutput = outputString.split("");
        if (splittedInput.length==0||splittedOutput.length==0){
           // System.out.println();
            return "Invalid input";
        }

        while (splittedInput.length!=0){
            if (splittedInput.equals(splittedOutput)){
                return inputString;
            }
            

        }

    
            return "";
    }
 

    public void add(){


    }

    public void subtract(){
    }


    public void multiply(){}
   

    
}
