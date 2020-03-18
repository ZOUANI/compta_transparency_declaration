package com.zsmart.declaration.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.declaration.bean.ServicePropose;
import com.zsmart.declaration.bean.CategorieService; 
public interface ServiceProposeService {

public ServicePropose save(ServicePropose servicepropose); 
public List<ServicePropose>  findAll();
public ServicePropose findById(Long id);
public int delete(ServicePropose servicepropose);
public void  deleteById(Long id);
public void clone(ServicePropose servicepropose,ServicePropose serviceproposeClone);
public ServicePropose clone(ServicePropose servicepropose);
public List<ServicePropose> clone(List<ServicePropose>serviceproposes);
 public List<ServicePropose>  findByCriteria(String libelle,String description,String lien,Long idMin,Long idMax,BigDecimal prixMin,BigDecimal prixMax);

}
