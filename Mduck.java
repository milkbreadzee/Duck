
public class Mduck extends Duck{
    public Mduck(){
         quackBehaviour = new Quack();
         flyBehaviour = new FlyWithWings();   
    }

    public void display(){
            System.out.println("im a real mduck");
    }
}