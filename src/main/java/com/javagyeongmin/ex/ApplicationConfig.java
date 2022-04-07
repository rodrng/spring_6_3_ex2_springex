package com.javagyeongmin.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:applicationCTX.xml")
public class ApplicationConfig {
	
	@Bean
	public Student student1() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("����");
		hobbys.add("�޸���");
		hobbys.add("�뷡");
		
		Student student = new Student("ȫ�浿", "30��", hobbys);
		
		student.setHeight(180);
		student.setWeight(90);
		
		return student;
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("Ȱ���");
		hobbys.add("��Ÿ��");
		hobbys.add("�ϱ⾲��");
		
		Student student = new Student("�̼���", "50��", hobbys);
		
		student.setHeight(170);
		student.setWeight(80);
		
		return student;
		
	}
	
	
}