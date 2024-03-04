public class Gun {
    private int bulletCount;

    public Gun(int bulletCount) {
        this.bulletCount = bulletCount;
    }

    public Gun(){
        this.bulletCount = 5;
    }

    public void shot(){
        if (bulletCount > 0){
            System.out.println("Бах!");
            bulletCount --;
        } else {
            System.out.println("Клац!");
        }
    }
}
