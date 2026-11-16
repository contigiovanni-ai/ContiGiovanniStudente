/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contigiovannistudente;
import java.util.*;

/**
 *
 * @author conti.giovanni
 */
public class TestStudente
{
    public void avvia()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Inserisci nome dello studente 1 ");
        String nome1 = s.nextLine();     
        System.out.print("Inserisci cognome dello studente 1 ");
        String cognome1 = s.nextLine();
        System.out.print("Inserisci anno dello studente 1 ");
        int anno1 = s.nextInt();
        System.out.print("Inserisci indirizzo dello studente 1 ");
        String indirizzo1 = s.nextLine();
        s.nextLine();
        System.out.print("Inserisci sezione dello studente 1 ");
        String sezione1 = s.nextLine();
        System.out.print("Inserisci numero delle materie dello studente 1 ");
        int numMaterie1 = s.nextInt();
        Studente s1 = new Studente(nome1, cognome1, anno1, indirizzo1, sezione1, numMaterie1);
        int i1 = 1;
        while (i1 < numMaterie1 + 1)
        {
            System.out.print("Quanto hai preso alla " + i1 + " materia ");
            int voto = s.nextInt();
            if (voto < 1 || voto > 10)
            {
                while (voto < 1 || voto > 10)
                {
                    System.out.print("Inserisci correttamente il voto ");
                    voto = s.nextInt();
                }
            }
            s1.assegnaVoto(voto);
            i1++;
        }
        System.out.println(s1.toString());
        System.out.print("Inserisci nome dello studente 2 ");
        String nome2 = s.nextLine(); 
        s.nextLine();
        System.out.print("Inserisci cognome dello studente 2 ");
        String cognome2 = s.nextLine();
        System.out.print("Inserisci anno dello studente 2 ");
        int anno2 = s.nextInt();
        System.out.print("Inserisci indirizzo dello studente 2 ");
        String indirizzo2 = s.nextLine();
        s.nextLine();
        System.out.print("Inserisci sezione dello studente 2 ");
        String sezione2 = s.nextLine();
        System.out.print("Inserisci numero delle materie dello studente 2 ");
        int numMaterie2 = s.nextInt();
        Studente s2 = new Studente(nome2, cognome2, anno2, indirizzo2, sezione2, numMaterie2);
        int i2 = 1;
        while (i2 < numMaterie2 + 1)
        {
            System.out.print("Quanto hai preso alla " + i2 + " materia ");
            int voto = s.nextInt();
            if (voto < 1 || voto > 10)
            {
                while (voto < 1 || voto > 10)
                {
                    System.out.print("Inserisci correttamente il voto ");
                    voto = s.nextInt();
                }
            }
            s2.assegnaVoto(voto);
            i2++;
        }
        System.out.println(s2.toString());
        System.out.println("Lo studente " + s1.getNome() + " " + s1.getCognome() + " ha una media piu' alta dello studente " + s2.getNome() + " " + s2.getCognome() + "? " + s1.confrontaMedia(s2));
        System.out.print("Lo studente " + s2.getNome() + " " + s2.getCognome() + " ha una media piu' alta dello studente " + s1.getNome() + " " + s1.getCognome() + "? " + s2.confrontaMedia(s1));
    }
}
