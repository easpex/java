public class Q1 {
    // size of C array must be equal or greater than

// sum of A and B arrays' sizes

public static int[] mergeLoop(int[] A, int[] B, int[] C) {

      int i, j, k, m, n;

      i = 0;

      j = 0;

      k = 0;

      m = A.length;

      n = B.length;

      while (i < m && j < n) {

            if (A[i] <= B[j]) {

                  C[k] = A[i];

                  i++;
                  print(C);
            } else {

                  C[k] = B[j];

                  j++;
                  print(C);
            }

            k++;

      }

      if (i < m) {

            for (int p = i; p < m; p++) {

                  C[k] = A[p];

                  k++;
                  print(C);
            }

      } else {

            for (int p = j; p < n; p++) {

                  C[k] = B[p];

                  k++;
                  print(C);
            }

      }
      return C;
}

public static void print(int[] a) {
    for(int i = 0; i < a.length; i++)
    System.out.print(a[i] + ",");
}

public static int[] merge (int[] ar1, int[] ar2) {
    int m = ar1.length;
    int n = ar2.length;
    int[] ar3 = new int[n + m];
    return(merge(ar1, ar2, ar3, 0, 0, 0, n, m));
}

public static int[] merge (int[] ar1, int[] ar2, int[] ar3, int i, int j, int k, int n, int m) {
    if(k == ar3.length)
    return ar3;
    
    if(i < m && j < n && ar1[i] <= ar2[j]) {
        ar3[k] = ar1[i];
        i++;
        k++;
        return(merge(ar1, ar2, ar3, i, j, k, n, m));
    } else if(i < m && j < n && ar1[i] > ar2[j]) {
        ar3[k] = ar2[j];
        j++;
        k++;
        return(merge(ar1, ar2, ar3, i, j, k, n, m));
    } else if(i < m) {
        ar3[k] = ar1[i];
        i++;
        k++;
        return(merge(ar1, ar2, ar3, i, j, k, n, m));
    } else {
        ar3[k] = ar2[j];
        j++;
        k++;
        return(merge(ar1, ar2, ar3, i, j, k, n, m));
    }

}

public static void main(String[] args) {
    int[] a = {1};
    int[] b = {2,5};
    int[] c = new int[6];
    
    //int[] loop = mergeLoop(a,b,c);
    int[] rec = merge(a, b);
    
    print(rec);
}
}