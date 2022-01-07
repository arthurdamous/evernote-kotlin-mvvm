package co.tiagoaguiar.evernotekt.data.model

import org.junit.Assert.*
import org.junit.Test

class NoteTest{

    @Test
    fun `test should format date pattern to month and year`(){
        val note = Note(title = "NotaA", body = "ConteudoA", date = "20/02/2021")

        assertEquals("Fev 2021", note.createdDate)
    }

    @Test
    fun `test should format date when empty`(){
        val note = Note(title = "NotaA", body = "ConteudoA", date = "")

        assertEquals("", note.createdDate)
    }

    @Test
    fun `test should format date when null`(){
        val note = Note(title = "NotaA", body = "ConteudoA")

        assertEquals("", note.createdDate)
    }
}