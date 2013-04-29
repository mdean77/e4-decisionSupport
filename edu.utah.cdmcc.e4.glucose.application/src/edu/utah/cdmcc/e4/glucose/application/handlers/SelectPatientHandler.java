 
package edu.utah.cdmcc.e4.glucose.application.handlers;

import javax.inject.Inject;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.ui.dialogs.SelectionDialog;
import edu.utah.cdmcc.e4.glucose.application.parts.PatientListSelectionPart;
import glucose.Patient;

public class SelectPatientHandler {
	
	@Inject ESelectionService selectionService;
	
	@Execute
	public void execute(IEclipseContext context) {
		PatientListSelectionPart dialog = ContextInjectionFactory.make(PatientListSelectionPart.class, context);
		if(dialog.open() == SelectionDialog.OK){
			Object selection[] = dialog.getResult();

			if (selection.length > 0) {
				selectionService.setSelection((Patient) selection[0]);
			}
		}
	}

}

//public class ExitHandlerWithCheck {
//	@Execute
//	public void execute(IEclipseContext context, IWorkbench workbench) {
//		ExitDialog dialog = ContextInjectionFactory.make(ExitDialog.class, context);
//		dialog.create();
//		if (dialog.open() == Window.OK) {
//			workbench.close();
//		}
//	}
//}