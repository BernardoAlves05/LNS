package com.LNS;

import org.springframework.web.client.RestTemplate;

import com.LNS.Models.ModelsETApi.Provinces;
import com.LNS.Models.ModelsOurApi.Community;

public class Templates {
    
    public static Provinces restTemplateProvince(RestTemplate restTemplate) {
		String ProvinceCommunityURL = "https://www.el-tiempo.net/api/json/v2/provincias";

		Provinces province
		= restTemplate.getForObject(ProvinceCommunityURL, Provinces.class);

		return province;
	}
	
	public static Community restTemplateCommunity(RestTemplate restTemplate) {
		String ProvinceCommunityURL = "https://www.el-tiempo.net/api/json/v2/provincias";

		Community communities
		= restTemplate.getForObject(ProvinceCommunityURL, Community.class);

		return communities;
	} 
    
}
