package com.corejsf;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Planetarium implements Serializable {

	private static final long serialVersionUID = 1L;

	private String selectedPlanet;
	
	public String getSelectedPlanet() {
		return selectedPlanet;
	}
	
	public String changePlanet(String selectedPlanet) {
		this.selectedPlanet = selectedPlanet;
		
		return selectedPlanet;
	}
	
}
