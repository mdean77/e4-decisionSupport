package edu.utah.cdmcc.glucose.model.services;

import glucose.GlucoseFactory;
import glucose.IntensiveCareUnit;
import glucose.IntensiveCareUnitService;

public class IntensiveCareUnitServiceImpl implements IntensiveCareUnitService {

	IntensiveCareUnit icu = GlucoseFactory.eINSTANCE.createIntensiveCareUnit();
	
	@Override
	public IntensiveCareUnit getIntensiveCareUnit() {
		return icu;
	}
}
