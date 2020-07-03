
package com.PincodeWise;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class DistrictOrderResponse {

	private String districtCode;
    private String districtName;
    private String StateCode;
	public String getDistrictCode() {
		return districtCode;
	}
	public DistrictOrderResponse(String districtCode, String districtName, String stateCode) {
		super();
		this.districtCode = districtCode;
		this.districtName = districtName;
		StateCode = stateCode;
	}
	public String getStateCode() {
		return StateCode;
	}
	public void setStateCode(String stateCode) {
		StateCode = stateCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public DistrictOrderResponse(String districtCode, String districtName) {
		super();
		this.districtCode = districtCode;
		this.districtName = districtName;
	}
   

    
    
}
