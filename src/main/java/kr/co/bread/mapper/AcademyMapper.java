package kr.co.bread.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import kr.co.bread.dto.AcademyDTO;

@Mapper
public interface AcademyMapper {

	@Insert("insert into academy(no,location,name,content,process,teacher,score,writedate) values(s_academy.nextval, #{dto.location}, #{dto.name}, #{dto.content}, #{dto.process},#{dto.teacher},#{dto.score},sysdate) ")
	int insert(@Param("dto") AcademyDTO dto);
	
	@Select("select * from academy")
	List<AcademyDTO> getAll();
	
	@Select("select * from academy where no=#{param1}")
	AcademyDTO getOne(int no);
}
