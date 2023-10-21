interface Animal
{
// by default all are public abstarct
// => public abstract void eat();
void eat(); 
void sound();
void running();
}
class Dog implements Animal
{
 public void eat()
{
 System.out.println("eats both veg and nonveg");
}
public void sound()
{
 System.out.println("bow bow..");
}
public void running()
{
 System.out.println("dogs runs faster");
}
}
class Tiger implements Animal
{
public void eat()
{
 System.out.println("eats only nonveg");
}
public void sound()
{
 System.out.println("roaring ..");
}
 public void running()
{
 System.out.println("tigers runs faster than dog");
}
}
class Main
{
public static void main(String args[])
{
//Animal a=new Animal(); invalid
Animal a;
a=new Dog();
a.eat();
a.sound();
a.running();

a=new Tiger();
a.eat();
a.sound();
a.running();
}
}
