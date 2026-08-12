package subtração.matrizes;

public class SubtraçãoMatrizes {

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
    //Declaração de matriz C, que armazena a subtração de A e B
    int [][] C = new int [2][2];
    //Percorre a linha da matriz
    for (int i = 0; i < 2; i++){
        //Percorre a coluna da matriz
        for (int j = 0; 1 <2; j++){
            C [i][j] = A [i][j] - B[i][j];
        }
    }
    //Exibe a matriz A
    System.out.println("Matriz A:");
    for (int i = 0; i <2; i++){
        for (int j = 0; j <2; j++)
            System.out.print(A[i][j] + "\t");
    }
    System.out.println();
    //Exibe a matriz B
    System.out.println("Matriz B");
    for (int i = 0; i < 2; i++){
        for (int j = 0; j <2; j++)
            System.out.print(B[i][j] + "\t");
    }
    System.out.println();
    //Exibe a matriz C
    System.out.println("Matriz C");
    for (int i = 0; i < 2; i++){
        for (int j = 0; j <2; j++)
            System.out.print(C[i][j] + "\t");
    }
  }
}
