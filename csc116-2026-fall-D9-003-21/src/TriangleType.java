import java.util.*;

/**
 * This class is to determine the type of a triangle
 */
public class TriangleType{

    public static void main(String[] args){

        //Getting the sides from the input
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the first side");
        double s1 = scnr.nextDouble();
        System.out.println("Enter the second side");
        double s2 = scnr.nextDouble();
        System.out.println("Enter the third side");
        double s3 = scnr.nextDouble();

        //Checking the validity of the traingle sides and print the type if valid
        if(isValidTriangle(s1, s2, s3)){
            System.out.println(getTriangleType(s1,s2,s3));
        }
        else {
            System.out.println("Invalid");
        }
    }//main end




    /** This method checks whether the three side of a triangle are legal and form a legal triangle
     * @param s1 side 1 size
     * @param s2 side 2 size
     * @param s3 side 3 size
     * @return true if the three sides form a valid triangle and false if not
     */

    public static boolean isValidTriangle(double s1, double s2, double s3){
        //Checking if any of the sides has illegal sizes (side >=0 ) and throws and IllegalArgumentException with message "Illegal side" if not
        if (s1<=0 || s2<=0 || s3<=0){
              return false;
        }

        //Checking if the three sides can form a valid triangle and return false if can't
        if(s1>=s2+s3 || s2>=s3+s1 ||s3>=s1+s2){
            return false;
        }

        //return true if all side sizes are legal and form a valid triangle
        return true;
    }

    /**
     * This method receives the sizes of three sides of a triangle and returns the type of the triangle
     * @param s1 side 1 size
     * @param s2 side 2 size
     * @param s3 side 3 size
     * @return the type of the triangle
     * @throws IllegalArgumentException with message "Invalid Triangle" if any of the sides are illegal (side <= 0)

     */
    public static String getTriangleType(double s1, double s2, double s3){

        //checking the argument validity
        if (!(isValidTriangle(s1,s2,s3)) ){
              throw new IllegalArgumentException("Invalid Triangle");
        }


        //Equilateral
        if(s1==s2 && s2==s3 && s1==s3){
            return("equilateral");
        }
        //Isosceles
        else if(s1==s2 || s2==s3 || s1==s3){
            return("Isosceles");
        }
        else {
              return("Scalene");
        }
        // else if ((s1!=s2 && s2!=s3 && s1!=s3))
        //     return("Scalene");

    } //end getTriangle

} //end TriangleType class
