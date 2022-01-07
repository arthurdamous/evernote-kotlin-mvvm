package co.tiagoaguiar.evernotekt

import co.tiagoaguiar.evernotekt.data.model.Note
import co.tiagoaguiar.evernotekt.data.model.RemoteDataSource
import io.reactivex.Observable
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class HomePresenterTests {
/*
    @Rule
    @JvmField
    var testSchedulerRule = RxSchedulerRule()

    @Mock
    private lateinit var mockView: Home.View

    @Mock
    private lateinit var mockDataSource: RemoteDataSource


    private val fakeAllNotes: List<Note>
        get() = arrayListOf(
            Note(1, "NotaA", "Nota desc", "01/10/2020", "Seja bem vindo a nota a"),
            Note(2, "NotaB", "Nota desc", "02/10/2020", "Seja bem vindo a nota b"),
            Note(3, "NotaC", "Nota desc", "03/10/2020", "Seja bem vindo a nota c")
        )

    @Before
    fun setup() {
    }

    @Test
    fun `test must get all notes`() {
        //Given
        Mockito.doReturn(Observable.just(fakeAllNotes)).`when`(mockDataSource).listNotes()
        //When
        //Then
        Mockito.verify(mockDataSource).listNotes()
        Mockito.verify(mockView).displayNotes(fakeAllNotes)
    }

    @Test
    fun `test must show empty notes`() {
        //Given
        Mockito.doReturn(Observable.just(arrayListOf<Note>())).`when`(mockDataSource).listNotes()
        //When
        //Then
        Mockito.verify(mockDataSource).listNotes()
        Mockito.verify(mockView).displayEmptyNotes()
    }*/
}