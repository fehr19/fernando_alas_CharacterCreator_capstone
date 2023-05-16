package com.perscholas.creator;

import com.perscholas.models.Character;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main2 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();


        Character character1 = new Character("Frodo", "Hobbit", "Rogue");

        Character character2 = new Character("Legolas", "Elf", "Archer");

        session.save(character1);
        session.save(character2);
        t.commit();
    }
}
