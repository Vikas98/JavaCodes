package PriorityQueue.heaps;

public class heapSort {
    public void heapify(int arr[],int n ,int index)
    {

        int left = 2*index+1;
        int right = 2*index+2;
        int minIdx = index;

        if(left < n && arr[left]>arr[minIdx])
            minIdx = left;
        if(right< n && arr[right]>arr[minIdx])
            minIdx = right;

        if(minIdx != index)
        {
            int temp = arr[index];
            arr[index] = arr[minIdx];
            arr[minIdx] = temp;
            heapify(arr,n,minIdx);
        }

    }
    public void heapSortalgo(int [] arr)
    {
        Heaps.Heap  heap = new Heaps.Heap();
        int n = arr.length;
        for (int i = n/2-1; i >= 0 ; i--) {

            heapify(arr,n,i);
        }
        for (int i = n-1; i >=0 ; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,i,0);
        }
    }
    public static void main(String[] args) {
        int[] arr= {5,4,8,7,2,6,1,6,1,0};
        new heapSort().heapSortalgo(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
