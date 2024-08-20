package acumuladores;

public class Acumuladores {

    public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) {
        if (mat == null || mat.length == 0 || num <= 0) {
            return false;
        }
    
        boolean existeFilaConMultiplos = false;
    
        for (int fila = 0; fila < mat.length; fila++) {
            boolean todosMultiplos = true;
    
            for (int elem = 0; elem < mat[fila].length; elem++) {
                if (mat[fila][elem] % num != 0) {
                    todosMultiplos = false;
                }
            }

            existeFilaConMultiplos = existeFilaConMultiplos || todosMultiplos;
        }
    
        return existeFilaConMultiplos;
    }

    public boolean hayInterseccionPorFila(int[][] mat1, int[][] mat2) {

        if (mat1 == null || mat2 == null || mat1.length != mat2.length || mat1.length == 0) {
            return false;
        }

        boolean todasFilasTienenInterseccion = true; 

        for (int fila = 0; fila < mat1.length; fila++) {
            boolean hayInterseccion = false;

            for (int elem1 = 0; elem1 < mat1[fila].length; elem1++) {

                for (int elem2 = 0; elem2 < mat2[fila].length; elem2++) {
                    if (mat1[fila][elem1] == mat2[fila][elem2]) {
                        hayInterseccion = true;
                    }
                }
            }

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
            // if (sumaDeFila > sumaDeColumna) {
            //     FilaMayor = true;
            // }
            FilaMayor |= (sumaDeFila > sumaDeColumna);
        }
        return FilaMayor;
    }

    public boolean hayInterseccionPorColumna(int[][] mat1, int[][]mat2) {

        if (mat1 == null || mat2 == null || mat1.length == 0 || mat2.length == 0 || mat1[0].length != mat2[0].length) {
            return false;
        }

        boolean todasColumsTienenInterseccion = true;


        for (int col = 0; col < mat1[0].length; col++) {
            boolean hayInterseccion = false;


            for (int fila1 = 0; fila1 < mat1.length; fila1++) {

                for (int fila2 = 0; fila2 < mat2.length; fila2++) {
                    if (mat1[fila1][col] == mat2[fila2][col]) {
                        hayInterseccion = true;
                    }
                }
            }
            todasColumsTienenInterseccion = todasColumsTienenInterseccion && hayInterseccion;
        }

        return todasColumsTienenInterseccion;
    }
}
