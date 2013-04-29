package edu.utah.cdmcc.e4.glucose.application.parts;

import javax.inject.Inject;
import javax.inject.Named;
import glucose.IntensiveCareUnitService;
import glucose.Patient;
import glucose.provider.GlucoseItemProviderAdapterFactory;

import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.dialogs.SelectionDialog;

public class PatientListSelectionPart extends SelectionDialog {

	private TableViewer viewer;

	@Inject IntensiveCareUnitService service;
	@Inject ESelectionService selectionService;
	
	@Inject
	public PatientListSelectionPart(@Named(IServiceConstants.ACTIVE_SHELL) Shell parentShell) {
		super(parentShell);
	}

	public TableViewer getTableViewer() {
		return viewer;
	}

	@Override @Inject
	protected Control createDialogArea(final Composite parent) {
		Table table = new PatientTable(parent).getTable();
		viewer = new TableViewer(table);
		AdapterFactory adapterFactory = new GlucoseItemProviderAdapterFactory();
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		
//		viewer = new TableViewer(table);
//		viewer.setLabelProvider(new PatientSelectLabelProvider());
//		viewer.setContentProvider(new PatientContentProvider());
//		viewer.setInput(ApplicationControllers.getPatientController().getPatients());
		viewer.setInput(service.getRootGroup());
		viewer.addFilter(new PatientFilter());
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				okPressed();
			}
		});
		//getShell().setText("Select the Active Patient");
		return parent;
	}

	@Override
	protected org.eclipse.swt.widgets.Label createMessageArea(Composite composite) {
		return null;};	

	protected void okPressed() {
		//System.out.println("In okPressed routine of active patient selection wizard");
		IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
		setResult(selection.toList());
		//selectionService.setSelection(selection);
		super.okPressed();
	}

	@Override
	protected Point getInitialSize() {
		return new Point(560, 410);
	}
//	protected void configureShell(Shell newShell) {
//		super.configureShell(newShell);
//		newShell.setText("Select the Active Patient");
//	}
	
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
