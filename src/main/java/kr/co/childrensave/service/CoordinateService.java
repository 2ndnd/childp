package kr.co.childrensave.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.childrensave.dto.CoordinateDTO;

public interface CoordinateService {

	public List<CoordinateDTO> selectCoordinate(); 
	
	public List<CoordinateDTO> selectToggle(CoordinateDTO dto);
	
	public List<CoordinateDTO> selectToggleOverlay(CoordinateDTO dto);
}
