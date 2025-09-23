package org.example

fun main(args: Array<String>) {
    var tabTest:Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    var tabResultat = sommeCumulative(tabTest)

    afficheTableau(tabResultat)
}

fun sommeCumulative(tabEntiers: Array<Int>):Array<Int> {
    val tabCopie = tabEntiers.copyOf()
    for(i in 0 .. tabCopie.size-1) {
        tabCopie[i] = 0
        for(j in 0..i){
            tabCopie[i] += tabEntiers[j]
        }
    }

    return tabCopie
}

fun afficheTableau(tabEntiers: Array<Int>){
    for(i in 0 .. tabEntiers.size-1) {
        println(tabEntiers[i])
    }
}