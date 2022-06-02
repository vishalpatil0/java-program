import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>(20);
        for(int i=20;i>0;i--){
            arrayList.add(i);
        }
        arrayList.add(3, 34);
        System.out.println(arrayList.contains(2));
        System.out.println("index of 5 : "+arrayList.indexOf(5));
        arrayList.clear();
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
