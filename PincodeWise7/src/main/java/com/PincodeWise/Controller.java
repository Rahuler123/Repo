package com.PincodeWise;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class Controller {
    @Autowired
    private PincodeRepo pincodeRepository;
    @Autowired
    private DistrictRepo districtRepository;

    @PostMapping("/create")
    public Pincode create(@RequestBody OrderRequest request){
       return pincodeRepository.save(request.getPincode());
    }

    @GetMapping("/findAll")
    public List<Pincode> findAll(){
        return pincodeRepository.findAll();
    }

    @GetMapping("/getAll")
    public List<PincodeResponse> getJoinInformation(){
        return pincodeRepository.getJoinInformation();
    }
    
    @GetMapping("/getDistrict")
    public List<DistrictOrderResponse> getJoinInformationnn(){
        return districtRepository.getJoinInformationnn();
    }
    
//    @GetMapping("/getInfo/{id}")
//    public List<OrderResponse> finByString(){
//        return ((Controller) pincodeRepository).finByString();
//    }
    
    
    
 
}
