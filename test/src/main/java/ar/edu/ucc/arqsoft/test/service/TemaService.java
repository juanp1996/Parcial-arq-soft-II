package ar.edu.ucc.arqsoft.test.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.ucc.arqsoft.test.dao.DaoGenerico;
import ar.edu.ucc.arqsoft.test.dto.TemaDto;
import ar.edu.ucc.arqsoft.test.model.Tema;

@Service
@Transactional
public class TemaService {

	@Autowired
	DaoGenerico<Tema, Long> temaDao;
	
	public void addTema(TemaDto dto){
		
		Tema tema = new Tema();
		
		tema.setTitulo(dto.getTitulo());
		tema.setDescripcion(dto.getDescripcion());
		tema.setClase(dto.getClase());
		
		temaDao.saveOrUpdate(tema);
		
		dto.setId(tema.getId());
	}
	

	public TemaDto getTemaById(Long id) {
		
		Tema tema = temaDao.load(id);
		
		TemaDto dto = new TemaDto();
		
		dto.setId(tema.getId());
		dto.setTitulo(tema.getTitulo());
		dto.setDescripcion(tema.getDescripcion());
		dto.setClase(tema.getClase());
		
		return dto;
	}
	
	public List<TemaDto> getAll(){
		
		List<Tema> temas;
		temas = temaDao.getAll();
		
		List<TemaDto> temaDtos = new ArrayList<TemaDto>();
		
		for (Tema tema : temas){
			temaDtos.add(new TemaDto(tema.getId(), tema.getTitulo(), tema.getDescripcion(), tema.getClase()));
		}
		
		return temaDtos;
	}
	
}
