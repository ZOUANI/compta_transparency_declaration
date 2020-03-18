package com.zsmart.declaration.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.declaration.bean.DocumentDemande;
import com.zsmart.declaration.bean.Document; 
import com.zsmart.declaration.bean.Demande; 
public interface DocumentDemandeService {

public DocumentDemande save(DocumentDemande documentdemande); 
public List<DocumentDemande>  findAll();
public DocumentDemande findById(Long id);
public int delete(DocumentDemande documentdemande);
public void  deleteById(Long id);
public void clone(DocumentDemande documentdemande,DocumentDemande documentdemandeClone);
public DocumentDemande clone(DocumentDemande documentdemande);
public List<DocumentDemande> clone(List<DocumentDemande>documentdemandes);
 public List<DocumentDemande>  findByCriteria(Long idMin,Long idMax,Integer nombreDocumentFournisMin,Integer nombreDocumentFournisMax,Integer nombreDocumentRestantMin,Integer nombreDocumentRestantMax);

}
