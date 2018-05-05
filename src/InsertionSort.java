import java.util.Arrays;

public class InsertionSort {
    /*
    直接插入排序. 初衷是向已经排好序的数组中插入新的元素.
        思想:把要排序的数组分为两部分, 一个是已经排好序的, 一个是未排序的.
        然后未排序的依次往已经排好序的部分里面插入.
     */

    /**
     * 直接插入排序.
     * 时间复杂度: o(n^2), 最好最坏都是
     * 空间复杂度:o(1)
     * @param arr
     */

    //从第一个元素开始,为已经排好的. 下一个元素依次和前面的元素比较, 然后进行交换.
    public static void insertionSort(int [] arr) {
        for(int i=0;i<arr.length-1;i++){  //用来控制每次要比的元素(i+1)
            for(int j=i+1;j>0;j--){   //从后往前依次比较, 如果该元素比他前一位还大, 说明不用排了,可以直接break
                if(arr[j-1]<=arr[j])    //如果没有前一个大,就交换位置,继续去比前前一个元素.
                    break;
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                System.out.println("sorting:"+Arrays.toString(arr));
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr={3,6,8,1,23,9,5,32,5};
        insertionSort(arr);
    }
}
