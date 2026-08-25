package somasubtraçãodivisãomatrizes;

import javax.swing.JOptionPane;

public class SomaSubtraçãoDivisãoMatrizes {

    public static void main(String[] args) {
        // Declaração das variáveis pra linhas e colunas
        int linhas = 3;
        int colunas = 3;
        // Declaração para os valores das colunas
        int[][] A = new int[linhas][colunas];
        int[][] B = new int[linhas][colunas];
        // Preenchendo a matriz A
        JOptionPane.showMessageDialog(null, "Agora vamos preencher a matriz A (3 linhas x 3 colunas)");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                String valor = JOptionPane.showInputDialog(
                        "Adicione o valor " + (j + 1) + " da linha " + (i + 1) + " (Matriz A):");
                A[i][j] = Integer.parseInt(valor);
            }
        }

        // Preenchendo a matriz B
        JOptionPane.showMessageDialog(null, "Agora vamos preencher a matriz B (3 linhas x 3 colunas)");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                String valor = JOptionPane.showInputDialog(
                        "Adicione o valor " + (j + 1) + " da linha " + (i + 1) + " (Matriz B):");
                B[i][j] = Integer.parseInt(valor);
            }
        }

        // Soma: A + B
        int[][] soma = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma[i][j] = A[i][j] + B[i][j];
            }
        }

        // Subtração: A - B
        int[][] subtracao = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                subtracao[i][j] = A[i][j] - B[i][j];
            }
        }

        // Divisão: A / B (elemento a elemento, com resultado decimal)
        double[][] divisao = new double[linhas][colunas];       // Uso double para poder ter resultados quebrados
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (B[i][j] != 0) {
                    divisao[i][j] = (double) A[i][j] / B[i][j];
                } else {
                    divisao[i][j] = Double.NaN; // Evita erro de divisão por zero
                }
            }
        }

        // Montando o texto de saída
        StringBuilder texto = new StringBuilder();      // Utilizo a variável StringBuilder pra modificar o texto sem precisar recriar as coisas do zero
        texto.append("Matriz A:\n");        // Utilizo o .append para adicionar "Matriz A" no conteúdo do StringBuilder
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                texto.append(String.format("%4d", A[i][j]));        //Uso o String.format pra fazer o resultado ficar alinhado e mais bonito
            }
            texto.append("\n");
        }

        texto.append("\nMatriz B:\n");      // Utilizo o .append para adicionar "Matriz B" no conteúdo do StringBuilder
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                texto.append(String.format("%4d", B[i][j]));        //Uso o String.format pra fazer o resultado ficar alinhado e mais bonito
            }
            texto.append("\n");
        }

        texto.append("\nA + B:\n");     // Utilizo o .append para adicionar a soma de A e B no conteúdo do StringBuilder
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                texto.append(String.format("%4d", soma[i][j]));     //Uso o String.format pra fazer o resultado ficar alinhado e mais bonito
            }
            texto.append("\n");
        }

        texto.append("\nA - B:\n");     // Utilizo o .append para adicionar a subtração de A e B no conteúdo do StringBuilder
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                texto.append(String.format("%4d", subtracao[i][j]));        //Uso o String.format pra fazer o resultado ficar alinhado e mais bonito
            }
            texto.append("\n");
        }

        texto.append("\nA / B (elemento a elemento):\n");       // Utilizo o .append para adicionar a divisão de A e B no conteúdo do StringBuilder
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (Double.isNaN(divisao[i][j])) {
                    texto.append(String.format("%8s", "erro"));     // Exibição de tela de erro
                } else {
                    texto.append(String.format("%8.2f", divisao[i][j]));
                }
            }
            texto.append("\n");
        }

        JOptionPane.showMessageDialog(null, texto.toString());
    }
}