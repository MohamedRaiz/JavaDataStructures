package academy.learnprogramming.mergesort;

public class Main {

    public static void main(String[] args) {

        int [] intArray = {20,35,-15,7,55,1,-22};

        mergeSort(intArray,0,intArray.length);


        for(int i = 0; i< intArray.length;i++){
            System.out.println(intArray[i]);

        }

    }

    //the array we want to sort, the start index and end index.
    public static void mergeSort(int [] input, int start, int end){

        //breaking condition: when we have 1 element array.
        if(end - start < 2){
            return;
        }

            //for the first iteration, start is 0 and end is 7. End is 1 greater than the last index.
            int mid = (start + end)/2;
            //this is a recursion for the left array.
            mergeSort(input,start,mid);
            //recursion for the right array
            mergeSort(input,mid,end);
            //this is the part we do the sorting.
            merge(input,start,mid,end);


    }

    public static void merge(int [] input, int start, int mid, int end){
        //input[mid-1] is the last element in the left partition, input[mid] is the first in the right partition.
        //if the left is smaller or equal than right, then the left is already sorted.
     if(input[mid-1]<= input[mid]){
            return;
     }

         int i = start;
         int j = mid;
         //this is to keep track where we are in the temp array.
         int tempIndex = 0;

         int [] temp = new int [end-start];

         //to put into temp, we compare i and j value, smaller put inside temp. Once, i or J reaches the end, we get out of loop.
            while(i<mid && j< end){
                //after run the line, then increment occurs.Post increment here.
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
            }

            //outside of loop: if the remaining element is on the right side, we do not need to care as
            //if we add into temp array, its just additional steps as the elements are already on the right side and sorted.
            //If left side, then we need to add.

         //parameters: source array, start copy position, destination array, destination index,length-> no.of elements we did not copy over from the left partition.
         System.arraycopy(input,i, input, start + tempIndex, mid-i);
           //copy temp array
         System.arraycopy(temp,0,input,start,tempIndex);

    }
}
