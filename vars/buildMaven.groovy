def call(Map config = [:]) {
    def mavenVersion = config.mavenVersion ?: 'Maven 3.9'
    def goals = config.goals ?: 'clean test'
    
    echo "Compilation et tests avec Maven (${goals})..."
    
    // Utilise l'outil Maven configuré dans Jenkins
    sh "mvn ${goals}"
}