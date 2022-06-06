//late init can only be used with "var" keyword
private lateinit var phoneNumber:String


//lazy
private val stuff:String by lazy{
    "some string"
}