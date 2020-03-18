
package com.zsmart.declaration.service.impl ;
import com.zsmart.declaration.service.facade.DocumentDemandeService ; 
import com.zsmart.declaration.dao.DocumentDemandeDao ;
import com.zsmart.declaration.service.util.SearchUtil;
import com.zsmart.declaration.bean.DocumentDemande;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.declaration.bean.Document; 
import com.zsmart.declaration.service.facade.DocumentService ; 
import com.zsmart.declaration.bean.Demande; 
import com.zsmart.declaration.service.facade.DemandeService ; 

 @Service  

 public class DocumentDemandeServiceImpl implements DocumentDemandeService  {


 @Autowired 

 private DocumentDemandeDao documentdemandeDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private DocumentService documentService; 

 @Autowired 

 private DemandeService demandeService; 

 @Override 
public DocumentDemande  save (DocumentDemande documentdemande){

if(documentdemande== null){ 
 return null; 
}else {
 documentdemandeDao.save(documentdemande);
return documentdemande;
}
}

 @Override 
public List< DocumentDemande>  findAll(){
 return documentdemandeDao.findAll();
}

 @Override 
public DocumentDemande findById(Long id){
 return documentdemandeDao.getOne(id);
}

 @Override 
public int delete(DocumentDemande documentdemande){
if(documentdemande== null){ 
  return -1; 
}else {
 documentdemandeDao.delete(documentdemande);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       documentdemandeDao.deleteById(id);
}
public void clone(DocumentDemande documentdemande,DocumentDemande documentdemandeClone){
if(documentdemande!= null && documentdemandeClone != null){
documentdemandeClone.setId(documentdemande.getId());
documentdemandeClone.setNombreDocumentFournis(documentdemande.getNombreDocumentFournis());
documentdemandeClone.setNombreDocumentRestant(documentdemande.getNombreDocumentRestant());
documentdemandeClone.setDocument(documentService.clone(documentdemande.getDocument()));
documentdemandeClone.setDemande(demandeService.clone(documentdemande.getDemande()));
}
}
public DocumentDemande clone(DocumentDemande documentdemande){
if(documentdemande== null){       return null ;
}else{DocumentDemande documentdemandeClone= new DocumentDemande();
documentdemandeClone.setId(documentdemande.getId());
documentdemandeClone.setNombreDocumentFournis(documentdemande.getNombreDocumentFournis());
documentdemandeClone.setNombreDocumentRestant(documentdemande.getNombreDocumentRestant());
documentdemandeClone.setDocument(documentService.clone(documentdemande.getDocument()));
documentdemandeClone.setDemande(demandeService.clone(documentdemande.getDemande()));
return documentdemandeClone;
}
}
public List<DocumentDemande> clone(List<DocumentDemande>documentdemandes){
if(documentdemandes== null){
       return null ;
}else{List<DocumentDemande> documentdemandesClone = new ArrayList();
	 	 	 documentdemandes.forEach((documentdemande)->{documentdemandesClone.add(clone(documentdemande));
});return documentdemandesClone;
}
}
 @Override 
 public List< DocumentDemande>  findByCriteria(Long idMin,Long idMax,Integer nombreDocumentFournisMin,Integer nombreDocumentFournisMax,Integer nombreDocumentRestantMin,Integer nombreDocumentRestantMax){
 return entityManager.createQuery(constructQuery(idMin,idMax,nombreDocumentFournisMin,nombreDocumentFournisMax,nombreDocumentRestantMin,nombreDocumentRestantMax)).getResultList(); 
 }
private String constructQuery(Long idMin,Long idMax,Integer nombreDocumentFournisMin,Integer nombreDocumentFournisMax,Integer nombreDocumentRestantMin,Integer nombreDocumentRestantMax){
String query = "SELECT d FROM DocumentDemande d where 1=1 ";
query += SearchUtil.addConstraintMinMax("d", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("d", "nombreDocumentFournis", nombreDocumentFournisMin, nombreDocumentFournisMax);
query += SearchUtil.addConstraintMinMax("d", "nombreDocumentRestant", nombreDocumentRestantMin, nombreDocumentRestantMax);

  return query; 
}
}
