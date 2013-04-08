package edu.utah.cdmcc.e4.glucose.tutorial.parts;

import java.util.Calendar;
import java.util.GregorianCalendar;
import glucose.Patient;
import javax.inject.Inject;
import javax.inject.Named;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import core.field.validators.Verify;

public class PatientDetailView {
	
	@Inject MDirtyable part;
	
	Composite container;
	Patient patient;

	private Composite composite;
	private Text studyIDText;
	private Text firstNameText;
	private Text lastNameText;
	private DateTime birthdateWidget;
	private Text medrecnumText;
	private Text weightText;
	private Text heightText;
	
	@Inject
	public PatientDetailView(Composite parent){
		container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		Label lblStudyIdNumber = new Label(container, SWT.NONE);
		lblStudyIdNumber.setText("Study ID Number (automatic)");
		{
			composite = new Composite(container, SWT.NONE);
			composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 1, 1));
			composite.setLayout(new GridLayout(3, true));

			Label lblStudyIdNumber_1 = new Label(composite, SWT.RIGHT);
			lblStudyIdNumber_1.setLayoutData(new GridData(SWT.RIGHT,
					SWT.CENTER, false, false, 1, 1));
			lblStudyIdNumber_1.setAlignment(SWT.RIGHT);
			lblStudyIdNumber_1.setText("Study ID number:");

