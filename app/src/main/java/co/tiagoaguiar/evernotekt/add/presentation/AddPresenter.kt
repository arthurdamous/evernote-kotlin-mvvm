package co.tiagoaguiar.evernotekt.add.presentation

import co.tiagoaguiar.evernotekt.add.Add
import co.tiagoaguiar.evernotekt.data.model.Note
import co.tiagoaguiar.evernotekt.data.model.RemoteDataSource
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

class AddPresenter(
    private val view: Add.View,
    private val dataSource: RemoteDataSource
) : Add.Presenter {

    private val compositeDisposable = CompositeDisposable()


    override fun createNote(title: String, body: String) {
    }

    override fun getNote(id: Int) {
    }

    override fun stop() {
        compositeDisposable.clear()
    }
}