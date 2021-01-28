
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
    private int[][] _matrixArray;
    private final int FACTOR=1;

    public Matrix(int[][] array) {
        /** Constructs a Matrix from 2D array.*/
        _matrixArray= new int[array.length][array[MIN].length];
        int temp;
        for(int i=0; i < array.length; i++)
            for(int k=0; k < array[i].length; k++){   
                temp = array[i][k];
                _matrixArray[i][k] = temp;
            }
    }

    public Matrix(int size1, int size2) {
        /** Constructs a size1 by size2 Matrix of zeroes */
        _matrixArray = new int[size1][size2];
    }

    public String toString()    {
        /** Displays the output in an orderly fashion, 
         * elements in the same row will be separated by a tab */
        String tempString = "";
        for(int i=0; i < _matrixArray.length; i++){
            for(int k=0; k< _matrixArray[i].length - FACTOR; k++)
                tempString += _matrixArray[i][k] + "\t";
            tempString += _matrixArray[i][_matrixArray[i].length-FACTOR] + "\n";
        }
        return tempString;
    }

    public Matrix flipHorizontal()  {
        /** Flip the values horizontally */
        int[][] horizontal = new int[_matrixArray.length][_matrixArray[MIN].length];
        for(int i=0; i < _matrixArray.length/2; i++){
            for(int k=0; k < _matrixArray[i].length; k++){
                horizontal[i][k] = _matrixArray[(_matrixArray.length-FACTOR)-i][k];
                horizontal[(_matrixArray.length-FACTOR)-i][k] = _matrixArray[i][k];
            }
        }
        return new Matrix(horizontal);
    }
    

    public Matrix flipVertical()    {
        /** Flip the values?vertically */
        int[][] vertical = new int[_matrixArray.length][_matrixArray[MIN].length];;
        for(int i=MIN; i < _matrixArray.length; i++){
            for(int k=MIN; k < _matrixArray[i].length/2; k++){
                vertical[i][k] = _matrixArray[i][(_matrixArray[i].length-FACTOR)-k];
                vertical[i][(_matrixArray[i].length-FACTOR)-k] = _matrixArray[i][k];
            }
        }
        return new Matrix(vertical);
    }

    public Matrix rotateClockwise()     {
        /** Rotate the entire image clockwise 90 degrees, 
         * may resize the image */
        int[][] tempArray = new int[_matrixArray[MIN].length][_matrixArray.length];
        for(int i=0; i < _matrixArray.length;i++)
            for(int m=0; m < _matrixArray[0].length;m++)
                tempArray[m][tempArray[m].length-FACTOR - i] = _matrixArray[i][m];
        return new Matrix(tempArray);
    }

    public Matrix rotateCounterClockwise()     {
        /** Rotate the entire image counterclockwise 90 degrees, 
         * may resize the image */
        int[][] tempArray = new int[_matrixArray[MIN].length][_matrixArray.length];
        for(int i=0; i < _matrixArray.length;i++)
            for(int m=0; m < _matrixArray[MIN].length;m++)
                tempArray[m][i] = _matrixArray[i][_matrixArray[i].length-FACTOR-m];
        return new Matrix(tempArray);
    }

    public Matrix makeNegative()    {
        /** Change each value in the array to its inverse value 
         * (relative to the range of shades between white and black, 255) */
        int[][] negetive = new int[this._matrixArray.length][_matrixArray[MIN].length];
        for(int i=0; i < _matrixArray.length; i++)
            for(int k=0; k < _matrixArray[i].length; k++)
                negetive[i][k] = MAX - _matrixArray[i][k];
        return new Matrix(negetive);
    }
} // end of class Metrix
