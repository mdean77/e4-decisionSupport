/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package edu.utah.cdmcc.e4.glucose.application.parts;

import glucose.Patient;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class SamplePart {

	private TableViewer tableViewer;

	@Inject EModelService modelService;
	@Inject MApplication application;

	@PostConstruct
	public void createComposite(Composite parent, @Optional Patient patient) {
		parent.setLayout(new GridLayout());

		tableViewer = new TableViewer(parent);
		tableViewer.add("Sample item 1");
		tableViewer.add("Sample item 2");
		tableViewer.add("Sample item 3");
		tableViewer.add("Sample item 4");
		tableViewer.add("Sample item 5");
		tableViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
	}

	@Inject
	@Optional
	public void updateLabels(Composite parent, @Named(IServiceConstants.ACTIVE_SELECTION) Patient patient) {
		MUIElement element = modelService.find("edu.utah.cdmcc.e4.glucose.application.decisionEditorPart", application);
		if (patient != null) {
			((MUILabel) element).setLabel("Patient Name: " + patient.getName());
		}
	}

	@Focus
	public void setFocus() {
		tableViewer.getTable().setFocus();
	}
}
