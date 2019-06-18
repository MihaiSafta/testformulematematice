package org.fasttrackit;

/**
 Create a method in App to receive 3 numbers, display them and display their average.
 3. Invoke that method from App.main() with 3 numbers of your choice
 */
public class App 
{

public void displayAverage(double a, double b, double c){
    System.out.println("Numbers are :" + a + "," + b + "," + c);
    double average = (a+b+c)/3;
    System.out.println("Average is :" + average);

}


    public static void main( String[] args )
    { App app = new App();
    app.displayAverage(2.5,3,5.5);

    }
}
