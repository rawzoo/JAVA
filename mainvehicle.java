import java.util.*;
class vehicle {
     protected int regnNumber;
	 protected int speed;
	 protected String ownerName;
	 protected String color;
	 
	 public vehicle(int regnNumber,int speed,String ownerName,String color) {
	   this.regnNumber=regnNumber;
	   this.speed=speed;
	   this.ownerName=ownerName;
	   this.color=color;
	   
	   
	   }
	   public void showData() {
	      System.out.println("This is Vehicle class");
		  }
		 }

class bus extends vehicle {
      int vehicleNumber;
	  
	    public bus(int r,int s,String o,String c,int vehicleNumber) {
          super(r,s,o,c);
             this.vehicleNumber=vehicleNumber;
}

       public void showData() {
	    System.out.println("registration Number =" +regnNumber);
		System.out.println("Color =" +color);
		System.out.println("Speed is =" +speed);
		System.out.println("Owner Name is = "+ownerName);
		System.out.println("Vehicle Number is "+vehicleNumber);
		}
}

class car extends vehicle {
       private String manufacturerName;
	      public car(int r,int s,String o,String c,String manufacturerName) {
		    super(r,s,o,c);
			this.manufacturerName=manufacturerName;
	}
	 public void showData(){
	    System.out.println("CAR DETAILS");
	    System.out.println("registration Number =" +regnNumber);
		System.out.println("Color =" +color);
		System.out.println("Speed is =" +speed);
		System.out.println("Owner Name is = "+ownerName);
		System.out.println("Manufacturer  is ="+manufacturerName);
	    }
	}
	
class mainvehicle {
     public static void main(String arg[]) {
	   car obj1=new car(89283,120,"RAJU","DARK BLUE","TATA");
	   bus obj2=new bus(17281,110,"RAJU","BLACK",123442);
	   obj1.showData();
	   System.out.println("\n");
	   obj2.showData();
	   }
	   }
	   //End of Program
	   
	   
	
			
		
	   
	 