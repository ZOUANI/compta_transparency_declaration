package com.zsmart.declaration.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.declaration.service.util.*;
import com.zsmart.declaration.bean.EtatDemande; 
import com.zsmart.declaration.ws.rest.vo.EtatDemandeVo; 

 @Component 
public class EtatDemandeConverter extends AbstractConverter<EtatDemande,EtatDemandeVo>{ 


 @Override 
 public EtatDemande toItem(EtatDemandeVo vo) {
 if (vo == null) {
    return null;
      } else {
EtatDemande item = new EtatDemande();

 if (StringUtil.isNotEmpty(vo.getLibelle())) {
 item.setLibelle(vo.getLibelle());
} 

 if (StringUtil.isNotEmpty(vo.getCode())) {
 item.setCode(vo.getCode());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

return item;
 }
 }

  @Override 
 public EtatDemandeVo toVo(EtatDemande item) {
 if (item == null) {
    return null;
      } else {
EtatDemandeVo vo = new EtatDemandeVo();

 if (StringUtil.isNotEmpty(item.getLibelle())) {
 vo.setLibelle(item.getLibelle());
} 

 if (StringUtil.isNotEmpty(item.getCode())) {
 vo.setCode(item.getCode());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

return vo;
 }
 }
public void init() { 
}
 } 
