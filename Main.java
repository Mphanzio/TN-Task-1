public class Main {
    public static void main(String args[]) {
        int[] duplicates = { 1, 2, 1, 4, 5 };
        RemoveDuplicates remover = new RemoveDuplicates(duplicates);

        remover.deleteDuplicates();

    }
}

class RemoveDuplicates{

    static int[] initArray;

    RemoveDuplicates(int[] array){
        initArray = array;
        outputArray(initArray);
    }
    
    void outputArray(int[] array){
        for(int i = 0; i<array.length;i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    void deleteDuplicates(){

        int arrayLength = initArray.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (initArray[i] == initArray[j]) {
                    initArray[j] = initArray[arrayLength - 1];
                    arrayLength--;
                    j--;
                }
            }
        }

        int[] noDuplicate = new int[arrayLength];

        for(int i = 0; i<arrayLength;i++){
            noDuplicate[i] = initArray[i];
        }

        outputArray(noDuplicate);
    }
}