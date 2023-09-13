package org.example.chapter1.annotations;

/**
 * @author xiebiao@akulaku.com
 * @date 2023-09-13 11:42
 */
public class Manager extends Employee {

    //并没有重写父类方法
    //@Override
    //编译器支持注解
    public void setSalary(int salary) {
        System.out.println("Manager.setSalary():" +
            salary);
    }

//    public void setSalary(double salary) {
//        System.out.println("Manager.setSalary():" +
//            salary);
//    }

    public static void main(String[] args) {
        Employee ken = new Manager();
        int salary = 200;
        ken.setSalary(salary);

    }
}

