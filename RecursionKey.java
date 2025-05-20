public class RecursionKey {

    static void procurePelaChave(Object[] caixa) {
        for (Object item : caixa) {
            if (item instanceof Object[]) {  // Se for uma caixa (array)
                procurePelaChave((Object[]) item);  // Recursão
            } else if (item.equals("chave")) {  // Se for a chave
                System.out.println("Achei a chave!");
            }
        }
    }

    public static void main(String[] args) {
        // Caixa com itens e sub-caixas
        Object[] caixaPrincipal = {
            "livro",
            new Object[] { 
                "caderno", 
                new Object[] { "chave", "caneta" } 
            },
            "lapis"
        };

        procurePelaChave(caixaPrincipal);
    }
}