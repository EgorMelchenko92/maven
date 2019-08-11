public class Dog implements Animal{

    public String go() {
        return "Run";
    }

    public Integer getLegs() {
        return 4;
    }

    public String voice() {
        return "WOOF-WOOF-WOOF-WOOF-WOOF";
    }

    @Override
    public int countAnimals(int a, int b) {
        return a/b;
    }
}
