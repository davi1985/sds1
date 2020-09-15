package com.devsuperior.devpesquisa.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.devpesquisa.dto.RecordDTO;
import com.devsuperior.devpesquisa.dto.RecordInsetDTO;
import com.devsuperior.devpesquisa.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordResource {

	@Autowired
	private RecordService service;

	@PostMapping
	public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsetDTO dto) {
		RecordDTO newDto = service.insert(dto);
		return ResponseEntity.ok().body(newDto);
	}
}
