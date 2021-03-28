package kr.co.bread.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
	
	public MemberDTO(int value, int i) {
		// TODO Auto-generated constructor stub
	}
	private int mno;
	private String id,pw,name,phone,birth,gender,zipcode,addr,addr_detail,email,mtype,writedate;

}
