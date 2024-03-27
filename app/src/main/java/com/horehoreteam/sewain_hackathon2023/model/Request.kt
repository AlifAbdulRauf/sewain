data class RequestPackage(
    val orderId:String,
    val imgUrl:String,
    val userName:String,
    val serviceName:String,
    val listOne:String,
    val listTwo:String,
    val listThree:String,
)
data class HistoryPackage(
    val orderId:String,
    val imgUrl:String,
    val userName:String,
    val serviceName:String,
    val listOne:String,
    val listTwo:String,
    val listThree:String,
    val statuslistOne:String,
    val statuslistTwo:String,
    val statuslistThree:String,
)

object Dummy {
    fun generateRequestPackage(): List<RequestPackage> {
        return listOf(
            RequestPackage(
                orderId = "PI091231",
                imgUrl = "https://media.gettyimages.com/id/662284095/photo/chef-fisinshing-dishes-in-the-kitchen.jpg?s=612x612&w=gi&k=20&c=9n-l6-RE3dXeaLpdWkpWCSJjaPyhkkQVMm6mZ66E2A0=",
                userName = "Mutia Catering",
                serviceName = "Layanan Makanan",
                listOne = "Rendang",
                listTwo = "Soto",
                listThree = "Gulai"
            ),
            RequestPackage(
                orderId = "PI091232",
                imgUrl = "https://media.gettyimages.com/id/662284095/photo/chef-fisinshing-dishes-in-the-kitchen.jpg?s=612x612&w=gi&k=20&c=9n-l6-RE3dXeaLpdWkpWCSJjaPyhkkQVMm6mZ66E2A0=",
                userName = "Rumah Penyewaan Pakaian",
                serviceName = "Layanan Wardobe",
                listOne = "Baju Kurung",
                listTwo = "Jas",
                listThree = "Gaun"
            ),
            RequestPackage(
                orderId = "PI091233",
                imgUrl = "https://media.gettyimages.com/id/662284095/photo/chef-fisinshing-dishes-in-the-kitchen.jpg?s=612x612&w=gi&k=20&c=9n-l6-RE3dXeaLpdWkpWCSJjaPyhkkQVMm6mZ66E2A0=",
                userName = "Duna Fancy",
                serviceName = "Layanan Dekorasi Pesta",
                listOne = "Tenda",
                listTwo = "Pelaminan",
                listThree = "Orgen"
            ),
            RequestPackage(
                orderId = "PI091239",
                imgUrl = "https://example.com/image6.jpg",
                userName = "AA CATERING",
                serviceName = "Layanan Makanan",
                listOne = "Gulai",
                listTwo = "Ayam Bakar",
                listThree = "Es Campur"
            ),
            RequestPackage(
                orderId = "PI091240",
                imgUrl = "https://example.com/image7.jpg",
                userName = "Ummura Bridal & Boutique",
                serviceName = "Layanan Wardrobe",
                listOne = "Dress Formal",
                listTwo = "Kemeja Putih",
                listThree = "Setelan Jas"
            ),
            RequestPackage(
                orderId = "PI091241",
                imgUrl = "https://example.com/image8.jpg",
                userName = "Cahaya Pesta Pelaminan",
                serviceName = "Layanan Dekorasi Pesta",
                listOne = "Bunga Dekorasi",
                listTwo = "Lampu Hias",
                listThree = "Kain Drapery"
            ),
            RequestPackage(
                orderId = "PI091242",
                imgUrl = "https://example.com/image9.jpg",
                userName = "Catering UMMI",
                serviceName = "Layanan Makanan",
                listOne = "Sate Ayam",
                listTwo = "Gado-Gado",
                listThree = "Rujak Buah"
            ),
            RequestPackage(
                orderId = "PI091243",
                imgUrl = "https://example.com/image10.jpg",
                userName = "Sharie Penganten Indah",
                serviceName = "Layanan Wardrobe",
                listOne = "Gaun Pesta",
                listTwo = "Jas Rapi",
                listThree = "Rok Panjang"
            )
        )
    }
    fun generateHistoryPackage(): List<HistoryPackage> {
        return listOf(
            HistoryPackage(
                orderId = "PI091241",
                imgUrl = "https://example.com/image8.jpg",
                userName = "Cahaya Pesta Pelaminan",
                serviceName = "Layanan Dekorasi Pesta",
                listOne = "Bunga Dekorasi",
                listTwo = "Lampu Hias",
                listThree = "Kain Drapery",
                statuslistOne = "Diterima",
                statuslistTwo = "Diterima",
                statuslistThree = "Diterima"
            ),
            HistoryPackage(
                orderId = "PI091232",
                imgUrl = "https://media.gettyimages.com/id/662284095/photo/chef-fisinshing-dishes-in-the-kitchen.jpg?s=612x612&w=gi&k=20&c=9n-l6-RE3dXeaLpdWkpWCSJjaPyhkkQVMm6mZ66E2A0=",
                userName = "Rumah Penyewaan Pakaian",
                serviceName = "Layanan Wardobe",
                listOne = "Baju Kurung",
                listTwo = "Jas",
                listThree = "Gaun",
                statuslistOne = "Diterima",
                statuslistTwo = "Diterima",
                statuslistThree = "Ditolak"
            ),
            HistoryPackage(
                orderId = "PI091240",
                imgUrl = "https://example.com/image7.jpg",
                userName = "Ummura Bridal & Boutique",
                serviceName = "Layanan Wardrobe",
                listOne = "Dress Formal",
                listTwo = "Kemeja Putih",
                listThree = "Setelan Jas",
                statuslistOne = "Diterima",
                statuslistTwo = "Diterima",
                statuslistThree = "Diterima"
            ),
            HistoryPackage(
                orderId = "PI091233",
                imgUrl = "https://media.gettyimages.com/id/662284095/photo/chef-fisinshing-dishes-in-the-kitchen.jpg?s=612x612&w=gi&k=20&c=9n-l6-RE3dXeaLpdWkpWCSJjaPyhkkQVMm6mZ66E2A0=",
                userName = "Duna Fancy",
                serviceName = "Layanan Dekorasi Pesta",
                listOne = "Tenda",
                listTwo = "Pelaminan",
                listThree = "Orgen",
                statuslistOne = "Diterima",
                statuslistTwo = "Ditolak",
                statuslistThree = "Ditolak"
            ),
            HistoryPackage(
                orderId = "PI091242",
                imgUrl = "https://example.com/image9.jpg",
                userName = "Catering UMMI",
                serviceName = "Layanan Makanan",
                listOne = "Sate Ayam",
                listTwo = "Gado-Gado",
                listThree = "Rujak Buah",
                statuslistOne = "Diterima",
                statuslistTwo = "Diterima",
                statuslistThree = "Diterima"
            ),
            HistoryPackage(
                orderId = "PI091231",
                imgUrl = "https://media.gettyimages.com/id/662284095/photo/chef-fisinshing-dishes-in-the-kitchen.jpg?s=612x612&w=gi&k=20&c=9n-l6-RE3dXeaLpdWkpWCSJjaPyhkkQVMm6mZ66E2A0=",
                userName = "Mutia Catering",
                serviceName = "Layanan Makanan",
                listOne = "Rendang",
                listTwo = "Soto",
                listThree = "Gulai",
                statuslistOne = "Diterima",
                statuslistTwo = "Ditolak",
                statuslistThree = "Ditolak"
            ),
            HistoryPackage(
                orderId = "PI091243",
                imgUrl = "https://example.com/image10.jpg",
                userName = "Sharie Penganten Indah",
                serviceName = "Layanan Wardrobe",
                listOne = "Gaun Pesta",
                listTwo = "Jas Rapi",
                listThree = "Rok Panjang",
                statuslistOne = "Ditolak",
                statuslistTwo = "Diterima",
                statuslistThree = "Ditolak"
            ),
            HistoryPackage(
                orderId = "PI091239",
                imgUrl = "https://example.com/image6.jpg",
                userName = "AA CATERING",
                serviceName = "Layanan Makanan",
                listOne = "Gulai",
                listTwo = "Ayam Bakar",
                listThree = "Es Campur",
                statuslistOne = "Diterima",
                statuslistTwo = "Ditolak",
                statuslistThree = "Diterima"
            )
        )
    }
}