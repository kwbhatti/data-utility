package io.github.kwbhatti;

/**
 * This class can compare two given values. 
 * If values are all that matter it can ignore the data type
 * and convert the two values to strings and compare the two strings.
 * @author tojala
 */
class Compare {
	
	private Object value1 = null;
	private Object value2 = null;
	
	public Compare(Object value1, Object value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	/**
	 * Checks if both values are null
	 * @return true / false
	 */
	private boolean areBothValuesNull() {
		return (value1 == null && value2 == null);
	}
	
	/**
	 * Checks if either value is null
	 * @return true / false
	 */
	private boolean isEitherValueNull() {
		return (value1 == null || value2 == null);
	}
	
	/**
	 * Checks if both values are of same data type (class)
	 * @return true / false
	 */
	private boolean areBothValuesOfSameDataType() {
		return (value1.getClass() == value2.getClass());
	}
	
	/**
	 * Converts both values to strings if they are not null
	 */
	private void convertValuesToString() {
		if (value1 != null) this.value1 = value1.toString();
		if (value2 != null) this.value2 = value2.toString();
	}
	
	/**
	 * Compares the values based on if the value types are the same. 
	 * if they are then it will compare the values.
	 * @return true / false
	 */
	boolean compareWithDataType() { 
		if (areBothValuesNull()) return true;
		else if (isEitherValueNull()) return false;
		else if (areBothValuesOfSameDataType()) return value1.equals(value2);
		else return false;
	}
	
	/**
	 * Converts the given values to strings. 
	 * It will then compare the values of the strings and return the result.
	 * @return true / false
	 */
	boolean compareWithoutDataType() {
		convertValuesToString();
		return compareWithDataType();
	}
}