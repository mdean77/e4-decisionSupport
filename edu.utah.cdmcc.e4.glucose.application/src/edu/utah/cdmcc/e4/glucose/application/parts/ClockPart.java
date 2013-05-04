package edu.utah.cdmcc.e4.glucose.application.parts;

import glucose.Patient;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.widgets.Composite;

public class ClockPart {
	private CLabel MinutesLeftText;
	
	@PostConstruct
	public void createComposite(Composite parent, @Optional Patient patient){
		parent.setLayout(null);
		parent.setToolTipText("Number of minutes until the next decision should be calculated");
		MinutesLeftText = new CLabel(parent, SWT.NONE);// new

		final CLabel minutesUntilNextLabel_1 = new CLabel(parent, SWT.NONE);
		//minutesUntilNextLabel_1.setFont(SWTResourceManager.getFont("Lucida Grande", 20, SWT.NONE));
		minutesUntilNextLabel_1.setAlignment(SWT.CENTER);
		minutesUntilNextLabel_1.setText("Time remaining:");
		minutesUntilNextLabel_1.setBounds(0, 0, 243, 34);

		MinutesLeftText.setEnabled(false);
		//MinutesLeftText.setBackground(SWTResourceManager.getColor(45, 28, 255));
		MinutesLeftText.setAlignment(SWT.CENTER);
		//MinutesLeftText.setForeground(SWTResourceManager.getColor(238, 255, 26));
		//MinutesLeftText.setFont(SWTResourceManager.getFont("Helvetica", 35, SWT.NONE));
		MinutesLeftText.setBounds(34, 40, 171, 74);
	}
	
	@Inject
	@Optional
	public void updateClock(Composite parent, @Named(IServiceConstants.ACTIVE_SELECTION) Patient patient){
		
	}
}
