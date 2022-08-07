public class Test2 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello123".substring(0, 5);
    }
}
class Animal2 {
    private int id;

    public Animal2(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal2 otherAnimal = (Animal2) obj;
        return this.id == otherAnimal.id;
    }
}
