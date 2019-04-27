package academy.learnprogramming.insertionsort;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {35,24,66,6,-2,-55,29};

        for(int firstUnsortedIndex =1; firstUnsortedIndex<intArray.length; firstUnsortedIndex++){

            int newElement = intArray[firstUnsortedIndex];

            int i;

            //Here, we are traversing the sorted partition from right to left. Hence, i>0 cuz the first element is
            // considered sorted. So if, i > 0 and the intArray[i-1] is bigger than new element, the position will be
            //in front of this element. so we need to change their locations.
            for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--){

                //we're shifting the element from the left to the right.
                intArray[i] = intArray[i-1];
            }
            //Once found position, we associate the newElement to that position.
            intArray[i] = newElement;

        }




        for(int i =0; i<intArray.length; i++){
            System.out.print(intArray[i]+ "\t");
        }


    }
}
