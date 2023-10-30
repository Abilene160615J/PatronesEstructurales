package creational_patter.abstractfactory

class ProductServiceRestImpl: IProductService {
    override fun getProducts(): List<String> {
        return ApiRestProducts.fetchAll()
    }
}
