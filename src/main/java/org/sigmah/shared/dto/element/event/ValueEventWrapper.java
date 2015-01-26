package org.sigmah.shared.dto.element.event;

import java.io.Serializable;

import org.sigmah.shared.dto.element.FlexibleElementDTO;
import org.sigmah.shared.dto.referential.ValueEventChangeType;
import org.sigmah.shared.dto.value.TripletValueDTO;

/**
 * @author Denis Colliot (dcolliot@ideia.fr)
 */
public class ValueEventWrapper implements Serializable {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 8800087226429558970L;

	private FlexibleElementDTO sourceElement;
	private TripletValueDTO listValue;
	private String singleValue;
	private ValueEventChangeType changeType;
	private boolean isProjectCountryChanged;

	/**
	 * @return the isProjectCountryChanged
	 */
	public boolean isProjectCountryChanged() {
		return isProjectCountryChanged;
	}

	/**
	 * @param isProjectCountryChanged
	 *          the isProjectCountryChanged to set
	 */
	public void setProjectCountryChanged(boolean isProjectCountryChanged) {
		this.isProjectCountryChanged = isProjectCountryChanged;
	}

	public ValueEventWrapper() {
	}

	public FlexibleElementDTO getSourceElement() {
		return sourceElement;
	}

	public void setSourceElement(FlexibleElementDTO sourceElement) {
		this.sourceElement = sourceElement;
	}

	public ValueEventChangeType getChangeType() {
		return changeType;
	}

	public void setChangeType(ValueEventChangeType changeType) {
		this.changeType = changeType;
	}

	public TripletValueDTO getListValue() {
		return listValue;
	}

	public void setListValue(TripletValueDTO listValue) {
		this.listValue = listValue;
	}

	public String getSingleValue() {
		return singleValue;
	}

	public void setSingleValue(String singleValue) {
		this.singleValue = singleValue;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((changeType == null) ? 0 : changeType.hashCode());
		result = prime * result + ((listValue == null) ? 0 : listValue.hashCode());
		result = prime * result + ((singleValue == null) ? 0 : singleValue.hashCode());
		result = prime * result + ((sourceElement == null) ? 0 : sourceElement.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ValueEventWrapper other = (ValueEventWrapper) obj;
		if (changeType != other.changeType)
			return false;
		if (listValue == null) {
			if (other.listValue != null)
				return false;
		} else if (!listValue.equals(other.listValue))
			return false;
		if (singleValue == null) {
			if (other.singleValue != null)
				return false;
		} else if (!singleValue.equals(other.singleValue))
			return false;
		if (sourceElement == null) {
			if (other.sourceElement != null)
				return false;
		} else if (!sourceElement.equals(other.sourceElement))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ValueEventWrapper [sourceElement="
			+ sourceElement
			+ ", listValue="
			+ listValue
			+ ", singleValue="
			+ singleValue
			+ ", changeType="
			+ changeType
			+ ", isProjectCountryChanged="
			+ isProjectCountryChanged
			+ "]";
	}

}
