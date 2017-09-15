import java.io.*;

public class CreateDirectory {
     public static void main(String[] args) {
		 //change path where you want to create a Directory
	    File dir = new File("C:/fileIO/");
		
		boolean isDirectoryCreated = dir.mkdir();
		
		if(isDirectoryCreated) 
		  System.out.println("CReated Sucessfully);
		else 
		System.out.println("Not Created Sucessfully);
		}
	}
	