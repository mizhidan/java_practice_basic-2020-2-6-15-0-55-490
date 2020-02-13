import animals.Eagle;

public class Application {

    /**
     * 运用之前写的类在Application中用代码描述一下场景：
     * 一只4岁的老鹰，体重5Kg，这只老鹰生活在兔子窝所以它只捕食兔子。
     * 某天它先翱翔天空，在饥肠辘辘之际捕食了一只兔子，然后饱餐一顿，
     * 心满意足之后就睡觉了。
     */
    public static void main(String[] args) {
        Eagle eagle = new Eagle("兔子","200km/h","4岁","5Kg");
        System.out.println("年龄：" + eagle.getAge());
        System.out.println("体重：" + eagle.getWeight());
        System.out.println("飞行速度：" + eagle.getFlySpeed());
        System.out.println("老鹰生活在兔子窝，所以它捕食" + eagle.getHuntTarget());
        System.out.print("某天，它");
        eagle.fly();
        System.out.print("在饥肠辘辘之际，它");
        eagle.hunt();
        eagle.eat();
        eagle.sleep();
    }
}
