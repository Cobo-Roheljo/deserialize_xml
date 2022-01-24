package it.meucci;

import java.util.Vector;

public class root {

    //variabili utlizzate
    public aula aula = new aula();
    public Vector <element> studenti = new Vector<>();
    public int numeroFinestreM;
    public int annoDiInizio;
    public String classe;
    public String specializzazione;
    


    //get e set Aula
    public aula getAula() {
        return aula;
    }


    public void setAula(aula aula) {
        this.aula = aula;
    }


    //get e set studenti
    public Vector<element> getStudenti() {
        return studenti;
    }


    public void setStudenti(Vector<element> studenti) {
        this.studenti = studenti;
    }


    //get e set numeroFinestreM
    public int getNumeroFinestreM() {
        return numeroFinestreM;
    }


    public void setNumeroFinestreM(int numeroFinestreM) {
        this.numeroFinestreM = numeroFinestreM;
    }


    //get e set annoDiInizio
    public int getAnnoDiInizio() {
        return annoDiInizio;
    }


    public void setAnnoDiInizio(int annoDiInizio) {
        this.annoDiInizio = annoDiInizio;
    }

    

    //get e set Classe
    public String getClasse() {
        return classe;
    }

    
    public void setClasse(String classe) {
        this.classe = classe;
    }

    

    //get e set specializzazione
    public String getSpecializzazione() {
        return specializzazione;
    }

    
    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    

    
}