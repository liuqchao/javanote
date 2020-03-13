##1.下面有关webservice的描述，错误的是？
A. Webservice是跨平台，跨语言的远程调用技术

B. Webservice通信机制实质就是json数据交换

C. Webservice采用了soap协议（简单对象协议）进行通信

D. WSDL是用于描述 Web Services 以及如何对它们进行访问

答案: B
解析：Web service顾名思义是基于web的服务，它是一种跨平台，跨语言的服务。
我们可以这样理解它，比如说我们可以调用互联网上查询天气信息的web服务，把它嵌入到我们的B/S程序中，当用户从我们的网点看到天气信息时，会认为我们为他提供很多的服务，但其实我们什么也没做，只是简单的调用了一下服务器上的一端代码而已。Web service 可以将你的服务发布到互联网上让别人去调用，也可以调用别人发布的web service，和使用自己的代码一样。
它是采用XML传输格式化的数据，它的通信协议是SOAP(简单对象访问协议).
##2.从下面四段（A，B，C，D）代码中选择出正确的代码段（
```java
A．abstract class Name {
    private String name;
public abstract boolean isStupidName(String name) {}
                                        }
B．public class Something {
void doSomething () {
private String s = ?”;
int l = s.length();
}
}
C．public class Something {
public static void main(String[] args) {
Other o = new Other();
new Something().addOne(o);
}
public void addOne(final Other o) {
o.i++;
}
}
class Other {
    public int i;
}
D．public class Something {
public int addOne(final int x) {
return ++x; }
}
```

答案：C

解析：
A..抽象方法不能有方法体
B．方法中定义的是局部变量，不能用类成员变量修饰符private
D．final修饰为常量，常量的值不能被改变