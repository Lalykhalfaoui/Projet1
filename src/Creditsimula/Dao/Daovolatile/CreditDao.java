package Creditsimula.Dao.Daovolatile;

import Creditsimula.Dao.Idao;
import Creditsimula.Model.Lk_Credit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CreditDao implements Idao<Lk_Credit, Long> {



    @Override
    public Lk_Credit TrouverParId(Long aLong) {
        return null;
    }

    static <Var> Set<Lk_Credit> BD_LKcredit(){


        Var credits = new HashSet<Lk_Credit>(){


            Arrays.aslist(


           new Lk_Credit(1L, 300000.0,120,2.5,"Laila",0.0),
           new Lk_Credit(2L,850000.0,240,2.5,"Sabrine",0.0),
           new Lk_Credit(3L,020000.0,030,1.5,"ayoub",0.0),
           new Lk_Credit(4L,065000.0,060,2.0,"mehdi",0.0)
            );

            }
                    )
        };
    public Lk_Credit trouverParId(Long id){
        System.out.println("[DAO - DS volatile] trouver le crédit n°:"+id);
        return            BD_LKcredit()
                               .stream()
                               .filter(Lk_Credit -> Lk_Credit.getId() == id)
                               .findFirst()
                               .orElse(null);





    }



}
