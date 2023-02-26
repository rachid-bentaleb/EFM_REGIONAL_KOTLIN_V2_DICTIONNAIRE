

//la methode d'extension estVideOuBlanche() permettant de rotourner true si la chaine est blanket
// et false si la chaine est empty

    fun String.estVideOuBlanche(): Boolean? {
        var checkString: Boolean? = null
        if (this.isEmpty()){ checkString = false}
        else if (this.isBlank()){checkString = true}
        return checkString
    }
// la methode d'extension VideOuBlancheMessage() permettant de verifier si la chaine est empty ou blank
    fun String.VideOuBlancheMessage():String{
        var message = ""
        if(this.estVideOuBlanche() == true){
            message = "your string is blank"
        }
        else if(this.estVideOuBlanche() == false){
            message = "your string is empty"
        }
        else {
            message = "your string is not empty and not blank"
        }
        return message
    }

    // la method sigle()
    fun String.sigle():String{
        var Stringacronyme = ""
        if (this.estVideOuBlanche() == true || this.estVideOuBlanche() == false){
            Stringacronyme = this.VideOuBlancheMessage()
        }
        else{
            val myString= this.split(" ").filter { it.isNotBlank() }
            val acronym = StringBuilder()
            for (mot in myString) {
                acronym.append(mot[0].toUpperCase())
            }
            Stringacronyme = acronym.toString()
        }
        return Stringacronyme
    }
