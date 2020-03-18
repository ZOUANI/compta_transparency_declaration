package com.zsmart.declaration.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class DemandeVo{

private String id ;
private String refrenceSociete ;
private String description ;
private String reference ;
private String referenceSociete ;
private String referenceComptableValidateur ;
private String referenceComptableCreateur ;
private String dateValidation;
private String dateValidationMin ;
private String dateValidationMax ;
private String dateSoumission;
private String dateSoumissionMin ;
private String dateSoumissionMax ;
private String dateAffectationComptable;
private String dateAffectationComptableMin ;
private String dateAffectationComptableMax ;
private String dateFinalisation;
private String dateFinalisationMin ;
private String dateFinalisationMax ;
private String dateSaisie;
private String dateSaisieMin ;
private String dateSaisieMax ;
private String montantTotal;
private String montantTotalMin ;
private String montantTotalMax ;
private String montantPaye;
private String montantPayeMin ;
private String montantPayeMax ;
private String montantRestant;
private String montantRestantMin ;
private String montantRestantMax ;
private EtatDemandeVo etatDemandeVo ;
private ServiceProposeVo serviceProposeVo ;
private List<DocumentDemandeVo>documentDemandesVo;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public String  getRefrenceSociete(){
    return refrenceSociete;
}

public void setRefrenceSociete(String  refrenceSociete){
     this.refrenceSociete = refrenceSociete;
}

public String  getDescription(){
    return description;
}

public void setDescription(String  description){
     this.description = description;
}

public String  getReference(){
    return reference;
}

public void setReference(String  reference){
     this.reference = reference;
}

public String  getReferenceSociete(){
    return referenceSociete;
}

public void setReferenceSociete(String  referenceSociete){
     this.referenceSociete = referenceSociete;
}

public String  getReferenceComptableValidateur(){
    return referenceComptableValidateur;
}

public void setReferenceComptableValidateur(String  referenceComptableValidateur){
     this.referenceComptableValidateur = referenceComptableValidateur;
}

public String  getReferenceComptableCreateur(){
    return referenceComptableCreateur;
}

public void setReferenceComptableCreateur(String  referenceComptableCreateur){
     this.referenceComptableCreateur = referenceComptableCreateur;
}

public String  getDateValidation(){
    return dateValidation;
}

public void setDateValidation(String  dateValidation){
     this.dateValidation = dateValidation;
}

public String  getDateValidationMin(){
    return dateValidationMin;
}

public void setDateValidationMin(String  dateValidationMin){
     this.dateValidationMin = dateValidationMin;
}

public String  getDateValidationMax(){
    return dateValidationMax;
}

public void setDateValidationMax(String  dateValidationMax){
     this.dateValidationMax = dateValidationMax;
}

public String  getDateSoumission(){
    return dateSoumission;
}

public void setDateSoumission(String  dateSoumission){
     this.dateSoumission = dateSoumission;
}

public String  getDateSoumissionMin(){
    return dateSoumissionMin;
}

public void setDateSoumissionMin(String  dateSoumissionMin){
     this.dateSoumissionMin = dateSoumissionMin;
}

public String  getDateSoumissionMax(){
    return dateSoumissionMax;
}

public void setDateSoumissionMax(String  dateSoumissionMax){
     this.dateSoumissionMax = dateSoumissionMax;
}

public String  getDateAffectationComptable(){
    return dateAffectationComptable;
}

public void setDateAffectationComptable(String  dateAffectationComptable){
     this.dateAffectationComptable = dateAffectationComptable;
}

public String  getDateAffectationComptableMin(){
    return dateAffectationComptableMin;
}

public void setDateAffectationComptableMin(String  dateAffectationComptableMin){
     this.dateAffectationComptableMin = dateAffectationComptableMin;
}

public String  getDateAffectationComptableMax(){
    return dateAffectationComptableMax;
}

public void setDateAffectationComptableMax(String  dateAffectationComptableMax){
     this.dateAffectationComptableMax = dateAffectationComptableMax;
}

public String  getDateFinalisation(){
    return dateFinalisation;
}

public void setDateFinalisation(String  dateFinalisation){
     this.dateFinalisation = dateFinalisation;
}

public String  getDateFinalisationMin(){
    return dateFinalisationMin;
}

public void setDateFinalisationMin(String  dateFinalisationMin){
     this.dateFinalisationMin = dateFinalisationMin;
}

public String  getDateFinalisationMax(){
    return dateFinalisationMax;
}

public void setDateFinalisationMax(String  dateFinalisationMax){
     this.dateFinalisationMax = dateFinalisationMax;
}

public String  getDateSaisie(){
    return dateSaisie;
}

public void setDateSaisie(String  dateSaisie){
     this.dateSaisie = dateSaisie;
}

public String  getDateSaisieMin(){
    return dateSaisieMin;
}

public void setDateSaisieMin(String  dateSaisieMin){
     this.dateSaisieMin = dateSaisieMin;
}

public String  getDateSaisieMax(){
    return dateSaisieMax;
}

public void setDateSaisieMax(String  dateSaisieMax){
     this.dateSaisieMax = dateSaisieMax;
}

public String  getMontantTotal(){
    return montantTotal;
}

public void setMontantTotal(String  montantTotal){
     this.montantTotal = montantTotal;
}

public String  getMontantTotalMin(){
    return montantTotalMin;
}

public void setMontantTotalMin(String  montantTotalMin){
     this.montantTotalMin = montantTotalMin;
}

public String  getMontantTotalMax(){
    return montantTotalMax;
}

public void setMontantTotalMax(String  montantTotalMax){
     this.montantTotalMax = montantTotalMax;
}

public String  getMontantPaye(){
    return montantPaye;
}

public void setMontantPaye(String  montantPaye){
     this.montantPaye = montantPaye;
}

public String  getMontantPayeMin(){
    return montantPayeMin;
}

public void setMontantPayeMin(String  montantPayeMin){
     this.montantPayeMin = montantPayeMin;
}

public String  getMontantPayeMax(){
    return montantPayeMax;
}

public void setMontantPayeMax(String  montantPayeMax){
     this.montantPayeMax = montantPayeMax;
}

public String  getMontantRestant(){
    return montantRestant;
}

public void setMontantRestant(String  montantRestant){
     this.montantRestant = montantRestant;
}

public String  getMontantRestantMin(){
    return montantRestantMin;
}

public void setMontantRestantMin(String  montantRestantMin){
     this.montantRestantMin = montantRestantMin;
}

public String  getMontantRestantMax(){
    return montantRestantMax;
}

public void setMontantRestantMax(String  montantRestantMax){
     this.montantRestantMax = montantRestantMax;
}

public EtatDemandeVo  getEtatDemandeVo (){
    return etatDemandeVo ;
}

public void setEtatDemandeVo (EtatDemandeVo  etatDemandeVo ){
     this.etatDemandeVo  = etatDemandeVo ;
}

public ServiceProposeVo  getServiceProposeVo (){
    return serviceProposeVo ;
}

public void setServiceProposeVo (ServiceProposeVo  serviceProposeVo ){
     this.serviceProposeVo  = serviceProposeVo ;
}

public List<DocumentDemandeVo> getDocumentDemandesVo(){
    return documentDemandesVo;
}

public void setDocumentDemandesVo(List<DocumentDemandeVo> documentDemandesVo){
     this.documentDemandesVo = documentDemandesVo;
}




}