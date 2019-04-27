package academy.learnprogramming.selectionsort;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20,35,-15,7,22,66,-20};

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            int largest = 0; //index 0

            for(int i = 1; i<= lastUnsortedIndex; i ++) {
                if(intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            swap(intArray,largest,lastUnsortedIndex);



        }



        for(int i=0; i< intArray.length; i ++){
            System.out.print(intArray[i] + "\t");
        }

    }

    //Everytime we finish a traversal of the unsorted partition, we swap the position with the last unsorted partition element.
    public static void swap(int[] array, int i, int j){

        if( i == j){
            return;
        }

        else{
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
