package kr.co.bread.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.co.bread.dto.AcademyDTO;

@Mapper
public interface AcademyMapper {

	@Insert("insert into academy(no,location,name,content,process,teacher,score,writedate,pwd) values(s_academy.nextval, #{dto.location}, #{dto.name}, #{dto.content}, #{dto.process},#{dto.teacher},#{dto.score},sysdate,#{dto.pwd}) ")
	int insert(@Param("dto") AcademyDTO dto);
	
	@Select("select * from academy order by no desc")
	List<AcademyDTO> getAll();
	
	@Select("select * from academy where no=#{param1}")
	AcademyDTO getOne(int no);
	
	@Update("update academy set location=#{dto.location},name=#{dto.name},content=#{dto.content}," +
			" process=#{dto.process},teacher=#{dto.teacher},score=#{dto.score} where no=#{dto.no}")
	int update(@Param("dto") AcademyDTO dto);
	
	@Select("select pwd from academy where no=#{param1}")
	String getPwd(int no);
	
	@Delete("delete from academy where no=#{param1}")
	int delete(int no);
}
