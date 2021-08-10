import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
//        int[] anArray = new int[10];

//        int numberOfElements = 10;
//        int[] anArray = new int[numberOfElements];

//        int[] numbers = new int[3];
//
//        numbers[0] = 1;
//        numbers[1] = 2;
//
//        System.out.println(numbers[0]); // 1
//        System.out.println(numbers[1]); // 2
//        System.out.println(numbers[2]); // 0 -- default int value
//        System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException ! ! !
//
//        int[] anArray = {1,2,3,4,5,6}; // array initializer syntax
//
//        System.out.println(anArray.length);

//        String[] languages = {"html", "css", "javascript", "java"};
//
//        for (String language : languages) {
//            System.out.println(language);
//        }

//        int scoreCard[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};
//
//        Arrays.fill(scoreCard, 0);
//        System.out.println("Score Card has been reset \n" + Arrays.toString(scoreCard));



//        int[] org = new int[] {1, 2, 3};
//        System.out.println("Original Array");
//
//        int[] copy = Arrays.copyOf(org, 5);
//
//        copy[3] = 11;
//        copy[4] = 55;
//
//        System.out.println(Arrays.toString(copy));

//        int[] arr = {12, 7, 6, 45, 21, 9, 101, 102};
//        Arrays.sort(arr); // Perform the function
//        System.out.printf("Modified arr[] : %s", Arrays.toString(arr));//Print out using print format

//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//// access the first element in the second row
//        System.out.println(matrix[1][0]); // 4
//// the last element in the first row
//        System.out.println(matrix[0][2]); // 3
//// the first element in the last row
//        System.out.println(matrix[2][0]); // 7


        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");






    }
}
