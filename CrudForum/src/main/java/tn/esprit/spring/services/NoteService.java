package tn.esprit.spring.services;

import java.util.List;


import tn.esprit.spring.entity.Note;

public interface NoteService {
	List<Note> retrieveAllNote();	
	Note addNote(Note m);	
	void deleteNote(String id);
	Note retrieveNote(String id);
	Note updateNote(Note m);
	

}
