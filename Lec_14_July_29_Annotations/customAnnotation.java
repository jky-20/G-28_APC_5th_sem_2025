package Lec_14_July_29_Annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface LoginUser{
    String value();
}

@LoginUser("password")
class Example{

}

public class customAnnotation {
    static void loginUser(){
        System.out.println("Login your user");
    }
    public static void main(String[] args) {
        
        Class<Example> anotatedclass = Example.class;
        
        if(anotatedclass.isAnnotationPresent(LoginUser.class)){
            loginUser();
            LoginUser userPassword = anotatedclass.getAnnotation(LoginUser.class);
            System.out.println(userPassword.value());
        }
    }
}
