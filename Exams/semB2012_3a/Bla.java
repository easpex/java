public class Bla {
    public static void main(String[] args) {
        //int[][] a = new int[3][2];
        int[][] a = {{1,2,3},{4,5,6}};
        for(int i = 0 ; i < a.length; i++) {
            for(int k = 0; k < a[1].length; k++) {
                System.out.print(a[i][k] + " ");
            }
            System.out.println();
        }
    }
}