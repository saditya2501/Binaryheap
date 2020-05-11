public class BinaryHeapByArrayMain {
    public static void main(String[] args)
    {
        BinaryHeapByArray object=new BinaryHeapByArray(5);
        object.insert(12);
        object.insert(7);
        object.insert(16);
        object.insert(4);
        object.insert(1);
        System.out.println("Elements are:");
        object.display();
        System.out.println("Size of tree:");
        object.getSizeoftree();
        System.out.println("Tells about weather heap is empty or not");
        object.isheapempty();
        System.out.println("tree deleted");
        object.deleteHeapTree();
        System.out.println(object.extract());
    }
}
