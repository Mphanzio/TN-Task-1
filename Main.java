//import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        int[] initArray = {1,2,3,4};
        ExtendArray extend = new ExtendArray(initArray);
        extend.extend();
    }
}

class ExtendArray {

    static int initArray[];
    

    ExtendArray(int[] inputArray){
        initArray = inputArray;
        System.out.println("Initial Array:");
        outputArray(inputArray);
    }

    void outputArray(int[] array){
        for(int i = 0; i<array.length;i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    int[] arrayCopy(int[] initArray){
        int arrayLength = initArray.length;
        int[] newArray = new int[arrayLength+1];
        for(int i = 0; i<initArray.length;i++){
            newArray[i] = initArray[i];
        }
        newArray[arrayLength] = 420;

        return newArray;
    }

    void extend(){
        initArray = arrayCopy(initArray);
        outputArray(initArray);
    }
}
