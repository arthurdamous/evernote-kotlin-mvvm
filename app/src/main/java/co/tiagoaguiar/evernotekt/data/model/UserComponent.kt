package co.tiagoaguiar.evernotekt.data.model

import dagger.Component

@Component
interface UserComponent {

    fun getUser(): User
}