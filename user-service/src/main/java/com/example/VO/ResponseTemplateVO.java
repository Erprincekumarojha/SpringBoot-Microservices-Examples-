package com.example.VO;

import com.example.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseTemplateVO {

	private User user;
	private Department department;
}
