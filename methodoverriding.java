class Animal
{
 public void eat()
 {
  System.out.println("eating the food");
 }
}
class Herbivores extends Animal
{
 public void eat()
 {
  System.out.println("eats only plants");
  }
}
class Carnivores extends Animal
{
 public void eat()
 {
  System.out.println("eats only meat");
 }
}
class Omnivores extends Animal
{
 public void eat()
 {
  System.out.println("eats both");
 }
}
class Mainclass
{
 public static void main(String args[])
 {
  Animal a=new Animal();
  a.eat();
  Herbivores h=new Herbivores();
  h.eat();
  Carnivores c=new Carnivores();
  c.eat();
  Omnivores o=new Omnivores();
  o.eat();
 
 }
}
 