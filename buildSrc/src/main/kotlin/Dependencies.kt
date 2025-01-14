object Versions {
    const val javax = "1"
    const val objenesis = "3.2"
    const val lorem = "2.1"
    const val jupiter = "5.8.2"
    const val mockk = "1.12.3"
    const val kotlin = "1.6.10"
    const val kotlinter = "3.9.0"
    const val detekt = "1.19.0"
    const val kover = "0.5.0"
}

object Dependency {
    const val objenesis = "org.objenesis:objenesis:${Versions.objenesis}"
    const val lorem = "com.thedeanda:lorem:${Versions.lorem}"

    object JavaX {
        const val inject = "javax.inject:javax.inject:${Versions.javax}"
    }

    object Test {
        const val junitJupiter = "org.junit.jupiter:junit-jupiter:${Versions.jupiter}"
        const val mockK = "io.mockk:mockk:${Versions.mockk}"
    }
}
