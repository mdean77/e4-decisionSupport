package edu.utah.cdmcc.e4.glucose.application.parts;

import glucose.IntensiveCareUnit;

import javax.annotation.PostConstruct;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;


public class PatientListPart {
	
	private TableViewer tableViewer;
	
	@PostConstruct
	public void createComposite(Composite parent, IntensiveCareUnit icu){
		Table table = new PatientTable(parent).getTable();
		
	}

}
