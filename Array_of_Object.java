class vishal{
    int a;
    void get(int a){
      this.a=a;  
    }
    void set(){
      System.out.println(a);
    }
  }
  public class Experiment1{
    public static void main(String[] args) {
      vishal vishu[]=new vishal[3];
      for(int i=0;i<3;i++){
        vishu[i]=new vishal();
      }
      for(int i=0;i<3;i++)
      {
        vishu[i].get(i);
      }
      for(int i=0;i<3;i++)
      {
        vishu[i].set();
      }
    }
  }