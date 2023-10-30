package creational_patter.objectPool


class ExecutorThreadPool(
    minInstances: Int, maxInstances: Int, waitTime: Int,
    poolableObjectFactory: IPoolableObjectFactory<ExecutorTask>?
) :  AbstractObjectPool<ExecutorTask>(minInstances, maxInstances, waitTime, poolableObjectFactory)
