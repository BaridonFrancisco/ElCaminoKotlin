package variables

class Variables {
    //val
    /*las variables locales se definen con val
    * se puede asignar solamente una vez*/

    private val numeroEntero:Int=25

    // kotlin puede inferir en el tipo de dato
    private val nombre = "Francisco"

    //var
    /*las variables con var pueden ser reasignadas */

    private var numeroFlotante:Float=2.2f
    private val numeroByte:Byte=127 // desde -128 hasta 127  8 bits
    private val numerShort:Short=-32768 // desde -32768 hasta 32767 16 bits
    private val numeroInt:Int=10 // desde -2,147,483,648 (-2^31) hasta  2,147,483,647 (2^31 - 1) 32bits
    private val numeroLong:Long=9000000L//-9,223,372,036,854,775,808 (-2^63) hasta 9,223,372,036,854,775,807 (2^63 - 1) 64bits
    //tipos flotantes
    private val numeroDouble:Double=1.5 // entre 6-7 digitos
    private val numeroFloat:Float=3.1416f // entre 15-16 digitos
    private val nombreString:String="Francisco Baridon"
    private val caracterChar:Char='a'
    private val valorBoolean:Boolean=true
   // val one:Double= 1 error se debe especificar el tipo double
    // ose a 1.0 no 1



   private fun mostrarVariales(){
        // numeroEntero=25;error
        numeroFlotante=3.1416f
        val c: Int  // el tipo requerido pero no inicializado
        c = 3       // referenciado
    }

    override fun toString(): String {
        return "numeroEntero=$numeroEntero\nnombre='$nombre'\n"+
                "numeroFlotante=$numeroFlotante\nnumeroByte=$numeroByte\n"+
                "numerShort=$numerShort\nnumeroInt=$numeroInt\n"+
                "numeroLong=$numeroLong\nnumeroDouble=$numeroDouble\n" +
                "numeroFloat=$numeroFloat\nnombreString='$nombreString'\n" +
                "caracterChar=$caracterChar\n"+"caracterBooleano=$valorBoolean\n"
    }


}