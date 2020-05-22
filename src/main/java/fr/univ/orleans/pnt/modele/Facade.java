package fr.univ.orleans.pnt.modele;

import java.util.Collection;

public interface Facade {

    long creerPersonne(String nom, String prenom, String login, String password);

    Personne getPersonneById(long id) throws PersonneNotFoundException;

    Collection<Personne> getAllPersonne();
}
