package com.zsmart.declaration.dao;
import com.zsmart.declaration.bean.CategorieService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface CategorieServiceDao extends JpaRepository<CategorieService,Long> {




}
