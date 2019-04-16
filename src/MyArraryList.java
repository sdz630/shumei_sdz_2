import javax.print.attribute.standard.NumberUp;

public class MyArraryList<T extends Number> {
    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY=10;

    MyArraryList(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    MyArraryList(int capacity){
        if(capacity<0){
            throw new RuntimeException("容器的容量不能为负数");
        }else if(capacity==0){
            elementData = new Object[DEFAULT_CAPACITY];
        }
        elementData = new Object[capacity];
    }

    public void add(T element)
    {
        if (size == elementData.length) {
            //扩容
            Object[] newArrary = new Object[elementData.length+(elementData.length>>1)];//扩容1.5倍
            System.arraycopy(elementData,0,newArrary, 0,size);//拷贝
            elementData =newArrary;
        }
        elementData[size++]=element;
    }

    public T get (int index){
        checkindex(index);
        return (T)elementData[index];
    }

    public void set(T element, int index) {
        checkindex(index);
        elementData[index]=element;
    }

    public void checkindex(int index) {
        if(index<0||index>size-1)
            throw new RuntimeException("索引越界:"+index);
    }

    public void remove(int index){
        System.arraycopy(elementData,index+1,elementData,index, size-index-1);
        size--;
    }
    public void remove(T element){
        for (int i = 0; i < size; i++) {
            if(element.equals(get(i))){
                remove(i);
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <size ; i++) {
            sb.append(elementData[i] + ",");
        }
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static void main(String[] args) {
        MyArraryList msl = new MyArraryList(10);
        Integer a = new Integer(4);
        System.out.println(a.hashCode());
        System.out.println(a);
        for (int i = 0; i <30 ; i++) {
            msl.add(i);
        }
        System.out.println(msl.get(3));
        System.out.println(msl.get(3));
        msl.set(666,3);
//        msl.add(369);
//        msl.add(9);
//        msl.add(9.9);
        msl.remove(29);
        System.out.println(msl.toString());
    }
}
