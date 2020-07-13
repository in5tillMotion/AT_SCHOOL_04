import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import somepackage.Other;
import somepackage.Some;
import somethinggreen.AnnotationForExaple;
import somethinggreen.Contract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Other.saySomthing();
        Some some = new Some("Секрет");
        System.out.println(some.getSecret());
        some.setNoMoreSecrets(some.getДаТакТожеМожно());
        System.out.println(some.getSecret(true));
        System.out.println(some);
        some.soTellMeAboutInterfaces();
        System.out.println();

        AnnotationForExaple annotation = Some.class.getAnnotation(AnnotationForExaple.class);
        System.out.println(annotation.description());

        try {
            String defaultValue = (String) AnnotationForExaple.class
                    .getDeclaredMethod("description").getDefaultValue();
            System.out.println(defaultValue);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}