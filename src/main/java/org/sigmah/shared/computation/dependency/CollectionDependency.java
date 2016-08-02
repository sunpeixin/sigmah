package org.sigmah.shared.computation.dependency;

import org.sigmah.shared.dto.element.FlexibleElementDTO;

/**
 *
 * @author Raphaël Calabro (raphael.calabro@netapsys.fr)
 */
public class CollectionDependency implements Dependency {
	
	private Scope scope;
	private FlexibleElementDTO flexibleElement;

	public CollectionDependency() {
	}

	public CollectionDependency(Scope scope, FlexibleElementDTO flexibleElement) {
		this.scope = scope;
		this.flexibleElement = flexibleElement;
	}

	@Override
	public String toHumanReadableString() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visitBy(DependencyVisitor visitor) {
		visitor.visit(this);
	}
}
