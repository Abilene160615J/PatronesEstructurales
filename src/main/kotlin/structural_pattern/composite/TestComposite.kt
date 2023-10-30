package structural_pattern.composite

fun main(){
    val main = MainComposite()
    main.buildProducts()
    main.orderSimpleProducts()
    main.orderHomePC()
    main.orderGammerPC()
    main.orderCombo()
    main.orderBig()

}