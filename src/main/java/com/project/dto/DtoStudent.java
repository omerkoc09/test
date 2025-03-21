package com.project.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudent {
	
	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	private List<DtoCommunity> communities = new ArrayList<>();
}
