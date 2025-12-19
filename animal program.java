class Animal
{
void makeSound()
{
System.out.println("animal make a sound");
}
}
class Dog extends Animal
{
void makeSound()
{
System.out.println("Dog make sounds");
}
}
public class ExampleForAnimal
{
public static void main(String args[])
{
Dog d=new Dog();
d.makeSound();
}
}
