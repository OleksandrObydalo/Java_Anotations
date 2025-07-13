import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE}) // Apply this annotation to classes and methods
@Retention(RetentionPolicy.RUNTIME) //Use this annotation during runtime
public @interface VeryImportant {
}
