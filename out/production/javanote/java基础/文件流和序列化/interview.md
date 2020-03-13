##1.Java I/O中字符流和字节流的区别 ?
字节流是传递0~255的整数而Java中有一些(如unicode代码)不能使用字符流，是特殊的字节流。

字节流：Java中的字节流处理的最基本单位为单个字节，它通常用来处理二进制数据。Java中最基本的两个字节流类是InputStream和OutputStream，它们分别代表了一组基本的输入字节流和输出字节流。InputStream类与OutputStream类均为抽象类，我们在实际使用中通常使用Java类库中提供的它们的一系列子类。下面我们以InputStream类为例，来介绍下Java中的字节流。

字符流：Java中的字符流处理的最基本的单元是Unicode码元（大小2字节），它通常用来处理文本数据。所谓Unicode码元，也就是一个Unicode代码单元，范围是0×0000~0xFFFF。在以上范围内的每个数字都与一个字符相对应，Java中的String类型默认就把字符以Unicode规则编码而后存储在内存中。然而与存储在内存中不同，存储在磁盘上的数据通常有着各种各样的编码方式。使用不同的编码方式，相同的字符会有不同的二进制表示。
## 2.什么是java 序列化，如何实现java 序列化？
答：序列化就是一种用来处理对象流的机制，所谓对象流也就是将对象的内容进行流化。可以对流化后的对象进行读写操作，也可将流化后的对象传输于网络之间。序列化是为了解决在对对象流进行读写操作时所引发的问题；序列化的实现：将需要被序列化的类实现Serializable 接口，该接口没有需实现的方法，implements Serializable 只是为了标注该对象是可被序列化的，然后使用一个输出流(如FileOutputStream)来构造一个ObjectOutputStream(对象流)对象，接着，使用ObjectOutputStream 对象的writeObject(Object obj)方法就可以将参数为obj 的对象写出(即保存其状态)，要恢复的话则用输入流。
## 3.java 中有几种类型的流？JDK 为每种类型的流提供了一些抽象类以供继承，请说出他们分别是哪些类？
InputStream、OutputStream，字符流继承于Reader、Writer。在java.io 包中还有许多其他的流，主要是为了提高性能和使用方便。
##4.下列哪个叙述是正确的()
A. 创建File对象可能发生异常。

B. BufferedRead流可以指向FileInputStream流

C. BufferedWrite流可以指向FileWrite流

D.RadomAccessFile流一旦指向文件，就会刷新该文件

答案：C
解析：
创建File对象不会发生异常，创建新文件的时候会发生IOException异常。
BufferedRead流只能指向FileRead流，它们都是以字符读取数据的。
RadomAccessFile流指向文件时，不刷新文件。

##5.为了向文件hello.txt尾加数据，下列哪个是正确创建指向hello.txt的流？
```java
A. try{ OutputStream out = new FileOutputStream(“hello.txt”); 
} 
catch(IOException e){} 

B. try { OutputStream out = new FileOutputStream(“hello.txt”,true); 
} 
catch(IOException e){} 

C.try{ OutputStream out = new FileOutputStream(“hello.txt”,false); 
} 
catch(IOException e){} 

D.try{ OutputStream out = new OutputStream(“hello.txt”,true); 
} 
catch(IOException e){}
```
答案：B

FileOutputStream类是文件字节输出流，它是OutputStream类的子类，所以FileOutputStream的实例方法都是从OutputStream类继承来的，那么在这道题中需要使用上转型对象才能调用重写父类的方法，排除D。ABC在于FileOutpurStream的构造方法的不同，题目要求向文件尾加数据，A选项是具有刷新功能的构造方法，也就是会覆盖掉原来文件的数据，B选项参数为true表示不会刷新所指向的文件，而是从文件的末尾开始向文件写入数据，取值为false，输出流将刷新所指向的文件。

