public class Addition{
    public void Sum(int x,int y){
        int s=x+y;
        System.out.println("sum="+s);  
        
    }
    public void Sum(double x,double y){
        double s=x+y;
        System.out.println("sum="+s);
    }
    public static void main(String [] args){
        Addition a= new Addition();
        
        a.Sum(4,5);
        a.Sum(4.5,5.5);
    }
}
