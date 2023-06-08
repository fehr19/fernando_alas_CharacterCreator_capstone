package com.perscholas.creator;

import com.perscholas.models.UserCharacter;
import com.perscholas.models.CharacterAbilities;
import com.perscholas.models.Weapon;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Transaction t = session.beginTransaction();

        CharacterAbilities ca1 = new CharacterAbilities();
        ca1.setStrength((byte) 1);
        ca1.setDexterity((byte) 5);

        Weapon w1 = new Weapon();
        w1.setWeaponName("Axe");
        w1. setDamage("1d6");

        Weapon w2 = new Weapon();
        w2.setWeaponName("Sword");
        w2.setDamage("2d6");

        session.save(w1);
        session.save(w2);

        List<Weapon> char1Weapons = new ArrayList<>();
        char1Weapons.add(w1);
        char1Weapons.add(w2);


        CharacterAbilities ca2 = new CharacterAbilities();
        ca2.setStrength((byte) 2);
        ca2.setDexterity((byte) 4);

        UserCharacter userCharacter1 = new UserCharacter("Frodo", "Hobbit", "Rogue");
        //character1.setWeaponsList(char1Weapons);


        UserCharacter userCharacter2 = new UserCharacter("Legolas", "Elf", "Archer");

        session.save(ca1);
        session.save(ca2);
        session.save(userCharacter1);
        session.save(userCharacter2);
        t.commit();

    }
}
