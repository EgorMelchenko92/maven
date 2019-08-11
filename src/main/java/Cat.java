public class Cat implements Animal {

    public String go() {
        return "";
    }

    public Integer getLegs() {
        return -4;
    }

    public String voice() {
        return "MyaYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY";
    }

    @Override
    public int countAnimals(int a, int b) {
        return a*b;
    }
}
