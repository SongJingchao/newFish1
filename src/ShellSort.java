import java.util.Arrays;

public class ShellSort {
    /*
    希尔排序:直接插入排序的改进版, (又称为递减增量排序)
    先将整个待排序序列分割成若干子序列, 分别进行直接插入排序, 待整个序列中的记录基本有序时,再对全体记录进行
    一次直接插入排序.
     */

    /**
     * 希尔排序,
     * 时间复杂度(nlog2 n)  最好最坏都是
     * 空间复杂度(o(1))
     * @param arr
     */
    public static void shellSort1(int [] arr){
        int gap = arr.length/2;
        for(;gap>0;gap /=2){
            for(int j=0;(j+gap)<arr.length;j++)  //使用当前gap进行组内排序
            {
                for(int k=0;(k+gap)<arr.length;k+=gap){
                    if(arr[k] > arr[k+gap]){
                        int temp=arr[k+gap];
                        arr[k+gap] = arr[k];
                        arr[k] = temp;
                        System.out.println("Sorting:"+ Arrays.toString(arr));
                    }
                }
            }
        }
    }


    public static  void shellSort2(int [] arr){
        int gap = 1,i,j, len=arr.length;
        int temp;
        while(gap<len/3){
            gap=gap*3+1;
        }
        for(;gap>0;gap /=3){
            for(i=gap;i<len;i++){
                temp=arr[i];
                for(j=i-gap;j>=0 && arr[j]>temp;j -=gap)
                    arr[j+gap]=arr[j];
                arr[j+gap]=temp;
                System.out.println("Sorting:"+Arrays.toString(arr));
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={3,6,8,1,23,9,5,32,5};
        //shellSort1(arr);
        System.out.println("/");
        shellSort2(arr);
    }
}
