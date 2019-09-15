class Data
{
    
    int data1;
    int data2;
    
    Data(int d1, int d2)
    {
        data1 = d1;
        data2 = d2;
    }
    
    Data(Data obj)
    {
        data1 = obj.data1;
        data2 = obj.data2;
    }
    
    void showData()
    {
        System.out.println("Data1 :"+data1);
        System.out.println("Data2 :"+data2);
    }
}

public class copconst 
{

    public static void main(String[] args) 
	{
       
        Data d1  = new Data(20,40);
        d1.showData();
        Data d2 = new Data(d1);
        d2.showData();
    }
}