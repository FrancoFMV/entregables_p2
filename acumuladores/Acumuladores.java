package acumuladores;

public class Acumuladores {

    public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) {
        if (mat == null || mat.length == 0 || num <= 0) {
            return false;
        }
    
        boolean existeFilaConMultiplos = false; // Acumulador booleano
    
        for (int fila = 0; fila < mat.length; fila++) {
            boolean todosMultiplos = true;
    
            for (int elem = 0; elem < mat[fila].length; elem++) {
                if (mat[fila][elem] % num != 0) {
                    todosMultiplos = false;
                }
            }
    
            // Acumulamos el resultado para todas las filas
            existeFilaConMultiplos = existeFilaConMultiplos || todosMultiplos;
        }
    
        return existeFilaConMultiplos;
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
        }

        return todasFilasTienenInterseccion;
    }

    public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) {
        if (mat == null || mat.length == 0 || nColum < 0 || nColum >= mat[0].length) {
            return false;
        }
        int sumaDeColumna = 0;
        for (int f = 0; f < mat.length; f++) {
            sumaDeColumna += mat[f][nColum];
        }
        boolean FilaMayor = false;

        for (int[] fila : mat) {
            int sumaDeFila = 0;
            for (int elemento : fila) {
                sumaDeFila += elemento;
            }
            if (sumaDeFila > sumaDeColumna) {
                FilaMayor = true;
            }
        }
        return FilaMayor;
    }

    public boolean hayInterseccionPorColumna(int[][] mat1, int[][]mat2) {
        // Verifica si las matrices tienen distinta cantidad de columnas o están vacías
        if (mat1 == null || mat2 == null || mat1.length == 0 || mat2.length == 0 || mat1[0].length != mat2[0].length) {
            return false;
        }

        boolean todasColumsTienenInterseccion = true; // Acumulador booleano

        // Recorre cada columna de las matrices
        for (int col = 0; col < mat1[0].length; col++) {
            boolean hayInterseccion = false;

            // Recorre cada fila de la columna en mat1
            for (int fila1 = 0; fila1 < mat1.length; fila1++) {
                // Compara el elemento actual de mat1 con todos los elementos de la columna correspondiente en mat2
                for (int fila2 = 0; fila2 < mat2.length; fila2++) {
                    if (mat1[fila1][col] == mat2[fila2][col]) {
                        hayInterseccion = true;
                    }
                }
            }

            // Acumulamos el resultado de esta columna en nuestro acumulador booleano
            todasColumsTienenInterseccion = todasColumsTienenInterseccion && hayInterseccion;
        }

        return todasColumsTienenInterseccion;
    }
}
