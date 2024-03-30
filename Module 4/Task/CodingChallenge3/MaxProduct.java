package CodingChallenge3;


//Find two numbers of which the product is maximum in an array
public class MaxProduct {

        public static void main(String[] args) {
            int[] array = {1, 3, -5, 2, 6}; // Example array

            int[] result = findMaxProductPair(array);
            System.out.println("The two numbers with maximum product are: " + result[0] + " and " + result[1]);
        }

        public static int[] findMaxProductPair(int[] array) {
            if (array.length < 2) {
                throw new IllegalArgumentException("Array should contain at least two elements");
            }

            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;

            for (int num : array) {
                if (num > max1) {
                    max2 = max1;
                    max1 = num;
                } else if (num > max2) {
                    max2 = num;
                }

                if (num < min1) {
                    min2 = min1;
                    min1 = num;
                } else if (num < min2) {
                    min2 = num;
                }
            }

            // Compare products of largest positive pair and largest negative pair
            int product1 = max1 * max2;
            int product2 = min1 * min2;

            return product1 > product2 ? new int[]{max1, max2} : new int[]{min1, min2};
        }
    }


