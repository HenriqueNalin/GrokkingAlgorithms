import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    private static List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> novoArr = new ArrayList<>(arr.size());

        int size = arr.size();
        for (int i = 0; i < size; i++) {
            int menor = buscaMenor(arr);
            novoArr.add(arr.get(menor));

            arr.remove(menor);
        }
        
        return novoArr;
    }

    private static int buscaMenor(List<Integer> arr) {
        int menor = arr.get(0);
        int menorIndice = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < menor) {
                menor = arr.get(i);
                menorIndice = i; 
            }
        }
        return menorIndice;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(selectionSort(arr));
    }
}