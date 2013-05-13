package edu.utah.cdmcc.e4.glucose.tutorial.parts;

import glucose.IntensiveCareUnitService;
import glucose.provider.GlucoseItemProviderAdapterFactory;
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

/**
 * Basic treeviewer to show elements of intensive care unit hierarchy,
 * consisting of Users and Patients, as well as the children of either
 * object.
 * 
 * This class is intended to be extended with appropriate filters to
 * create patient and user viewers.
 * 
 * @author J. Michael Dean, MD
 *
 */
public class IntensiveCareUnitListView {
	TreeViewer viewer;
	
	@Inject IntensiveCareUnitService service;
	@Inject ESelectionService selectionService;
	
	@Inject
	IntensiveCareUnitListView(Composite parent){
		viewer = new TreeViewer(parent);
		AdapterFactory adapterFactory = new GlucoseItemProviderAdapterFactory();
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
	}
	
	@PostConstruct
	void init(){
		viewer.setInput(service.getIntensiveCareUnit());
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {		
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();
				if (selection instanceof IStructuredSelection){
					selectionService.setSelection(((IStructuredSelection) selection).getFirstElement());
					System.out.println(((IStructuredSelection) selection).getFirstElement().toString());
				}			
			}
		});
	}
}
