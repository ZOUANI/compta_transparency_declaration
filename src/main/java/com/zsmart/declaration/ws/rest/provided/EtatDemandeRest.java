package com.zsmart.declaration.ws.rest.provided ;


import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.zsmart.declaration.service.facade.EtatDemandeService;
import com.zsmart.declaration.bean.EtatDemande;
import com.zsmart.declaration.ws.rest.vo.EtatDemandeVo;
import com.zsmart.declaration.ws.rest.converter.EtatDemandeConverter;
import com.zsmart.declaration.service.util.* ;
@RestController
@RequestMapping("/declaration/EtatDemande")
@CrossOrigin(origins = {"http://localhost:4200"})
public class EtatDemandeRest {

 @Autowired 
 private EtatDemandeService etatDemandeService;

 @Autowired 
private EtatDemandeConverter etatDemandeConverter ;

@PostMapping("/")
public EtatDemandeVo save(@RequestBody EtatDemandeVo etatDemandeVo){
EtatDemande etatDemande= etatDemandeConverter.toItem(etatDemandeVo);
return etatDemandeConverter.toVo(etatDemandeService.save(etatDemande));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
etatDemandeService.deleteById(id);
}
@GetMapping("/")
public List<EtatDemandeVo> findAll(){
return etatDemandeConverter.toVo(etatDemandeService.findAll());
}

 public EtatDemandeConverter getEtatDemandeConverter(){
return etatDemandeConverter;
}
 
 public void setEtatDemandeConverter(EtatDemandeConverter etatDemandeConverter){
this.etatDemandeConverter=etatDemandeConverter;
}

 public EtatDemandeService getEtatDemandeService(){
return etatDemandeService;
}
 
 public void setEtatDemandeService(EtatDemandeService etatDemandeService){
this.etatDemandeService=etatDemandeService;
}

}