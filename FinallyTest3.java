import java.io.FileInputStream;
import java.util.*;

public class FinallyTest3
{
    public static void main(String[] args) {
       // FileInputStream obj=new FileInputStream("/cd/vision_code/test50");
    

//  class not found exception
//we can handle excepion by using try catch block
try{
FileInputStream obj=new FileInputStream("/cd/vision_code/test50");

}
catch(Exception e)
{
System.out.println("it is catch block:");
}
finally{
System.out.println("it is finally:");
}
}
}