package com.etoak.classroom;

import org.springframework.beans.factory.annotation.Autowired;

import com.etoak.JayZhou;

public class Classroom {
	@Autowired
	JayZhou jayZhou;
	
	public void teach(){
		jayZhou.teach();
	}
}
