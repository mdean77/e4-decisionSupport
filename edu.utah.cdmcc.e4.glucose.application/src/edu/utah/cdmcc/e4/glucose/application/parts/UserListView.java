package edu.utah.cdmcc.e4.glucose.application.parts;

import javax.inject.Inject;
import org.eclipse.swt.widgets.Composite;
import core.filters.FilterFactory;
import core.filters.FilterType;

public class UserListView extends IntensiveCareUnitListView{
	
	@Inject
	UserListView(Composite parent){
		super(parent);
		viewer.addFilter(new FilterFactory().create(FilterType.USER));
	}
}
