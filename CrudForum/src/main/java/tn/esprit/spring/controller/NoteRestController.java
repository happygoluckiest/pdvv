package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

import tn.esprit.spring.entity.Note;
import tn.esprit.spring.services.NoteService;

@RestController
public interface NoteRestController {
	
@Autowired
NoteService noteService;
	
	@GetMapping("/retrieve-all-note")
	@ResponseBody
	public default List<Note> getNote(){
		List <Note> list= noteService.retrieveAllNote();
		return list;
	}
	
	@GetMapping("/retrieve-note/{note-id}")
	@ResponseBody
	public default Note getParent(@PathVariable("note-id") String noteId){
	return noteService.retrieveNote(noteId);
		}
	
	@PostMapping("/addNote")
	@ResponseBody
	public default Note addNote(@RequestBody Note note)
	{
		note.addNote(note);
		return note;
	}
	
	@DeleteMapping("/deleteNote/{id_note}")
	@ResponseBody
	public default void deleteMessage(@PathVariable("id_note") String id_note){
		noteService.deleteNote(id_note);
	}
	
	@PutMapping("/updateNote")
	@ResponseBody
	public default Note updateNote(@RequestBody Note m){
		return noteService.updateNote(m);
	}


}



