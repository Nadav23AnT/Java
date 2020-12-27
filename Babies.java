
/**
 * This is class  Babies.
 * Tests the health of the babies in postpartum tests and checks if further tests are needed
 *
 * @author (your name)
 * @email (nadav2282@gmail.com)
 */
import java.util.Scanner;
public class Babies
{

        private double[][] weight = {{2.5, 2.52, 2.7, 2.6, 2.5},
                {4.5, 4.6, 4.7, 5, 5.1},
                {2.5, 2.6, 2.5, 2.4, 2.2},
                {3.72, 3.8, 3.8, 3.7, 3.7},
                {1.5, 1.6, 1.82, 1.9, 2.2}};

        private double[][] height = {{0.51, 0.51, 0.52, 0.52, 0.53},
                {0.43, 0.43, 0.43, 0.43, 0.44},
                {0.47, 0.48, 0.49, 0.49, 0.49},
                {0.6, 0.6, 0.6, 0.6, 0.6},
                {0.61, 0.61, 0.62, 0.63, 0.63}};

        public void check() {

            for (int i = 0; i < weight.length; i++) {

                if (weight[i][0] > weight[i][weight[0].length - 1])

                    System.out.println("baby number " + i);

            }

        }

        public void max() {
            double max = 0;
            int index = -1;
            for (int i = 0; i < weight.length; i++) {
                for (int j = 0; j < weight[0].length; j++) {
                    double BMI = weight[i][j] / (height[i][j] * height[i][j]);
                    if (BMI > max) {
                        max = BMI;
                        index = i;
                    }
                }
            }
            System.out.println("Max BMI is " + max + ", in baby number " + index);
        }
} // end of class Babies
