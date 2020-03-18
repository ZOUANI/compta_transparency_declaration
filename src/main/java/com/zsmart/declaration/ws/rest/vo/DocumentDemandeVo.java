package com.zsmart.declaration.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class DocumentDemandeVo{

private String id ;
private String nombreDocumentFournis;
private String nombreDocumentFournisMin ;
private String nombreDocumentFournisMax ;
private String nombreDocumentRestant;
private String nombreDocumentRestantMin ;
private String nombreDocumentRestantMax ;
private DocumentVo documentVo ;
private DemandeVo demandeVo ;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public String  getNombreDocumentFournis(){
    return nombreDocumentFournis;
}

public void setNombreDocumentFournis(String  nombreDocumentFournis){
     this.nombreDocumentFournis = nombreDocumentFournis;
}

public String  getNombreDocumentFournisMin(){
    return nombreDocumentFournisMin;
}

public void setNombreDocumentFournisMin(String  nombreDocumentFournisMin){
     this.nombreDocumentFournisMin = nombreDocumentFournisMin;
}

public String  getNombreDocumentFournisMax(){
    return nombreDocumentFournisMax;
}

public void setNombreDocumentFournisMax(String  nombreDocumentFournisMax){
     this.nombreDocumentFournisMax = nombreDocumentFournisMax;
}

public String  getNombreDocumentRestant(){
    return nombreDocumentRestant;
}

public void setNombreDocumentRestant(String  nombreDocumentRestant){
     this.nombreDocumentRestant = nombreDocumentRestant;
}

public String  getNombreDocumentRestantMin(){
    return nombreDocumentRestantMin;
}

public void setNombreDocumentRestantMin(String  nombreDocumentRestantMin){
     this.nombreDocumentRestantMin = nombreDocumentRestantMin;
}

public String  getNombreDocumentRestantMax(){
    return nombreDocumentRestantMax;
}

public void setNombreDocumentRestantMax(String  nombreDocumentRestantMax){
     this.nombreDocumentRestantMax = nombreDocumentRestantMax;
}

public DocumentVo  getDocumentVo (){
    return documentVo ;
}

public void setDocumentVo (DocumentVo  documentVo ){
     this.documentVo  = documentVo ;
}

public DemandeVo  getDemandeVo (){
    return demandeVo ;
}

public void setDemandeVo (DemandeVo  demandeVo ){
     this.demandeVo  = demandeVo ;
}




}