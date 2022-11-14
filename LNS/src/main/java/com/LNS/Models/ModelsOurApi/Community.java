package com.LNS.Models.ModelsOurApi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Community {

    private List<CommunityData> provincias;

	public Community(){
	}

	public Community(List<CommunityData> provincias) {
		this.provincias = provincias;
	}

	public List<CommunityData> getprovincias() {
		return provincias;
	}

	public void setprovincias(List<CommunityData> provincias) {
		this.provincias = provincias;
	}
    
}
