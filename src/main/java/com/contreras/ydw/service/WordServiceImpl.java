package com.contreras.ydw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contreras.ydw.entity.Word;
import com.contreras.ydw.repository.WordRepository;

@Service
public class WordServiceImpl implements WordService {

	@Autowired
	private WordRepository repository;

	@Override
	public List<Word> listaWordsGroup1() {
		return repository.listaWordsGroup1();
	}

	@Override
	public List<Word> listaWordsGroup2() {
		return repository.listaWordsGroup2();
	}

	@Override
	public List<Word> listaWordsGroup3() {
		return repository.listaWordsGroup3();
	}

	@Override
	public List<Word> listaWordsGroup4() {
		return repository.listaWordsGroup4();
	}

	@Override
	public List<Word> listaWordsGroup5() {
		return repository.listaWordsGroup5();
	}

	@Override
	public List<Word> listaWordsGroup6() {
		return repository.listaWordsGroup6();
	}

	@Override
	public List<Word> listaWordsGroup7() {
		return repository.listaWordsGroup7();
	}

	@Override
	public List<Word> listaWordsGroup8() {
		return repository.listaWordsGroup8();
	}

	@Override
	public List<Word> listaWordsGroup9() {
		return repository.listaWordsGroup9();
	}

	@Override
	public List<Word> listaWordsGroup10() {
		return repository.listaWordsGroup10();
	}

	@Override
	public List<Word> listaWordsxId(int idWord) {
		return repository.listaWordsxId(idWord);
	}

}
