package org.ab.admin.model;

import javax.validation.constraints.Size;

import org.ab.core.config.model.BaseModel;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class Department extends BaseModel {

	@NotBlank(message = "{code.required}")
	@Size(max=50, message="{code.max.size}")
	private String code;
	
	@NotBlank(message = "{name.required}")
	private String name;
}
