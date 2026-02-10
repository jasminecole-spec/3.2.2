public class Person
{
    private int age = 0;
    private String name;
    private double height;


    public Person(String n, int a, double h)
    {
      age = a;
      name = n;
      height = h;
    }

    public void setAge(int a)
    {
      age = a;
    }

    public void setName(String n)
    {
      name = n;
    }

    public void setHeight(double h)
    {
      height = h;
    }

    public int getAge()
    {
      return age;
    }

    public String getName()
    {
      return name;
    }

    public double getHeight()
    {
      return height;
    }
}
