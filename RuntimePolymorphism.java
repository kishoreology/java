class Bike{
void run() { System.out.println("running") ;}
}
class Splendor extends Bike{
void run() { System.out.println("running safely with 60km"); }
}
class RuntimePolymorphism{
public static void main(String args[]) {
Splendor b1 = new Splendor();
b1.run();
Bike b2 = new Bike();
b2.run();
Bike b3 = new Splendor();	//Up casting
b3.run();			// subclass method i.e., Splendor will be executed
}
}