			studyIDText = new Text(composite, SWT.BORDER | SWT.READ_ONLY);
			studyIDText.setEnabled(false);
			studyIDText
					.setToolTipText("Study ID number (assigned automatically)");
			studyIDText.setEditable(false);
			studyIDText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));
		}
		{
			Label label1 = new Label(container, SWT.NONE);
			label1.setText("Enter the first name of the patient:");
		}
		{
			composite = new Composite(container, SWT.NONE);
			composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 1, 1));
			GridLayout compositeLayout = new GridLayout();
			compositeLayout.makeColumnsEqualWidth = true;
			compositeLayout.numColumns = 3;
			composite.setLayout(compositeLayout);
			{
				Label label3 = new Label(composite, SWT.NONE);
				GridData label3LData = new GridData();
				label3LData.horizontalAlignment = GridData.END;
				label3.setLayoutData(label3LData);
				label3.setText("First name:");
			}
			{
				GridData firstNameTextLData = new GridData();
				firstNameTextLData.grabExcessHorizontalSpace = true;
				firstNameTextLData.horizontalAlignment = GridData.FILL;
				firstNameTextLData.horizontalSpan = 2;
				firstNameText = new Text(composite, SWT.BORDER);
				firstNameText.setToolTipText("First name of the patient");
				firstNameText.setLayoutData(firstNameTextLData);
				firstNameText.addVerifyListener(new VerifyListener() {
					public void verifyText(VerifyEvent evt) {
						Verify.verifyLettersText(evt);
					}
				});
				firstNameText.addModifyListener(new ModifyListener() {
					@Override
					public void modifyText(ModifyEvent e) {
						setDirty(true);
					}
				});
			}
		}
		{
			Label label2 = new Label(container, SWT.NONE);
			label2.setText("Enter the last name of the patient:");
		}
		{
			composite = new Composite(container, SWT.NONE);
			composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 1, 1));
			GridLayout compositeLayout = new GridLayout();
			compositeLayout.numColumns = 3;
			compositeLayout.makeColumnsEqualWidth = true;
			composite.setLayout(compositeLayout);
			{
				Label label7 = new Label(composite, SWT.NONE);
				GridData label7LData = new GridData();
				label7LData.horizontalAlignment = GridData.END;
				label7.setLayoutData(label7LData);
				label7.setText("Last name:");
			}
			{
				GridData lastNameTextLData = new GridData();
				lastNameTextLData.horizontalAlignment = GridData.FILL;
				lastNameTextLData.grabExcessHorizontalSpace = true;
				lastNameTextLData.horizontalSpan = 2;
				lastNameText = new Text(composite, SWT.BORDER);
				lastNameText.setToolTipText("Last name of the patient");
				lastNameText.setLayoutData(lastNameTextLData);
				lastNameText.addVerifyListener(new VerifyListener() {
					public void verifyText(VerifyEvent evt) {
						Verify.verifyLettersText(evt);
					}
				});
				lastNameText.addModifyListener(new ModifyListener() {
					@Override
					public void modifyText(ModifyEvent e) {
						setDirty(true);
					}
				});
			}
		}
		{
			Label label = new Label(container, SWT.NONE);
			label.setText("Enter the date of birth of the patient (MM/DD/YYYY):");
		}
		{
			composite = new Composite(container, SWT.NONE);
			composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 1, 1));
			GridLayout compositeLayout = new GridLayout();
			compositeLayout.numColumns = 3;
			compositeLayout.makeColumnsEqualWidth = true;
			composite.setLayout(compositeLayout);
			{
				Label label8 = new Label(composite, SWT.NONE);
				GridData label8LData = new GridData();
				label8LData.horizontalAlignment = GridData.END;
				label8.setLayoutData(label8LData);
				label8.setText("Date of birth:");
			}
			{
				GridData birthdateWidgetLData = new GridData();
				birthdateWidgetLData.grabExcessHorizontalSpace = true;
				birthdateWidgetLData.horizontalAlignment = GridData.FILL;
				birthdateWidgetLData.horizontalSpan = 2;
				birthdateWidget = new DateTime(composite, SWT.DATE
						| SWT.BORDER);
				birthdateWidget.setToolTipText("Birthdate of patient");
				birthdateWidget.setLayoutData(birthdateWidgetLData);
			}
		}
		{
			Label label5 = new Label(container, SWT.NONE);
			label5.setText("Enter the medical record number of the patient:");
		}
		{
			composite = new Composite(container, SWT.NONE);
			composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 1, 1));
			GridLayout compositeLayout = new GridLayout();
			compositeLayout.numColumns = 3;
			compositeLayout.makeColumnsEqualWidth = true;
			composite.setLayout(compositeLayout);
			{
				Label label9 = new Label(composite, SWT.NONE);
				GridData label9LData = new GridData();
				label9LData.horizontalAlignment = GridData.END;
				label9.setLayoutData(label9LData);
				label9.setText("Medical record number:");
			}
			{
				GridData medrecnumTextLData = new GridData();
				medrecnumTextLData.grabExcessHorizontalSpace = true;
				medrecnumTextLData.horizontalAlignment = GridData.FILL;
				medrecnumTextLData.horizontalSpan = 2;
				medrecnumText = new Text(composite, SWT.BORDER);
				medrecnumText
						.setToolTipText("Medical record number of patient");
				medrecnumText.setLayoutData(medrecnumTextLData);
				{
					Label lblEnterTheWeight = new Label(container, SWT.NONE);
					lblEnterTheWeight.setLayoutData(new GridData(SWT.LEFT,
							SWT.TOP, false, false, 1, 1));
					lblEnterTheWeight
							.setText("Enter the weight of the patient (kilograms):");
				}
				{
					composite = new Composite(container, SWT.NONE);
					composite.setLayoutData(new GridData(SWT.FILL,
							SWT.CENTER, true, false, 1, 1));
					composite.setLayout(new GridLayout(3, true));
					{
						Label lblWeightkg = new Label(composite, SWT.NONE);
						lblWeightkg.setLayoutData(new GridData(SWT.RIGHT,
								SWT.CENTER, false, false, 1, 1));
						lblWeightkg.setText("Weight (kg)::");
					}
					{
						weightText = new Text(composite, SWT.BORDER);
						weightText
								.setToolTipText("Weight of the patient in kilograms");
						weightText.setLayoutData(new GridData(SWT.FILL,
								SWT.CENTER, true, false, 2, 1));
						weightText.addVerifyListener(new VerifyListener() {
							public void verifyText(VerifyEvent e) {
								Verify.verifyFloatText(e);
							}
						});
						weightText.addModifyListener(new ModifyListener() {
							@Override
							public void modifyText(ModifyEvent e) {
								setDirty(true);
							}
						});
					}
				}
				{
					Label lblEnterTheHeight = new Label(container, SWT.NONE);
					lblEnterTheHeight
							.setText("Enter the height of the patient (cm):");
				}
				{
					composite = new Composite(container, SWT.NONE);
					composite.setLayoutData(new GridData(SWT.FILL,
							SWT.CENTER, false, false, 1, 1));
					composite.setLayout(new GridLayout(3, true));
					{
						Label lblHeightcm = new Label(composite, SWT.NONE);
						lblHeightcm.setLayoutData(new GridData(SWT.RIGHT,
								SWT.CENTER, false, false, 1, 1));
						lblHeightcm.setText("Height (cm)::");
					}
					{
						heightText = new Text(composite, SWT.BORDER);
						heightText
								.setToolTipText("Weight of the patient in kilograms");
						heightText.setLayoutData(new GridData(SWT.FILL,
								SWT.CENTER, true, false, 2, 1));
						heightText.addVerifyListener(new VerifyListener() {
							public void verifyText(VerifyEvent e) {
								Verify.verifyFloatText(e);
							}
						});
						heightText.addModifyListener(new ModifyListener() {
							@Override
							public void modifyText(ModifyEvent e) {
								setDirty(true);
							}
						});
					}
				}
				medrecnumText.addVerifyListener(new VerifyListener() {
					public void verifyText(VerifyEvent evt) {
						String string = evt.text;
						char[] chars = new char[string.length()];
						string.getChars(0, chars.length, chars, 0);
						for (int i = 0; i < chars.length;) {
							if (!(Character.isDigit(chars[i]))
									&& !(chars[i] == '-'))
								evt.doit = false;
							return;
						}
					}
				});
				medrecnumText.addModifyListener(new ModifyListener() {
					@Override
					public void modifyText(ModifyEvent e) {
						setDirty(true);
					}
				});
			}
		}
	}
	
	private void setDirty(boolean newValue) {
		if (part != null)
			part.setDirty(newValue);
	}
	
	@Inject
	@Optional
	public void setInput(
			@Named(IServiceConstants.ACTIVE_SELECTION) Patient patient) {
		this.patient = patient;
		String newValue = (patient == null || patient.getStudyID() == null) ? ""
				: patient.getStudyID();
		studyIDText.setText(newValue);
		newValue = (patient == null || patient.getFirstName() == null) ? ""
				: patient.getFirstName();
		firstNameText.setText(newValue);
		newValue = (patient == null || patient.getLastName() == null) ? ""
				: patient.getLastName();
		lastNameText.setText(newValue);
		
		Calendar newCalendar = (patient == null || patient.getBirthdate() == null) ? null
				: patient.getBirthdate();
		if(newCalendar != null){
			birthdateWidget.setDate(newCalendar.get(Calendar.YEAR),
					newCalendar.get(Calendar.MONTH),
					newCalendar.get(Calendar.DAY_OF_MONTH));
		}
		newValue = (patient == null || patient.getMedRecNum() == null) ? ""
				: patient.getMedRecNum();
		medrecnumText.setText(newValue);
		Double newDouble = (patient == null || patient.getWeight() == null) ? null
				: patient.getWeight();
		if (newDouble != null) {
			weightText.setText(newDouble.toString());
		} else
			weightText.setText("");

		newDouble = (patient == null || patient.getHeight() == null) ? null
				: patient.getHeight();
		if (newDouble != null) {
			heightText.setText(newDouble.toString());
		} else
			heightText.setText("");

		setDirty(false);
	}
	
	public void setBirthdateWidget(final GregorianCalendar birthDate) {
		GregorianCalendar dateCopy = birthDate;
		this.birthdateWidget.setDate(dateCopy.get(GregorianCalendar.YEAR),
				dateCopy.get(GregorianCalendar.MONTH),
				dateCopy.get(GregorianCalendar.DAY_OF_MONTH));
	}
	
	@Persist
	public void save() {
		if (patient == null)
			return;
		patient.setLastName(lastNameText.getText());
		patient.setFirstName(firstNameText.getText());
		patient.setMedRecNum(medrecnumText.getText());
		//patient.setHeight(heightText);
		//patient.setWeight(weightText);
		setDirty(false);
	}
	@Focus
	public void setFocus() {
		studyIDText.setFocus();
	}
	
}
