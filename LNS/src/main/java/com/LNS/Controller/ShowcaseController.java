package com.LNS.Controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LNS.Models.ModelsETApi.Provinces;
import com.LNS.Models.ModelsOurApi.Community;
import com.LNS.Service.ProvinceService;



@RestController
public class ShowcaseController {

	@Autowired
	ProvinceService provinceService;

	@GetMapping("/provinces")
    public Provinces getAllProvinces(){

	  return provinceService.getAllProvinces(); 

	}

	@GetMapping("/communities")
    public Community getAllCommunities(){

	  return provinceService.getAllCommunities(); 

	}
}

	