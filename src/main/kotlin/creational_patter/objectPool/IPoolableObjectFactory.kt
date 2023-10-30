package creational_patter.objectPool

interface IPoolableObjectFactory<T : IPoolableObject?> {
    fun createNew(): T
}