package br.com.gmfonseca.tcc

fun <T> MutableList<T>.swap(indexA: Int, indexB: Int) {
    val temp = this[indexA]
    this[indexA] = this[indexB]
    this[indexB] = temp
}
