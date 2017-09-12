import java.util.*;
class arrays {
   static final int size = 1000;
   int i;
   int top=-1;

int arr[]=new int[size];

 void push(int item) {
  if(top>=size) {
     System.out.println("Overflow");
    return;
  } else {
   arr[++top]=item;
 }
}

 void pop() {
   int v;
   if(top<0) {
     System.out.println("Underflow");
     return;
   }
   else{
   v=arr[top--];
   System.out.println(v+ " IS DELETED.");
    return;
 }
 }

 void peep() {
   if(top==-1) {
     System.out.println("Underflow");
     return;
   }
   System.out.println("The TopMost Elements is "+arr[top]);
 }

 void display() {
   int i;
   if(top==-1) {
     System.out.println("Underflow");
     return;
   }
     System.out.println("The Elements in the Stack is ");
     for(i=top;i>0;i--);
      System.out.println(arr[i]);
      return;
 }
 }

 class arraystack {
   public static void main(String arg[]) {
     arrays obj = new arrays();

     int it;
     int ch;
     boolean done = false;
     while(!done) {
       System.out.println("Menu");
       System.out.println("1.Push\n2.Pop\n3.Peep\n4.Display\n5.Exit");
       System.out.println("Enter Your Choice");
       Scanner sn = new Scanner(System.in);
       ch=sn.nextInt();
       switch(ch) {
         case (1):
           System.out.println("Enter the Element that you want to insert: ");
           it=sn.nextInt();
          obj.push(it);
                 break;
         case (2):obj.pop();
                break;
        case (3):obj.peep();
               break;
        case (4):obj.display();
               break;
        case (5):System.exit(0);
        Default:System.out.println("Please Enter a valid OPtion");

      }
     }
   }
 }
