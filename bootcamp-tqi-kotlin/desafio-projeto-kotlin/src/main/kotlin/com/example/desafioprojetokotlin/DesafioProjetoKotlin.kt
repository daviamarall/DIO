package com.example.desafioprojetokotlin

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} matriculado na formação $nome.")
    }
}

fun main() {
    val formacaoFullStack = Formacao(
        nome = "Desenvolvedor Full Stack",
        nivel = Nivel.BASICO,
        conteudos = listOf(
            ConteudoEducacional("Introdução ao Git e Controle de Versões", 8),
            ConteudoEducacional("Introdução ao GitHub e comandos para trabalhar em equipe", 8),
            ConteudoEducacional("Criando um repositório para seus projetos inovadores", 6),
            ConteudoEducacional("Fundamentos de Arquitetura de Sistemas", 6),
            ConteudoEducacional("Introdução ao Banco de Dados SQL com MySQL", 8)
        )
    )

    val formacaoAndroid = Formacao(
        nome = "Desenvolvedor Android",
        nivel = Nivel.INTERMEDIARIO,
        conteudos = listOf(
            ConteudoEducacional("Criando seu primeiro aplicativo Android com Kotlin", 10),
            ConteudoEducacional("Desenvolvimento integrado de dados em Android", 10),
            ConteudoEducacional("Aplicativos Android para múltiplas telas", 10),
            ConteudoEducacional("Princípios de desenvolvimento ágil de software com Kotlin", 10)
        )
    )

    val formacaoJava = Formacao(
        nome = "Desenvolvedor Java",
        nivel = Nivel.DIFICIL,
        conteudos = listOf(
            ConteudoEducacional("Introdução ao Java", 8),
            ConteudoEducacional("Desenvolvimento básico em Java", 12),
            ConteudoEducacional("Fundamentos de Orientação a Objetos com Java", 10),
            ConteudoEducacional("Trabalhando com Banco de Dados utilizando JDBC e JPA", 12)
        )
    )

    val formacaoPython = Formacao(
        nome = "Desenvolvedor Python",
        nivel = Nivel.INTERMEDIARIO,
        conteudos = listOf(
            ConteudoEducacional("Introdução ao Python", 8),
            ConteudoEducacional("Fundamentos para a Análise de Dados com Python", 12),
            ConteudoEducacional("Programação para internet com Python", 12),
            ConteudoEducacional("Construindo um jogo multiplayer com Python", 10)
        )
    )

    val formacaoDataScience = Formacao(
        nome = "Data Science",
        nivel = Nivel.INTERMEDIARIO,
        conteudos = listOf(
            ConteudoEducacional("Introdução à Ciência de Dados", 10),
            ConteudoEducacional("Fundamentos de Estatística com Python", 12),
            ConteudoEducacional("Análise de Dados com Python e Pandas", 12),
            ConteudoEducacional("Visualização de Dados com Python e Matplotlib", 12)
        )
    )

    // Exemplo de matrícula
    val usuario = Usuario("João")
    formacaoFullStack.matricular(usuario)

    val usuario2 = Usuario("Maria")
    formacaoAndroid.matricular(usuario2)
    formacaoJava.matricular(usuario2)

    val usuario3 = Usuario("José")
    formacaoPython.matricular(usuario3)
    formacaoDataScience.matricular(usuario3)

    val usuario4 = Usuario("Ana")
    formacaoFullStack.matricular(usuario4)
    formacaoAndroid.matricular(usuario4)
    formacaoJava.matricular(usuario4)
    formacaoPython.matricular(usuario4)


    //Imprime uma lista de pessoas matriculadas em cada formação.
    println("Formação: ${formacaoFullStack.nome}")
    println("Formação: ${formacaoAndroid.nome}")
    println("Formação: ${formacaoJava.nome}")
    println("Formação: ${formacaoPython.nome}")
    println("Formação: ${formacaoDataScience.nome}")

    //Imprime a quantidade de pessoas matriculadas em cada formação.
    println("Quantidade de pessoas matriculadas na formação ${formacaoFullStack.nome}: ${formacaoFullStack.inscritos.size}")
    println("Quantidade de pessoas matriculadas na formação ${formacaoAndroid.nome}: ${formacaoAndroid.inscritos.size}")
    println("Quantidade de pessoas matriculadas na formação ${formacaoJava.nome}: ${formacaoJava.inscritos.size}")
    println("Quantidade de pessoas matriculadas na formação ${formacaoPython.nome}: ${formacaoPython.inscritos.size}")
    println("Quantidade de pessoas matriculadas na formação ${formacaoDataScience.nome}: ${formacaoDataScience.inscritos.size}")

    //Imprime a quantidade total de pessoas matriculadas em todas as formações.
    val totalInscritos = formacaoFullStack.inscritos.size + formacaoAndroid.inscritos.size + formacaoJava.inscritos.size + formacaoPython.inscritos.size + formacaoDataScience.inscritos.size
    println("Quantidade total de pessoas matriculadas em todas as formações: $totalInscritos")

    //Imprime a quantidade total de horas de todas as formações.
    val totalHoras = formacaoFullStack.conteudos.sumOf { it.duracao } + formacaoAndroid.conteudos.sumOf { it.duracao } + formacaoJava.conteudos.sumOf { it.duracao } + formacaoPython.conteudos.sumOf { it.duracao } + formacaoDataScience.conteudos.sumOf { it.duracao }
    println("Quantidade total de horas de todas as formações: $totalHoras")













}
