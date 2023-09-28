public class RemoveDuplicatesFromSorted {
    public static int removeDuplicates(int[] nums) {
        int checkingIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[checkingIndex] == nums[i]) {
                nums[i] = -1;
            } else {
                checkingIndex = i;
            }
        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = 2; j < nums.length; j++) {
                if (j != -1){

                }
            }
        }

        return 15;
    }

    public void swap(int x, int y, int[] arrayOfHell){
        int tempInt;

    }
}
