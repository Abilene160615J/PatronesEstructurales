package creational_patter.objectPool

interface IObjectPool<T: IPoolableObject> {
    fun getObject(): T

    fun releaseObject(pooledObject: T)
}
