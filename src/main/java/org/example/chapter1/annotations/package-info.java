package org.example.chapter1.annotations;
/**
 * <pre>
 *      1、所有的注解定义都实现了 {@link java.lang.annotation.Annotation} 接口
 *      2、[约束1] 注解不能继承
 *      3、[约束2] 注解在运行时，注解的方法（熟悉），只能被读取 {@link org.example.chapter1.annotations.VersionUsage},同时方法不能带参数，{@link org.example.chapter1.annotations.WrongVersion}
 *      4、[约束3] 注解方法定义，不能抛出异常
 *      5、[约束4] 注解方法定义返回的类型不能包含自定义类，因为注解是预编译的，数据类型必须包含在SDK中。
 *      6、[约束5] 注解方法定义不能重写Object类和Annotation接口中的方法
 *      7、[约束6] 注解不能使用泛型
 *      8、注解可以定义默认值 {@link org.example.chapter1.annotations.DefaultTest}
 *   </pre>
 */