package com.horehoreteam.sewain_hackathon2023

import com.horehoreteam.sewain_hackathon2023.model.Notification

object DataDummy {

    fun generateNotificationMessage(): List<Notification> {
        return listOf(
            Notification(message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."),
            Notification(message = "Morbi congue lectus ac tellus aliquet, sit amet vehicula sem tempus. Quisque pretium bibendum iaculis. Aliquam elit elit, volutpat id libero et"),
            Notification(message = "Integer molestie nisl id metus iaculis pulvinar!"),
            Notification(message = "Mauris in hendrerit libero, a luctus velit. Quisque vel risus diam. Class aptent taciti sociosqu ad litora torquent per conubia nostra!"),
            Notification(message = "Maecenas placerat justo ac turpis iaculis consequat. Aenean non lacinia nisl, nec laoreet ex."),
            Notification(message = "Etiam enim nisi, blandit ac sodales et, mattis id nibh!"),
            Notification(message = "Nullam pretium facilisis viverra. Nullam eleifend massa ac eros varius mollis!"),
            Notification(message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."),
            Notification(message = "Nullam pretium facilisis viverra. Nullam eleifend massa cuare eros varius mollis."),
            Notification(message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi congue lectus ac tellus aliquet, sit amet vehicula sem tempus."),
            Notification(message = "Duis vel elit orci. In rutrum dolor eu quam rhoncus eleifend!"),
        )
    }
}