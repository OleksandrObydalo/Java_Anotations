@VeryImportant
public class Cat {
    String name;
    int age;

    public Cat(String name) {
        this.name = name;
    }

    @VeryImportant
    public void meow() {
        System.out.println("Meow!");
    }
    
    public void eat(){
        System.out.println("Munch!");
    }
}
