public class largestElementinArray {

    public static int findTheLargest(int arr[]){
        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{64,2,3,4,65,899};
        System.out.println(findTheLargest(arr));
    }
}

//This the Optimal Solution with O(n) Time Complexity.
//There is other way that we can find that first sort the array then print the last element of the array