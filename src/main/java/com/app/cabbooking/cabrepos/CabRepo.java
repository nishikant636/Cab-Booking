package com.app.cabbooking.cabrepos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.cabbooking.models.Cab;

public interface CabRepo extends JpaRepository<Cab,Long>{

}
