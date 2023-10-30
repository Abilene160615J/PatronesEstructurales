package structural_pattern.proxy

class SecurityService {
    fun authorization(user:String, password:String): Boolean{
        return if (user == "abilene" && password =="t0ps3cr3t") {
            println("usuario $user autorizado")
            true
        }else{
            println("usuario $user No autorizado"  )
            false

        }
        return ((user.equals("abileneavesan")&&(password =="t0pSecr3et")))
    }
}
