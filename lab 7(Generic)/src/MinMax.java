public class MinMax <T extends Comparable<T> >{
    private T[] array;

    public MinMax(T[] array) {
        this.array = array.clone();
    }

    public T MaxValue(){
        T max=array[0];
        for (int i=1;i<array.length;i++)
        { if (array[i].compareTo(max)>0)
            max= array[i]; }
        return max;
    }
    public T MinValue(){
        T min=array[0];
        for (int i=1;i< array.length;i++)
        { if (array[i].compareTo(min)<0)
            min = array[i]; }
        return min;
    }

    public static void main (String[] args){
        Integer[] array= new Integer[]{2,8,15};
        MinMax<Integer> arr = new MinMax<>(new Integer[]{1,5,10});
        MinMax<Integer> arr2 = new MinMax<>(array);
        System.out.println(arr.MaxValue());
        System.out.println(arr.MinValue());
        System.out.println(arr2.MaxValue());
        System.out.println(arr2.MinValue());
    }


}
