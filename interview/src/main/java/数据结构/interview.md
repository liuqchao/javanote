##1.java中栈和堆得区别？
1.功能不同
栈内存用来存储局部变量和方法调用。
而堆内存用来存储Java中的对象。无论是成员变量，局部变量，还是类变量，它们指向的对象都存储在堆内存中。

2.共享性不同
栈内存是线程私有的。
堆内存是所有线程共有的。

3.异常错误不同
如果栈内存或者堆内存不足都会抛出异常。
栈空间不足：java.lang.StackOverFlowError。
堆空间不足：java.lang.OutOfMemoryError。

4.空间大小
栈的空间大小远远小于堆的。
##2.下面有关List接口、Set接口和Map接口的描述，错误的是？
A. 他们都继承自Collection接口
B. List是有序的Collection，使用此接口能够精确的控制每个元素插入的位置
C. Set是一种不包含重复的元素的Collection
D. Map提供key到value的映射。一个Map中不能包含相同的key，每个key只能映射一个value

答案: A
解析：
1、List接口和Set接口都继承自Collection接口，Collection接口继承Iterable接口（Iterable有一个Iterator方法），即可迭代的；Collection只能存储引用类型，并且是单个存储；

2、List接口存储元素特点：有序（存进去什么顺序取出来还什么顺序），可重复；Set接口存储元素特点：无序，不可重复

3、实现List接口主要的类包括ArrayList，LinkedList，Vector；实现Set的主要类包括：hashSet，另外还有一个TreeSet接口继承它（自动排序）

4、Map接口以键值对方式存储元素，键无序不可重复，Map和Collection没有任何关系
##3. 关于Java语言，下列描述正确的是（多选）
A. switch 不能够作用在String类型上

B. List， Set， Map都继承自Collection接口

C. Java语言支持goto语句

D. GC是垃圾收集器，程序员不用担心内存管理

答案：AD
解析：
B. Map没有继承Collection接口
C．java不支持goto语句

##4.请简单谈谈 TreeMap 与 HashMap 的区别？
答：TreeMap 实现了 SortMap 接口，其能够根据键排序，默认是按键的升序排序，也可以指定排序的比较器，当用 Iterator 遍历 TreeMap 时得到的记录是排过序的，所以在插入和删除操作上会有些性能损耗，TreeMap 的键和值都不能为空，其为非并发安全 Map，此外 TreeMap 基于红黑树实现。

HashMap 是最常用的 Map，其基于哈希散列表实现，主要根据键的 hashCode 值存储数据，根据键可以直接获取它的值，具有很快的访问速度，当用 Iterator 遍历 HashMap 时得到的记录顺序是随机的，HashMap 只允键值均为空，其为非并发安全 Map。

所以一般情况下我们选用 HashMap，因为 HashMap 的键值对在取出时是随机的，其依据键的 hashCode 值和键的 equals 方法存取数据，具有很快的访问速度，所以在 Map 中插入、删除及索引元素时其是效率最高的实现。而 TreeMap 取出来的是排序后的键值对，所以效率会低点。
## 5. HashSet 与 HashMap 的区别？
答：从实质上说 HashSet 的实现实质就是一个 Map 对象的包装，只是 Map 的 value 为 Object 固定对象，Set 只利用了 Map 的 key 而已。具体区别来说如下：

HashMap 实现了 Map 接口，而 HashSet 实现了 Set 接口。

HashMap 储存键值对，而 HashSet 仅仅存储对象。

HashMap 使用 put 方法将元素放入 Map 中，而 HashSet 使用 add 方法将元素放入 Set 中。

HashMap 中使用键对象来计算 hashcode 值，而 HashSet 使用成员对象来计算 hashcode 值。


##21、ArrayList和Vector的区别

这两个类都实现了List接口（List接口继承了Collection接口），他们都是有序集合，即存储在这两个集合中的元素的位置都是有顺序的，相当于一种动态的数组，我们以后可以按位置索引号取出某个元素，并且其中的数据是允许重复的，这是与HashSet之类的集合的最大不同处，HashSet之类的集合不可以按索引号去检索其中的元素，也不允许有重复的元素。
ArrayList与Vector的区别主要包括两个方面：.

