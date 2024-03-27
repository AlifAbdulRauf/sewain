package com.horehoreteam.sewain_hackathon2023.model

data class OrderHistory(
    val orderId:String,
    val imgUrl:String,
    val userName:String,
    val serviceName:String,
    val price:String,
    val status:String
)
data class OrderOnProcess(
    val orderId:String,
    val imgUrl:String,
    val userName:String,
    val serviceName:String,
    val price:String,
)
object Dummy {
    fun generateOrderHistory(): List<OrderHistory> {
        return listOf(
            OrderHistory(
                orderId = "SI091236",
                imgUrl = "https://static.vecteezy.com/system/resources/previews/018/838/223/original/avatar-of-a-chef-character-free-vector.jpg",
                userName = "Sarah Adam",
                serviceName = "Rasa Nusantara",
                price = "Rp 600.000",
                status = "Selesai"
            ),
            OrderHistory(
                orderId = "SI091237",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_1bpO0XDD8fbmRvnbnkCoQNFFoH3AqofVTg&usqp=CAU",
                userName = "Rina Malik",
                serviceName = "Delicieux Catering",
                price = "Rp 1.200.000",
                status = "Dibatalkan"
            ),
            OrderHistory(
                orderId = "SI091238",
                imgUrl = "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?cs=srgb&dl=pexels-pixabay-220453.jpg&fm=jpg",
                userName = "Arya Surya",
                serviceName = "Eleganza Tuxedo",
                price = "Rp 900.000",
                status = "Dibatalkan"
            ),
            OrderHistory(
                orderId = "SI091239",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6lZRVAi4cLxnDSPCTm0s7A1FUu1o9GYTi7_4ZApIuK5pg9tYf_4KAgUYDoQ543zrWQAA&usqp=CAU",
                userName = "Rizka Adzani",
                serviceName = "Fairy Dress Rental",
                price = "Rp 1.000.000",
                status = "Selesai"
            ),
            OrderHistory(
                orderId = "SI091240",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpumTyBB7zgUcv-XjuTLQg2RR-R8X9dYbySCGCmyWSplaIToj3lMw_Nih3xeklZvddWoQ&usqp=CAU",
                userName = "Lani Wati",
                serviceName = "Gardenia Decor Services",
                price = "Rp 750.000",
                status = "Selesai"
            ),
            OrderHistory(
                orderId = "SI091241",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpumTyBB7zgUcv-XjuTLQg2RR-R8X9dYbySCGCmyWSplaIToj3lMw_Nih3xeklZvddWoQ&usqp=CAU",
                userName = "Dewi Tri",
                serviceName = "Elegant Events Decor",
                price = "Rp 700.000",
                status = "Selesai"
            ),
            OrderHistory(
                orderId = "SI091242",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6fbEXoQw0SBxg8ppqN2kiHYVz65sUaYAgHZMlsqfnIMraDDD4PiNWDowodi9TkAwJfEM&usqp=CAU",
                userName = "Ivan Darmawan",
                serviceName = "Makanan Lezat Abadi",
                price = "Rp 1.500.000",
                status = "Selesai"
            ),
            OrderHistory(
                orderId = "SI091243",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_1bpO0XDD8fbmRvnbnkCoQNFFoH3AqofVTg&usqp=CAU",
                userName = "Rima Shofiya",
                serviceName = "Saji Sejahtera",
                price = "Rp 900.000",
                status = "Selesai"
            )
        )
    }
    fun generateOrderOnProcess(): List<OrderOnProcess>{
        return listOf(
            OrderOnProcess(
                orderId = "SI091244",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6fbEXoQw0SBxg8ppqN2kiHYVz65sUaYAgHZMlsqfnIMraDDD4PiNWDowodi9TkAwJfEM&usqp=CAU",
                userName = "Alex Johnson",
                serviceName = "Elegant Events Decor",
                price = "Rp 750.000"
            ),
            OrderOnProcess(
                orderId = "SI091245",
                imgUrl = "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?cs=srgb&dl=pexels-pixabay-220453.jpg&fm=jpg",
                userName = "Eva Martinez",
                serviceName = "Makanan Lezat Abadi",
                price = "Rp 900.000"
            ),
            OrderOnProcess(
                orderId = "SI091246",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRij6dtiHizH96qpCOe8WeXXP3yLyQJkPdGVg&usqp=CAU",
                userName = "Daniel Lee",
                serviceName = "Saji Sejahtera",
                price = "Rp 820.000"
            ),
            OrderOnProcess(
                orderId = "SI091247",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_1bpO0XDD8fbmRvnbnkCoQNFFoH3AqofVTg&usqp=CAU",
                userName = "Sophie Brown",
                serviceName = "Rasa Nusantara",
                price = "Rp 700.000"
            ),
            OrderOnProcess(
                orderId = "SI091248",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRij6dtiHizH96qpCOe8WeXXP3yLyQJkPdGVg&usqp=CAU",
                userName = "Liam Wilson",
                serviceName = "Gardenia Decor Services ",
                price = "Rp 600.000"
            ),
            OrderOnProcess(
                orderId = "SI091249",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6aFkmK5B0Zw_udaEn6Z9hLJ17h0l2gm43jw&usqp=CAU",
                userName = "Olivia Davis",
                serviceName = "Fantasi Kreasi Dekor",
                price = "Rp 850.000"
            ),
            OrderOnProcess(
                orderId = "SI091250",
                imgUrl = "https://images.ctfassets.net/h6goo9gw1hh6/2sNZtFAWOdP1lmQ33VwRN3/24e953b920a9cd0ff2e1d587742a2472/1-intro-photo-final.jpg?w=1200&h=992&fl=progressive&q=70&fm=jpg",
                userName = "Noah Taylor",
                serviceName = "Delicieux Catering",
                price = "Rp 950.000"
            ),
            OrderOnProcess(
                orderId = "SI091251",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6Hb5xzFZJCTW4cMqmPwsgfw-gILUV7QevvQ&usqp=CAU",
                userName = "Mia Garcia",
                serviceName = "Vintage Vibe Rentals",
                price = "Rp 780.000"
            )
        )
    }
    fun generateOrderRequest(): List<OrderOnProcess>{
        return listOf(
            OrderOnProcess(
                orderId = "SI091249",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6aFkmK5B0Zw_udaEn6Z9hLJ17h0l2gm43jw&usqp=CAU",
                userName = "Olivia Davis",
                serviceName = "Gardenia Decor Services",
                price = "Rp 850.000"
            ),
            OrderOnProcess(
                orderId = "SI091247",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_1bpO0XDD8fbmRvnbnkCoQNFFoH3AqofVTg&usqp=CAU",
                userName = "Sophie Brown",
                serviceName = "Gourmet Eksklusif",
                price = "Rp 700.000"
            ),
            OrderOnProcess(
                orderId = "SI091251",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6Hb5xzFZJCTW4cMqmPwsgfw-gILUV7QevvQ&usqp=CAU",
                userName = "Mia Garcia",
                serviceName = "Makanan Lezat Abadi",
                price = "Rp 780.000"
            ),
            OrderOnProcess(
                orderId = "SI091245",
                imgUrl = "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?cs=srgb&dl=pexels-pixabay-220453.jpg&fm=jpg",
                userName = "Eva Martinez",
                serviceName = "Saji Sejahtera",
                price = "Rp 900.000"
            ),
            OrderOnProcess(
                orderId = "SI091246",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRij6dtiHizH96qpCOe8WeXXP3yLyQJkPdGVg&usqp=CAU",
                userName = "Daniel Lee",
                serviceName = "Fairy Dress Rental",
                price = "Rp 820.000"
            ),
            OrderOnProcess(
                orderId = "SI091248",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRij6dtiHizH96qpCOe8WeXXP3yLyQJkPdGVg&usqp=CAU",
                userName = "Liam Wilson",
                serviceName = "Delicieux Catering",
                price = "Rp 600.000"
            ),
            OrderOnProcess(
                orderId = "SI091244",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6fbEXoQw0SBxg8ppqN2kiHYVz65sUaYAgHZMlsqfnIMraDDD4PiNWDowodi9TkAwJfEM&usqp=CAU",
                userName = "Alex Johnson",
                serviceName = "Saji Sejahtera",
                price = "Rp 750.000"
            ),
            OrderOnProcess(
                orderId = "SI091250",
                imgUrl = "https://images.ctfassets.net/h6goo9gw1hh6/2sNZtFAWOdP1lmQ33VwRN3/24e953b920a9cd0ff2e1d587742a2472/1-intro-photo-final.jpg?w=1200&h=992&fl=progressive&q=70&fm=jpg",
                userName = "Noah Taylor",
                serviceName = "Makanan Lezat Abadi",
                price = "Rp 950.000"
            ),

        )
    }
}