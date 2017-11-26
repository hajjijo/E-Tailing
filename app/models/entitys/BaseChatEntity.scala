package models.entitys

case class BaseChatEntity (
                            id: Long,
                            chat_type: String,
                            pinned_message_id: Option[Long] = None
                          )
