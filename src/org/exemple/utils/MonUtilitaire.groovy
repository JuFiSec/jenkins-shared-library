// src/org/exemple/utils/MonUtilitaire.groovy
package org.exemple.utils

class MonUtilitaire implements Serializable {
    static void saluer(script, nom) {
        script.echo "Bonjour de la Shared Library, ${nom} !"
    }

    static String genererMessage(String type) {
        if (type == "succes") {
            return "Opération réussie !"
        } else {
            return "Opération échouée."
        }
    }
}