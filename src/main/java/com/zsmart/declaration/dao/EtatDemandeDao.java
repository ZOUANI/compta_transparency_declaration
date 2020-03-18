package com.zsmart.declaration.dao;
import com.zsmart.declaration.bean.EtatDemande;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface EtatDemandeDao extends JpaRepository<EtatDemande,Long> {




}
