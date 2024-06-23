package academy.guerra.notes.controller;

import academy.guerra.notes.model.Note;
import academy.guerra.notes.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("notes", noteRepository.findAll());
        return "index";
    }

    @PostMapping("/addNote")
    public String addNote(Note note) {
        noteRepository.save(note);
        return "redirect:/";
    }
}
