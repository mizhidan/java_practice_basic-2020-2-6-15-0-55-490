package animals;

public class Animal {
    private String age;
    private String weight;

    public Animal() {

    }

    public Animal(String inputAge,String inputWeight) {
        age = inputAge;
        weight = inputWeight;
    }

    public void eat() {
        System.out.println("饱餐一顿");
    }

    public void sleep() {
        System.out.println("心满意足地睡觉了");
    }

    public String getAge() {
        return age;
    }

    public String getWeight() {
        return weight;
    }
}
