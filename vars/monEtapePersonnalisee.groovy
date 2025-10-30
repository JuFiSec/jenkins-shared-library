// vars/monEtapePersonnalisee.groovy
def call(body) {
    // Permet d'appeler cette fonction comme une étape du pipeline
    // Exemple : monEtapePersonnalisee { echo "Contenu du bloc" }
    script { // On garde le 'script {}' si le 'body()' contient du code Groovy arbitraire
        body() // Exécute le bloc de code passé en paramètre depuis le Jenkinsfile
    }
}