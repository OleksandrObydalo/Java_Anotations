import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotations {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat("Oscar");

        if(cat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("Cat is very important");
        } else{
            System.out.println("Cat isn't very important");
        }

        Dog dog = new Dog("Max");

        if(dog.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("Dog is very important");
        } else{
            System.out.println("Dog isn't very important");
        }

        for(Method method : cat.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(RunImmediately.class)){
                method.invoke(cat);
            }

        }

    }
}
