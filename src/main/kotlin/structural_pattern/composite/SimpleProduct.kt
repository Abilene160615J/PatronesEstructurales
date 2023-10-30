package structural_pattern.composite

class SimpleProduct (
    name:String, price: Double, val brand:String,
    quantity: Long=1 ):
    AbstractProduct(name,tax= 0.0, price, quantity){

    }

//name:String, price:Double, val brand:String, impuesto:Double, catidad:Int):
//AbstractProduct(name, price, impuesto,catidad)