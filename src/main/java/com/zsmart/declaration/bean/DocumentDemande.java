/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.declaration.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author MoulaYounes
 */
@Entity
public class DocumentDemande implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Document document;
    private Integer nombreDocumentFournis;
    private Integer nombreDocumentRestant;
    @ManyToOne
    private Demande demande;

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Integer getNombreDocumentFournis() {
        return nombreDocumentFournis;
    }

    public void setNombreDocumentFournis(Integer nombreDocumentFournis) {
        this.nombreDocumentFournis = nombreDocumentFournis;
    }

    public Integer getNombreDocumentRestant() {
        return nombreDocumentRestant;
    }

    public void setNombreDocumentRestant(Integer nombreDocumentRestant) {
        this.nombreDocumentRestant = nombreDocumentRestant;
    }

   
    public Demande getDemande() {
        return demande;
    }

    public void setDemande(Demande demande) {
        this.demande = demande;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentDemande)) {
            return false;
        }
        DocumentDemande other = (DocumentDemande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zsmart.declaration.bean.DocumentDemandeur[ id=" + id + " ]";
    }

}
