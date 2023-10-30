package structural_pattern.proxy

class SecuredFile : IFile {
    private  val normaFile = NormalFile()
    var password: String =""

    override fun read(name: String) {
        if (password == "secret"){
            println("Password is correct: $password")
            normaFile.read(name)
        }else {
            println("Incorrect password. Access denied!")
        }
    }
}
