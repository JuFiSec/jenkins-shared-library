def call(Closure body) {
    echo "Début de l'étape personnalisée"
    body()
    echo "Fin de l'étape personnalisée"
}