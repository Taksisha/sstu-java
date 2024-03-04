public class Cat {
    private String name;

    public Cat(String  name){
        this.name = name;
    }

    public String toString(){
        return "кот: " + name;
    }

    public void meow(){
        System.out.println(name + " мяу!");
    }

    public void meow(int times){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times-1; i++) {
            sb.append("мяу-");
        }
        sb.append("мяу!");
        System.out.println(name + ": " + sb.toString());
    }
}
