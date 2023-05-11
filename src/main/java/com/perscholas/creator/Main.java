package com.perscholas.creator;

import com.perscholas.models.Character;
import com.perscholas.models.CharacterAbilities;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Transaction t = session.beginTransaction();

        CharacterAbilities ca1 = new CharacterAbilities();
        ca1.setStrength((byte) 1);
        ca1.setDexterity((byte) 5);

        CharacterAbilities ca2 = new CharacterAbilities();
        ca2.setStrength((byte) 2);
        ca2.setDexterity((byte) 4);

        Character character1 = new Character();
        character1.setName("Frodo");
        character1.setAncestry("Hobbit");
        character1.setLevel((byte) 1);
        character1.setAbilitiesId(ca1);

        Character character2 = new Character();
        character2.setName("Legolas");
        character2.setAncestry("Elf");
        character2.setLevel((byte) 3);
        character2.setAbilitiesId(ca2);

        session.save(ca1);
        session.save(ca2);
        session.save(character1);
        session.save(character2);
        t.commit();
    }
}
