import java.util.Arrays;

public class SelectionSort {
    /*
    选择排序:
        最简单直接的排序,所需移动的次数最少.
        在未排序的序列中找到最值,然后存放到未排序序列的起点.
     */

    /**
     * 选择排序:
     * 时间复杂度: o(n^2)  最好最坏都是
     * 空间复杂度: o(1)
     * @param arr
     */
    public static void selectionSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            int min=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            if(min !=1){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
                System.out.println("Sorting:"+ Arrays.toString(arr));
            }
        }

    }
}
