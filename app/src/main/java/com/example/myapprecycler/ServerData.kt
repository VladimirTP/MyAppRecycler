package com.example.myapprecycler

object ServerData {
    fun getMovies (): List<MovieData> = listOf(
        MovieData( "https://ru.wikipedia.org/wiki/%D0%90%D0%B2%D0%B0%D1%82%D0%B0%D1%80_(%D1%84%D0%B8%D0%BB%D1%8C%D0%BC,_2009)#/media/%D0%A4%D0%B0%D0%B9%D0%BB:Avatar-2009.jpg",
            "Avatar", true, "8.0"),
        MovieData( "https://ru.wikipedia.org/wiki/%D0%94%D1%8E%D0%BD%D0%B0_(%D1%84%D0%B8%D0%BB%D1%8C%D0%BC,_2021)#/media/%D0%A4%D0%B0%D0%B9%D0%BB:%D0%94%D1%8E%D0%BD%D0%B0_%D0%BE%D1%84%D0%B8%D1%86%D0%B8%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9_%D0%BF%D0%BE%D1%81%D1%82%D0%B5%D1%80.jpgб",
            "Duna", true, "7.7"),
        MovieData( "https://ru.wikipedia.org/wiki/%D0%94%D0%B6%D0%B5%D0%BD%D1%82%D0%BB%D1%8C%D0%BC%D0%B5%D0%BD%D1%8B_(%D1%84%D0%B8%D0%BB%D1%8C%D0%BC)#/media/%D0%A4%D0%B0%D0%B9%D0%BB:%D0%94%D0%B6%D0%B5%D0%BD%D1%82%D0%BB%D1%8C%D0%BC%D0%B5%D0%BD%D1%8B.jpg",
            "Джентельмены", false, "8.5"),
        MovieData( "https://ru.wikipedia.org/wiki/%D0%94%D0%B6%D0%BE%D0%BA%D0%B5%D1%80_(%D1%84%D0%B8%D0%BB%D1%8C%D0%BC,_2019)#/media/%D0%A4%D0%B0%D0%B9%D0%BB:%D0%94%D0%B6%D0%BE%D0%BA%D0%B5%D1%80_(%D1%84%D0%B8%D0%BB%D1%8C%D0%BC_%D0%A2%D0%BE%D0%B4%D0%B4%D0%B0_%D0%A4%D0%B8%D0%BB%D0%BB%D0%B8%D0%BF%D1%81%D0%B0).jpg",
            "Джокер", true, "8.0"),
        MovieData( "https://ru.wikipedia.org/wiki/%D0%A2%D0%BE%D0%BF_%D0%93%D0%B0%D0%BD:_%D0%9C%D1%8D%D0%B2%D0%B5%D1%80%D0%B8%D0%BA#/media/%D0%A4%D0%B0%D0%B9%D0%BB:Top_Gun-_Maverick.jpg",
            "Топ Ган: Мэверик", true, "7.8"),
        MovieData( "https://ru.wikipedia.org/wiki/%D0%97%D0%B5%D0%BC%D0%BB%D1%8F_%D0%BA%D0%BE%D1%87%D0%B5%D0%B2%D0%BD%D0%B8%D0%BA%D0%BE%D0%B2#/media/%D0%A4%D0%B0%D0%B9%D0%BB:Nomadland_poster.jpg",
            "Земля кочевников", true, "7.2")
    )
}