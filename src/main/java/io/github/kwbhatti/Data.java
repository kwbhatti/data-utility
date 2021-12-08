package io.github.kwbhatti;

import io.github.kwbhatti.compare.Compare;
import io.github.kwbhatti.convert.*;

public class Data {
	
	private Object value = null;
	private Object compareValue = null;

	public Data(Object value) {
		this.value = value;
	}
	
	public Compare compare(Object value) {
		this.compareValue = value;
		return new Compare(this.value, this.compareValue);
	}
	
	public ConvertInterface convert() {
		if (value instanceof String) return new ConvertString((String) value);
		else if (value instanceof Boolean) return new ConvertBoolean((boolean) value);
		else if (value instanceof Double) return new ConvertDouble((double) value);
		else if (value instanceof Float) return new ConvertFloat((float) value);
		else if (value instanceof Integer) return new ConvertInteger((int) value);
		else if (value instanceof Long) return new ConvertLong((long) value);
		else if (value instanceof Short) return new ConvertShort((short) value);
		return null;
	}
		
	public static void main(String[] args) {
		System.out.println(new Data(2.2).compare("2.2").withoutDataType());
		new Data(498).convert().toString();
		boolean g = true;
		System.out.println(new Data(g).convert().toString());
		String valStr = null;
		String value = null;
		System.out.println(new Data(valStr).compare(value).withDataType());
	}
}