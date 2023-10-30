package creational_patter.objectPool


class ExecutorTaskFactory : IPoolableObjectFactory<ExecutorTask?> {
    override fun createNew(): ExecutorTask {
        return ExecutorTask()
    }
}

