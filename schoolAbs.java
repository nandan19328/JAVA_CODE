import java.util.*;
abstract  class schoolAbs { // abstract class 
    abstract void display(); // abstract method 
    // abstract method is used in class and method only .

    class branches extends schoolAbs{ // branch class extending the abstract class 
         void display(){
            String name = "Nandan Verma";
            int roll_no = 19328;
            String branch_name = "EEE";
            int age = 21;
            System.out.println("student name "+name);
            System.out.println("Student Roll-no"+roll_no);
            System.out.println("Student branch "+branch_name);
            System.out.println("student age "+age);

        }
        
        
            
        }
    }
    class driverschool {

        public static void main(String[] args) {
            schoolAbs a = new branches();
            a.display();
              
                
            
                
            

           

        }
    }
        
                
            

    
    

