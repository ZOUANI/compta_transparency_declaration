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
import com.zsmart.declaration.service.facade.DemandeService;
import com.zsmart.declaration.bean.Demande;
import com.zsmart.declaration.ws.rest.vo.DemandeVo;
import com.zsmart.declaration.ws.rest.converter.DemandeConverter;
import com.zsmart.declaration.service.util.* ;
@RestController
@RequestMapping("/declaration/Demande")
@CrossOrigin(origins = {"http://localhost:4200"})
public class DemandeRest {

 @Autowired 
 private DemandeService demandeService;

 @Autowired 
private DemandeConverter demandeConverter ;

@PostMapping("/")
public DemandeVo save(@RequestBody DemandeVo demandeVo){
Demande demande= demandeConverter.toItem(demandeVo);
return demandeConverter.toVo(demandeService.save(demande));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
demandeService.deleteById(id);
}
@DeleteMapping("/{reference}")
public void  deleteByReference(@PathVariable String  reference){
demandeService.deleteByReference(reference);
}
@GetMapping("/")
public List<DemandeVo> findAll(){
return demandeConverter.toVo(demandeService.findAll());
}

 public DemandeConverter getDemandeConverter(){
return demandeConverter;
}
 
 public void setDemandeConverter(DemandeConverter demandeConverter){
this.demandeConverter=demandeConverter;
}

 public DemandeService getDemandeService(){
return demandeService;
}
 
 public void setDemandeService(DemandeService demandeService){
this.demandeService=demandeService;
}

}