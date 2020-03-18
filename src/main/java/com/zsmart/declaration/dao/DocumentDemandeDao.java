package com.zsmart.declaration.dao;
import com.zsmart.declaration.bean.Document;
import com.zsmart.declaration.bean.Demande;
import com.zsmart.declaration.bean.DocumentDemande;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface DocumentDemandeDao extends JpaRepository<DocumentDemande,Long> {


	 public DocumentDemande findByDocument(Document document);
	 public DocumentDemande findByDemande(Demande demande);

	 public int deleteByDocument(Document document);
	 public int deleteByDemande(Demande demande);

}
