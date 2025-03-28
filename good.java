class phone
{
 private int age;
  private String name;

 public int getAge()
 {
    return age;
 }
 public void setAge(int a)
 {
   age = a;
 }
 public String getName()
{
    return name;
}
public void setName(String n)
{
name = n;
}
}
 
public class good{
    public static void main(String args[]){

phone ob1 = new phone();
ob1.setAge(30);
ob1.setName("rama");
System.out.println(ob1.getAge() + " : " + ob1.getName());
    }
}