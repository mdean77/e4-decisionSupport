package core.filters;

import glucose.Patient;
import glucose.User;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public final class FilterFactory {
	public ViewerFilter create(int filterType) {
		switch (filterType) {
		case FilterType.PATIENT:
			return new PatientFilter();
		case FilterType.USER:
			return new UserFilter();
		default:
			throw new IllegalArgumentException("The filter type  '" + filterType + "' is not a valid filter type");
		}
	}

	private class UserFilter extends ViewerFilter {
		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			return (element instanceof User || parentElement instanceof User);
		}
	}

	private class PatientFilter extends ViewerFilter {
		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			return (element instanceof Patient || parentElement instanceof Patient);
		}
	}
}
