##1.如下代码
```java
 public class Alpha{
         public void foo(){
                System.out.print("Afoo ");
           }
｝
     public class Beta extends Alpha{
          public void foo() {
                 System.out.print("Bfoo" );
           }
    public static void main(String[] args){
           Alpha a = new Beta();
           Beta b=(Beta)a;
           a.foo();
           b.foo();
      }
｝
```
下面哪一个是正确的（）

A.Afoo Afoo

B. Afoo Bfoo

C. Bfoo Afoo

D. Bfoo Bfoo

E. Compilation fails

F.An exception is thrown at runtime

答案:D

考察多态性，编译器认为a是Alpha 类型，b 是Beta 类型，但是虚拟机知道a 和b 的真实类型是Beta，所以调用Beta 类的函数。

## 2.下列哪种说法是正确的（ ）
A． 实例方法可直接调用超类的实例方法

B． 实例方法可直接调用超类的类方法

C． 实例方法可直接调用其他类的实例方法

D． 实例方法可直接调用本类的类方法

答案 D

解析:
AC选项 如果方法是private 则不可以;
B选项类父类的类方法是属于父类本身的;
D选项虽然类方法可以类名.类方法来调用 但是new 该类 的实例方法去调也不不会报错 ;
记住一句话：实例方法只能直接调用本类的方法，其他类的方法得需要引用调用

