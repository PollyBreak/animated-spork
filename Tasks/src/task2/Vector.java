
package task2;

public class Vector {
    double x1,y1,x2,y2;
    double[] coordinate = new double[2];
    double module;
    public double modulus(double a, double b)
            {
                return(Math.sqrt(a*a+b*b));
            }
    public double[] countCoordinates()
            {
                double[] coordinates = new double[2];
                double x1 = this.x1;
                double x2 = this.x2;
                double y1 = this.y1;
                double y2 = this.y2;
                coordinates[0]=x2-x1;
                coordinates[1]=y2-y1;
                return coordinates;
            }
}
