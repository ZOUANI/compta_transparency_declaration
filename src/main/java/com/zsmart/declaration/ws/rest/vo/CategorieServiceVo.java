package com.zsmart.declaration.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class CategorieServiceVo{

private String id ;
private String libelle ;
private List<ServiceProposeVo>serviceProposesVo;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public String  getLibelle(){
    return libelle;
}

public void setLibelle(String  libelle){
     this.libelle = libelle;
}

public List<ServiceProposeVo> getServiceProposesVo(){
    return serviceProposesVo;
}

public void setServiceProposesVo(List<ServiceProposeVo> serviceProposesVo){
     this.serviceProposesVo = serviceProposesVo;
}




}