package com.maxxxwk.hometask3_1

fun <T> getMostRepeatedElement(list: List<T>) =
    list.groupBy { it }.values.maxBy { it.size }?.get(0)

data class Person(val name: String, val age: Int)

fun main() {
    val list1 = listOf(12, 34, 12, 12, 4, 11, 98, 37, 37, 12)
    val person1 = Person("Max", 20)
    val person2 = Person("Andrew", 25)
    val person3 = Person("Alex", 23)
    val list2 = listOf(person1, person1, person2, person1, person1, person3, person3)
    println(getMostRepeatedElement<Int>(list1))
    println(getMostRepeatedElement<Person>(list2))
}