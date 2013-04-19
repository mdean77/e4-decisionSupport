package edu.utah.cdmcc.e4.glucose.tutorial.parts;

import glucose.IntensiveCareUnitService;
import glucose.User;
import javax.inject.Inject;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Composite;

public class UserListView extends IntensiveCareUnitListView{
	@Inject IntensiveCareUnitService service;
	@Inject ESelectionService selectionService;
	
	@Inject
	UserListView(Composite parent){
		super(parent);
		viewer.addFilter(new UserFilter());
	}
	
	private class UserFilter extends ViewerFilter {
		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			if(element instanceof User || parentElement instanceof User) {
				return true; 
			}
			return false;
		}		
	}
}
