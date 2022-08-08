package com.contreras.ydw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.contreras.ydw.entity.Word;

@Repository
public interface WordRepository extends JpaRepository<Word, Integer> {

	@Query("select w from Word w where w.idWord <= 100")
	public abstract List<Word> listaWordsGroup1();

	@Query("select w from Word w where w.idWord >100 and w.idWord <= 200")
	public abstract List<Word> listaWordsGroup2();

	@Query("select w from Word w where w.idWord >200 and w.idWord <= 300")
	public abstract List<Word> listaWordsGroup3();

	@Query("select w from Word w where w.idWord >300 and w.idWord <= 400")
	public abstract List<Word> listaWordsGroup4();

	@Query("select w from Word w where w.idWord >400 and w.idWord <= 500")
	public abstract List<Word> listaWordsGroup5();

	@Query("select w from Word w where w.idWord >500 and w.idWord <= 600")
	public abstract List<Word> listaWordsGroup6();

	@Query("select w from Word w where w.idWord >600 and w.idWord <= 700")
	public abstract List<Word> listaWordsGroup7();

	@Query("select w from Word w where w.idWord >700 and w.idWord <= 800")
	public abstract List<Word> listaWordsGroup8();

	@Query("select w from Word w where w.idWord >800 and w.idWord <= 900")
	public abstract List<Word> listaWordsGroup9();

	@Query("select w from Word w where w.idWord >900 and w.idWord <= 1000")
	public abstract List<Word> listaWordsGroup10();

	@Query("select w from Word w where w.idWord = ?1")
	public abstract List<Word> listaWordsxId(int idWord);

}
