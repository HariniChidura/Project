package com.cg.onlinepizza.coupan.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlinepizza.coupan.dto.Coupan;


public interface ICoupanRepository extends CrudRepository<Coupan,Integer> {

}
