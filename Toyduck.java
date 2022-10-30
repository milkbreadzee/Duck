public class Toyduck extends Duck{
    public Toyduck(){
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }
    public void display(){
        System.out.println("im a toy duck");
    }
}
