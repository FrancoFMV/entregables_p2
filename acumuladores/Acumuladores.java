package acumuladores;

public class Acumuladores {

    public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) {
        // Verifica si la matriz está vacía o si el número no es positivo
        if (mat == null || mat.length == 0 || num <= 0) {
            return false;
        }

        // Recorre cada fila de la matriz
        for (int fila = 0; fila < mat.length; fila++) {
            boolean esMultiploEnTodaLaFila = true;

            // Recorre cada elemento de la fila actual
            for (int elem = 0; elem < mat[fila].length; elem++) {
                // Si algún elemento no es múltiplo del número, marca como falso
                if (mat[fila][elem] % num != 0) {
                    esMultiploEnTodaLaFila = false;
                    //break;
                }
            }

            // Si todos los elementos de la fila son múltiplos del número, devuelve verdadero
            if (esMultiploEnTodaLaFila) {
                return true;
            }
        }

        // Si ninguna fila cumple la condición, devuelve falso
        return false;
    }

    public boolean hayInterseccionPorFila(int[][] mat, int[][] mat2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hayInterseccionPorFila'");
    }

    public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'algunaFilaSumaMasQueLaColumna'");
    }

    public boolean hayInterseccionPorColumna(int[][] mat1, int[][]mat2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hayInterseccionPorColumna'");
    }
}
