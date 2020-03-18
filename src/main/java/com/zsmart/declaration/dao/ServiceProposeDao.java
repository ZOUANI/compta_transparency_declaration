package com.zsmart.declaration.dao;
import com.zsmart.declaration.bean.CategorieService;
import com.zsmart.declaration.bean.ServicePropose;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface ServiceProposeDao extends JpaRepository<ServicePropose,Long> {


	 public ServicePropose findByCategorieService(CategorieService categorieService);

	 public int deleteByCategorieService(CategorieService categorieService);

}
