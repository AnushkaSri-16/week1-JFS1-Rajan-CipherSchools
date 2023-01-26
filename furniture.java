public class furniture {
    int width;
    int height;

    void display(java.lang.String string) {
        System.err.println(string+" width "+width+" height "+height);
    }
    public static void main(String[] args) {
        Chair wow = new Chair();
        wow.foo();
    }

}
class Chair extends furniture {
    void foo() {
        width=19;
        height=54;
        display("chair");
    }
}
class Table extends furniture {
    void foo() {
        width=89;
        height=94;
        display("Table");
    }
}
class Almirah extends furniture{
    void foo() {
        width=18;
        height=94;
        display("Almirah");
    }

}