（1）同步性：
Vector是线程安全的，也就是说是它的方法之间是线程同步的，而ArrayList是线程序不安全的，它的方法之间是线程不同步的。如果只有一个线程会访问到集合，那最好是使用ArrayList，因为它不考虑线程安全，效率会高些；如果有多个线程会访问到集合，那最好是使用Vector，因为不需要我们自己再去考虑和编写线程安全的代码。

（2）数据增长：
ArrayList与Vector都有一个初始的容量大小，当存储进它们里面的元素的个数超过了容量时，就需要增加ArrayList与Vector的存储空间，每次要增加存储空间时，不是只增加一个存储单元，而是增加多个存储单元，每次增加的存储单元的个数在内存空间利用与程序效率之间要取得一定的平衡。Vector默认增长为原来两倍，而ArrayList的增长策略在文档中没有明确规定（从源代码看到的是增长为原来的1.5倍）。ArrayList与Vector都可以设置初始的空间大小，Vector还可以设置增长的空间大小，而ArrayList没有提供设置增长空间的方法。
总结：即Vector增长原来的一倍，ArrayList增加原来的0.5倍。

##22、HashMap和Hashtable的区别

HashMap是Hashtable的轻量级实现（非线程安全的实现），他们都完成了Map接口，主要区别在于HashMap允许空（null）键值（key）,由于非线程安全，在只有一个线程访问的情况下，效率要高于Hashtable。
HashMap允许将null作为一个entry的key或者value，而Hashtable不允许。

HashMap把Hashtable的contains方法去掉了，改成containsvalue和containsKey。因为contains方法容易让人引起误解。

Hashtable继承自Dictionary类，而HashMap是Java1.2引进的Map interface的一个实现。

最大的不同是，Hashtable的方法是Synchronize的，而HashMap不是，在多个线程访问Hashtable时，不需要自己为它的方法实现同步，而HashMap就必须为之提供同步。

就HashMap与HashTable主要从三方面来说。
一.历史原因:Hashtable是基于陈旧的Dictionary类的，HashMap是Java 1.2引进的Map接口的一个实现
二.同步性:Hashtable是线程安全的，也就是说是同步的，而HashMap是线程序不安全的，不是同步的
三.值：只有HashMap可以让你将空值作为一个表的条目的key或value

##23、List和 Map区别?

一个是存储单列数据的集合，另一个是存储键和值这样的双列数据的集合，List中存储的数据是有顺序，并且允许重复；Map中存储的数据是没有顺序的，其键是不能重复的，它的值是可以有重复的。

##24、List,Set, Map是否继承自Collection接口?

List，Set是，Map不是

##25、List、Map、Set三个接口，存取元素时，各有什么特点？

（这样的题比较考水平，两个方面的水平：一是要真正明白这些内容，二是要有较强的总结和表述能力。）
首先，List与Set具有相似性，它们都是单列元素的集合，所以，它们有一个共同的父接口，叫Collection。

Set里面不允许有重复的元素，即不能有两个相等（注意，不是仅仅是相同）的对象，即假设Set集合中有了一个A对象，现在我要向Set集合再存入一个B对象，但B对象与A对象equals相等，则B对象存储不进去，所以，Set集合的add方法有一个boolean的返回值，当集合中没有某个元素，此时add方法可成功加入该元素时，则返回true，当集合含有与某个元素equals相等的元素时，此时add方法无法加入该元素，返回结果为false。

Set取元素时，不能细说要取第几个，只能以Iterator接口取得所有的元素，再逐一遍历各个元素。

List表示有先后顺序的集合，注意，不是那种按年龄、按大小、按价格之类的排序。当我们多次调用add(Obje)方法时，每次加入的对象就像火车站买票有排队顺序一样，按先来后到的顺序排序。有时候，也可以插队，即调用add(intindex,Obj e)方法，就可以指定当前对象在集合中的存放位置。

一个对象可以被反复存储进List中，每调用一次add方法，这个对象就被插入进集合中一次，其实，并不是把这个对象本身存储进了集合中，而是在集合中用一个索引变量指向这个对象，当这个对象被add多次时，即相当于集合中有多个索引指向了这个对象，如图x所示。List除了可以用Iterator接口取得所有的元素，再逐一遍历各个元素之外，还可以调用get(index i)来明确说明取第几个。

