package lv2;

public class Finght {
    public void finght() {
        Role role = new Role();
        role.role();
        System.out.println("战斗开始");
        Monstrosity monstrosity = new Monstrosity();
        int life = role.getLife();
        int life0 = monstrosity.getProperty()[0];
        int harm0 = 1;
        if (role.getAttack() > monstrosity.getProperty()[2])
            harm0 = role.getAttack() - monstrosity.getProperty()[2];
        int harm = 1;
        if (monstrosity.getProperty()[1] > role.getDefense())
            harm = monstrosity.getProperty()[1] - role.getDefense();//怪伤
        for (int i = 1; ; i++) {
            System.out.println("第" + i + "回合");
            life0 = life0 - harm0;
            life = life - harm;
            System.out.println(role.getName() + "对" + monstrosity.getName() + "造成" + harm0 + "点伤害");
            System.out.println(monstrosity.getName() + "剩余" + life0 + "点血");
            System.out.println(monstrosity.getName() + "对" + role.getName() + "造成" + harm + "点伤害");
            System.out.println(role.getName() + "剩余" + life + "点血");
            if (life < 1 || life0 < 1) break;
        }
        if (life < 1) {
            System.out.println("战斗失败");
        } else System.out.println("战斗胜利");
    }
}
