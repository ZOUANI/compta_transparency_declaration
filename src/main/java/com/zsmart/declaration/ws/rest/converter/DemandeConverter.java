package com.zsmart.declaration.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.declaration.service.util.*;
import com.zsmart.declaration.bean.Demande; 
import com.zsmart.declaration.ws.rest.vo.DemandeVo; 

 @Component 
public class DemandeConverter extends AbstractConverter<Demande,DemandeVo>{ 

private boolean etatDemande; 

 @Autowired
 private EtatDemandeConverter etatDemandeConverter ; 
private boolean servicePropose; 

 @Autowired
 private ServiceProposeConverter serviceProposeConverter ; 
private boolean documentDemandes; 

 @Autowired
 private DocumentDemandeConverter documentDemandeConverter ; 

 @Override 
 public Demande toItem(DemandeVo vo) {
 if (vo == null) {
    return null;
      } else {
Demande item = new Demande();

 if(etatDemande&& vo.getEtatDemandeVo() != null) {
 item.setEtatDemande(etatDemandeConverter.toItem(vo.getEtatDemandeVo()));
} 
 
 if(servicePropose&& vo.getServiceProposeVo() != null) {
 item.setServicePropose(serviceProposeConverter.toItem(vo.getServiceProposeVo()));
} 
 
 if (StringUtil.isNotEmpty(vo.getRefrenceSociete())) {
 item.setRefrenceSociete(vo.getRefrenceSociete());
} 

 if (StringUtil.isNotEmpty(vo.getDescription())) {
 item.setDescription(vo.getDescription());
} 

 if (StringUtil.isNotEmpty(vo.getReference())) {
 item.setReference(vo.getReference());
} 

 if (StringUtil.isNotEmpty(vo.getReferenceSociete())) {
 item.setReferenceSociete(vo.getReferenceSociete());
} 

 if (StringUtil.isNotEmpty(vo.getReferenceComptableValidateur())) {
 item.setReferenceComptableValidateur(vo.getReferenceComptableValidateur());
} 

 if (StringUtil.isNotEmpty(vo.getReferenceComptableCreateur())) {
 item.setReferenceComptableCreateur(vo.getReferenceComptableCreateur());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (vo.getDateValidation() != null) {
 item.setDateValidation(DateUtil.parse(vo.getDateValidation()));
} 

 if (vo.getDateSoumission() != null) {
 item.setDateSoumission(DateUtil.parse(vo.getDateSoumission()));
} 

 if (vo.getDateAffectationComptable() != null) {
 item.setDateAffectationComptable(DateUtil.parse(vo.getDateAffectationComptable()));
} 

 if (vo.getDateFinalisation() != null) {
 item.setDateFinalisation(DateUtil.parse(vo.getDateFinalisation()));
} 

 if (vo.getDateSaisie() != null) {
 item.setDateSaisie(DateUtil.parse(vo.getDateSaisie()));
} 

 if (vo.getMontantTotal() != null) {
 item.setMontantTotal(NumberUtil.toBigDecimal(vo.getMontantTotal()));
} 

 if (vo.getMontantPaye() != null) {
 item.setMontantPaye(NumberUtil.toBigDecimal(vo.getMontantPaye()));
} 

 if (vo.getMontantRestant() != null) {
 item.setMontantRestant(NumberUtil.toBigDecimal(vo.getMontantRestant()));
} 

 if (ListUtil.isNotEmpty(vo.getDocumentDemandesVo ()) && documentDemandes) {
 item.setDocumentDemandes(documentDemandeConverter.toItem(vo.getDocumentDemandesVo())); 
} 

return item;
 }
 }

  @Override 
 public DemandeVo toVo(Demande item) {
 if (item == null) {
    return null;
      } else {
DemandeVo vo = new DemandeVo();

 if(etatDemande&& item.getEtatDemande() != null) {
 vo.setEtatDemandeVo(etatDemandeConverter.toVo(item.getEtatDemande()));
} 
 
 if(servicePropose&& item.getServicePropose() != null) {
 vo.setServiceProposeVo(serviceProposeConverter.toVo(item.getServicePropose()));
} 
 
 if (StringUtil.isNotEmpty(item.getRefrenceSociete())) {
 vo.setRefrenceSociete(item.getRefrenceSociete());
} 

 if (StringUtil.isNotEmpty(item.getDescription())) {
 vo.setDescription(item.getDescription());
} 

 if (StringUtil.isNotEmpty(item.getReference())) {
 vo.setReference(item.getReference());
} 

 if (StringUtil.isNotEmpty(item.getReferenceSociete())) {
 vo.setReferenceSociete(item.getReferenceSociete());
} 

 if (StringUtil.isNotEmpty(item.getReferenceComptableValidateur())) {
 vo.setReferenceComptableValidateur(item.getReferenceComptableValidateur());
} 

 if (StringUtil.isNotEmpty(item.getReferenceComptableCreateur())) {
 vo.setReferenceComptableCreateur(item.getReferenceComptableCreateur());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if (item.getDateValidation() != null) {
 vo.setDateValidation(DateUtil.formateDate(item.getDateValidation()));
} 

 if (item.getDateSoumission() != null) {
 vo.setDateSoumission(DateUtil.formateDate(item.getDateSoumission()));
} 

 if (item.getDateAffectationComptable() != null) {
 vo.setDateAffectationComptable(DateUtil.formateDate(item.getDateAffectationComptable()));
} 

 if (item.getDateFinalisation() != null) {
 vo.setDateFinalisation(DateUtil.formateDate(item.getDateFinalisation()));
} 

 if (item.getDateSaisie() != null) {
 vo.setDateSaisie(DateUtil.formateDate(item.getDateSaisie()));
} 

 if (item.getMontantTotal() != null) {
 vo.setMontantTotal(NumberUtil.toString(item.getMontantTotal()));
} 

 if (item.getMontantPaye() != null) {
 vo.setMontantPaye(NumberUtil.toString(item.getMontantPaye()));
} 

 if (item.getMontantRestant() != null) {
 vo.setMontantRestant(NumberUtil.toString(item.getMontantRestant()));
} 

 if(ListUtil.isNotEmpty(item.getDocumentDemandes()) && documentDemandes) {
 vo.setDocumentDemandesVo(documentDemandeConverter.toVo(item.getDocumentDemandes()));
} 

return vo;
 }
 }
public void init() { 

etatDemande = true; 

servicePropose = true; 

documentDemandes = true; 
}
 } 
