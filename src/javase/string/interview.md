##1.下面程序的运行结果是（）
```java
        String str1 = "banalan";

        String str2 = "bana" + new String("lan");

        System.err.println(str1 == str2);
```
A：true

B：false

C：不确定

答案：B

对于字符串，==比较引用对象的内存地址，equals比较的是字符串的内容
String str1 = “banalan”; //一个对象
String str2 = “bana” + new String(“lan”); //new了一个对象，总的就是2个对象 System.err.println(str1 == str2); // ==是比较引用，两个对象的地址能一样么？只有重写equals比较内容（值）才能为TRUE

##2.String能被继承吗？为什么？
不可以，因为String类有final修饰符，而final修饰的类是不能被继承的，实现细节不允许改变。平常我们定义的String str=”a”;其实和String str=new String(“a”)还是有差异的。

前者默认调用的是String.valueOf来返回String实例对象，至于调用哪个则取决于你的赋值，比如String num=1,调用的是

```java
public static String valueOf(int i) { 
return Integer.toString(i); 
}
```
后者则是调用如下部分：
```java
public String(String original) { 
this.value = original.value; 
this.hash = original.hash; 
} 
```

最后我们的变量都存储在一个char数组中

private final char value[];

## 3. String, Stringbuffer, StringBuilder 的区别?
String 字符串常量(final修饰，不可被继承)，String是常量，当创建之后即不能更改。(可以通过StringBuffer和StringBuilder创建String对象(常用的两个字符串操作类)。)
StringBuffer 字符串变量（线程安全）,其也是final类别的，不允许被继承，其中的绝大多数方法都进行了同步处理，包括常用的Append方法也做了同步处理(synchronized修饰)。其自jdk1.0起就已经出现。其toString方法会进行对象缓存，以减少元素复制开销。
```java
public synchronized String toString() { 
if (toStringCache == null) { 
toStringCache = Arrays.copyOfRange(value, 0, count); 
} 
return new String(toStringCache, true); 
}
```
StringBuilder 字符串变量（非线程安全）其自jdk1.5起开始出现。与StringBuffer一样都继承和实现了同样的接口和类，方法除了没使用synch修饰以外基本一致，不同之处在于最后toString的时候，会直接返回一个新对象。
```java
public String toString() { 
// Create a copy, don’t share the array 
return new String(value, 0, count); 
}
```