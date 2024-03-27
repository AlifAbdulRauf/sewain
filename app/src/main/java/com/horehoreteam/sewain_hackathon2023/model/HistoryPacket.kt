package com.horehoreteam.sewain_hackathon2023.model

data class HistoryPacket(
    val time: String,
    val requestItems: List<ItemHistoryPacket>
)

data class ItemHistoryPacket(
    val imageUrl: String,
    val requestId: String,
    val userName: String,
    val packetName: String,
    val contact: String,
    val submittedCaterings: List<String>,
    val submittedWardrobes: List<String>,
    val submittedDecoration: List<String>
)
data class SubmittedItem{
    val serviceName: String,
    val isAccepted: Boolean
}

object Dummy {
    fun generateHistoryPacket(): List<HistoryPacket> {
        val imageUrl = "https://cdn3.vectorstock.com/i/1000x1000/77/17/chef-avatar-icon-vector-32077717.jpg"

        return listOf(
            HistoryPacket(
                time = "Baru Saja",
                requestItems = listOf(
                    ItemHistoryPacket(
                        imageUrl = imageUrl,
                        requestId = "PI081240",
                        userName = "Catering King Alam",
                        packetName = "Pesta Pernikahan",
                        contact = "6281275651571",
                        submittedCaterings = listOf("Catering King Alam\n Catering Pernikahan", "Catering King Alam\n Home Catering"),
                        submittedWardrobes = emptyList(),
                        submittedDecoration = emptyList()
                    ),
                    ItemHistoryPacket(
                        imageUrl = imageUrl,
                        requestId = "PI081241",
                        userName = "Catering King Alam",
                        packetName = "Pesta Ulang Tahun",
                        contact = "6281275651571",
                        submittedCaterings = emptyList(),
                        submittedWardrobes = emptyList(),
                        submittedDecoration = listOf("Catering King Alam\n Pelaminan", "Catering King Alam\n Dekorasi Ruangan")
                    )
                )
            ),
            HistoryPacket(
                time = "1 Minggu Terakhir",
                requestItems = listOf(
                    ItemHistoryPacket(
                        imageUrl = imageUrl,
                        requestId = "PI081230",
                        userName = "Catering King Alam",
                        packetName = "Paket Halal Bihalal",
                        contact = "6281278235287",
                        submittedCaterings = listOf("Catering King Alam\n Catering Pesta", "Catering King Alam\n Mobile Catering"),
                        submittedWardrobes = listOf("King Alam\n Pakaian Adat"),
                        submittedDecoration = emptyList()
                    ),
                    ItemHistoryPacket(
                        imageUrl = imageUrl,
                        requestId = "PI081233",
                        userName = "Catering King Alam",
                        packetName = "Konferensi Internasional",
                        contact = "6281278235231",
                        submittedCaterings = listOf("Catering King Alam\n Konferensi Internasional"),
                        submittedWardrobes = emptyList(),
                        submittedDecoration = listOf("King Alam\n Dekorasi Ruangan", "King Alam\n Tenda")
                    ),
                    ItemHistoryPacket(
                        imageUrl = imageUrl,
                        requestId = "PI081235",
                        userName = "Catering King Alam",
                        packetName = "Pesta Anniversary",
                        contact = "6281254235231",
                        submittedCaterings = emptyList(),
                        submittedWardrobes = listOf("King Alam Pakaian Adat", "King Alam Gaun", "King Alam Jas"),
                        submittedDecoration = emptyList()
                    )
                )
            )
        )
    }
}

