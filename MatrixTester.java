
/**
 * This is a tester to the class Matrix.
 *
 * @author Liran
 * @version 7/1/2021
 */
public class MatrixTester
{
    /**
     * The main method runs the tester to the class Matrix.
     */
    public static void main(String[] args){
        int[][] arr1 = { {1,2,3,40,57} , {11,12,13,16}, {71,82,33,96} };
        int[][] arr2 = { {21,22,23,27} };
        Matrix mat1 = new Matrix(arr1);
        Matrix mat2 = new Matrix(arr2);
        Matrix mat3 = new Matrix(arr1.length, arr1[0].length);
        Matrix mat4 = new Matrix(arr2.length, arr2[0].length);
        
        System.out.println("TO STRING");
        System.out.println("arr1 = " + "\n" + arr1);
        System.out.println("arr2 = " + "\n" + arr2);
        System.out.println("mat1 = " + "\n" + mat1);
        System.out.println("mat2 = " + "\n" + mat2);
        System.out.println("mat3 = " + "\n" + mat3);
        System.out.println("mat4 = " + "\n" + mat4);

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("MAKE NEGATIVE");
        System.out.println("mat1.makeNegative() = " + "\n" + mat1.makeNegative());
        System.out.println("mat2.makeNegative() = " + "\n" + mat2.makeNegative());
        System.out.println("mat3.makeNegative() = " + "\n" + mat3.makeNegative());
        System.out.println("mat4.makeNegative() = " + "\n" + mat4.makeNegative());
        
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("FLIP HORIZONTAL");
        System.out.println("mat1.flipHorizontal() = " + "\n" + mat1.flipHorizontal());
        System.out.println("mat2.flipHorizontal() = " + "\n" + mat2.flipHorizontal());
        System.out.println("mat3.flipHorizontal() = " + "\n" + mat3.flipHorizontal());
        System.out.println("mat4.flipHorizontal() = " + "\n" + mat4.flipHorizontal());
        
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("FLIP VERTICAL");
        System.out.println("mat1.flipVertical() = " + "\n" + mat1.flipVertical());
        System.out.println("mat2.flipVertical() = " + "\n" + mat2.flipVertical());
        System.out.println("mat3.flipVertical() = " + "\n" + mat3.flipVertical());
        System.out.println("mat4.flipVertical() = " + "\n" + mat4.flipVertical());
        
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("ROTATE CLOCKWISE");
        System.out.println("Original: \n" + mat1);
        System.out.println("mat1.rotateClockwise() = " + "\n" + mat1.rotateClockwise());
        System.out.println("Original: \n" + mat2);
        System.out.println("mat2.rotateClockwise() = " + "\n" + mat2.rotateClockwise());
        System.out.println("Original: \n" + mat3);
        System.out.println("mat3.rotateClockwise() = " + "\n" + mat3.rotateClockwise());
        System.out.println("Original: \n" + mat4);
        System.out.println("mat4.rotateClockwise() = " + "\n" + mat4.rotateClockwise());
        
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("ROTATE COUTER-CLOCKWISE");
        System.out.println("Original: \n" + mat1);
        System.out.println("mat1.rotateCounterClockwise() = " + "\n" + mat1.rotateCounterClockwise());
        System.out.println("Original: \n" + mat2);
        System.out.println("mat2.rotateCounterClockwise() = " + "\n" + mat2.rotateCounterClockwise());
        System.out.println("Original: \n" + mat3);
        System.out.println("mat3.rotateCounterClockwise() = " + "\n" + mat3.rotateCounterClockwise());
        System.out.println("Original: \n" + mat4);
        System.out.println("mat4.rotateCounterClockwise() = " + "\n" + mat4.rotateCounterClockwise());
        
    } //end of method main
    
} //end of class MatrixTester 
