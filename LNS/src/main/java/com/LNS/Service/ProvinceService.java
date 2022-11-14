package com.LNS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.LNS.Templates;
import com.LNS.Models.ModelsETApi.Provinces;
import com.LNS.Models.ModelsOurApi.Community;


@Service
public class ProvinceService {

	@Autowired
	RestTemplate restTemplate;

    public Provinces getAllProvinces(){
        
	Provinces listOfProvinces = Templates.restTemplateProvince(restTemplate);
    return listOfProvinces;
    }

    public Community getAllCommunities(){
        
    Community listOfCommunities = Templates.restTemplateCommunity(restTemplate);
    return listOfCommunities;
    }

   
}

