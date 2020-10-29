class Animal{  
Animal(){System.out.println("animal is created");}  
}  
class Dog extends Animal{  
Dog(){  
super();  
System.out.println("dog is created");  
}
}  
class Super_invoke_parent_class_constructor{
public static void main(String args[]){  
Dog d=new Dog();  
}}  