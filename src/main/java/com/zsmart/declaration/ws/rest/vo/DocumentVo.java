package com.zsmart.declaration.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class DocumentVo{

private String id ;
private String libelle ;
private String code ;
private String ordre;
private String ordreMin ;
private String ordreMax ;
private String nombre;
private String nombreMin ;
private String nombreMax ;
private ServiceProposeVo serviceProposeVo ;



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

public String  getCode(){
    return code;
}

public void setCode(String  code){
     this.code = code;
}

public String  getOrdre(){
    return ordre;
}

public void setOrdre(String  ordre){
     this.ordre = ordre;
}

public String  getOrdreMin(){
    return ordreMin;
}

public void setOrdreMin(String  ordreMin){
     this.ordreMin = ordreMin;
}

public String  getOrdreMax(){
    return ordreMax;
}

public void setOrdreMax(String  ordreMax){
     this.ordreMax = ordreMax;
}

public String  getNombre(){
    return nombre;
}

public void setNombre(String  nombre){
     this.nombre = nombre;
}

public String  getNombreMin(){
    return nombreMin;
}

public void setNombreMin(String  nombreMin){
     this.nombreMin = nombreMin;
}

public String  getNombreMax(){
    return nombreMax;
}

public void setNombreMax(String  nombreMax){
     this.nombreMax = nombreMax;
}

public ServiceProposeVo  getServiceProposeVo (){
    return serviceProposeVo ;
}

public void setServiceProposeVo (ServiceProposeVo  serviceProposeVo ){
     this.serviceProposeVo  = serviceProposeVo ;
}




}