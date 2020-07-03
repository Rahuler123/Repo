package com.PincodeWise;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DistrictRepo extends JpaRepository<District, String>{
	
	@Query("SELECT new com.PincodeWise.DistrictOrderResponse(s.stateCode,d.districtCode,d.districtName) FROM District d JOIN State s where d.stateCode = s.stateCode ")
	 public List<DistrictOrderResponse> getJoinInformationnn();
	
	

}
