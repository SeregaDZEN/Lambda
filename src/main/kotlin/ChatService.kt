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

    }


    fun sendMessages(userId: Int, text: String) {
        chats.getOrPut(userId) { Chat() }.messages += Message(text, false, idMessage = unitIdMessage++)
        println(" пользователь : $userId, текст: $text")
    }


    fun getCountMessageInChat(
        idChat: Int,
        idMessage: Int,
        countMessage: Int
    ): List<Message> { // получить  кол-во сообщений в чате

        return chats[idChat]?.messages?.filter { it.idMessage >= idMessage }?.take(countMessage)?.onEach { // тут филтер
            if (it.incoming) {
                it.isRead = true
            }
        } ?: throw RuntimeException("чат не найден")
    }

    fun deleteChat(userId: Int) {
        chats[userId]?.messages?.clear() ?: throw RuntimeException("чат не найден")

    }

    fun getCountOfUnreadChats(): Int {
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
        return chats.values.map { it.messages.lastOrNull()?.text ?: "no messages" } //  тут map
    }

    fun allMessagesInChats(): String {
        print("Введите номер чата, если 0 - все чаты ")
        val number = readlnOrNull()?.toInt() ?: -1
        val countMessage = chats.values.fold(0) { a, c -> a + c.messages.size }
        return if (number > 0) {
            "Кол-во сообщений в этом чате: ${chats[number]?.messages?.size ?: throw RuntimeException("нет сообщений")} "
        } else {
            "Кол-во всех сообщений во всех чатах: $countMessage"

        }

    }  // эту функцию для себя сделал, проверить fold!
}

fun main() {
    val c = ChatService
    c.sendMessages(1, "hi")
    c.sendMessages(1, "hiawd")
    c.sendMessages(2, "hiawd")
    println(c.allMessagesInChats())

}
