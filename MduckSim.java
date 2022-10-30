public class MduckSim {
   public static void main(String[] args) {
    Duck mallard = new Mduck();
    mallard.performQuack();
    mallard.performFly();
    mallard.display();
    Duck toyd = new Toyduck();
    toyd.performQuack();
    toyd.performFly();
    toyd.display();
   }
}
