
/**
 * The Matrix class represents a two-dimensional array of integers in the 255-0 range.
 * The matrix represents a two-dimensional image in black and white, 
 * with the numbers representing the shades of gray in the image
 * Where 0 is white and 255 is black.
 *
 * @author (Nadav Chen)
 * @email (nadav2282@gmail.com)
 */

public class Matrix
{
    private final int MIN=0, MAX=255;
    private int[][] matrixArray;
    private final int FACTOR=1;

    public Matrix(int[][] array) {
        /** Constructs a Matrix from 2D array.*/
        matrixArray= new int[array.length][array[0].length];
        int temp;
        for(int i=0; i < array.length; i++)
            for(int k=0; k < array[i].length; k++){   
                temp = array[i][k];
                matrixArray[i][k] = temp;
            }
    }

    public Matrix(int size1, int size2) {
        /** Constructs a size1 by size2 Matrix of zeroes */
        matrixArray = new int[size1][size2];
        for(int i=0; i < matrixArray.length; i++)
            for(int k=0; k < matrixArray[i].length; k++)
                matrixArray[i][k] = MIN;
    }

    public String toString()    {
        /** Displays the output in an orderly fashion, 
         * elements in the same row will be separated by a tab */
        String tempString = "";
        for(int i=0; i < matrixArray.length; i++){
            for(int k=0; k< matrixArray[i].length - FACTOR; k++)
                tempString += matrixArray[i][k] + "\t";
            tempString += matrixArray[i][matrixArray[i].length-FACTOR] + "\n";
        }
        return tempString;
    }

    public Matrix flipHorizontal()  {
        /** Flip the values horizontally */
        int temp;
        for(int i=0; i < matrixArray.length/2; i++){
            for(int k=0; k < matrixArray[i].length; k++){
                temp = matrixArray[i][k];
                matrixArray[i][k] = matrixArray[(matrixArray.length-FACTOR)-i][k];
                matrixArray[(matrixArray.length-FACTOR)-i][k] = temp;
            }
        }
        return this;
    }

    public Matrix flipVertical()    {
        /** Flip the values?vertically */
        int temp;
        for(int i=MIN; i < matrixArray.length; i++){
            for(int k=MIN; k < matrixArray[i].length/2; k++){
                temp = matrixArray[i][k];
                matrixArray[i][k] = matrixArray[i][(matrixArray[i].length-FACTOR)-k];
                matrixArray[i][(matrixArray[i].length-FACTOR)-k] = temp;
            }
        }
        return this;
    }

    public Matrix rotateClockwise()     {
        /** Rotate the entire image clockwise 90 degrees, 
         * may resize the image */
        int[][] tempArray = new int[matrixArray[MIN].length][matrixArray.length];
        for(int i=0; i < matrixArray.length;i++)
            for(int m=0; m < matrixArray[0].length;m++)
                tempArray[m][tempArray[m].length-FACTOR - i] = matrixArray[i][m];
        Matrix move90 = new Matrix(tempArray);
        
        return move90;
    }

    public Matrix rotateCounterClockwise()     {
        /** Rotate the entire image counterclockwise 90 degrees, 
         * may resize the image */
        int[][] tempArray = new int[matrixArray[MIN].length][matrixArray.length];
        for(int i=0; i < matrixArray.length;i++)
            for(int m=0; m < matrixArray[0].length;m++)
                tempArray[m][i] = matrixArray[i][matrixArray[i].length-FACTOR-m];
        Matrix moveBack90 = new Matrix(tempArray);
        return moveBack90;
    }

    public Matrix makeNegative()    {
        /** Change each value in the array to its inverse value 
         * (relative to the range of shades between white and black, 255) */
        int[][] negetive = new int[this.matrixArray.length][matrixArray[MIN].length];
        for(int i=0; i < matrixArray.length; i++)
            for(int k=0; k < matrixArray[i].length; k++)
                negetive[i][k] = MAX - matrixArray[i][k];
        return new Matrix(negetive);
    }
} // end of class Metrix
