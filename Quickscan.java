
/**
 * Algorithms for rapid sorting, use of practice and examples.
 *
 * @author (Nadav_Chen)
 */
public class Quickscan
{
    public static double halfMin(double[] a) {
        return halfMin(a, 0);  

    }

    private static double halfMin(double[] a, int i) {
        if(i == (a.length -1) / 2)
            return a[i];
        double val = halfMin(a, i + 1);
        return Math.min(a[i], val);
    }

    public static int maxEven(int[] a)
    {
        if (a.length % 2 == 0)
            return maxEven(a, a.length - 2);
        else
            return maxEven(a,a.length - 1);
    }

    private static int maxEven(int[] a, int i)
    {
        if (i == 0)
            return a[i];
        int val = maxEven(a, i - 2);
        return Math.max(a[i], val);
    }

    public static boolean twoAscending(int[] a) {
        return twoAscending(a, 0) && twoAscending(a, 1);
    }

    public static boolean twoAscending(int[] a, int i)
    {
        if (i >= a.length - 2)
            return true;
        if (a[i] < a[i + 2])
            return twoAscending(a, i + 2);
        return false;
    }
    
    public static boolean zigzag(int[] a)
    {
        return zigzag(a,0);
    }
    private static boolean zigzag(int[] a, int i)
    {
        if(i == a.length - 1)
            return true;
        if(a[i] % 2 == 0 && a[i] < a[i + 1])
            return zigzag(a , i + 1);
        if(a[i] % 2 != 0 && a[i] > a[i + 1])
            return zigzag(a, i + 1);
        else
            return false;
    }
    
    
    
    
    
    
    
    
}
