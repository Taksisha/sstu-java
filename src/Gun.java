public class Gun {
    private int maxBulletCount;
    private int bulletCount;

    public Gun(int maxBulletCount) {
        this.maxBulletCount = maxBulletCount;
        this.bulletCount = 0;
    }

    public void reload(int bullets) {
        if (bullets < 0) {
            throw new IllegalArgumentException("Невозможно перезарядить оружие с отрицательным количеством патронов");
        }
        if (bulletCount + bullets > maxBulletCount) {
            bulletCount = maxBulletCount;
        } else {
            bulletCount += bullets;
        }
    }

    public int shot() {
        if (bulletCount > 0) {
            System.out.println("Бах!");
            bulletCount--;
            return 1;
        } else {
            System.out.println("Клац!");
            return 0;
        }
    }

    public void discharge() {
        bulletCount = 0;
    }

    public int getBulletCount() {
        return bulletCount;
    }

    public boolean isLoaded() {
        return bulletCount > 0;
    }
}
