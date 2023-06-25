
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        int[] modifiedArray = moveZeroes(nums);

        System.out.println(Arrays.toString(modifiedArray));
    }

    public static int[] moveZeroes(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
        return nums;
    }
}



