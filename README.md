# 🌳 Implementação de Árvore Binária de Busca (BST)

| Campo | Valor |
| :--- | :--- |
| **Aluno** | Murilo Sambrana |
| **RA** | **2403111** |
| **Disciplina** | Estruturas de Dados |
| **Professor** | Odair |

---

## 🏗️ Construção

- **Sequência de Inserção (Final, após remoção de repetições consecutivas):** [2, 4, 0, 3, 1]
- **Regra:** Menor vai para a Esquerda, Maior vai para a Direita.

## 📊 Características e Percursos

A árvore resultante possui a seguinte estrutura e resultados de percurso, conforme a execução do código Java:

| Característica | Resultado |
| :--- | :--- |
| **Raiz** | **2** |
| **Folhas** | **1** e **3** |
| **Altura da Árvore** (em nós) | **3** |
| **Percurso Em Ordem (Ordenado)** | `0, 1, 2, 3, 4` |
| **Percurso Pré-Ordem** | `2, 0, 1, 4, 3` |
| **Percurso Pós-Ordem** | `1, 3, 4, 0, 2` |

## 🌲 Estrutura (Resumo)

A BST é balanceada na raiz e segue as regras:
* O nó **1** é filho direito do nó **0**.
* O nó **3** é filho esquerdo do nó **4**.
