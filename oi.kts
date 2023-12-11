class User(val id: Int, val name: String)

object UserManager {
    private val users = mutableListOf<User>()

    fun addUser(name: String) {
        val user = User(users.size + 1, name)
        users.add(user)
    }

    fun listUsers() {
        if (users.isEmpty()) {
            println("Nenhum usuário cadastrado.")
        } else {
            for ((index, user) in users.withIndex()) {
                println("${index + 1} - ${user.name}")
            }
        }
    }
}

fun main() {
    val quantity = readLine()?.toIntOrNull() ?: 0

    for (i in 1..quantity) {
        val name = readLine() ?: ""
        UserManager.addUser(name)
    }

    UserManager.listUsers()
      println("oi")
      println("Ola Mundo Conseguiiiiii")
}

