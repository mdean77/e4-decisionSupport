package laboratory.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import core.laboratory.object.BasicLaboratoryObject;
import core.laboratory.object.SingleValueLaboratoryObject;

public class TestExperimentalSingleValueClasses {

	@Test
	public void testBasicLaboratoryObjectConstructorFillsLabelAndAccountName(){
		BasicLaboratoryObject lab = new BasicLaboratoryObject();
		assertEquals("Single lab should be called unlabeled","unlabeled",lab.getLabelName());
		assertEquals("Unassigned account should be called unassigned","unassigned", lab.getAccountName());
	}
	@Test
	public void testSingleValueLabObjectConstructorWithoutParameters(){
		SingleValueLaboratoryObject lab = new SingleValueLaboratoryObject();
		assertEquals("Single lab should be called unlabeled","unlabeled",lab.getLabelName());
	}
	
	@Test
	public void testSingleValueLabObjectHasAccountValue(){
		SingleValueLaboratoryObject lab = new SingleValueLaboratoryObject();
		assertEquals("Unassigned account should be called unassigned","unassigned", lab.getAccountName());
	}
}
