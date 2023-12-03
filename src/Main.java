import models.MyClass;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("nurgazy", "temiraliev", 20, new String[]{"Java, English, asdf,"}, "plov");
        System.out.println(myClass);

    MyClass myClass1 = new MyClass();
    myClass1.setName("nurgazy2");
    myClass1.setLastName("temiraliev");
    myClass1.setAge(19);
    myClass1.setLessons(new String[]{"alsdk, aslkd, alskf"});
    myClass1.setFavoriteDish("ris");
        System.out.println(myClass1);
    }

}

