package io.blockz.budgeteer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform