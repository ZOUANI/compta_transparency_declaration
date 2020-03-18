package com.zsmart.declaration.dao;
import com.zsmart.declaration.bean.ServicePropose;
import com.zsmart.declaration.bean.Document;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface DocumentDao extends JpaRepository<Document,Long> {


	 public Document findByServicePropose(ServicePropose servicePropose);

	 public int deleteByServicePropose(ServicePropose servicePropose);

}
