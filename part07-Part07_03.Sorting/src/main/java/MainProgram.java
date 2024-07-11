import java.util.Arrays;

public class MainProgram {
    
    public static int smallest(int[] array){
        
        int min = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        
        return min;
    }
    
    public static int indexOfSmallest(int [] array) {
        
        int min = array[0];
        int found = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                found = i;
            }
        }
        
        return found;
    }
    
    public static int indexOfSmallestFrom(int [] table, int startIndex) {
        
        int min = table[startIndex];
        int found = 0;
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] <= min) {
                min = table[i];
                found = i;
            }
        }
        return found;
    }
    
    public static void swap (int[] array, int index1, int index2) {
        
        int aux = array[0];
        
        aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
        
    }
    
    public static void sort(int[] array) {
         
       for(int i = 0; i < array.length; i++) {
           System.out.println(Arrays.toString(array));
           swap(array, indexOfSmallestFrom(array, i), i);
       }
    }

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    
    

}
