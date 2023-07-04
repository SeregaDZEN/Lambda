import org.junit.Before
import org.junit.Test
import java.lang.RuntimeException
import kotlin.test.assertEquals


class ChatServiceTest {


    private val chatService = ChatService


    @Before
    fun clear() {
        chatService.clearChats()
    }

    @Test
    fun sendMessages() {

    }

    @Test
    fun getCountMessageInChat() {
        val message = Message("hi", true, incoming = true)
        chatService.sendMessages(1, "hi")
        val result = chatService.getCountMessageInChat(1, 1, 2)
        val list = listOf(message)
        assertEquals(result, list)
    }

    @Test
    fun deleteChat() {
        val message = Message("hi", true, incoming = true)
        val message2 = Message("hi - hi", true, incoming = true)
        chatService.sendMessages(1, "hi")
        val chatList = mutableMapOf(1 to message, 2 to message2).clear()
        val result = chatService.deleteChat(1)
        assertEquals(result, chatList)

    }

    @Test(expected = RuntimeException::class)
    fun deleteChat2() {
        val message = Message("hi", true, incoming = true)
        val message2 = Message("hi - hi", true, incoming = true)
        val chatList = mutableMapOf(1 to message, 2 to message2).clear()
        val result = chatService.deleteChat(1)
        assertEquals(result, chatList)

    }

    @Test
    fun getCountOfUnreadChats() {
        chatService.sendMessages(1, "hi")
        chatService.sendMessages(1, "hi - hi")
        val result = chatService.getCountOfUnreadChats(1)

        assertEquals(result, 1)
    }

    @Test
    fun deleteMessage() {
        chatService.sendMessages(1, "hi")
        val result2 = chatService.sendMessages(1, "hi - hoy")

        val result = chatService.deleteMessage(1, 1)

        assertEquals(result, result2)

    }

    @Test
    fun getChats() {
        chatService.sendMessages(1, "hi")
        chatService.sendMessages(1, "hoy")
        val result = chatService.getChats()
        //val result2 = mutableListOf(Chat())
        val listString = mutableListOf(
            "Chat(messages=[Message(text=hi, isRead=false," +
                    " idMessage=9, incoming=true), Message(text=hoy," +
                    " isRead=false, idMessage=10, incoming=true)])"
        )
        assertEquals(result.toString(), listString.toString()) // фуф, как долго думал тут...

    }

    @Test
    fun getTextLastChats() {
        chatService.sendMessages(1, "hi")
        chatService.sendMessages(1, "hoy")

        val result = chatService.getTextLastChats()
        val result2 = mutableListOf("hoy")
      assertEquals(result,result2)

    }
}