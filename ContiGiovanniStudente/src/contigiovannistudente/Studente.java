/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contigiovannistudente;

/**
 *
 * @author conti.giovanni
 */
public class Studente
{
    private String nome;
    private String cognome;
    private int anno;
    private String indirizzo;
    private String sezione;
    private int[] votiFinali;
    private int numMaterie;
    
    /**
     * @param nome dello studente
     * @param cognome dello studente
     * @param anno dello studente
     * @param indirizzo dello studente
     * @param sezione dello studente
     * @param numMaterie dello studente
     * #Il metodo costruttore dello studente istanzia l'oggetto dello studente
     */
    public Studente(String nome, String cognome, int anno, String indirizzo, String sezione, int numMaterie)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.anno = anno;
        this.indirizzo = indirizzo;
        this.sezione = sezione;
        this.numMaterie = numMaterie;
        this.votiFinali = new int[this.numMaterie];
    }
    
    /**
     * #Il metodo get del nome riporta il nome sul main
     * @return String
     */
    public String getNome()
    {
        return this.nome;
    }
    
    /**
     * #Il metodo get del cognome riporta il cognome sul main
     * @return String
     */
    public String getCognome()
    {
        return this.cognome;
    }
    
    /**
     * #Il metodo get dell'anno riporta l'anno sul main
     * @return int
     */
    public int getAnno()
    {
        return this.anno;
    }
    
    /**
     * #Il metodo get dell'indirizzo riporta l'indirizzo sul main
     * @return String
     */
    public String getIndirizzo()
    {
        return this.indirizzo;
    }
    
    /**
     * #Il metodo get della sezione riporta la sezione sul main
     * @return String
     */
    public String getSezione()
    {
        return this.sezione;
    }
    
    /**
     * #Il metodo get dei voti finali riporta i voti finali sul main
     * @return int[]
     */
    public int[] getVotiFinali()
    {
        return this.votiFinali;
    }
    
    /**
     * #Il metodo get del numero delle materie riporta il numero delle materie sul main
     * @return int
     */
    public int getNumMaterie()
    {
        return this.numMaterie;
    }
    
    /**
     * #Il metodo assegnaVoto inserisce il voto nell'array
     * @param voto 
     */
    public void assegnaVoto(int voto)
    {
        for (int i = 0; i < this.numMaterie; i++)
        {
            if (this.votiFinali[i] == 0)
            {
                this.votiFinali[i] = voto;
                break;
            }
        }
    }
    
    /**
     * #Il metodo definisciVotoMax dice quale voto è il più alto
     * @return VotoMax
     */
    public int definisciVotoMax()
    {
        int VotoMax = 0;
        for (int i = 0; i < this.numMaterie; i++)
        {
            if (this.votiFinali[i] > VotoMax)
            {
                VotoMax = this.votiFinali[i];
            }
        }
        return VotoMax;
    }
    
    /**
     * #Il metodo definisciVotoMin dice quale voto è il più basso
     * @return VotoMin
     */
    public int definisciVotoMin()
    {
        int VotoMin = 11;
        for (int i = this.numMaterie - 1; i >= 0; i--)
        {
            if (this.votiFinali[i] < VotoMin)
            {
                VotoMin = this.votiFinali[i];
            }
        }
        return VotoMin;
    }
    
    /**
     * #Il metodo calcolaMediaVoti calcola la media dello studente
     * @return media
     */
    public double calcolaMediaVoti()
    {
        double media = 0;
        for (int i = 0; i < this.numMaterie; i++)
        {
            media = media + this.votiFinali[i];
        }
        media = media / this.numMaterie;
        return media;
    }
    
    /**
     * #Il metodo controllaMediaVoti dice se la media è sufficiente o no
     * @return boolean
     */
    public boolean controllaMediaVoti()
    {
        if (this.calcolaMediaVoti() >= 6)
        {
            return true;
        }
        return false;
    }
    
    /**
     * #Il metodo toString riporta le informazioni sul main
     * @return string
     */
    public String toString()
    {
        return "Lo studente " + this.getNome() + " " + this.getCognome() + " fa il " + this.getAnno() + this.getSezione() + " dell'indirizzo " + this.getIndirizzo() + ", ha una media di " + this.calcolaMediaVoti() + " ed e' quindi sufficiente? " + this.controllaMediaVoti() + ". Il voto piu' alto e' " + this.definisciVotoMax() + " mentre il voto piu' basso e' " + this.definisciVotoMin() + ".";
        
    }
    
    /**
     * #Il metodo confrontaMedia prende le medie di due studente e vede quale delle due è più alta o bassa, e se sono uguali
     * @param npc
     * @return boolean
     */
    public boolean confrontaMedia(Studente npc)
    {
        if (this.calcolaMediaVoti() > npc.calcolaMediaVoti())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
