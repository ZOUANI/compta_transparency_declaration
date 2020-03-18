package com.zsmart.declaration.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.declaration.bean.Demande;
import com.zsmart.declaration.bean.EtatDemande; 
import com.zsmart.declaration.bean.ServicePropose; 
public interface DemandeService {

public Demande save(Demande demande); 
public Demande  saveWithDocumentDemandes (Demande demande);public List<Demande>  findAll();
public Demande findById(Long id);
public Demande  findByReference(String  reference);
public int delete(Demande demande);
public void  deleteById(Long id);
public void  deleteByReference(String  reference);
public void clone(Demande demande,Demande demandeClone);
public Demande clone(Demande demande);
public List<Demande> clone(List<Demande>demandes);
 public List<Demande>  findByCriteria(String refrenceSociete,String description,String reference,String referenceSociete,String referenceComptableValidateur,String referenceComptableCreateur,Long idMin,Long idMax,Date dateValidationMin,Date dateValidationMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantPayeMin,BigDecimal montantPayeMax,BigDecimal montantRestantMin,BigDecimal montantRestantMax);

}
