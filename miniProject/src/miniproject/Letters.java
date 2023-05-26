

package miniproject;



public class Letters implements operations{

    String inputString;
    String outputString;
    Letters(String inputString, String outputString){
        this.inputString = inputString;
        this.outputString = outputString;
       
    }


    public void Operation (){
        String [] splittedInput = inputString.split("");
        String [] splittedOutput = outputString.split("");
        if (splittedInput.length==0||splittedOutput.length==0){
            System.out.println("Invalid input");
            return;
        }

        

    

    }
 

    public void add(){


    }

    public void subtract(){
    }


    public void multiply(){}
   

    
}
