package multiplicação.matrizes;

public class MultiplicaçãoMatrizes {
    public static void main(String[] args) {
        //Declaração da matriz A de ordem 2x2
        int [][] A = {
            {2, 4},
            {6, 8}
        };
        //Declaração da matriz B de ordem 2x2
        int [][] B = {
            {1, 3},
            {5, 7}        
        };
        //Declaração de matriz C, que armazena a multiplicação de A e B
        int [][] C = new int [2][2];

        //Percorre a linha da matriz A
        for (int i = 0; i < 2; i++){
            //Percorre a coluna da matriz B
            for (int j = 0; j < 2; j++){
                int soma = 0;
                //Percorre e soma os produtos linha x coluna
                for (int k = 0; k < 2; k++){
                    soma += A[i][k] * B[k][j];
                }
                C[i][j] = soma;
            }
        }

        //Exibe a matriz A
        System.out.println("Matriz A:");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++)
                System.out.print(A[i][j] + "\t");
            System.out.println();
        }
        System.out.println();
        //Exibe a matriz B
        System.out.println("Matriz B");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++)
                System.out.print(B[i][j] + "\t");
            System.out.println();
        }
        System.out.println();
        //Exibe a matriz C
        System.out.println("Matriz C");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++)
                System.out.print(C[i][j] + "\t");
            System.out.println();
        }
    }
}