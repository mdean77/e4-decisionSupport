package edu.utah.cdmcc.e4.glucose.application.handlers;

import java.util.GregorianCalendar;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import glucose.GlucoseDecision;
import glucose.GlucoseFactory;
import glucose.IntensiveCareUnit;
import glucose.IntensiveCareUnitService;
import glucose.Patient;
import glucose.Person;
import glucose.StatusType;
import glucose.User;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.CanExecute;

public class FakeDataHandler {

	@Inject IntensiveCareUnitService service;

	private IntensiveCareUnit icu;

	@PostConstruct
	private void init() {
		icu = service.getRootGroup();
	}

	@Execute
	public void execute() {
		addFakeData();
	}

	@CanExecute
	public boolean canExecute() {
		return (icu.getPatients().isEmpty() && icu.getUsers().isEmpty());
	}

	private void addFakeData() {

		// Create the objects
		Patient patient1 = GlucoseFactory.eINSTANCE.createPatient();
		icu.getPatients().add(patient1);
		User user1 = GlucoseFactory.eINSTANCE.createUser();
		icu.getUsers().add(user1);
		Patient patient2 = GlucoseFactory.eINSTANCE.createPatient();
		icu.getPatients().add(patient2);
		User user2 = GlucoseFactory.eINSTANCE.createUser();
		icu.getUsers().add(user2);
		GlucoseDecision decision1 = GlucoseFactory.eINSTANCE.createGlucoseDecision();
		GlucoseDecision decision2 = GlucoseFactory.eINSTANCE.createGlucoseDecision();
		GlucoseDecision decision3 = GlucoseFactory.eINSTANCE.createGlucoseDecision();
		GlucoseDecision decision4 = GlucoseFactory.eINSTANCE.createGlucoseDecision();
		patient1.getDecisions().add(decision1);
		patient1.getDecisions().add(decision2);
		patient2.getDecisions().add(decision3);
		patient2.getDecisions().add(decision4);

		// Give the object fields some values
		GregorianCalendar birthdate1 = new GregorianCalendar(2000, 5, 25);
		GregorianCalendar birthdate2 = new GregorianCalendar(2010, 5, 25);
		GregorianCalendar decisionDates1 = new GregorianCalendar(2000, 5, 26);
		GregorianCalendar decisionDates2 = new GregorianCalendar(2000, 5, 27);
		GregorianCalendar decisionDates3 = new GregorianCalendar(2010, 5, 26);
		GregorianCalendar decisionDates4 = new GregorianCalendar(2010, 5, 27);
		initializePatientValues(patient1, "Dean", "Mike", birthdate1, 125., 55.6, "CHOM0099", "12-34-56");
		initializePatientValues(patient2, "Secco", "Diana", birthdate2, 114.6, 35.6, "CHLA9099", "34-56-78");
		initializePersonValues(user1, "Welkie", "Katy");
		initializePersonValues(user2, "Maloney", "Chris");
		initializeDecisionValues(decision1, "No advice", "Because I said so", 1.44, decisionDates1, 60);
		initializeDecisionValues(decision2, "No advice", "Because I said so", 2.44, decisionDates2, 120);
		initializeDecisionValues(decision3, "No advice", "Because I said so", 3.44, decisionDates3, 180);
		initializeDecisionValues(decision4, "No advice", "Because I said so", 4.44, decisionDates4, 240);
	}

	private void initializeDecisionValues(GlucoseDecision decision, String advice, String explain, Double insulin,
			GregorianCalendar decisionDate, int minutes) {
		decision.setAdviceText(advice);
		decision.setCurrentInsulinDripRate(insulin);
		decision.setObservationDate(decisionDate);
		decision.setMinutesToNextEvaluation(minutes);
	}

	private void initializePatientValues(Patient patient, String last, String first, GregorianCalendar birthdate, Double height,
			Double weight, String studyID, String medRecNum) {
		patient.setBirthdate(birthdate);
		initializePersonValues(patient, last, first);
		patient.setHeight(height);
		patient.setWeight(weight);
		patient.setMedRecNum(medRecNum);
		patient.setStudyID(studyID);
		patient.setStatus(StatusType.SAMPLE);

	}

	private void initializePersonValues(Person person, String last, String first) {
		person.setFirstName(first);
		person.setLastName(last);
	}
}
