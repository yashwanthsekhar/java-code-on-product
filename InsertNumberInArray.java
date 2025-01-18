import java.util.Arrays;

public class InsertNumberInArray {
    public static void main(String[] args) {
        // Initialize the array with 5 elements
        int[] array = {10, 20, 30, 40, 50};

        // Define the number to insert
        int numberToInsert = 25;

        // Define the position where the number should be inserted
        int position = 3;

        // Create a new array with one extra space
        int[] newArray = new int[array.length + 1];

        // Insert elements into the new array
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = numberToInsert;
            } else {
                newArray[i] = array[j];
                j++;
            }
        }

        // Print the updated array
        System.out.print("Updated array: " + Arrays.toString(newArray));
    }
}

//this codes time complexity is O(n) known as insertion sort with java code 
//this codes space complexity is O(n) known as insertion sort with java code 
