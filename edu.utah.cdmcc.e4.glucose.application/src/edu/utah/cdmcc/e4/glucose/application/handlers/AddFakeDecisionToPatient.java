 
package edu.utah.cdmcc.e4.glucose.application.handlers;

import javax.inject.Inject;
import javax.inject.Named;

import glucose.GlucoseDecision;
import glucose.GlucoseFactory;
import glucose.Patient;
import glucose.StatusType;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;

public class AddFakeDecisionToPatient {
	
	@Inject Logger logger;
//	
//	@Inject @Optional
//	private Patient patient;
	
	@Inject ESelectionService selectionService;
	
	@Execute
	public void execute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Patient patient) {
		logger.info("Entered the Execute method of addFakeDecisionToPatient");
		if(patient != null){
			logger.info("Patient is not null, and status is: "+ patient.getStatus().toString());
			logger.info("Patient name is: "+patient.getName());
			logger.info("Number of decisions before executing is: "+patient.getDecisions().size());
			addDecision(patient);
			logger.info("Number of decisions after executing is: "+patient.getDecisions().size());
		}
		
	}
	
	
	private void addDecision(Patient patient) {
		logger.info("In private addDecision method of addFakeDecisionToPatient handler");
		GlucoseDecision decision = GlucoseFactory.eINSTANCE.createGlucoseDecision();
		patient.getDecisions().add(decision);
		selectionService.setSelection(patient);
	}


	@CanExecute
	public boolean canExecute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Patient patient) {
		logger.info("Entered the canExecute method of addFakeDecisionToPatient");
		if (patient != null) {
			logger.info("Patient is not null, and status is "+ patient.getStatus().toString());
		} else logger.info("Patient is null");
		return (patient != null && patient.getStatus() == StatusType.SAMPLE);
	}
		
}