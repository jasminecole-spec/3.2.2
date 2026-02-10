import java.util.ArrayList;

public class ArrayListPerson
{  
  public static void main(String[] args)
  { 
    ArrayList<Person> newList = new ArrayList<Person>();
    newList.add(new Person("John", 14, 150.0));
    newList.add(new Person("Jade", 14, 145.0));
    newList.add(new Person("Dave", 14, 160.0));

    for (Person age : newList)
    {
      //does not work because 1. it is only a String and no age nor height. It also attempts to add while it's running through the array in the enhanced for loop.
      //age.add("my cousin");
      System.out.println(age.getName() + " is " + age.getAge());
    }

    
  }
}
