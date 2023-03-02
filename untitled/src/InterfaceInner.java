interface OutInterface{
    public void f();
}
public class InterfaceInner {
    public static void main(String args[]){
        Outclass outclass = new Outclass();
        OutInterface outInterface = outclass.doit();
        outInterface.f();
    }
}
class Outclass{
    private class InnerClass implements OutInterface{
        InnerClass(String s){
            System.out.println(s);
        }
        @Override
        public void f() {
            System.out.println("内部类中f()的调用");
        }
    }
    public OutInterface doit(){
        return new InnerClass("内部类的构造方法");
    }
}
