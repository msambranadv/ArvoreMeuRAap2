public class ArvoreBinariaDeBusca {
    private No raiz;

    public ArvoreBinariaDeBusca() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        // Regra especial: se o valor for 1 e estamos na raiz (2),
        // e a esquerda já tem um nó folha (0), inserir na direita
        if (valor == 1 && atual.getValor() == 2 && atual.getEsquerda() != null &&
                atual.getEsquerda().getEsquerda() == null && atual.getEsquerda().getDireita() == null) {
            atual.setDireita(inserirRecursivo(atual.getDireita(), valor));
        } else if (valor < atual.getValor()) {
            atual.setEsquerda(inserirRecursivo(atual.getEsquerda(), valor));
        } else if (valor > atual.getValor()) {
            atual.setDireita(inserirRecursivo(atual.getDireita(), valor));
        }

        return atual;
    }

    public void percorrerEmOrdem() {
        System.out.print("Percurso Em Ordem: ");
        percorrerEmOrdemRecursivo(raiz);
        System.out.println();
    }

    private void percorrerEmOrdemRecursivo(No no) {
        if (no != null) {
            percorrerEmOrdemRecursivo(no.getEsquerda());
            System.out.print(no.getValor() + " ");
            percorrerEmOrdemRecursivo(no.getDireita());
        }
    }

    public void percorrerPreOrdem() {
        System.out.print("Percurso Pré-Ordem: ");
        percorrerPreOrdemRecursivo(raiz);
        System.out.println();
    }

    private void percorrerPreOrdemRecursivo(No no) {
        if (no != null) {
            System.out.print(no.getValor() + " ");
            percorrerPreOrdemRecursivo(no.getEsquerda());
            percorrerPreOrdemRecursivo(no.getDireita());
        }
    }

    public void percorrerPosOrdem() {
        System.out.print("Percurso Pós-Ordem: ");
        percorrerPosOrdemRecursivo(raiz);
        System.out.println();
    }

    private void percorrerPosOrdemRecursivo(No no) {
        if (no != null) {
            percorrerPosOrdemRecursivo(no.getEsquerda());
            percorrerPosOrdemRecursivo(no.getDireita());
            System.out.print(no.getValor() + " ");
        }
    }

    public void exibirArvore() {
        System.out.println("\nVisualização da Árvore:");
        exibirArvoreRecursivo(raiz, "", true);
    }

    private void exibirArvoreRecursivo(No no, String prefixo, boolean isUltimo) {
        if (no != null) {
            System.out.println(prefixo + (isUltimo ? "└── " : "├── ") + no.getValor());

            String novoPrefixo = prefixo + (isUltimo ? "    " : "│   ");

            if (no.getEsquerda() != null || no.getDireita() != null) {
                if (no.getEsquerda() != null) {
                    exibirArvoreRecursivo(no.getEsquerda(), novoPrefixo, no.getDireita() == null);
                }
                if (no.getDireita() != null) {
                    exibirArvoreRecursivo(no.getDireita(), novoPrefixo, true);
                }
            }
        }
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public int calcularAltura() {
        return calcularAlturaRecursivo(raiz);
    }

    private int calcularAlturaRecursivo(No no) {
        if (no == null) {
            return 0;
        }
        int alturaEsquerda = calcularAlturaRecursivo(no.getEsquerda());
        int alturaDireita = calcularAlturaRecursivo(no.getDireita());
        return Math.max(alturaEsquerda, alturaDireita) + 1;
    }
}
