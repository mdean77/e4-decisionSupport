package edu.utah.cdmcc.glucose.tutorial.services;

import glucose.GlucoseFactory;
import glucose.IntensiveCareUnit;
import glucose.IntensiveCareUnitService;


public class IntensiveCareUnitServiceImpl implements IntensiveCareUnitService {

	//IntensiveCareUnit icu = GlucoseFactory.eINSTANCE.createExampleGlucoseModel();
	IntensiveCareUnit icu = GlucoseFactory.eINSTANCE.createIntensiveCareUnit();
	
	@Override
	public IntensiveCareUnit getRootGroup() {
		System.out.println("Inside implementation of ICU service");
		System.out.println(icu);
		return icu;
	}
	


}
