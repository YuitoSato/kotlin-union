package io.github.yuitosato.kotlinunion

sealed interface Union2<out A, out B> {

    fun <T> match(
        transformA: (A) -> T,
        transformB: (B) -> T,
    ): T {
        return when (this) {
            is UnionA -> transformA(value)
            is UnionB -> transformB(value)
        }
    }
}

sealed interface Union3<out A, out B, out C> {

    fun <T> match(
        transformA: (A) -> T,
        transformB: (B) -> T,
        transformC: (C) -> T,
    ): T {
        return when (this) {
            is UnionA -> transformA(value)
            is UnionB -> transformB(value)
            is UnionC -> transformC(value)
        }
    }
}

sealed interface Union4<out A, out B, out C, out D> {

    fun <T> match(
        transformA: (A) -> T,
        transformB: (B) -> T,
        transformC: (C) -> T,
        transformD: (D) -> T,
    ): T {
        return when (this) {
            is UnionA -> transformA(value)
            is UnionB -> transformB(value)
            is UnionC -> transformC(value)
            is UnionD -> transformD(value)
        }
    }
}

sealed interface Union5<out A, out B, out C, out D, out E> {

    fun <T> match(
        transformA: (A) -> T,
        transformB: (B) -> T,
        transformC: (C) -> T,
        transformD: (D) -> T,
        transformE: (E) -> T,
    ): T {
        return when (this) {
            is UnionA -> transformA(value)
            is UnionB -> transformB(value)
            is UnionC -> transformC(value)
            is UnionD -> transformD(value)
            is UnionE -> transformE(value)
        }
    }
}

sealed interface Union6<out A, out B, out C, out D, out E, out F> {

    fun <T> match(
        transformA: (A) -> T,
        transformB: (B) -> T,
        transformC: (C) -> T,
        transformD: (D) -> T,
        transformE: (E) -> T,
        transformF: (F) -> T,
    ): T {
        return when (this) {
            is UnionA -> transformA(value)
            is UnionB -> transformB(value)
            is UnionC -> transformC(value)
            is UnionD -> transformD(value)
            is UnionE -> transformE(value)
            is UnionF -> transformF(value)
        }
    }
}

sealed interface Union7<out A, out B, out C, out D, out E, out F, out G> {

    fun <T> match(
        transformA: (A) -> T,
        transformB: (B) -> T,
        transformC: (C) -> T,
        transformD: (D) -> T,
        transformE: (E) -> T,
        transformF: (F) -> T,
        transformG: (G) -> T,
    ): T {
        return when (this) {
            is UnionA -> transformA(value)
            is UnionB -> transformB(value)
            is UnionC -> transformC(value)
            is UnionD -> transformD(value)
            is UnionE -> transformE(value)
            is UnionF -> transformF(value)
            is UnionG -> transformG(value)
        }
    }
}

sealed interface Union8<out A, out B, out C, out D, out E, out F, out G, out H> {

    fun <T> match(
        transformA: (A) -> T,
        transformB: (B) -> T,
        transformC: (C) -> T,
        transformD: (D) -> T,
        transformE: (E) -> T,
        transformF: (F) -> T,
        transformG: (G) -> T,
        transformH: (H) -> T,
    ): T {
        return when (this) {
            is UnionA -> transformA(value)
            is UnionB -> transformB(value)
            is UnionC -> transformC(value)
            is UnionD -> transformD(value)
            is UnionE -> transformE(value)
            is UnionF -> transformF(value)
            is UnionG -> transformG(value)
            is UnionH -> transformH(value)
        }
    }
}

sealed interface Union9<out A, out B, out C, out D, out E, out F, out G, out H, out I> {

    fun <T> match(
        transformA: (A) -> T,
        transformB: (B) -> T,
        transformC: (C) -> T,
        transformD: (D) -> T,
        transformE: (E) -> T,
        transformF: (F) -> T,
        transformG: (G) -> T,
        transformH: (H) -> T,
        transformI: (I) -> T,
    ): T {
        return when (this) {
            is UnionA -> transformA(value)
            is UnionB -> transformB(value)
            is UnionC -> transformC(value)
            is UnionD -> transformD(value)
            is UnionE -> transformE(value)
            is UnionF -> transformF(value)
            is UnionG -> transformG(value)
            is UnionH -> transformH(value)
            is UnionI -> transformI(value)
        }
    }
}

sealed interface Union10<out A, out B, out C, out D, out E, out F, out G, out H, out I, out J> {

