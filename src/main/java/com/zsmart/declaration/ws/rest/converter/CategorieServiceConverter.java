package com.zsmart.declaration.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.declaration.service.util.*;
import com.zsmart.declaration.bean.CategorieService; 
import com.zsmart.declaration.ws.rest.vo.CategorieServiceVo; 

 @Component 
public class CategorieServiceConverter extends AbstractConverter<CategorieService,CategorieServiceVo>{ 

private boolean serviceProposes; 

 @Autowired
 private ServiceProposeConverter serviceProposeConverter ; 

 @Override 
 public CategorieService toItem(CategorieServiceVo vo) {
 if (vo == null) {
    return null;
      } else {
CategorieService item = new CategorieService();

 if (StringUtil.isNotEmpty(vo.getLibelle())) {
 item.setLibelle(vo.getLibelle());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (ListUtil.isNotEmpty(vo.getServiceProposesVo ()) && serviceProposes) {
 item.setServiceProposes(serviceProposeConverter.toItem(vo.getServiceProposesVo())); 
} 

return item;
 }
 }

  @Override 
 public CategorieServiceVo toVo(CategorieService item) {
 if (item == null) {
    return null;
      } else {
CategorieServiceVo vo = new CategorieServiceVo();

 if (StringUtil.isNotEmpty(item.getLibelle())) {
 vo.setLibelle(item.getLibelle());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if(ListUtil.isNotEmpty(item.getServiceProposes()) && serviceProposes) {
 vo.setServiceProposesVo(serviceProposeConverter.toVo(item.getServiceProposes()));
} 

return vo;
 }
 }
public void init() { 

serviceProposes = true; 
}
 } 
