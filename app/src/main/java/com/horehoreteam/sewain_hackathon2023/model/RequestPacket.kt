package com.horehoreteam.sewain_hackathon2023.model
data class RequestPacket(
    val time:String,
    val requestItems:List<ItemRequestPacket>
)

data class ItemRequestPacket(
    val imageUrl:String,
    val requestId:String,
    val userName:String,
    val packetName:String,
    val contact:String,
    val submittedCaterings:List<String>,
    val submittedWardrobes:List<String>,
    val submittedDecoration:List<String>
)
object Dummy {
    fun generateRequestPacket(): List<RequestPacket> {
        return listOf(
            RequestPacket(
                time = "Baru Saja",
                requestItems = listOf(
                    ItemRequestPacket(
                        imageUrl = "https://o-cdn-cas.sirclocdn.com/parenting/images/Chef_Vindex_exquisite-taste-magaz.width-800.format-webp.webp",
                        requestId = "PI081240",
                        userName = "AA Catering",
                        packetName = "Pesta Pernikahan",
                        contact = "6281275651571",
                        submittedCaterings = listOf("AA Catering\n Catering Pernikahan", "AA Catering\n Home Catering"),
                        submittedWardrobes = listOf(),
                        submittedDecoration = listOf(),
                    ),
                    ItemRequestPacket(
                        imageUrl = "https://image.cermati.com/q_70,w_1200,h_800,c_fit/txdm5mmzk88fi3vnicjk",
                        requestId = "PI081241",
                        userName = "Duna Fancy",
                        packetName = "Pesta Ulang Tahun",
                        contact = "6281275651571",
                        submittedCaterings = listOf(),
                        submittedWardrobes = listOf(),
                        submittedDecoration = listOf("Duna Fancy\n Pelaminan","Duna Fancy\n Dekorasi Ruangan"),
                    ),
                )
            ),
            RequestPacket(
                time = "1 Minggu Terakhir",
                requestItems = listOf(
                    ItemRequestPacket(
                        imageUrl = "https://static.promediateknologi.id/crop/0x0:0x0/0x0/webp/photo/jawapos/2022/04/IKLAN-DANTI.jpg",
                        requestId = "PI081230",
                        userName = "UMMI Catering",
                        packetName = "Paket Halal Bihalal",
                        contact = "6281278235287",
                        submittedCaterings = listOf("UMMI Catering\n Catering Pesta", "AA Catering\n Mobile Catering"),
                        submittedWardrobes = listOf("UMMI Catering\n Pakaian Adat"),
                        submittedDecoration = listOf(),
                    ),
                    ItemRequestPacket(
                        imageUrl = "https://rayaboga.com/tinymce/images/raya_boga_catering_crest_koki_lower.png",
                        requestId = "PI081233",
                        userName = "Boga Catering",
                        packetName = "Konferensi Internasional",
                        contact = "6281278235231",
                        submittedCaterings = listOf("Boga Catering\n Konferensi Internasional"),
                        submittedWardrobes = listOf(),
                        submittedDecoration = listOf("Boga Catering\n Dekorasi Ruangan","Boga Catering\n Tenda"),
                    ),
                    ItemRequestPacket(
                        imageUrl = "https://static.vecteezy.com/system/resources/previews/006/696/223/original/boutique-fashion-logo-design-template-vector.jpg",
                        requestId = "PI081235",
                        userName = "Ummura Bridal & Boutique",
                        packetName = "Pesta Anniversary",
                        contact = "6281254235231",
                        submittedCaterings = listOf(),
                        submittedWardrobes = listOf("Ummura Pakaian Adat", "Ummura Gaun", "Ummura Jas"),
                        submittedDecoration = listOf(),
                    ),
                )
            )

        )
    }
}