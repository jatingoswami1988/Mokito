package com.mockito.Mockito;



import lombok.Builder;
import lombok.Getter;

//@Data
//@JsonDeserialize(builder = Widget.Builder.class)
//@Builder(builderClassName = "EmployeeBuilder", toBuilder = true)
@Getter
@Builder(toBuilder = true)
public class Widget {

	private String name;
	private int id;
	
   /*
	 * @JsonPOJOBuilder(withPrefix = "") public static class Builder { }
	 */

}