Map与List和Set不同，它是双列的集合，其中有put方法，定义如下：put(obj key,obj value)，每次存储时，要存储一对key/value，不能存储重复的key，这个重复的规则也是按equals比较相等。取则可以根据key获得相应的value，即get(Object key)返回值为key所对应的value。

另外，也可以获得所有的key的结合，还可以获得所有的value的结合，还可以获得key和value组合成的Map.Entry对象的集合。
List以特定次序来持有元素，可有重复元素。Set无法拥有重复元素,内部排序。Map保存key-value值，value可多值。

##26、说出ArrayList,Vector,LinkedList的存储性能和特性

ArrayList和Vector都是使用数组方式存储数据，此数组元素数大于实际存储的数据以便增加和插入元素，它们都允许直接按序号索引元素，但是插入元素要涉及数组元素移动等内存操作，所以索引数据快而插入数据慢，Vector由于使用了synchronized方法（线程安全），通常性能上较ArrayList差。

而LinkedList使用双向链表实现存储，按序号索引数据需要进行前向或后向遍历，索引就变慢了，但是插入数据时只需要记录本项的前后项即可，所以插入速度较快。
LinkedList也是线程不安全的，LinkedList提供了一些方法，使得LinkedList可以被当作堆栈和队列来使用。

##27去掉一个Vector集合中重复的元素
```java

Vector newVector = new Vector();
For (int i=0;i<vector.size();i++)
{
Object obj = vector.get(i);
       if(!newVector.contains(obj);
     newVector.add(obj);
}
//还有一种简单的方式，利用了Set不允许重复元素：
HashSetset = new HashSet(vector);
```
##28、Collection和Collections的区别。

Collection是集合类的上级接口，继承他的接口主要有Set和List.
Collections是针对集合类的一个帮助类，他提供一系列静态方法实现对各种集合的搜索、排序、线程安全化等操作。

##29、Set里的元素是不能重复的，那么用什么方法来区分重复与否呢?是用==还是equals()?它们有何区别?

Set里的元素是不能重复的，元素重复与否是使用equals()方法进行判断的。
==和equal区别也是考烂了的题，这里说一下：
==操作符专门用来比较两个变量的值是否相等，也就是用于比较变量所对应的内存中所存储的数值是否相同，要比较两个基本类型的数据或两个引用变量是否相等，只能用==操作符。
equals方法是用于比较两个独立对象的内容是否相同，就好比去比较两个人的长相是否相同，它比较的两个对象是独立的。
比如：两条new语句创建了两个对象，然后用a/b这两个变量分别指向了其中一个对象，这是两个不同的对象，它们的首地址是不同的，即a和b中存储的数值是不相同的，所以，表达式a==b将返回false，而这两个对象中的内容是相同的，所以，表达式a.equals(b)将返回true。

##、你所知道的集合类都有哪些？主要方法？

最常用的集合类是 List 和 Map。 List的具体实现包括 ArrayList和 Vector，它们是可变大小的列表，比较适合构建、存储和操作任何类型对象的元素列表。 List适用于按数值索引访问元素的情形。

Map 提供了一个更通用的元素存储方法。 Map集合类用于存储元素对（称作”键”和”值”），其中每个键映射到一个值。
它们都有增删改查的方法。

对于set，大概的方法是add,remove, contains等
对于map，大概的方法就是put,remove，contains等
List类会有get(int index)这样的方法，因为它可以按顺序取元素，而set类中没有get(int index)这样的方法。List和set都可以迭代出所有元素，迭代时先要得到一个iterator对象，所以，set和list类都有一个iterator方法，用于返回那个iterator对象。

map可以返回三个集合，一个是返回所有的key的集合，另外一个返回的是所有value的集合，再一个返回的key和value组合成的EntrySet对象的集合，map也有get方法，参数是key，返回值是key对应的value，这个自由发挥，也不是考记方法的能力，这些编程过程中会有提示，结合他们三者的不同说一下用法就行。

