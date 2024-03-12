public class Hello1 extends HelloParent implements IHello{
    @Override
    public void SaySomething() {
        System.out.println("Hello world!");
    }
}