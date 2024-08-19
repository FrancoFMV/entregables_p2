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

    public boolean hayInterseccionPorFila(int[][] mat1, int[][] mat2) {
        // Verifica si las matrices tienen distinta cantidad de filas o están vacías
        if (mat1 == null || mat2 == null || mat1.length != mat2.length || mat1.length == 0) {
            return false;
        }

        boolean todasFilasTienenInterseccion = true; // Acumulador booleano

        // Recorre cada fila de las matrices
        for (int fila = 0; fila < mat1.length; fila++) {
            boolean hayInterseccion = false;

            // Recorre cada elemento de la fila en mat1
            for (int elem1 = 0; elem1 < mat1[fila].length; elem1++) {
                // Compara el elemento actual de mat1 con todos los elementos de la fila correspondiente en mat2
                for (int elem2 = 0; elem2 < mat2[fila].length; elem2++) {
                    if (mat1[fila][elem1] == mat2[fila][elem2]) {
                        hayInterseccion = true;
                    }
                }
            }

            // Acumulamos el resultado de esta fila en nuestro acumulador booleano
            todasFilasTienenInterseccion = todasFilasTienenInterseccion && hayInterseccion;

            // Si en alguna fila no hay intersección, podemos terminar temprano
            if (!todasFilasTienenInterseccion) {
                return false;
            }
        }

        // Si el acumulador booleano sigue siendo verdadero, todas las filas tienen intersección
        return todasFilasTienenInterseccion;
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
