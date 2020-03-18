package com.zsmart.declaration.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.declaration.service.util.*;
import com.zsmart.declaration.bean.DocumentDemande; 
import com.zsmart.declaration.ws.rest.vo.DocumentDemandeVo; 

 @Component 
public class DocumentDemandeConverter extends AbstractConverter<DocumentDemande,DocumentDemandeVo>{ 

private boolean document; 

 @Autowired
 private DocumentConverter documentConverter ; 
private boolean demande; 

 @Autowired
 private DemandeConverter demandeConverter ; 

 @Override 
 public DocumentDemande toItem(DocumentDemandeVo vo) {
 if (vo == null) {
    return null;
      } else {
DocumentDemande item = new DocumentDemande();

 if(document&& vo.getDocumentVo() != null) {
 item.setDocument(documentConverter.toItem(vo.getDocumentVo()));
} 
 
 if(demande&& vo.getDemandeVo() != null) {
 item.setDemande(demandeConverter.toItem(vo.getDemandeVo()));
} 
 
 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (vo.getNombreDocumentFournis() != null) {
 item.setNombreDocumentFournis((vo.getNombreDocumentFournis()));
} 

 if (vo.getNombreDocumentRestant() != null) {
 item.setNombreDocumentRestant((vo.getNombreDocumentRestant()));
} 

return item;
 }
 }

  @Override 
 public DocumentDemandeVo toVo(DocumentDemande item) {
 if (item == null) {
    return null;
      } else {
DocumentDemandeVo vo = new DocumentDemandeVo();

 if(document&& item.getDocument() != null) {
 vo.setDocumentVo(documentConverter.toVo(item.getDocument()));
} 
 
 if(demande&& item.getDemande() != null) {
 vo.setDemandeVo(demandeConverter.toVo(item.getDemande()));
} 
 
 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if (item.getNombreDocumentFournis() != null) {
 vo.setNombreDocumentFournis(NumberUtil.toString(item.getNombreDocumentFournis()));
} 

 if (item.getNombreDocumentRestant() != null) {
 vo.setNombreDocumentRestant(NumberUtil.toString(item.getNombreDocumentRestant()));
} 

return vo;
 }
 }
public void init() { 

document = true; 

demande = true; 
}
 } 
