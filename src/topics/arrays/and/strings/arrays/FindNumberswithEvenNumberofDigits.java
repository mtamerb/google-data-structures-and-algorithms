package topics.arrays.and.strings.arrays;

public class FindNumberswithEvenNumberofDigits {

    public static int findNumbers(int[] nums) {

        int numberOfEvenNumbers = 0;

        for (int num : nums) {
            numberOfEvenNumbers += isNumberEven(num);
        }

        return numberOfEvenNumbers;
    }

    static int isNumberEven(int num) {
        int digits = findDigits(num);

        if (digits % 2 == 0) {
            return 1;
        }

        return 0;
    }


    static int findDigits(int num) {
        int digits = 0;

        while (num > 0) {
            num /= 10;
            digits++;
        }

        return digits;
    }

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12, 345, 2, 6, 7896}));
    }
}
