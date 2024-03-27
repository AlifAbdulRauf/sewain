data class listCatering(
    val imageUrl:String,
    val name:String,
    val price:String,
    val rating:String
)
object Dummy{
    fun generatelistCatering(): List<listCatering> {
        return listOf(
            listCatering(
                imageUrl= "https://1.bp.blogspot.com/-xtvWTRugjbk/X_WzOdQW7HI/AAAAAAAAPr8/PVMiow-Lhb0NbfVs3obq3oVXo0d7g39mgCLcBGAsYHQ/w1200-h630-p-k-no-nu/Pengertian-dan-Jenis-Catering-728w.jpg'",
                name= "Catering Pesta Pernikahan",
                price = "Rp 1.500.000",
                rating= "5.0"
            ),
            listCatering(
                imageUrl= "https://www.diajengcatering.com/wp-content/uploads/2016/04/catering-bekasi-1024x685.jpg",
                name= "Catering Halal Bihalal",
                price = "Rp 750.000",
                rating= "5.0"
            ),
            listCatering(
                imageUrl= "https://bestchef.biz/wp-content/uploads/2018/01/ccccc.jpg",
                name= "Catering Seminar",
                price = "Rp 900.000",
                rating= "5.0"
            ),
            listCatering(
                imageUrl= "https://www.flokq.com/blog/wp-content/uploads/2020/08/take.jpg",
                name= "Koki Pribadi",
                price = "Rp 1.000.000",
                rating= "5.0"
            ),listCatering(
                imageUrl= "https://miro.medium.com/v2/resize:fit:912/1*KHrPWdx_unWp0MVEcyctjw.jpeg",
                name= "Home Catering",
                price = "Rp 300.000",
                rating= "5.0"
            ),
            listCatering(
                imageUrl= "https://www.zandonellacatering.com/wp-content/uploads/2014/11/anniversary-party.jpg",
                name= "Catering Anniversary",
                price = "Rp 500.000",
                rating= "5.0"
            )
        )
    }
}
