/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

/**
 *
 * @author Administrator
 */
public class Sort {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] a = {43,2,45,10,343,5,1};
        //MergeSort.mergeSort(a);
        //InsertionSort.insertionSort(a);
        //ShellSort.shellSort(a);
        HeapSort.heapSort(a);
    }
    
     public static <AnyType extends Comparable<? super AnyType>>
            void print( AnyType [] a ){
        for(AnyType i : a){
           System.out.print((Integer)i + ",");
        }
        System.out.println();
    }
     
     public static <AnyType extends Comparable<? super AnyType>>
             void swapReferences( AnyType [] a, int i, int j ){
         AnyType temp = a[ i ];
         a[ i ] = a [ j ];
         a[ j ] = temp;
     }
}
