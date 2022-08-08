package com.contreras.ydw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_words")
public class Word {

	@Id
	@Column(name = "id_word")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idWord;

	@Column(name = "words_eng")
	private String wordsEng;

	@Column(name = "words_esp")
	private String wordsEsp;

	public int getIdWord() {
		return idWord;
	}

	public void setIdWord(int idWord) {
		this.idWord = idWord;
	}

	public String getWordsEng() {
		return wordsEng;
	}

	public void setWordsEng(String wordsEng) {
		this.wordsEng = wordsEng;
	}

	public String getWordsEsp() {
		return wordsEsp;
	}

	public void setWordsEsp(String wordsEsp) {
		this.wordsEsp = wordsEsp;
	}

	public Word(int idWord, String wordsEng, String wordsEsp) {
		super();
		this.idWord = idWord;
		this.wordsEng = wordsEng;
		this.wordsEsp = wordsEsp;
	}

	public Word() {
		super();
	}

}
