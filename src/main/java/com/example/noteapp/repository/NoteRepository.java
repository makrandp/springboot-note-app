package com.example.noteapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.noteapp.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
