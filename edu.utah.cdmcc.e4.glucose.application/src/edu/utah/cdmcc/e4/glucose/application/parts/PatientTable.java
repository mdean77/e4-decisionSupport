package edu.utah.cdmcc.e4.glucose.application.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class PatientTable {
	private Table table;
	
	@Inject
	public PatientTable(Composite parent){
		table = new Table(parent,SWT.FULL_SELECTION);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		
		TableColumn studyIDColumn = new TableColumn(table, SWT.None);
		studyIDColumn.setText("Study ID");
		studyIDColumn.setWidth(150);
		studyIDColumn.setResizable(true);
		
		TableColumn nameColumn = new TableColumn(table, SWT.None);
		nameColumn.setText("Patient Name");
		nameColumn.setWidth(150);
		nameColumn.setResizable(true);
		
		TableColumn medRecColumn = new TableColumn(table, SWT.NONE);
		medRecColumn.setWidth(150);
		medRecColumn.setText("Medical Record Number");
		
		TableColumn birthdateColumn = new TableColumn(table, SWT.NONE);
		birthdateColumn.setWidth(150);
		birthdateColumn.setText("Birthdate");		
		
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		table.setFont(parent.getFont());
	}
	
	public Table getTable() {
		return table;
	}
	
}
