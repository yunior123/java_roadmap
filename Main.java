public class Main {
    public static void main(String[] args) {
        // This is a comment
        /* The code below will print the words Hello World
to the screen, and it is amazing */
      System.out.println("Hello World");
      System.out.println(3 + 3);
      String name = "John";
      System.out.println("Hello " + name);
      System.out.println("I am learning Java.");
      int myNum = 15;
      myNum = 20;  // myNum is now 20
      System.out.println(myNum);
      final int my1Num = 15;
      // my1Num = 20;  // will generate an error: cannot assign a value to a final variable
      int my11Num = 5;
      float myFloatNum = 5.99f;
      char myLetter = 'D';
      boolean myBool = true;
      String myText = "Hello";
      String firstName = "John ";
      String lastName = "Doe";
      String fullName = firstName + lastName;
      System.out.println(fullName); 
      // int x = 5;
      // int y = 6;
      // System.out.println(x + y); // Print the value of x + y  
      int x, y, z;
      x = y = z = 50;
      System.out.println(x + y + z);

      String studentName = "John Doe";
      int studentID = 15;
      int studentAge = 23;
      float studentFee = 75.25f;
      char studentGrade = 'B';
          
      // Print variables
      System.out.println("Student name: " + studentName);
      System.out.println("Student id: " + studentID);
      System.out.println("Student age: " + studentAge);
      System.out.println("Student fee: " + studentFee);
      System.out.println("Student grade: " + studentGrade);
    }
  }