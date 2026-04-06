public class ArrayOperations{


    public static int linearSearch(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left=0;
        int right=arr.length -1;
        
        while (left<=right) {
            int mid = left + (right - left)/2;
            
            if(arr[mid] == target) {
                return mid;
            }
            
            if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        int[] numbers = {5,2,9,1,5,6};
        int target = 9;
        int index = linearSearch(numbers, target);
        System.out.println("Target found at index: " + index);

        int[] nums = {1,2,3,4,5,9};
        int target1 = 9;
        // Time complexity: O(log n)
        int idx = binarySearch(nums, target1);
        System.out.println("Target found at index: " + idx);
    }
}