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
import com.zsmart.declaration.service.facade.DocumentDemandeService;
import com.zsmart.declaration.bean.DocumentDemande;
import com.zsmart.declaration.ws.rest.vo.DocumentDemandeVo;
import com.zsmart.declaration.ws.rest.converter.DocumentDemandeConverter;
import com.zsmart.declaration.service.util.* ;
@RestController
@RequestMapping("/declaration/DocumentDemande")
@CrossOrigin(origins = {"http://localhost:4200"})
public class DocumentDemandeRest {

 @Autowired 
 private DocumentDemandeService documentDemandeService;

 @Autowired 
private DocumentDemandeConverter documentDemandeConverter ;

@PostMapping("/")
public DocumentDemandeVo save(@RequestBody DocumentDemandeVo documentDemandeVo){
DocumentDemande documentDemande= documentDemandeConverter.toItem(documentDemandeVo);
return documentDemandeConverter.toVo(documentDemandeService.save(documentDemande));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
documentDemandeService.deleteById(id);
}
@GetMapping("/")
public List<DocumentDemandeVo> findAll(){
return documentDemandeConverter.toVo(documentDemandeService.findAll());
}

 public DocumentDemandeConverter getDocumentDemandeConverter(){
return documentDemandeConverter;
}
 
 public void setDocumentDemandeConverter(DocumentDemandeConverter documentDemandeConverter){
this.documentDemandeConverter=documentDemandeConverter;
}

 public DocumentDemandeService getDocumentDemandeService(){
return documentDemandeService;
}
 
 public void setDocumentDemandeService(DocumentDemandeService documentDemandeService){
this.documentDemandeService=documentDemandeService;
}

}