package lv2;

import java.util.Scanner;
import java.util.Random;

public class Role {
    private String name;
    private int life, attack, defense;

    public void role() {
        System.out.println("取一个名字吧！");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        if (in.length() < 51 && in.length() > 0)
            name = in;
        Random r = new Random();
        life = r.nextInt(3) + 2;
        attack = r.nextInt(1) + 1;
        defense = r.nextInt(2);
        System.out.println("生命：" + life + " " + "攻击：" + attack + "防御：" + defense + "（随机）");
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
}

