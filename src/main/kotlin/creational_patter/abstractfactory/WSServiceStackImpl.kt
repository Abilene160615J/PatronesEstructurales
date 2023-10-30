package creational_patter.abstractfactory

class WSServiceStackImpl: IServiceStackAbstractFactory {
    override fun getEmployeeService(): IEmployeeService = EmployeeServiceWSImpl()
    override fun getProductService(): IProductService = ProductServiceWSImpl()
}
