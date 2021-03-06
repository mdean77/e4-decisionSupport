package edu.utah.cdmcc.e4.glucose.tutorial.parts;

import glucose.IntensiveCareUnitService;
import glucose.Patient;
import javax.inject.Inject;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Composite;

public class PatientListView extends IntensiveCareUnitListView{
	
	@Inject IntensiveCareUnitService service;
	@Inject ESelectionService selectionService;
	
	@Inject
	PatientListView(Composite parent){
		super(parent);
		viewer.addFilter(new PatientFilter());
	}
	
	private class PatientFilter extends ViewerFilter {
		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			if(element instanceof Patient || parentElement instanceof Patient) {
				return true; 
			}
			return false;
		}		
	}
}
