public class ThisTestClass {
    public int i;

    ThisTestClass(int i){
        this.i = i;
    }

    public void writeOutput(ThisTestClass that) {
        System.out.println("i is " + i + ", this i is " + this.i + ", and that is " + that.i);
    }
    public static void main(String[] args){
        ThisTestClass a = new ThisTestClass(1);
        ThisTestClass b = new ThisTestClass(10);

        a.writeOutput(b);
        b.writeOutput(a);
    }
}
