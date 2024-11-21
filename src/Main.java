public class Main {
    public static void main(String[] args) {
        // Создаем оружие
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Doomblade");
        Weapon skeletonWeapon = new Weapon(WeaponType.BOW, "Bone Bow");

        // Создаем босса
        Boss boss = new Boss("Dark Lord", 5000, 300, bossWeapon);
        boss.printInfo();

        System.out.println("------------------------");

        // Создаем двух скелетов
        Skeleton skeleton1 = new Skeleton("Skeleton Archer", 150, 50, skeletonWeapon, 10);
        Skeleton skeleton2 = new Skeleton("Elite Skeleton", 200, 70, skeletonWeapon, 15);

        // Выводим информацию о скелетах
        skeleton1.printInfo();
        System.out.println("------------------------");
        skeleton2.printInfo();
    }
}