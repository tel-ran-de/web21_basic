package auto;

public class Owner {
    private static String str = "Каждый из нас человек";
    String name;
    private int age;
    protected int passport;
    public Owner(String name) {
        this.name = name;
    }

    public static String getStr() {
        return str;
    }

    public static void setStr(String str1) {
        str = str1;
    }

    Owner() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void happyBirthday() {
        this.age++;
        str = "Человечество взрослеет";
    }
}
