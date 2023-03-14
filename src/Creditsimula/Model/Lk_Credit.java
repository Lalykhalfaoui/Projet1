package Creditsimula.Model;
import lombok.*;
@Data @AllArgsConstructor



public class Lk_Credit
{
    public static Object getTaux;
    private long id;
    private Double capitale_emprunte;
    private Integer nbr_mois;
    private Double taux ;
    private String nom_demandeur;
    private Double mensualite;

    public static double getTaux_Mensuel() {
    }


    public long getId() {
        return id;
    }

    public Double getCapitale_emprunte() {
        return capitale_emprunte;
    }

    public Integer getNbr_mois() {
        return nbr_mois;
    }

    public Double getTaux() {
        return taux;
    }

    public String getNom_demandeur() {
        return nom_demandeur;
    }

    public Double getMensualite() {
        return mensualite;
    }

    @Override
    public String toString() {
        return "Lk_Credit{" +
                "id=" + id +
                ", capitale_emprunte=" + capitale_emprunte +
                ", nbr_mois=" + nbr_mois +
                ", taux=" + taux +
                ", nom_demandeur='" + nom_demandeur + '\'' +
                ", mensualite=" + mensualite +
                '}';
    }
}
