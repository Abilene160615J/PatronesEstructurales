package creational_patter.abstractfactory

interface IServiceStackAbstractFactory {
    fun getEmployeeService(): IEmployeeService
    fun getProductService(): IProductService

}