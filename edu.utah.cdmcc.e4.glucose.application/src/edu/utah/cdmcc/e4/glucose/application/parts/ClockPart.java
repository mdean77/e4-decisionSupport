package edu.utah.cdmcc.e4.glucose.application.parts;

import glucose.Patient;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.widgets.Composite;

public class ClockPart {
	private CLabel minutesLeftText;
	
	@Inject private Logger logger;
	@Inject IEventBroker broker;
	
	public ClockPart() {
		super();
	}

	@PostConstruct
	public void createComposite(Composite parent, @Optional Patient patient, @Optional IStylingEngine styleEngine){
		logger.info("Clock createComposite routine entered (PostConstruct");
		if(patient != null) logger.info("Patient is: " + patient.getName());
		parent.setLayout(null);
		parent.setToolTipText("Number of minutes until the next decision should be calculated");
		minutesLeftText = new CLabel(parent, SWT.NONE);// new

		final CLabel minutesLeftLabel = new CLabel(parent, SWT.NONE);
		minutesLeftLabel.setAlignment(SWT.CENTER);
		minutesLeftLabel.setText("Time remaining:");
		minutesLeftLabel.setBounds(0, 0, 243, 34);

		minutesLeftText.setEnabled(false);
		minutesLeftText.setAlignment(SWT.CENTER);
		minutesLeftText.setText("Sample");
		minutesLeftText.setBounds(34, 40, 171, 74);
		if (styleEngine != null){
			styleEngine.setClassname(minutesLeftText, "minutesLeftText");
			styleEngine.setClassname(minutesLeftLabel, "minutesLeftLabel");
		}
	}
	
	@Inject
	@Optional
	public void updateClock(Composite parent, @Named(IServiceConstants.ACTIVE_SELECTION) Patient patient){
		logger.info("Entered the clock update routine - info");
		if(patient != null) logger.info("Patient is: " + patient.getName());
		
	}
}
