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

import ar.edu.ucc.arqsoft.test.dto.ClaseDto;
import ar.edu.ucc.arqsoft.test.service.ClaseService;

@Controller
public class ClaseController {

	@Autowired
	ClaseService claseService;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/api/clase", method = RequestMethod.POST, 
	produces = "application/json")
	public ResponseEntity<?> addClase(@RequestBody ClaseDto dto) throws Exception {
	
		claseService.addClase(dto);
		return new ResponseEntity(dto, HttpStatus.CREATED);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/api/clase/{id}", method = RequestMethod.GET, 
	produces = "application/json")
	public ResponseEntity<?> getClase(@PathVariable("id") Long id) throws Exception {
	
		ClaseDto dto = claseService.getClaseById(id);
		return new ResponseEntity(dto, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/api/clase/all", method = RequestMethod.GET, 
	produces = "application/json")
	public ResponseEntity<?> getClases() throws Exception {
	
		List<ClaseDto> dtos = claseService.getAll();
		return new ResponseEntity(dtos, HttpStatus.OK);
	}
	
}
