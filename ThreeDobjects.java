/*RAJU KUMAR
UEMK
Question:
Create a general class ThreeDObject and derive the classes Box,Cube,Cylinder, and Cone from it.The Class ThreeDObject has methods
wholeSurfaceArea() and Volume().Override these two methods in each of the derived classes to calculate dimensions of the objects are to taken
from users and passed through the respective constructor of each derived class.Write a main method test these classes.

*/
import java.util.*;
import java.lang.*;
class ThreeDObject {
  int dimension1,dimension2,dimension3;
  void getdata(){
    Scanner sn = new Scanner (System.in);
    System.out.println("Enter The length of Objects: ");
    dimension1=sn.nextInt();
    System.out.println("Enter The Breadth(radius in case of Cone) of Objects: ");
    dimension2=sn.nextInt();
    System.out.println("Enter The Width(height in case of Cone) of Objects :");
    dimension3=sn.nextInt();

  }
  void wholeSurfaceArea() {
    System.out.println("The Surface area is ");
     }
  void Volume() {
    System.out.println("The volume is ");
     }
}

class Box extends ThreeDObject {
  void getdata() {
    super.getdata();
    }

  void wholeSurfaceArea() {
    double sa=2*((dimension1*dimension2)+(dimension2*dimension3)+(dimension3*dimension1));
    System.out.println("The Surface area of Box is "+sa);
     }

  void Volume() {
    double vol=dimension1*dimension2*dimension3;
    System.out.println("The volume of Box is "+vol);
     }
  }

class cube extends ThreeDObject {
  void getdata() {
    super.getdata();
  }
  void wholeSurfaceArea() {
    double sa=2*((dimension1*dimension2)+(dimension2*dimension3)+(dimension3*dimension1));
    System.out.println("The Surface area of CUBE is "+sa);
  }
  void Volume() {
    double vol=dimension1*dimension2*dimension3;
    System.out.println("The volume is of CUBE "+vol);
  }
}

  class cone extends ThreeDObject {
    void getdata() {
      super.getdata();
    }
    void wholeSurfaceArea() {
      double s=Math.sqrt((dimension2*dimension2) + (dimension3*dimension3));
      double sa=(Math.PI*dimension2*dimension2)+(Math.PI*dimension2*s);
      System.out.println("The Surface area of CONE is "+sa);
    }
    void Volume() {
      double vol=(1/3)*(Math.PI*dimension2*dimension2*dimension3);
      System.out.println("The volume CONE is "+vol);
    }
  }

  class Cylinder extends ThreeDObject {
    void getdata() {
      super.getdata();
    }
    void wholeSurfaceArea() {
      double sa=(2*Math.PI*dimension2*dimension2) + (2*Math.PI*dimension2*dimension3);
      System.out.println("The Surface area of CYLINDER is "+sa);
    }
    void Volume() {
      double vol=(Math.PI*dimension2*dimension2*dimension3);
      System.out.println("The volume of CYLINDER is"+vol);
    }
  }

  class ThreeDobjects {
    public static void main(String arg[]){
       Box obj1 = new Box();
       obj1.getdata();
       obj1.wholeSurfaceArea();
       obj1.Volume();

       cube obj2 = new cube();
       obj2.getdata();
       obj2.wholeSurfaceArea();
       obj2.Volume();

       cone obj3 = new cone();
       obj3.getdata();
       obj3.wholeSurfaceArea();
       obj3.Volume();

       Cylinder obj4 = new Cylinder();
       obj4.getdata();
       obj4.wholeSurfaceArea();
       obj4.Volume();
    }
  }
