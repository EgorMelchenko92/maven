public class Bird implements Animal {

    public String go() {
        return "";
    }

    public Integer getLegs() {
        return null;
    }

    public String voice() {
        return "KAR";
    }

    @Override
    public int countAnimals(int a, int b) {
        return a+b;
    }
}