    fun <T> match(
        transformA: (A) -> T,
        transformB: (B) -> T,
        transformC: (C) -> T,
        transformD: (D) -> T,
        transformE: (E) -> T,
        transformF: (F) -> T,
        transformG: (G) -> T,
        transformH: (H) -> T,
        transformI: (I) -> T,
        transformJ: (J) -> T,
    ): T {
        return when (this) {
            is UnionA -> transformA(value)
            is UnionB -> transformB(value)
            is UnionC -> transformC(value)
            is UnionD -> transformD(value)
            is UnionE -> transformE(value)
            is UnionF -> transformF(value)
            is UnionG -> transformG(value)
            is UnionH -> transformH(value)
            is UnionI -> transformI(value)
            is UnionJ -> transformJ(value)
        }
    }
}

data class UnionA<A>(val value: A) :
    Union2<A, Nothing>,
    Union3<A, Nothing, Nothing>,
    Union4<A, Nothing, Nothing, Nothing>,
    Union5<A, Nothing, Nothing, Nothing, Nothing>,
    Union6<A, Nothing, Nothing, Nothing, Nothing, Nothing>,
    Union7<A, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>,
    Union8<A, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>,
    Union9<A, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>,
    Union10<A, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

data class UnionB<B>(val value: B) :
    Union2<Nothing, B>,
    Union3<Nothing, B, Nothing>,
    Union4<Nothing, B, Nothing, Nothing>,
    Union5<Nothing, B, Nothing, Nothing, Nothing>,
    Union6<Nothing, B, Nothing, Nothing, Nothing, Nothing>,
    Union7<Nothing, B, Nothing, Nothing, Nothing, Nothing, Nothing>,
    Union8<Nothing, B, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>,
    Union9<Nothing, B, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>,
    Union10<Nothing, B, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

data class UnionC<C>(val value: C) :
    Union3<Nothing, Nothing, C>,
    Union4<Nothing, Nothing, C, Nothing>,
    Union5<Nothing, Nothing, C, Nothing, Nothing>,
    Union6<Nothing, Nothing, C, Nothing, Nothing, Nothing>,
    Union7<Nothing, Nothing, C, Nothing, Nothing, Nothing, Nothing>,
    Union8<Nothing, Nothing, C, Nothing, Nothing, Nothing, Nothing, Nothing>,
    Union9<Nothing, Nothing, C, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>,
    Union10<Nothing, Nothing, C, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

data class UnionD<D>(val value: D) :
    Union4<Nothing, Nothing, Nothing, D>,
    Union5<Nothing, Nothing, Nothing, D, Nothing>,
    Union6<Nothing, Nothing, Nothing, D, Nothing, Nothing>,
    Union7<Nothing, Nothing, Nothing, D, Nothing, Nothing, Nothing>,
    Union8<Nothing, Nothing, Nothing, D, Nothing, Nothing, Nothing, Nothing>,
    Union9<Nothing, Nothing, Nothing, D, Nothing, Nothing, Nothing, Nothing, Nothing>,
    Union10<Nothing, Nothing, Nothing, D, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

data class UnionE<E>(val value: E) :
    Union5<Nothing, Nothing, Nothing, Nothing, E>,
    Union6<Nothing, Nothing, Nothing, Nothing, E, Nothing>,
    Union7<Nothing, Nothing, Nothing, Nothing, E, Nothing, Nothing>,
    Union8<Nothing, Nothing, Nothing, Nothing, E, Nothing, Nothing, Nothing>,
    Union9<Nothing, Nothing, Nothing, Nothing, E, Nothing, Nothing, Nothing, Nothing>,
    Union10<Nothing, Nothing, Nothing, Nothing, E, Nothing, Nothing, Nothing, Nothing, Nothing>

data class UnionF<F>(val value: F) :
    Union6<Nothing, Nothing, Nothing, Nothing, Nothing, F>,
    Union7<Nothing, Nothing, Nothing, Nothing, Nothing, F, Nothing>,
    Union8<Nothing, Nothing, Nothing, Nothing, Nothing, F, Nothing, Nothing>,
    Union9<Nothing, Nothing, Nothing, Nothing, Nothing, F, Nothing, Nothing, Nothing>,
    Union10<Nothing, Nothing, Nothing, Nothing, Nothing, F, Nothing, Nothing, Nothing, Nothing>

data class UnionG<G>(val value: G) :
    Union7<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, G>,
    Union8<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, G, Nothing>,
    Union9<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, G, Nothing, Nothing>,
    Union10<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, G, Nothing, Nothing, Nothing>

data class UnionH<H>(val value: H) :
    Union8<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, H>,
    Union9<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, H, Nothing>,
    Union10<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, H, Nothing, Nothing>

data class UnionI<I>(val value: I) :
    Union9<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, I>,
    Union10<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, I, Nothing>

data class UnionJ<J>(val value: J) :
    Union10<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, J>
