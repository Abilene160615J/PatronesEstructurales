package structural_pattern.proxy

import java.lang.Exception

fun main(){
    val securedFile = SecuredFile()
    securedFile.read("read.md")

    securedFile.password = "secret"
    securedFile.read("read.md")

    val user = "abilenee"
    val password = "t0ps3cr3t"
    val process = 1
    val processExecutor = ServiceFactory.createProcessExecutor()
    try {
        processExecutor.executeProcess(process,user,password)
    } catch (e:Exception){
        println(e.message)
    }
}
