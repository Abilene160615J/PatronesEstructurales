package creational_patter.objectPool

interface IPoolableObject {
    fun validate(): Boolean
    fun invalidate()
}

