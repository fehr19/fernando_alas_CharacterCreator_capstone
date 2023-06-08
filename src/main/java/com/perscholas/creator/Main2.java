package com.perscholas.creator;

import com.perscholas.models.UserCharacter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main2 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        UserCharacter userCharacter1 = new UserCharacter("Frodo Baggins", "Hobbit", "Rogue");
        userCharacter1.setSocialClass("Lower");
        userCharacter1.setBackground("Tradesperson");
        userCharacter1.setLevel(1);
        userCharacter1.setHealth(18);
        userCharacter1.setExperience(100);
        userCharacter1.setDefense(13);
        userCharacter1.setSpeed(12);

        UserCharacter userCharacter2 = new UserCharacter("Legolas", "Elf", "Archer");
        userCharacter2.setSocialClass("Lower");
        userCharacter2.setBackground("Soldier");
        userCharacter2.setLevel(2);
        userCharacter2.setHealth(48);
        userCharacter2.setExperience(2000);
        userCharacter2.setDefense(20);
        userCharacter2.setSpeed(18);

        UserCharacter userCharacter3 = new UserCharacter("Aankia", "Saurian", "Rogue");
        userCharacter3.setSocialClass("Lower");
        userCharacter3.setBackground("Performer");
        userCharacter3.setLevel(2);
        userCharacter3.setHealth(29);
        userCharacter3.setExperience(100);
        userCharacter3.setDefense(13);
        userCharacter3.setSpeed(13);

        session.save(userCharacter1);
        session.save(userCharacter2);
        session.save(userCharacter3);

        t.commit();
    }
}
