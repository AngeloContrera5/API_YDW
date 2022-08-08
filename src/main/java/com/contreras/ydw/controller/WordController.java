package com.contreras.ydw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.contreras.ydw.entity.Word;
import com.contreras.ydw.repository.WordRepository;
import com.contreras.ydw.service.WordService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class WordController {

	@Autowired
	private WordRepository repository;

	@Autowired
	private WordService service;

	@GetMapping("/words")
	public List<Word> listAllWords() {
		return repository.findAll();
	}

	@GetMapping("/word/{id}")
	@ResponseBody
	public ResponseEntity<List<Word>> listaWordsxId(@PathVariable("id") int id) {
		return ResponseEntity.ok(service.listaWordsxId(id));
	}

	@GetMapping("/words/1")
	@ResponseBody
	public ResponseEntity<List<Word>> listaWordsGroup1() {
		return ResponseEntity.ok(service.listaWordsGroup1());
	}

	@GetMapping("/words/2")
	@ResponseBody
	public ResponseEntity<List<Word>> listaWordsGroup2() {
		return ResponseEntity.ok(service.listaWordsGroup2());
	}

	@GetMapping("/words/3")
	@ResponseBody
	public ResponseEntity<List<Word>> listaWordsGroup3() {
		return ResponseEntity.ok(service.listaWordsGroup3());
	}

	@GetMapping("/words/4")
	@ResponseBody
	public ResponseEntity<List<Word>> listaWordsGroup4() {
		return ResponseEntity.ok(service.listaWordsGroup4());
	}

	@GetMapping("/words/5")
	@ResponseBody
	public ResponseEntity<List<Word>> listaWordsGroup5() {
		return ResponseEntity.ok(service.listaWordsGroup5());
	}

	@GetMapping("/words/6")
	@ResponseBody
	public ResponseEntity<List<Word>> listaWordsGroup6() {
		return ResponseEntity.ok(service.listaWordsGroup6());
	}

	@GetMapping("/words/7")
	@ResponseBody
	public ResponseEntity<List<Word>> listaWordsGroup7() {
		return ResponseEntity.ok(service.listaWordsGroup7());
	}

	@GetMapping("/words/8")
	@ResponseBody
	public ResponseEntity<List<Word>> listaWordsGroup8() {
		return ResponseEntity.ok(service.listaWordsGroup8());
	}

	@GetMapping("/words/9")
	@ResponseBody
	public ResponseEntity<List<Word>> listaWordsGroup9() {
		return ResponseEntity.ok(service.listaWordsGroup9());
	}

	@GetMapping("/words/10")
	@ResponseBody
	public ResponseEntity<List<Word>> listaWordsGroup10() {
		return ResponseEntity.ok(service.listaWordsGroup10());
	}
}
