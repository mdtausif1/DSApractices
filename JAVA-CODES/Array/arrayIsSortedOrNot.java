// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    static boolean sortedCheck(int arr[]){
        for(int i = 1;i<arr.length;i++){
            if (arr[i-1]<arr[i]){
                continue;
            }
            else{
                return false;
            }
        }
         return true;
    }
    public static void main(String[] args) {
        int[] arr = {11,34,48,234,264};
        System.out.println(sortedCheck(arr));
    }
}
