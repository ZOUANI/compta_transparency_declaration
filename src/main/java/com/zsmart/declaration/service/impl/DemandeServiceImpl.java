
package com.zsmart.declaration.service.impl ;
import com.zsmart.declaration.service.facade.DemandeService ; 
import com.zsmart.declaration.dao.DemandeDao ;
import com.zsmart.declaration.service.util.SearchUtil;
import com.zsmart.declaration.bean.Demande;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.declaration.bean.EtatDemande; 
import com.zsmart.declaration.service.facade.EtatDemandeService ; 
import com.zsmart.declaration.bean.ServicePropose; 
import com.zsmart.declaration.service.facade.ServiceProposeService ; 
import com.zsmart.declaration.service.facade.DocumentDemandeService ; 
import com.zsmart.declaration.bean.DocumentDemande ; 

 @Service  

 public class DemandeServiceImpl implements DemandeService  {


 @Autowired 

 private DemandeDao demandeDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private DocumentDemandeService documentdemandeService; 

 @Autowired 

 private EtatDemandeService etatdemandeService; 

 @Autowired 

 private ServiceProposeService serviceproposeService; 

 @Override 
public Demande  save (Demande demande){

if(demande== null){ 
 return null; 
}else {
 demandeDao.save(demande);
return demande;
}
}

 @Override 
public Demande  saveWithDocumentDemandes (Demande demande){

if(demande== null){ 
        return null; 
}else {
   if(demande.getDocumentDemandes().isEmpty()){
            return null;
        }else{
            for (DocumentDemande documentdemande : demande.getDocumentDemandes()) {
documentdemande.setDemande(demande);
 documentdemandeService.save(  documentdemande);          
            }
            }
demandeDao.save(demande);
return demande;
}
}

 @Override 
public List< Demande>  findAll(){
 return demandeDao.findAll();
}

 @Override 
public Demande findById(Long id){
 return demandeDao.getOne(id);
}

 @Override 
public Demande  findByReference(String  reference){
 return demandeDao.findByReference(reference);
}

 @Override 
public int delete(Demande demande){
if(demande== null){ 
  return -1; 
}else {
 demandeDao.delete(demande);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       demandeDao.deleteById(id);
}

 @Override 
public void  deleteByReference(String  reference){
  demandeDao.deleteByReference(reference);
}
public void clone(Demande demande,Demande demandeClone){
if(demande!= null && demandeClone != null){
demandeClone.setId(demande.getId());
demandeClone.setRefrenceSociete(demande.getRefrenceSociete());
demandeClone.setDescription(demande.getDescription());
demandeClone.setReference(demande.getReference());
demandeClone.setReferenceSociete(demande.getReferenceSociete());
demandeClone.setReferenceComptableValidateur(demande.getReferenceComptableValidateur());
demandeClone.setReferenceComptableCreateur(demande.getReferenceComptableCreateur());
demandeClone.setDateValidation(demande.getDateValidation());
demandeClone.setDateSoumission(demande.getDateSoumission());
demandeClone.setDateAffectationComptable(demande.getDateAffectationComptable());
demandeClone.setDateFinalisation(demande.getDateFinalisation());
demandeClone.setDateSaisie(demande.getDateSaisie());
demandeClone.setMontantTotal(demande.getMontantTotal());
demandeClone.setMontantPaye(demande.getMontantPaye());
demandeClone.setMontantRestant(demande.getMontantRestant());
demandeClone.setEtatDemande(etatdemandeService.clone(demande.getEtatDemande()));
demandeClone.setServicePropose(serviceproposeService.clone(demande.getServicePropose()));
demandeClone.setDocumentDemandes(documentdemandeService.clone(demande.getDocumentDemandes()));
}
}
public Demande clone(Demande demande){
if(demande== null){       return null ;
}else{Demande demandeClone= new Demande();
demandeClone.setId(demande.getId());
demandeClone.setRefrenceSociete(demande.getRefrenceSociete());
demandeClone.setDescription(demande.getDescription());
demandeClone.setReference(demande.getReference());
demandeClone.setReferenceSociete(demande.getReferenceSociete());
demandeClone.setReferenceComptableValidateur(demande.getReferenceComptableValidateur());
demandeClone.setReferenceComptableCreateur(demande.getReferenceComptableCreateur());
demandeClone.setDateValidation(demande.getDateValidation());
demandeClone.setDateSoumission(demande.getDateSoumission());
demandeClone.setDateAffectationComptable(demande.getDateAffectationComptable());
demandeClone.setDateFinalisation(demande.getDateFinalisation());
demandeClone.setDateSaisie(demande.getDateSaisie());
demandeClone.setMontantTotal(demande.getMontantTotal());
demandeClone.setMontantPaye(demande.getMontantPaye());
demandeClone.setMontantRestant(demande.getMontantRestant());
demandeClone.setEtatDemande(etatdemandeService.clone(demande.getEtatDemande()));
demandeClone.setServicePropose(serviceproposeService.clone(demande.getServicePropose()));
demandeClone.setDocumentDemandes(documentdemandeService.clone(demande.getDocumentDemandes()));
return demandeClone;
}
}
public List<Demande> clone(List<Demande>demandes){
if(demandes== null){
       return null ;
}else{List<Demande> demandesClone = new ArrayList();
	 	 	 demandes.forEach((demande)->{demandesClone.add(clone(demande));
});return demandesClone;
}
}
 @Override 
 public List< Demande>  findByCriteria(String refrenceSociete,String description,String reference,String referenceSociete,String referenceComptableValidateur,String referenceComptableCreateur,Long idMin,Long idMax,Date dateValidationMin,Date dateValidationMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantPayeMin,BigDecimal montantPayeMax,BigDecimal montantRestantMin,BigDecimal montantRestantMax){
 return entityManager.createQuery(constructQuery(refrenceSociete,description,reference,referenceSociete,referenceComptableValidateur,referenceComptableCreateur,idMin,idMax,dateValidationMin,dateValidationMax,dateSoumissionMin,dateSoumissionMax,dateAffectationComptableMin,dateAffectationComptableMax,dateFinalisationMin,dateFinalisationMax,dateSaisieMin,dateSaisieMax,montantTotalMin,montantTotalMax,montantPayeMin,montantPayeMax,montantRestantMin,montantRestantMax)).getResultList(); 
 }
private String constructQuery(String refrenceSociete,String description,String reference,String referenceSociete,String referenceComptableValidateur,String referenceComptableCreateur,Long idMin,Long idMax,Date dateValidationMin,Date dateValidationMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantPayeMin,BigDecimal montantPayeMax,BigDecimal montantRestantMin,BigDecimal montantRestantMax){
String query = "SELECT d FROM Demande d where 1=1 ";
query += SearchUtil.addConstraint( "d", "refrenceSociete","=",refrenceSociete);
query += SearchUtil.addConstraint( "d", "description","=",description);
query += SearchUtil.addConstraint( "d", "reference","=",reference);
query += SearchUtil.addConstraint( "d", "referenceSociete","=",referenceSociete);
query += SearchUtil.addConstraint( "d", "referenceComptableValidateur","=",referenceComptableValidateur);
query += SearchUtil.addConstraint( "d", "referenceComptableCreateur","=",referenceComptableCreateur);
query += SearchUtil.addConstraintMinMax("d", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMaxDate("d"," dateValidation", dateValidationMin, dateValidationMax);
query += SearchUtil.addConstraintMinMaxDate("d"," dateSoumission", dateSoumissionMin, dateSoumissionMax);
query += SearchUtil.addConstraintMinMaxDate("d"," dateAffectationComptable", dateAffectationComptableMin, dateAffectationComptableMax);
query += SearchUtil.addConstraintMinMaxDate("d"," dateFinalisation", dateFinalisationMin, dateFinalisationMax);
query += SearchUtil.addConstraintMinMaxDate("d"," dateSaisie", dateSaisieMin, dateSaisieMax);
query += SearchUtil.addConstraintMinMax("d", "montantTotal", montantTotalMin, montantTotalMax);
query += SearchUtil.addConstraintMinMax("d", "montantPaye", montantPayeMin, montantPayeMax);
query += SearchUtil.addConstraintMinMax("d", "montantRestant", montantRestantMin, montantRestantMax);

  return query; 
}
}
