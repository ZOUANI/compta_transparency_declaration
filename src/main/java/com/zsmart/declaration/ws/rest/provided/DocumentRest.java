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
import com.zsmart.declaration.service.facade.DocumentService;
import com.zsmart.declaration.bean.Document;
import com.zsmart.declaration.ws.rest.vo.DocumentVo;
import com.zsmart.declaration.ws.rest.converter.DocumentConverter;
import com.zsmart.declaration.service.util.* ;
@RestController
@RequestMapping("/declaration/Document")
@CrossOrigin(origins = {"http://localhost:4200"})
public class DocumentRest {

 @Autowired 
 private DocumentService documentService;

 @Autowired 
private DocumentConverter documentConverter ;

@PostMapping("/")
public DocumentVo save(@RequestBody DocumentVo documentVo){
Document document= documentConverter.toItem(documentVo);
return documentConverter.toVo(documentService.save(document));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
documentService.deleteById(id);
}
@GetMapping("/")
public List<DocumentVo> findAll(){
return documentConverter.toVo(documentService.findAll());
}

 public DocumentConverter getDocumentConverter(){
return documentConverter;
}
 
 public void setDocumentConverter(DocumentConverter documentConverter){
this.documentConverter=documentConverter;
}

 public DocumentService getDocumentService(){
return documentService;
}
 
 public void setDocumentService(DocumentService documentService){
this.documentService=documentService;
}

}