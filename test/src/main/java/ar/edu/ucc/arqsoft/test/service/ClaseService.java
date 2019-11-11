package ar.edu.ucc.arqsoft.test.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.ucc.arqsoft.test.dao.DaoGenerico;
import ar.edu.ucc.arqsoft.test.dto.ClaseDto;
import ar.edu.ucc.arqsoft.test.model.Clase;

@Service
@Transactional
public class ClaseService {
	
	@Autowired
	DaoGenerico<Clase, Long> claseDao;
	
	public void addClase(ClaseDto dto){
		
		Clase clase = new Clase();
		
		
		clase.setFecha(dto.getFecha());
		clase.setProfesor(dto.getProfesor());
		clase.setTemas(dto.getTemas());
		
		claseDao.saveOrUpdate(clase);
		
		dto.setId(clase.getId());
	}
	

	public ClaseDto getClaseById(Long id) {
		
		Clase clase = claseDao.load(id);
		
		ClaseDto dto = new ClaseDto();
		
		dto.setId(clase.getId());
		dto.setFecha(clase.getFecha());
		dto.setProfesor(clase.getProfesor());
		dto.setTemas(clase.getTemas());
		
		return dto;
	}
	
	public List<ClaseDto> getAll(){
		
		List<Clase> clases;
		clases = claseDao.getAll();
		
		List<ClaseDto> claseDtos = new ArrayList<ClaseDto>();
		
		for (Clase clase : clases){
			claseDtos.add(new ClaseDto(clase.getId(), clase.getFecha(), clase.getProfesor(), clase.getTemas()));
		}
		
		return claseDtos;
	}
	
}
