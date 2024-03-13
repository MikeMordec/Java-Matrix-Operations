import java.util.Scanner;

class MainClass {
    public static void main(String args[]) {
        // a class object is created
        Add_Matrices obj = new Add_Matrices();

        // the class object performs a sequence of actions
        long preTime, postTime;

        preTime = System.currentTimeMillis();
        obj.create();
        postTime = System.currentTimeMillis();
        System.out.println("Time taken for matrix creation: " + (postTime - preTime) + " milliseconds");

        preTime = System.currentTimeMillis();
        obj.display();
        postTime = System.currentTimeMillis();
        System.out.println("Time taken for matrix display: " + (postTime - preTime) + " milliseconds");

        preTime = System.currentTimeMillis();
        obj.add();
        postTime = System.currentTimeMillis();
        System.out.println("Time taken for matrix addition: " + (postTime - preTime) + " milliseconds");
    }
}