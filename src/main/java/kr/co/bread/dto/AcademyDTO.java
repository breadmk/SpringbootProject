package kr.co.bread.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcademyDTO {
	
	private int no,score;
	private String location, name, content, process, writedate,teacher,pwd;
	
	
}
