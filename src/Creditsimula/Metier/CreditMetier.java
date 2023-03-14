package Creditsimula.Metier;

import Creditsimula.Dao.Idao;
import Creditsimula.Model.Lk_Credit;
import lombok.var;

public class CreditMetier {

    Idao<Lk_Credit,Long> CreditDao;
    public Lk_Credit CalculerMensualite(Long idcredit) throws Exception {
        var credit = CreditDao.TrouverParId(idcredit);
        if (credit== null){
            throw new Exception("Credit introuvable");

        }
        else {
            double mensualite =0.0;
            double taux = Lk_Credit.getTaux_Mensuel();
            double c = Lk_Credit.getCapitale_emprunte();
            int nbrmois= Lk_Credit. getNbr_mois();

            double capitale;
            double mensualite  = (capitale * taux)/ (1-Math.pow(1+taux),-1*nbrmois)));
            double mensualite  = Math.round (mensualite*100)/100;

                ((Lk_Credit) credit).setMensualite(mensualite);

                return credit;


        }


    }


}
