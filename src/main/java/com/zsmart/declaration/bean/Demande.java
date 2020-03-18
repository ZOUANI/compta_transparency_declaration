/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.declaration.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author MoulaYounes
 */
@Entity
public class Demande implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String refrenceSociete;
    private String description;
    private String reference;
    private String referenceSociete;
    private String referenceComptableValidateur;
    private String referenceComptableCreateur;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateValidation;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateSoumission;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateAffectationComptable;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateFinalisation;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateSaisie;

    @Column(precision = 16, scale = 4)
    private BigDecimal montantTotal;
    @Column(precision = 16, scale = 4)
    private BigDecimal montantPaye;
    @Column(precision = 16, scale = 4)
    private BigDecimal montantRestant;

    @ManyToOne
    private EtatDemande etatDemande;
    @OneToMany(mappedBy = "demande")
    private List<DocumentDemande> documentDemandes;

    @ManyToOne
    private ServicePropose servicePropose;

    public ServicePropose getServicePropose() {
        return servicePropose;
    }

    public void setServicePropose(ServicePropose servicePropose) {
        this.servicePropose = servicePropose;
    }

    public String getRefrenceSociete() {
        return refrenceSociete;
    }

    public void setRefrenceSociete(String refrenceSociete) {
        this.refrenceSociete = refrenceSociete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReferenceSociete() {
        return referenceSociete;
    }

    public void setReferenceSociete(String referenceSociete) {
        this.referenceSociete = referenceSociete;
    }

    public String getReferenceComptableValidateur() {
        return referenceComptableValidateur;
    }

    public void setReferenceComptableValidateur(String referenceComptableValidateur) {
        this.referenceComptableValidateur = referenceComptableValidateur;
    }

    public String getReferenceComptableCreateur() {
        return referenceComptableCreateur;
    }

    public void setReferenceComptableCreateur(String referenceComptableCreateur) {
        this.referenceComptableCreateur = referenceComptableCreateur;
    }

    public Date getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(Date dateValidation) {
        this.dateValidation = dateValidation;
    }

    public Date getDateSoumission() {
        return dateSoumission;
    }

    public void setDateSoumission(Date dateSoumission) {
        this.dateSoumission = dateSoumission;
    }

    public Date getDateAffectationComptable() {
        return dateAffectationComptable;
    }

    public void setDateAffectationComptable(Date dateAffectationComptable) {
        this.dateAffectationComptable = dateAffectationComptable;
    }

    public Date getDateFinalisation() {
        return dateFinalisation;
    }

    public void setDateFinalisation(Date dateFinalisation) {
        this.dateFinalisation = dateFinalisation;
    }

    public Date getDateSaisie() {
        return dateSaisie;
    }

    public void setDateSaisie(Date dateSaisie) {
        this.dateSaisie = dateSaisie;
    }

    public BigDecimal getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(BigDecimal montantTotal) {
        this.montantTotal = montantTotal;
    }

    public BigDecimal getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(BigDecimal montantPaye) {
        this.montantPaye = montantPaye;
    }

    public BigDecimal getMontantRestant() {
        return montantRestant;
    }

    public void setMontantRestant(BigDecimal montantRestant) {
        this.montantRestant = montantRestant;
    }

    public EtatDemande getEtatDemande() {
        return etatDemande;
    }

    public void setEtatDemande(EtatDemande etatDemande) {
        this.etatDemande = etatDemande;
    }

    public List<DocumentDemande> getDocumentDemandes() {
        return documentDemandes;
    }

    public void setDocumentDemandes(List<DocumentDemande> documentDemandes) {
        this.documentDemandes = documentDemandes;
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
        if (!(object instanceof Demande)) {
            return false;
        }
        Demande other = (Demande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zsmart.declaration.bean.Demande[ id=" + id + " ]";
    }

}
