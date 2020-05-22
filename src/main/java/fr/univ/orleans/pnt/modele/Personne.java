package fr.univ.orleans.pnt.modele;

public class Personne {

    private String nom;
    private String prenom;
    private String login;
    private String password;
    private long id;

    private static long IDS = 0;

    private Personne(String nom, String prenom, String login, String password) {
        this.id=IDS++;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
    }

    public static Personne creer(String nom, String prenom, String login, String password) {
        return new Personne(nom, prenom, login, password);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

}
