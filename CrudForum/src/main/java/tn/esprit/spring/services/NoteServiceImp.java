package tn.esprit.spring.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.entity.Note;

import tn.esprit.spring.repository.NoteRepository;

@Service
public class NoteServiceImp implements NoteService {
	@Autowired
	NoteRepository noteRepository;
	private static final Logger l =  LogManager.getLogger(NoteServiceImp.class);
	@Override	
public List<Note> retrieveAllNote(){
	List<Note> notes=(List<Note>) noteRepository.findAll();
	for(Note note : notes){
		l.info("note +++ :" + note);
		}
		return notes;
	}
	@Override
	public Note addNote(Note m){
		return noteRepository.save(m);
		}
	@Override
public void deleteNote(String id){
		noteRepository.deleteById(Long.parseLong(id));
		}
	public Note  retrieveNote(String id){
		return noteRepository.findById(Long.parseLong(id)).get();
	}
	@Override
	public Note updateNote(Note m){
		return noteRepository.save(m);
		}
}