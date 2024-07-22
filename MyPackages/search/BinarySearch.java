package MyPackages.search;

public class BinarySearch {
    public int binarySearch(int[] array, Integer ele){

        int left = 0;
        int right = (array.length)-1;
        while (left<=right){
            int mid = (left + right)/2;
            if (array[mid]==ele){
                return mid;
            }
            else if (array[mid]<ele){
                left = mid +1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
}