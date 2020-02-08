package 数据类型和数据结构.面向对象;

interface IFace{}
class CFace implements IFace{}
class Base{}
public class ObRef extends Base{
    public static void main(String argv[]){
        ObRef ob = new ObRef();
        Base b = new Base();
        Object o1 = new Object();
        IFace o2 = new CFace();
        o1=o2;
        b=ob;
        //ob=b;
        o1=b;
        System.out.println(o1);
    }
}
