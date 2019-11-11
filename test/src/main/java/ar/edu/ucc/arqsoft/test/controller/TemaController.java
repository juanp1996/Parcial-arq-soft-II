package ar.edu.ucc.arqsoft.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.edu.ucc.arqsoft.test.dto.TemaDto;
import ar.edu.ucc.arqsoft.test.service.TemaService;

@Controller
public class TemaController {

	@Autowired
	TemaService temaService;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/api/tema", method = RequestMethod.POST, 
	produces = "application/json")
	public ResponseEntity<?> addTema(@RequestBody TemaDto dto) throws Exception {
	
		temaService.addTema(dto);
		return new ResponseEntity(dto, HttpStatus.CREATED);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/api/tema/{id}", method = RequestMethod.GET, 
	produces = "application/json")
	public ResponseEntity<?> getTema(@PathVariable("id") Long id) throws Exception {
	
		TemaDto dto = temaService.getTemaById(id);
		return new ResponseEntity(dto, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/api/tema/all", method = RequestMethod.GET, 
	produces = "application/json")
	public ResponseEntity<?> getTemas() throws Exception {
	
		List<TemaDto> dtos = temaService.getAll();
		return new ResponseEntity(dtos, HttpStatus.OK);
	}
	
}
