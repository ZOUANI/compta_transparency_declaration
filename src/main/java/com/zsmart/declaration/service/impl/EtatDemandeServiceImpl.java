
package com.zsmart.declaration.service.impl ;
import com.zsmart.declaration.service.facade.EtatDemandeService ; 
import com.zsmart.declaration.dao.EtatDemandeDao ;
import com.zsmart.declaration.service.util.SearchUtil;
import com.zsmart.declaration.bean.EtatDemande;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class EtatDemandeServiceImpl implements EtatDemandeService  {


 @Autowired 

 private EtatDemandeDao etatdemandeDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public EtatDemande  save (EtatDemande etatdemande){

if(etatdemande== null){ 
 return null; 
}else {
 etatdemandeDao.save(etatdemande);
return etatdemande;
}
}

 @Override 
public List< EtatDemande>  findAll(){
 return etatdemandeDao.findAll();
}

 @Override 
public EtatDemande findById(Long id){
 return etatdemandeDao.getOne(id);
}

 @Override 
public int delete(EtatDemande etatdemande){
if(etatdemande== null){ 
  return -1; 
}else {
 etatdemandeDao.delete(etatdemande);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       etatdemandeDao.deleteById(id);
}
public void clone(EtatDemande etatdemande,EtatDemande etatdemandeClone){
if(etatdemande!= null && etatdemandeClone != null){
etatdemandeClone.setId(etatdemande.getId());
etatdemandeClone.setLibelle(etatdemande.getLibelle());
etatdemandeClone.setCode(etatdemande.getCode());
}
}
public EtatDemande clone(EtatDemande etatdemande){
if(etatdemande== null){       return null ;
}else{EtatDemande etatdemandeClone= new EtatDemande();
etatdemandeClone.setId(etatdemande.getId());
etatdemandeClone.setLibelle(etatdemande.getLibelle());
etatdemandeClone.setCode(etatdemande.getCode());
return etatdemandeClone;
}
}
public List<EtatDemande> clone(List<EtatDemande>etatdemandes){
if(etatdemandes== null){
       return null ;
}else{List<EtatDemande> etatdemandesClone = new ArrayList();
	 	 	 etatdemandes.forEach((etatdemande)->{etatdemandesClone.add(clone(etatdemande));
});return etatdemandesClone;
}
}
 @Override 
 public List< EtatDemande>  findByCriteria(String libelle,String code,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,code,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,String code,Long idMin,Long idMax){
String query = "SELECT e FROM EtatDemande e where 1=1 ";
query += SearchUtil.addConstraint( "e", "libelle","=",libelle);
query += SearchUtil.addConstraint( "e", "code","=",code);
query += SearchUtil.addConstraintMinMax("e", "id", idMin, idMax);

  return query; 
}
}
