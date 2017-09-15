import java.io.File;
import java.io.IOException;

public class createFile {
	public static void main(String arg[]) {
		 try {
			 //change the path as you wish
			 File file = new File("C:/file.txt");
			 if(file.createNewFile())
				 System.out.println("Success");
			   else 
				  System.out.println("Error");
		 }
		 catch(IOException ioe){
			 ioe.printStackTrace();
		 }
	}
}