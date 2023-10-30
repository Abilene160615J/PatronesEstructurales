package structural_pattern.decorator2

fun main(){
    val pine= PineChristmasTree()
    val christmasTree = BubbleLights(pine)
    val decorateChristmasTree= Sphere(christmasTree)

    val decorated = Star(BubbleLights(Sphere(PineChristmasTree())))

    println(decorateChristmasTree.decorate())
    println(decorated.decorate())
}