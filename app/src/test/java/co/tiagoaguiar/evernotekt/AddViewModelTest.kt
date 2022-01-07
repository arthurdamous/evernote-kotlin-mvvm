package co.tiagoaguiar.evernotekt

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MediatorLiveData
import co.tiagoaguiar.evernotekt.data.NoteRepository
import co.tiagoaguiar.evernotekt.data.model.Note
import co.tiagoaguiar.evernotekt.viewmodel.AddViewModel
import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.verify
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class AddViewModelTest {

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    private lateinit var viewModel: AddViewModel

    @Mock
    lateinit var repository: NoteRepository

    @Before
    fun setup() {
        viewModel = AddViewModel(repository)
    }

    @Test
    fun `test must not save note without title`() {
        //Given
        viewModel.title.set("")
        viewModel.body.set("")
        //When
        viewModel.createNote()
        //Then
        Assert.assertEquals(false, viewModel.saved.value)
    }

    @Test
    fun `test must save note`() {
        //Given
        viewModel.title.set("NoteA")
        viewModel.body.set("BodyA")
        //When
        viewModel.createNote()
        //Then
        Assert.assertEquals(true, viewModel.saved.value)

        val note = Note(title = "NoteA", body = "BodyA")
        verify(repository).createNote(note)
    }

    @Test
    fun `test must get a note`() {
        val noteA = Note(id = 1, title = "NotaA", body = "BodyA")

        //Given
        val liveData = MediatorLiveData<Note>()
        liveData.value = noteA

        doReturn(liveData).`when`(repository).getNote(1)
        //When
        viewModel.getNote(1)
        //Then
        Assert.assertEquals(noteA, viewModel.getNote(1).value)
    }
}