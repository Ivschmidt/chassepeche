/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;
import Metier.*;

import com.sun.javafx.collections.ObservableListWrapper;
import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.ListProperty;
import javafx.beans.property.ReadOnlyListWrapper;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.ObservableList;

/**
 *
 * @author antho
 */
public class Test {
    public static void main(String[] args) {
           Animal lievre = new GibierPoil("Lievre", "Lepus", " Ce sont des petits mammifères sauvages herbivores proches des lapins. Il existe une trentaine d'espèces de lièvres de par le monde qui diffèrent entre elles par leur taille, leur coloris ou leur mode de vie. Les lièvres sont des animaux relativement solitaires vivant parfois en couple.", "/Images/Lievre", "Léporidés",4.3, false);
           System.out.println(lievre.toString());
           
           Animal faisan = new GibierPlume("Faisan", "Phasianus", " Tous ces oiseaux sont des gibiers réputés. Leur femelle s'appelle la faisane ou poule faisane.", "/Images/faisan", "Phasianinae",1.2, true);
           System.out.println(faisan.toString());
           
           Animal truite = new Poisson("truite", "truite", "Les truites vivent dans des eaux claires et vives, on les trouve principalement en Amérique du Nord, en Europe dans le nord de l'Asie et dans les rivières de l'Atlas au Maroc.", "Images/truite", "salmonidé", 22);
           System.out.println(truite.toString());

           // probleme pour mettre la liste dans la zone de chasse
           ListProperty<TypeChasse> list = new SimpleListProperty<TypeChasse>();
           list.add(TypeChasse.Affut);
           list.add(TypeChasse.Battue);
          // ZoneChasse auvergne = new ZoneChasse("Auvergne", "Région Française très rurale", TypeZone.Region,100,10000,list);
          
           //System.out.println(auvergne.toString());
           Zone auvergneC = new ZoneChasse("Auvergne", "Région Française très rurale", TypeZone.Region,100,10000);
          // auvergne.ajouterTypeChasse(TypeChasse.Battue);
           System.out.println(auvergneC.toString());
           
           Zone FranceP = new ZonePeche("France", "pays ou la pêche est beaucoup pratiqué", TypeZone.Pays, 55, 50000,null);
           System.out.println(FranceP.toString());

           
    }
}
