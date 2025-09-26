
class Student {
    private int age;
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
class Main{
    public static void main(String args[]){
        Student s= new Student();
        s.setAge(20);
        System.out.println("Age"+s.getAge());
    }
}
