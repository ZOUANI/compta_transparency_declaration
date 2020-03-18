package com.zsmart.declaration.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.declaration.bean.Document;
import com.zsmart.declaration.bean.ServicePropose; 
public interface DocumentService {

public Document save(Document document); 
public List<Document>  findAll();
public Document findById(Long id);
public int delete(Document document);
public void  deleteById(Long id);
public void clone(Document document,Document documentClone);
public Document clone(Document document);
public List<Document> clone(List<Document>documents);
 public List<Document>  findByCriteria(String libelle,String code,Long idMin,Long idMax,Integer ordreMin,Integer ordreMax,Integer nombreMin,Integer nombreMax);

}
