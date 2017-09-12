import java.util.*;
class staff {
    int code;
	String name;
	staff(int code,String name) {
	   this.code=code;
	   this.name=name;
	   }
	 public void showData() {
	   System.out.println("STAFF DETAILS IS MAIN");
	   }
	   
 }
 
class teacher extends staff {
     String sub,publication;
	public teacher(int code,String name,String sub, String publication){
	    super(code,name);
		this.sub=sub;
		this.publication=publication;
		}
	public void showData() {
	        System.out.println("TEACHER ");
	    System.out.println("CODE= "+code);
	    System.out.println("NAME= "+name);
	    System.out.println("SUBJECT= "+sub);
	    System.out.println("PUBLICATION= "+publication);
	}
}

class officer extends staff {
    String grade;
	officer(int code,String name,String grade) {
	   super(code,name);
	   this.grade=grade;
	   }
	public void showData() {
	      System.out.println("OFFICER");
	    System.out.println("CODE= "+code);
	    System.out.println("NAME= "+name);
	    System.out.println("GRADE= "+grade);
		}
	}

class typist extends staff {
   int speed;
    typist(int code,String name,int speed){
     super(code,name);
      this.speed=speed;
   }
    public void showData() {
	   System.out.println("TYPIST");
       System.out.println("CODE= "+code);
	    System.out.println("NAME= "+name);
	    System.out.println("SPEED= "+speed);
   }
}   

class regularTypist extends typist {
     int salary;
       regularTypist(int code,String name,int speed,int salary){
       super(code,name,speed);
       this.salary=salary;
     }
     public void showData() {
	    System.out.println("REGULAR TYPIST");
        System.out.println("CODE= "+code);
	    System.out.println("NAME= "+name);
	    System.out.println("SPEED= "+speed);
		System.out.println("SALARY= "+salary);
	}
}
class casualTypist extends typist {
     int wages;
	    casualTypist(int code,String name,int speed,int wages) {
		    super(code,name,speed);
			this.wages=wages;
			}
		public void showData() {
		   System.out.println("CASUAL TYPIST");
		   System.out.println("CODE= "+code);
	    System.out.println("NAME= "+name);
	    System.out.println("DAILY WAGES= "+wages);
		System.out.println("SPEED= "+speed);
	    }
		}
class maindb {
    public static void main(String arg[]) {
	   //TEACHER OBJECT
	   teacher obj1 = new teacher(123,"RAJU","CSE","ARIHANT");
	   obj1.showData();
	   System.out.println();
	   
	   //OFFIVCER OBJECT
       officer obj2 = new officer(234,"ABHISEK","SUPERITENDENT");
       obj2.showData();
	   System.out.println();
	   
	   //TYPIST OBJECT
   	   typist obj3 = new typist(1267,"RAQUIB",230);
	   obj3.showData();
	   System.out.println();
	   
	   //REGULAR TYPIST
	   regularTypist obj4 = new regularTypist(1287,"HERO",235,12000);
	   obj4.showData();
	   System.out.println();
	   
	   //CASUAL TYPIST
	   casualTypist obj5 = new casualTypist(1345,"SOURAV",130,500);
	   obj5.showData();
	   System.out.println();
	  }
	}
        		