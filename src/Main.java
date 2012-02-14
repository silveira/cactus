
import cactus.Computer;
import java.util.Scanner;

/**
 *
 */
public class Main {
    
    public static void main(String args[]) {
        Scanner inputContext = new Scanner(System.in);
        Computer computer = new Computer();
        
        switch(args[0]){
            
            case "execute":
                //Send the binary code to computer
                computer.setProgram(inputContext.nextLine());
                
                break;
            case "compile":
                //Create a instance of compiler
                cactus.utils.Compiler compiler = new cactus.utils.Compiler();
                
                //Compile the assembly code and send it to computer
                computer.setProgram(compiler.compile(inputContext.nextLine()));
                
                break;
            default:
                System.out.println("In order to run this program you have to pass 1 parameter.");
        }
    }
    
}
