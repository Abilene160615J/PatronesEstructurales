package structural_pattern.flyweight

fun main(){
    val playListAbilene = PlayList("musica popular")
    playListAbilene.addPlayItem("la llorona")
    playListAbilene.addPlayItem("la martiniana")
    playListAbilene.printList()
    playListAbilene.addPlayItem("La sandunga")
    playListAbilene.printList()

    val playListAntonio= PlayList("musica rock")
    playListAntonio.addPlayItem("la llorona")
    playListAntonio.addPlayItem("rock is dead")
    playListAntonio.printList()
    playListAntonio.addPlayItem("La plaga")
    playListAntonio.addPlayItem("La sandunga")
    playListAntonio.printList()


}