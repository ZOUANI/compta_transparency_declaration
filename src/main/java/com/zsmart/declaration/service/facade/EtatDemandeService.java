package com.zsmart.declaration.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.declaration.bean.EtatDemande;
public interface EtatDemandeService {

public EtatDemande save(EtatDemande etatdemande); 
public List<EtatDemande>  findAll();
public EtatDemande findById(Long id);
public int delete(EtatDemande etatdemande);
public void  deleteById(Long id);
public void clone(EtatDemande etatdemande,EtatDemande etatdemandeClone);
public EtatDemande clone(EtatDemande etatdemande);
public List<EtatDemande> clone(List<EtatDemande>etatdemandes);
 public List<EtatDemande>  findByCriteria(String libelle,String code,Long idMin,Long idMax);

}
