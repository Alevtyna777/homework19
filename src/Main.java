import MyTestClass.MyTestClass;
import TestRunner.TestRunner;

public class Main {
    public static void main(String[] args) throws Exception {
        TestRunner.start(MyTestClass.class);
    }
}