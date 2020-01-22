
java军团 

```java

```
## 1. Byte类型可以存储多少个字节和取值范围？（）
A 1个字节 ， -128 ~ 127

B 2个字节， 32 768 – 32 767

C 4字节 -2 147 483 648 – 2 147 483 647 (正好超过 20 亿)

D 8个字节 -9 223 372 036 854 775 808 – 9 223 372 036 854 775 807

答案：A

解析：

byte是一个字节保存的，有8个位，即8个0、1。

8位的第一个位是符号位，

也就是说0000 0001代表的是数字1

1000 0000代表的就是-1

所以正数最大位0111 1111，也就是数字127

负数最大为1111 1111，也就是数字-128

所以Java中的一个byte是1个字节，其范围是-128~127
##2. short类型可以存储多少个字节和取值范围？（）
A 1个字节 ， -128 ~ 127

B 2个字节， 32 768 – 32 767

C 4字节 -2 147 483 648 – 2 147 483 647 (正好超过 20 亿)

D 8个字节 -9 223 372 036 854 775 808 – 9 223 372 036 854 775 807

答案 B

解析：

与byte类似道理，16位,（-32768~32767） (-2的15次方到2的15次方-1)需要2个字节存储所以答案为B.
##3.long类型可以存储多少个字节和取值范围？（）
A 1个字节 ， -128 ~ 127

B 2个字节， 32 768 – 32 767

C 4字节 -2 147 483 648 – 2 147 483 647 (正好超过 20 亿)

D 8个字节 -9 223 372 036 854 775 808 – 9223 372 036 854 775 807

答案 D

解析：

与byte类似道理,64位，（-9223372036854774808~9223372036854774807）（-2的63次方到2的63次方-1）需要4个字节存储。

## 4.下面能通过编译运行出Hello World的是()
```java
A:public class Hello {
public static void main(String[]args) {
System.out.println("Hello World");
    }
}

B:.public class Hello {
public static void main(String[] args) {
system.out.println("Hello World");
    }
}

C:public class Hello {
public static void main(String[] args) {
System.out.println("Hello World");
    }
}

D:public class Hello {
public static  main(String[] args) {
System.out.println("Hello World");
    }
}
```
AC

## 5.java源文件和编译后得文件拓展名分别为（）
A:.class和.java 

B: .java 和.class

C:.class和.class 

D:.java和.javac

B，源文件就是程序员们所编写出来的java代码。类文件则是通过java虚拟机编译后没有语法错误生成的.class文件

## 6.如下哪些不是java的关键字？（ ）
A.const

B.NULL

C.false

D.this

E.native

答案：BC
解析：
虽然null false 还有true不是java的关键字，但是都有特殊用途，不建议作为标识符。

## 7.下面哪个表达式的值与数组下标量总数相等？（ ）
A .m.length()

B.m.length

C.m.length()+1

D.m.length+1

答案：B
数组下标是从零开始的，但是数据下标的总量和数据长度相同。

##8.如下代码
```java
public class Sortof {
        public static void main(String[] args) {
            ArrayList<Integer> a=new ArrayList<>();
             a.add(1);a.add(5);a.add(3);
            Collections.sort(a);
            a.add(2);
            Collections.reverse(a);
            System.out.println(a);
        }
}
```

下面哪一个是正确的（）

A[1,2,3,5)]   
    
B.[2 ,1,3,5]

C.[2,5,3,1]    
   
D [5, 3,2, 1]

E [1,3 ,5,2)      
  
F Compilation fails.

答案：C
解析：
Collections.sort(a);默认是升序排列，所以变成了1，3，5然后在加上2，就会变成1，3，5，2，
而reverse方法是反转集合中的所有元素，所以反转之后就成了2，5，3，1.

## 9.对于以下，有int x = 5, y =6, z;
z = ++x + y++;

z的结果下面正确是是（）

A：10

B:8

C:11

D:12

答案：D

解析：
++x ，y++ 将 x = 5, y =6带入里面 得到 6 ，6 所以结果为12

