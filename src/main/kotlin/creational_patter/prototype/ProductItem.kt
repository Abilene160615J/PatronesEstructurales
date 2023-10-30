package creational_patter.prototype

data class ProductItem(var product: Product):
    IPrototype<ProductItem> {
    override fun clone(): Any {
        return ProductItem(Product(product.name, product.price))
    }
    override fun deepClone(): ProductItem {
        return (this.clone() as ProductItem)
    }
}
