package kr.co.bread.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kr.co.bread.dto.MemberDTO;

@Mapper
public interface MemberMapper {

	@Insert("insert into member(mno,id,pw,name,phone,birth,gender,zipcode,addr,addr_detail,email,mtype,writedate) "+
			" values (s_member.nextval,#{dto.id,jdbcType=VARCHAR},#{dto.pw,jdbcType=VARCHAR},#{dto.name,jdbcType=VARCHAR},"+
			" #{dto.phone,jdbcType=VARCHAR},#{dto.birth,jdbcType=VARCHAR},#{dto.gender,jdbcType=VARCHAR},#{dto.zipcode,jdbcType=VARCHAR},#{dto.addr,jdbcType=VARCHAR}," +
			" #{dto.addr_detail,jdbcType=VARCHAR},#{dto.email,jdbcType=VARCHAR},#{dto.mtype,jdbcType=VARCHAR},sysdate)")
	int join(@Param("dto") MemberDTO dto);
}
