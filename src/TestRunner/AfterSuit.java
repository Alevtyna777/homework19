package TestRunner;

import java.lang.annotation.Annotation;

public class AfterSuit implements Annotation {
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
