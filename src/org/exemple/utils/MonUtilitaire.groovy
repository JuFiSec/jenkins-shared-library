package org.exemple.utils

class MonUtilitaire implements Serializable {
    
    def script
    
    MonUtilitaire(script) {
        this.script = script
    }
    
    def saluer(nom) {
        script.echo "Bonjour de la Shared Library, ${nom} !"
    }
    
    def faireQuelqueChose() {
        script.echo "Opération réussie !"
        return true
    }
}