class Dictionnaire {
    var daictionnaire = ArrayList<Entree>()

    //
    fun ajouter(e:Entree){
        if (daictionnaire.contains(e)){
            throw Exception("l'entree appartien deja au daictionnaire ")
        }else{
            daictionnaire.add(e)
        }
    }

    //
    fun nombreEntrees():Int{
        return daictionnaire.size
    }

    //
    fun supprimer(e:Entree):Boolean{
        var isexiste = false
        if (daictionnaire.contains(e)){
            daictionnaire.remove(e)
            isexiste = true
        }
        return isexiste
    }

    //
    fun supprimer(motFrancais:String):Boolean {
        var isexiste = false
        for (i in daictionnaire) {
            if (i.motFrancais == motFrancais) {
                daictionnaire.remove(i)
                isexiste = true
            }
        }
        return isexiste
    }

    //
    fun anFr(motFrancais:String):ArrayList<String>{
        var motEngiaisListe = ArrayList<String>()
        for (i in daictionnaire){
            if (i.motAnglais == motFrancais){
                motEngiaisListe.add(i.motFrancais)
            }
        }
        return motEngiaisListe
    }

    //
    fun motsAnglais():ArrayList<String>{
        var motsAnglaisListe = ArrayList<String>()
        for (i in daictionnaire){
            if (!motsAnglaisListe.contains(i.motAnglais)){
                motsAnglaisListe.add(i.motAnglais)
            }
        }
        return motsAnglaisListe
    }

    //
    fun dictionnaireEnFr():HashMap<String,ArrayList<String>>{
        var map = HashMap<String,ArrayList<String>>()

        for (i in daictionnaire){
            val motsFrancais = map.getOrDefault(i.motAnglais, ArrayList())
            motsFrancais.add(i.motFrancais)
            map[i.motAnglais] = motsFrancais

        }
        return map
    }

    override fun toString(): String {
        return "DAICTIONNAIRE = ${daictionnaire.joinToString()} "
    }

    //



}



