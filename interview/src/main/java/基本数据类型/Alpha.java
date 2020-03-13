package 基本数据类型;

public class Alpha {
    public void foo() {
        System.out.print("Afoo ");
    }
}

class Beta extends Alpha {
   public void foo() {
       System.out.print("Bfoo");
   }

   public static void main(String[] args) {
       Alpha a = new Beta();
       Beta b = (Beta) a;
       a.foo();
       b.foo();
   }
}
