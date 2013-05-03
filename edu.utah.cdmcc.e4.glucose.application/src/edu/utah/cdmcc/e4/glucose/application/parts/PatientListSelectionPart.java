package edu.utah.cdmcc.e4.glucose.application.parts;

import glucose.IntensiveCareUnitService;
import glucose.provider.GlucoseItemProviderAdapterFactory;
import javax.inject.Inject;
import javax.inject.Named;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.dialogs.SelectionDialog;
import core.filters.FilterFactory;
import core.filters.FilterType;

public class PatientListSelectionPart extends SelectionDialog {

	private TableViewer viewer;

	@Inject IntensiveCareUnitService service;
	@Inject ESelectionService selectionService;

	@Inject
	public PatientListSelectionPart(@Named(IServiceConstants.ACTIVE_SHELL) Shell parentShell) {
		super(parentShell);
		setTitle("Select the Active Patient");
	}

	public TableViewer getTableViewer() {
		return viewer;
	}

	@Override
	@Inject
	protected Control createDialogArea(final Composite parent) {
		Table table = new PatientTable(parent).getTable();
		viewer = new TableViewer(table);
		AdapterFactory adapterFactory = new GlucoseItemProviderAdapterFactory();
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		viewer.setInput(service.getRootGroup());
		viewer.addFilter(new FilterFactory().create(FilterType.PATIENT));
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				okPressed();
			}
		});
		return parent;
	}

	protected void okPressed() {
		IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
		setResult(selection.toList());
		super.okPressed();
	}

	@Override
	protected Point getInitialSize() {
		return new Point(560, 410);
	}
}
