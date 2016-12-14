/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;
import Metier.*;


/**
 *
 * @author antho
 */
public class Test {
    public static void main(String[] args) {
           Gibier lievre = new GibierPoil("Lievre", "Lepus", " Ce sont des petits mammifères sauvages herbivores proches des lapins. Il existe une trentaine d'espèces de lièvres de par le monde qui diffèrent entre elles par leur taille, leur coloris ou leur mode de vie. Les lièvres sont des animaux relativement solitaires vivant parfois en couple.", "/Images/Lievre", "Léporidés",4.3, false);
           System.out.println(lievre.toString());
           
           Gibier faisan = new GibierPlume("Faisan", "Phasianus", " Tous ces oiseaux sont des gibiers réputés. Leur femelle s'appelle la faisane ou poule faisane.", "/Images/faisan", "Phasianinae",1.2, true);
           System.out.println(faisan.toString());
           
           Poisson truite = new Poisson("truite", "truite", "Les truites vivent dans des eaux claires et vives, on les trouve principalement en Amérique du Nord, en Europe dans le nord de l'Asie et dans les rivières de l'Atlas au Maroc.", "Images/truite", "salmonidé", 22);
           System.out.println(truite.toString());

           Poisson perche = new Poisson("perche", "perche", "Les perches vivent dans des eaux claires et vives, on les trouve principalement en Amérique du Nord, en Europe dans le nord de l'Asie et dans les rivières de l'Atlas au Maroc.", "Images/perche", "perchidé", 15);
           System.out.println(truite.toString());
           
          
           ZoneChasse auvergneC = new ZoneChasse("Auvergne", "Région Française très rurale", TypeZone.Region,100,10000);
           auvergneC.ajouterTypeChasse(TypeChasse.Battue);
           auvergneC.ajouterTypeChasse(TypeChasse.ChienCourant);
           auvergneC.ajouterGibier(lievre);
           auvergneC.ajouterGibier(faisan);
           System.out.println(auvergneC.toString());
           
           ZonePeche FranceP = new ZonePeche("France", "pays ou la pêche est beaucoup pratiqué", TypeZone.Pays, 55, 50000);
           FranceP.ajouterTypePeche(TypePeche.Toc);
           FranceP.ajouterPoisson(truite);
           FranceP.ajouterPoisson(perche);       
           System.out.println(FranceP.toString());
           
           
           
           
           
           

           
    }
}