## 10.代码如下
int a=5;

int b=++a;

int c=a+(++b)

C的正确结果是（）

A：11

B：13

C：10

D：12

答案 B

解析：
a=5; b=++a; // 相当于a=a+1;b=a; 结果是a=6，b=6
int c=a+(++b) //先计算 ++b =6+1=7; c=6+7=13;
这个主要是考察 自增的运算， ++在变量前面就是先让变量+1 在运算；++在变量的后面就是 先运算。

##11.计算2 << 3，下面正确的是（）
A：6

B:54

C:8

D:16

答案D

解析：
2<<3； 表示 2向左移 3位：2 * 2^3(2的3次方) = 2 * 8；
因为一个数左移 n位，就相当于 2的 n次方，那么一个数乘以 8只要将其左移 3位即可，而为运算符的效率最高，所以 2乘以 8等于几的最有效方法是 2<<3。

## 12.选择下面代码的运行结果：（）。
```java
public class TEST {
    public static void main(String[] args) {
        for (int i = ; i < 3; i++) {
            System.out.print(i);
        }
        System.out.print(i);
    
    }
}

```
A．0123

B．123

C．编译错误

D．没有任何输出

答案：C

解析：
本试题属于 本身该试题就有严重的语法程序错误。

##13 以下哪些定义的变量是正确的（）

A int 1abc;

B char abc1;

C long #abc;

D boolean $abc;

E：String_123456asdfghjklqwertyuiopzmnbvasdf12345;

答案 B D

解析：

因为java中变量名必须是一个以字母开头并由字母或者数字构成的序列。
字母包括 A-Z,a-z,_,$或在某种语言中表示的字母的任何Unicode字符。变量名中所有的字符都是有意义的，并且大小写敏感，变量名基本上没有限制.
##14 代码如下
```java
double a = 15.0;
     int b=2;
      system.out.println(a+b);
```
打印出来的数值类型为（）
A int

B float

C String

D double

答案 D

解析：
如果两个操作数中有一个是double类型，另一个操作数就会自动转换为double类型。

## 15.下面float的赋值语句错误的是？()
A:float f=3.4;

B:float f=3.4F;

C:float f=1.0;

D:float f=1;

答:AC

解析

3.4是双精度数，将双精度型（double）赋值给浮点型（float）属于下转型（down-casting，也称为窄化）会造成精度损失，因此需要强制类型转换float f =(float)3.4; 或者写成float f =3.4F;
float a = 1;这里的1是整形，当赋值给一个float时，存在一个隐式转换，不损失精度。

float a = 1f;

1f就是float类型的。

如果你这样定义

float f = 1.0;

肯定会出错。 因为1.0默认是double类型的。double范围比float大。为了不损失精度，不会自动转换。这是必须这样写
float f = 1.0f;

## 16.以下哪个约束符可用于定义成员常量？（）
A、 static

B、final

C、abstract

D、No modifier can be used

答案 B
解析：static 静态成员变量(在定义这个变量的类的实例中,这个变量是唯一的,即多个实例间这个变量为共享的)
final 成员常量(必须在定义时或在构造方法中赋初值)
final static 静态成员常量,必须在定义这个常量时给定其初始化值

## 17.以下哪个约束符可用于定义成员常量？（）
A、 static

B、final

C、abstract

D、No modifier can be used

答案 B
解析：static 静态成员变量(在定义这个变量的类的实例中,这个变量是唯一的,即多个实例间这个变量为共享的)
final 成员常量(必须在定义时或在构造方法中赋初值)
final static 静态成员常量,必须在定义这个常量时给定其初始化值

## 18.在使用interface声明一个接口时，只可以使用（）修饰符修饰该接口
A private

B protected

C private protected

D public

答案：D
解析：接口必须要具体类实现才有意义，所以必须是public。

## 19.java语言使用的字符码集是()
A ASCII

B BCD

C DCB

D Unicode

答案：D
解析：Java语言使用的是Unicode字符集，ASCII是国际上使用最广泛的字符编码