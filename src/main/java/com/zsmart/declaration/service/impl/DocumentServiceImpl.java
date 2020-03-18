
package com.zsmart.declaration.service.impl ;
import com.zsmart.declaration.service.facade.DocumentService ; 
import com.zsmart.declaration.dao.DocumentDao ;
import com.zsmart.declaration.service.util.SearchUtil;
import com.zsmart.declaration.bean.Document;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.declaration.bean.ServicePropose; 
import com.zsmart.declaration.service.facade.ServiceProposeService ; 

 @Service  

 public class DocumentServiceImpl implements DocumentService  {


 @Autowired 

 private DocumentDao documentDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private ServiceProposeService serviceproposeService; 

 @Override 
public Document  save (Document document){

if(document== null){ 
 return null; 
}else {
 documentDao.save(document);
return document;
}
}

 @Override 
public List< Document>  findAll(){
 return documentDao.findAll();
}

 @Override 
public Document findById(Long id){
 return documentDao.getOne(id);
}

 @Override 
public int delete(Document document){
if(document== null){ 
  return -1; 
}else {
 documentDao.delete(document);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       documentDao.deleteById(id);
}
public void clone(Document document,Document documentClone){
if(document!= null && documentClone != null){
documentClone.setId(document.getId());
documentClone.setLibelle(document.getLibelle());
documentClone.setCode(document.getCode());
documentClone.setOrdre(document.getOrdre());
documentClone.setNombre(document.getNombre());
documentClone.setServicePropose(serviceproposeService.clone(document.getServicePropose()));
}
}
public Document clone(Document document){
if(document== null){       return null ;
}else{Document documentClone= new Document();
documentClone.setId(document.getId());
documentClone.setLibelle(document.getLibelle());
documentClone.setCode(document.getCode());
documentClone.setOrdre(document.getOrdre());
documentClone.setNombre(document.getNombre());
documentClone.setServicePropose(serviceproposeService.clone(document.getServicePropose()));
return documentClone;
}
}
public List<Document> clone(List<Document>documents){
if(documents== null){
       return null ;
}else{List<Document> documentsClone = new ArrayList();
	 	 	 documents.forEach((document)->{documentsClone.add(clone(document));
});return documentsClone;
}
}
 @Override 
 public List< Document>  findByCriteria(String libelle,String code,Long idMin,Long idMax,Integer ordreMin,Integer ordreMax,Integer nombreMin,Integer nombreMax){
 return entityManager.createQuery(constructQuery(libelle,code,idMin,idMax,ordreMin,ordreMax,nombreMin,nombreMax)).getResultList(); 
 }
private String constructQuery(String libelle,String code,Long idMin,Long idMax,Integer ordreMin,Integer ordreMax,Integer nombreMin,Integer nombreMax){
String query = "SELECT d FROM Document d where 1=1 ";
query += SearchUtil.addConstraint( "d", "libelle","=",libelle);
query += SearchUtil.addConstraint( "d", "code","=",code);
query += SearchUtil.addConstraintMinMax("d", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("d", "ordre", ordreMin, ordreMax);
query += SearchUtil.addConstraintMinMax("d", "nombre", nombreMin, nombreMax);

  return query; 
}
}
