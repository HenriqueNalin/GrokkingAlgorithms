public class BuscaBinaria {

    private static Integer buscaBinaria(int[] list, int item) {
        int baixo = 0;
        int alto = list.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = list[meio];
            if (chute == item) {
                return meio;
            }
            if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] minhaLista = {1, 3, 5, 7, 9};

        System.out.println(buscaBinaria(minhaLista, 3)); //1
        System.out.println(buscaBinaria(minhaLista, -1)); // null
    }
}