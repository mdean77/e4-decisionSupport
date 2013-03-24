package laboratory.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.GregorianCalendar;
import org.junit.Test;

import core.laboratory.object.LaboratoryPanelComponent;
import core.laboratory.object.MultipleValueLaboratoryObject;


public class TestExperimentalMultiValueClasses {

	protected int oldRecordCOunt, newRecordCount;
	protected GregorianCalendar birthdate,labDate,secondLabDate;
	
	@Test
	public void testMultipleValueLabObjectHasLabelAndAccount(){
		MultipleValueLaboratoryObject lab = new MultipleValueLaboratoryObject();
		assertEquals("Multiple lab should be called unlabeled","unlabeled",lab.getLabelName());
		assertEquals("Unassigned account should be called unassigned","unassigned", lab.getAccountName());
	}
	
	@Test
	public void testMultipleValueLabObjectHasPanelComponentsSet(){
		MultipleValueLaboratoryObject lab = new MultipleValueLaboratoryObject();
		assertNotNull("panel components should not be null", lab.getComponents());
	}
	
	@Test
	public void testMultipleValueLabObjectHasPanelComponentsSetEmptyOnInit(){
		MultipleValueLaboratoryObject lab = new MultipleValueLaboratoryObject();
		assertNotNull("panel components should not be null", lab.getComponents());
		assertEquals("Initial components panel should be empty",0, lab.getComponents().size());
	}
	
	@Test
	public void testAddPanelComponentToMultipleLabObject(){
		MultipleValueLaboratoryObject lab = new MultipleValueLaboratoryObject();
		assertNotNull("panel components should not be null", lab.getComponents());
		assertEquals("Initial components panel should be empty",0, lab.getComponents().size());
		LaboratoryPanelComponent component = new LaboratoryPanelComponent();
		lab.addLaboratoryComponent(component);
		assertEquals("Components should now have one component",1, lab.getComponents().size());		
	}
	
	@Test
	public void testAddedPanelHasNonNullValues(){
		LaboratoryPanelComponent component = new LaboratoryPanelComponent();
		assertNotNull("Component loinc should not be null", component.getLoincCode());
		assertNotNull("Component label should not be null", component.getLabelName());
		assertNotNull("Component conventional units should not be null", component.getConventionalUnits());
		assertNotNull("Component conventional result should not be null", component.getConventionalTextResult());
	}

}
