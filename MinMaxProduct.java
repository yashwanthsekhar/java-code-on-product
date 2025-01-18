public class MinMaxProduct {

    public static boolean isMultipleOfEachOther(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        // Find the minimum and maximum elements in the array
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < minVal) {
                minVal = num;
            }
            if (num > maxVal) {
                maxVal = num;
            }
        }

        // Calculate the product of minVal and maxVal
        int product = minVal * maxVal;

        // Check if the product is a multiple of both minVal and maxVal
        boolean isMultiple = (product % minVal == 0) && (product % maxVal == 0);

        return isMultiple;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        boolean result = isMultipleOfEachOther(arr);

        if (result) {
            System.out.println("The product of the minimum and maximum elements is a multiple of each other.");
        } else {
            System.out.println("The product of the minimum and maximum elements is not a multiple of each other.");
        }
    }
}
