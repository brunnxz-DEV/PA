package multiplicação.matrizes;

import javax.swing.JOptionPane;

public class MultiplicaçãoMatrizes {

    public static void main(String[] args) {
        // Declaração de variáveis para as linhas e colunas de A e B
        int linhasA = 2;
        int colunasA = 4;
        int linhasB = 4;
        int colunasB = 2;
        // Declaração de variáveis A e B
        int[][] A = new int[linhasA][colunasA];
        int[][] B = new int[linhasB][colunasB];

        // Preenchendo a matriz A
        JOptionPane.showMessageDialog(null, "Agora vamos preencher a matriz A (2 linhas x 4 colunas)");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                String valor = JOptionPane.showInputDialog("Adicione o valor " + (j + 1) + " da linha " + (i + 1) + " (Matriz A):");
                A[i][j] = Integer.parseInt(valor);
            }
        }

        // Preenchendo a matriz B
        JOptionPane.showMessageDialog(null, "Agora vamos preencher a matriz B (4 linhas x 2 colunas)");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                String valor = JOptionPane.showInputDialog("Adicione o valor " + (j + 1) + " da linha " + (i + 1) + " (Matriz B):");
                B[i][j] = Integer.parseInt(valor);
            }
        }

        // Multiplicação, resultado terá linhasA x colunasB
        int[][] resultado = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                int soma = 0;       // Variável para a soma
                for (int k = 0; k < colunasA; k++) {
                    soma += A[i][k] * B[k][j];
                }
                resultado[i][j] = soma;     // Variável para o resultado que recebe a soma
            }
        }

        // Montando o texto de saída
        StringBuilder texto = new StringBuilder();      // Utilizo a variável StringBuilder pra modificar o texto sem orecisar reciar coisas do zero
        texto.append("Matriz A:\n");        // Utilizo o .append para adicionar "Matriz A" no conteúdo do StringBuilder
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                texto.append(String.format("%4d", A[i][j]));        //Uso o String.format pra fazer o resultado ficar alinhado e mais bonito
            }
            texto.append("\n");     // Mais uma utilização do .append pra adicionar informações ao texto final
        }

        texto.append("\nMatriz B:\n");      // Utilizo o .append para dessa vez adicionar "Matriz B" no conteúdo do StringBuilder
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                texto.append(String.format("%4d", B[i][j]));        //Uso o String.format pra fazer o resultado ficar alinhado e mais bonito
            }
            texto.append("\n");     // Mais uma utilização do .append pra adicionar informações ao texto final
        }

        texto.append("\nResultado de A x B:\n");        // Dessa vez uso o .append pra mostrar "Resultado de A x B"
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                texto.append(String.format("%4d", resultado[i][j]));        //Uso o String.format pra fazer o resultado ficar alinhado e mais bonito
            }
            texto.append("\n");     // Mais uma utilização do .append pra adicionar informações ao texto final
        }

        JOptionPane.showMessageDialog(null, texto.toString());      // Uso o .toString pra pegar tudo do StringBuilder e transformar em String já pronta
    }
}