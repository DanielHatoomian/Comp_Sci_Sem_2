public class matrix {
    int sum;
    public int diagonalOP(int [][] mat1,int [][] mat2) {
        int rows = mat1.length;
        int columns = mat1[0].length;
        
        sum = 0;
        
        int rowscount = 0;
        int columnscount = 0;
        
        while(rowscount<rows-1) {
            while(columnscount<columns-1) {
                if(rowscount==columnscount) {
                 sum = sum + (mat1[rowscount][columnscount] * mat2[rowscount][columnscount]);   
                }
                columnscount++;
            }
            columnscount = 0;
            rowscount++;
        }
    }
}