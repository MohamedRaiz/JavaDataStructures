package academy.learnprogramming.shellsort;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20,35,-15,7,55,1,-22};

        //Here, final iteration gap will always be 1. and that is when we do insertion sort.
        for(int gap = intArray.length/2; gap > 0; gap /= 2){
            for(int i = gap; i < intArray.length; i++){
                //intArray[i] would be the element we are looking at
                int newElement = intArray[i];
                //j would be used for traversing.
                int j = i;

                //if j is less than gap, we have reached the front of the array.
                //When i = 6, looking at -22, and comparing it with 3 gaps in front which is 20 now. 20 will go to index 6.
                //Then j would be reduced from 6 to 3. As 3 = gap, and intArray[0] is bigger than -22, int array[0] will
                //be changed to index 3 and -22 will be placed at index 0.
                while(j>= gap && intArray[j-gap] > newElement){

                    //Basically, 20 goes to 7.
                    intArray[j] = intArray[j-gap];
                    j -= gap;
                }

                intArray[j] = newElement;


            }
        }


        for(int i=0; i< intArray.length; i++){
            System.out.print(intArray[i]+ "\t");
        }

    }
}
