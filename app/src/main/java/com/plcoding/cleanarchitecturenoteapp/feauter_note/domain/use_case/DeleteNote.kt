package com.plcoding.cleanarchitecturenoteapp.feauter_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feauter_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feauter_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}