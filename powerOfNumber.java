class Main {
    public int root(){
        int n=5;
        int m= (int) Math.pow(n,1.0/2);
        return m;
    }
    public static void main(String[] args) {
        Main r=new Main();
        int m=r.root();
        System.out.println("answer:"+m);
    }
}
