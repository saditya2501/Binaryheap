public class BinaryHeapByArray {
    int arr[];
    int sizeoftree;
    public BinaryHeapByArray(int size)
    {
        arr=new int[size+1];
        sizeoftree=0;

    }
    public int extract()
    {
      if(sizeoftree==0)
      {
          System.out.println("extract not possible");
          return -1;
      }
      else
          {
          int result = arr[1];
          arr[1]= arr[sizeoftree];
          sizeoftree--;
          heapifiyextract(1);
          return result;
        }
    }

    public void heapifiyextract(int index)
    {

        int left=index * 2;
        int right= 1+(index * 2);
        int smallChild=0;

        if(sizeoftree<left)
        {
            return;
        }
        else if (sizeoftree== left)
        {
            if(arr[index]>arr[left])
            {
                int temp=arr[index];
                arr[index]=arr[left];
                arr[left]=temp;
            }
            return;
        }
            else
        {
            if(arr[left]<arr[right])

                smallChild=left;
                else
                    smallChild=right;

                if(arr[index]>arr[smallChild])
                {
                    int temp=arr[index];
                    arr[index]=arr[smallChild];
                    arr[smallChild]=temp;

                    heapifiyextract(smallChild);


                }


        }
    }
    public void insert(int value)
    {
        arr[sizeoftree+1]=value;
        sizeoftree++;
        heapify(sizeoftree);

    }
    public int size()
    {
        return arr.length;
    }
    public int getSizeoftree()
    {
        return sizeoftree;
    }
    public void deleteHeapTree()
    {
        arr=null;
        System.out.println("heap deleted");
    }
    public boolean isheapempty()
    {
        if(sizeoftree==0)
        {
            return true;

        }
        else {
            System.out.println("no");
            return false;

        }
    }
    public void peakinheap()
    {
    if(sizeoftree==0)
    {
        System.out.println("heap empty");
            }
    else
        System.out.println(arr[1]);
    }
public void heapify(int index)
{
    int parent=index/2;
    if(index<=1)
    {
        return;
    }
    if (arr[index] < arr[parent])
    {
    int temp=arr[index];
    arr[index]=arr[parent];
    arr[parent]=temp;
    }
heapify(parent);
}
public void display()
{
    for(int i=1;i<=sizeoftree;i++)
    {
        System.out.println(arr[i]);
    }
}
}
