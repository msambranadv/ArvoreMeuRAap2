public class Main {
    public static void main(String[] args) {
        // RA: 2403111
        String ra = "2403111";

        System.out.println("=== ÁRVORE BINÁRIA DE BUSCA ===");
        System.out.println("RA: " + ra);
        System.out.println();

        // Estrutura específica conforme solicitado pelo professor:
        //        2
        //       / \
        //      0   4
        //        / \
        //       1   3

        ArvoreBinariaDeBusca arvore = new ArvoreBinariaDeBusca();

        // Criar os nós
        No raiz = new No(2);
        No no0 = new No(0);
        No no4 = new No(4);
        No no1 = new No(1);
        No no3 = new No(3);

        // Conectar os nós na estrutura correta
        raiz.setEsquerda(no0);  // 0 é filho esquerdo de 2
        raiz.setDireita(no4);   // 4 é filho direito de 2
        no4.setEsquerda(no1);   // 1 é filho esquerdo de 4
        no4.setDireita(no3);    // 3 é filho direito de 4

        // Definir a raiz da árvore
        arvore.setRaiz(raiz);

        System.out.println("Árvore construída com os dígitos: 2, 4, 0, 3, 1");
        System.out.println("(Removendo repetições consecutivas de 2403111)");
        System.out.println();

        // Exibir informações da árvore
        System.out.println("Raiz da árvore: " + arvore.getRaiz().getValor());
        System.out.println("Altura da árvore: " + arvore.calcularAltura());
        System.out.println();

        // Exibir percursos
        arvore.percorrerEmOrdem();
        arvore.percorrerPreOrdem();
        arvore.percorrerPosOrdem();

        // Exibir visualização da árvore
        arvore.exibirArvore();
    }
}
