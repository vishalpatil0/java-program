public class varargs {
    /**
     * 
     * @param a compulsory parameter in add method.
     * @param arr variable argument it is an array and number of element are depened on how many elemetns are passed.
     * @return sum of variable arguments
     */
    static int add(char a,int ...arr)
    {
        /* ...arr is available as arr[] here
        and this array also be work as empty array
        mean the function work as default function*/
        int result=0;
        for(int elt:arr)
        {
            result+=elt;
        }
        System.out.println("first parameter is "+a);
        return result;
    }
    public static void main(String[] args) {
            System.out.println(add('3'));        
            System.out.println(add('3',4));        
            System.out.println(add('3',123,234));        
    }
    
}
