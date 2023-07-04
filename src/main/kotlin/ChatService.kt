data class Message(
    val text: String,
    var isRead: Boolean,
    var idMessage: Int = 1,
    var incoming: Boolean = true,

    )

data class Chat(val messages: MutableList<Message> = mutableListOf())

object ChatService {

    private val chats = mutableMapOf<Int, Chat>()
    private var unitIdMessage = 1

    fun clearChats() {

        chats.clear()
        println(chats)
    }


    fun sendMessages(userId: Int, text: String)  {
       chats.getOrPut(userId) { Chat() }.messages += Message(text, false, idMessage = unitIdMessage++)

        println(" пользователь : $userId, текст: $text")

    }


    fun getCountMessageInChat(
        idChat: Int,
        idMessage: Int,
        countMessage: Int
    ): List<Message> { // получить  кол-во сообщений в чате
        return chats[idChat]?.messages?.filter { it.idMessage >= idMessage }?.take(countMessage)?.onEach {
            if (it.incoming) {
                it.isRead = true
            }
        }
            ?: throw RuntimeException("чат не найден")
    }

    fun deleteChat(userId: Int)  {
        chats[userId]?.messages?.clear()  ?: throw RuntimeException("чат не найден")

    }

    fun getCountOfUnreadChats(userId: Int): Int {
        val chat = chats.values.count { chat -> chat.messages.any { !it.isRead } }
        println(chat)
        return chat //кол-во не прочитанных чатов

    }

    fun deleteMessage(userId: Int, idMessage: Int) {
        val mes = chats[userId]?.messages?.find { it.idMessage == idMessage }
        chats[userId]?.messages?.remove(mes) ?: throw RuntimeException("такого сообщения нет")
    }

    fun getChats(): List<Chat> {
        val getChat = chats.values.toList()
        println(getChat)
        return getChat
    }

    fun getTextLastChats(): List<String> {
        return chats.values.map { it.messages.lastOrNull()?.text ?: "no messages" }
    }
}

fun main() {
    val chat = ChatService
    chat.sendMessages(1, "hi")

}
