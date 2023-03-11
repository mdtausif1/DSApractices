public class secondLargestElementInArray {

    static int findTheSecondLargest(int arr[]){
        int largest=arr[0];
        int secondLargest = -1;

        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{64,2,899,867,897,899};
        System.out.println(findTheSecondLargest(arr));
    }
}
//This is a Optimal Solution for finding the Second Largest Number in the array .
// There are other ways are there to find the but there are not optimal and they will consume more space and time so they were not the optimal solution.