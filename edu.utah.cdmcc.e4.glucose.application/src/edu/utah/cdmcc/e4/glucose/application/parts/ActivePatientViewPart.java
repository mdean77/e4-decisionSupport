package edu.utah.cdmcc.e4.glucose.application.parts;

import glucose.Patient;
import java.text.DecimalFormat;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class ActivePatientViewPart {

	public ActivePatientViewPart() {
	}

	private CLabel weightText;
	private CLabel heightText;
	private CLabel birthdateText;
	private CLabel medRecText;
	private CLabel patientNameText;
	private int x = 10, y = 10, width = 120, height = 25;
	private Button selectPatientButton;

	@Inject EHandlerService handlerService;
	@Inject ECommandService commandService;

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		setupPatientName(composite);
		setupMedicalRecNumber(composite);
		setupBirthdate(composite);
		setupHeight(composite);
		setupWeight(composite);

		selectPatientButton = new Button(composite, SWT.NONE);
		selectPatientButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(final SelectionEvent e) {
				ParameterizedCommand myCommand = commandService.createCommand(
						"edu.utah.cdmcc.e4.glucose.application.command.selectPatient", null);
				handlerService.executeHandler(myCommand);
			}
		});
	}

	@Inject
	@Optional
	public void setInput(@Named(IServiceConstants.ACTIVE_SELECTION) Patient patient) {
		System.out.println("Entered set input for active patient view");
		selectPatientButton.setToolTipText("Select or change  active patient");
		if (patient == null) {
			selectPatientButton.setText("Select Active Patient");
		} else {
			selectPatientButton.setText("Change Active Patient");
		}
		selectPatientButton.setBounds(10, 164, 240, 28);

		if (patient == null)
			initPatientFields();
		else
			refreshFields(patient);
	}

	public void refreshFields(Patient patient) {
		DecimalFormat formatter = new DecimalFormat("###.##");
		patientNameText.setText(patient.getName());
		medRecText.setText(patient.getMedRecNum());
		birthdateText.setText(patient.getBirthdateString());
		weightText.setText(formatter.format(patient.getWeight()));
		heightText.setText(formatter.format(patient.getHeight()));
		selectPatientButton.setText("Change Active Patient");
	}

	public void initPatientFields() {
		patientNameText.setText("Select a patient");
		medRecText.setText("");
		birthdateText.setText("");
		weightText.setText("");
		heightText.setText("");
		selectPatientButton.setText("Select Active Patient");
	}

	private void setupWeight(final Composite composite) {
		final CLabel weightLabel = new CLabel(composite, SWT.NONE);
		weightLabel.setAlignment(SWT.RIGHT);
		weightLabel.setBounds(x, y + height * 4, width, height);
		weightLabel.setText("Weight (kg):");

		weightText = new CLabel(composite, SWT.NONE);
		weightText.setAlignment(SWT.LEFT);
		weightText.setText("");
		weightText.setBounds(x + width, y + height * 4, width, height);
	}

	private void setupHeight(final Composite composite) {
		final CLabel heightLabel = new CLabel(composite, SWT.NONE);
		heightLabel.setAlignment(SWT.RIGHT);
		heightLabel.setBounds(x, y + height * 3, width, height);
		heightLabel.setText("Height (cm):");

		heightText = new CLabel(composite, SWT.NONE);
		heightText.setAlignment(SWT.LEFT);
		heightText.setText("");
		heightText.setBounds(x + width, y + height * 3, width, height);
	}

	private void setupBirthdate(final Composite composite) {
		final CLabel birthdateLabel = new CLabel(composite, SWT.NONE);
		birthdateLabel.setAlignment(SWT.RIGHT);
		birthdateLabel.setBounds(x, y + height * 2, width, height);
		birthdateLabel.setText("Date of Birth:");

		birthdateText = new CLabel(composite, SWT.NONE);
		birthdateText.setAlignment(SWT.LEFT);
		birthdateText.setText("");
		birthdateText.setBounds(130, 60, 142, 25);
	}

	private void setupMedicalRecNumber(final Composite composite) {
		final CLabel medRecLabel = new CLabel(composite, SWT.NONE);
		medRecLabel.setAlignment(SWT.RIGHT);
		medRecLabel.setBounds(x, y + height, width, height);
		medRecLabel.setText("Medical Record:");

		medRecText = new CLabel(composite, SWT.NONE);
		medRecText.setAlignment(SWT.LEFT);
		medRecText.setText("");
		medRecText.setBounds(x + width, y + height, width, height);
	}

	private void setupPatientName(final Composite composite) {
		FontRegistry fontRegistry = new FontRegistry();
		fontRegistry.put("patientname", new FontData[] { new FontData("Lucida Grande", 18, SWT.NORMAL) });

		patientNameText = new CLabel(composite, SWT.NONE);
		patientNameText.setAlignment(SWT.CENTER);
		patientNameText.setText("Select a patient");
		patientNameText.setFont(fontRegistry.get("patientname"));
		patientNameText.setBounds(x, y, width * 2, height);
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
		selectPatientButton.setFocus();
	}

}
