package fr.univ.orleans.pnt;

import fr.univ.orleans.pnt.vues.Accueil;
import fr.univ.orleans.pnt.vues.AffichagePersonnes;
import fr.univ.orleans.pnt.vues.EnregistrementPersonne;
import fr.univ.orleans.pnt.vues.Vue;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        Vue accueil = Accueil.creer(stage);
        accueil.show();

       // Vue enregistrementPersonne = EnregistrementPersonne.creer(stage);
       // enregistrementPersonne.show();

        Vue affichagePersonnes = AffichagePersonnes.creer(stage);
        affichagePersonnes.show();
    }


    public static void main(String[] args) {
        launch();
    }

}