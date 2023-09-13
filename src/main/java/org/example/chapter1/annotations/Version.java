package org.example.chapter1.annotations;

/**
 * <pre>
 *     1、所有的注解定义都实现了 {@link java.lang.annotation.Annotation} 接口
 *     2、注解不能继承
 * </pre>
 *
 * @author xiebiao@akulaku.com
 * @date 2023-09-13 16:07
 */
public @interface Version {

    int major();

    int minor();

    int defaultValue() default 2;

}
