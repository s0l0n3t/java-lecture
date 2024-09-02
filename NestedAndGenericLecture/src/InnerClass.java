public class InnerClass {

    public int a = 4;
    public class In{
        public int a = 5;
        public void add(){
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(InnerClass.this.a);
        }
    }
    public void add(){
        In inObject = new In();
        inObject.add();
    }
    public In createClass(){
        return new In();
    }
}
