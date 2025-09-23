package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import java.io.File
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val url = URL("https://info.cegepmontpetit.ca/3N5-Prog3/testbot/courrielsDansA.html")
    val connectionURL = url.openConnection() as HttpURLConnection
    connectionURL.requestMethod = "GET"
    connectionURL.connect()

    val réponse = connectionURL.inputStream
    val document: Document = Jsoup.parse(réponse, "UTF-8", url.toString())

    val text = document.text()
    val Regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}".toRegex()
    var emailsSurPage = mutableListOf<String>()

    document.select("a[href]").forEach { element ->
        val href = element.attr("href")
        if(element.toString().contains(Regex)){
            emailsSurPage.add(href)
        }
    }
    emailsSurPage.forEach { email ->
        val cleanEmail = email.split("mailto:")[1]
        val NomComplet = cleanEmail.split("@")[0]
        val NomCoupé = NomComplet.split(".")
        val Prénom = NomCoupé[0].capitalize()
        val Nom = NomCoupé[1].capitalize()

        println("$Prénom $Nom a pour adresse $cleanEmail")
    }


}