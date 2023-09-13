package org.example.chapter1.annotations;

/**
 * @author xiebiao@akulaku.com
 * @date 2023-09-13 17:56
 */
public @interface DefaultTest {

    double d() default 12.89;

    int num() default 12;

    int[] x() default {1, 2};

    String s() default "Hello";

    String[] s2() default {"abc", "xyz"};

    Class c() default Exception.class;

    Class[] c2() default {Exception.class, java.io.IOException.class};
}
