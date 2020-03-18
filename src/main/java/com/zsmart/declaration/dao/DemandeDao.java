package com.zsmart.declaration.dao;
import com.zsmart.declaration.bean.EtatDemande;
import com.zsmart.declaration.bean.ServicePropose;
import com.zsmart.declaration.bean.Demande;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface DemandeDao extends JpaRepository<Demande,Long> {
	 public Demande findByReference(String reference);

	 public int deleteByReference(String reference);

	 public Demande findByEtatDemande(EtatDemande etatDemande);
	 public Demande findByServicePropose(ServicePropose servicePropose);

	 public int deleteByEtatDemande(EtatDemande etatDemande);
	 public int deleteByServicePropose(ServicePropose servicePropose);

}
