
package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    Vector A = new Vector();
    Vector B = new Vector();
    
    A.x1 = in.nextDouble();
    A.x2 = in.nextDouble();
    A.y1 = in.nextDouble();
    A.y2 = in.nextDouble();
    
    B.x1 = in.nextDouble();
    B.x2 = in.nextDouble();
    B.y1 = in.nextDouble();
    B.y2 = in.nextDouble();
    
    A.coordinate = A.countCoordinates();
    B.coordinate = B.countCoordinates();
    
    System.out.println(A.coordinate[0]);
    A.module = A.modulus(A.coordinate[0], A.coordinate[1]);
    B.module = B.modulus(B.coordinate[0], B.coordinate[1]);
    
    }
    
}
