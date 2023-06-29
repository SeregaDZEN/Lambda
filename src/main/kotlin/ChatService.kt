data class Message (val text : String)

data class Chat(val message: MutableList<Message> = mutableListOf())

object ShatService {

    private val chats = mutableMapOf<Int,Chat>()

    fun sendMessages ( userId : Int, message: Message ){
        chats.getOrPut(userId) {Chat()}.message += message
    }

    fun printChats (){
         println(chats)
    }
}

fun main (){
    
}

