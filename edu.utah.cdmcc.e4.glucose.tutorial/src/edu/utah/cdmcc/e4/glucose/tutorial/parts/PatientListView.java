package edu.utah.cdmcc.e4.glucose.tutorial.parts;


import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import edu.utah.cdmcc.glucose.tutorial.services.IntensiveCareUnitService;
import glucose.provider.GlucoseItemProviderAdapterFactory;

public class PatientListView {

	TreeViewer viewer;
	
	@Inject IntensiveCareUnitService service;
	@Inject ESelectionService selectionService;
	
	@Inject
	PatientListView(Composite parent){
		viewer = new TreeViewer(parent);
		AdapterFactory adapterFactory = new GlucoseItemProviderAdapterFactory();
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));		
	}
	
	@PostConstruct
	void init(){
		viewer.setInput(service.getRootGroup());
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {		
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();
				if (selection instanceof IStructuredSelection){
					selectionService.setSelection(((IStructuredSelection) selection).getFirstElement());
				}			
			}
		});
	}
}
