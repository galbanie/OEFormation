package com.github.galbanie.models.dsl

import com.github.galbanie.utils.AnswerType
import com.github.galbanie.utils.Difficulty
import com.github.galbanie.utils.Language
import com.github.galbanie.utils.Multiplicity
import org.jetbrains.exposed.sql.Table

/**
 * Created by Galbanie on 2017-10-05.
 */

object Quiz : Table(){
    val id = integer("id").primaryKey().autoIncrement()
    val name = varchar("name", 100).uniqueIndex()
    val lang = enumeration("lang", Language::class.java)
    val difficulty = enumeration("difficulty", Difficulty::class.java)
}

object Questions : Table(){
    val id = integer("id").primaryKey().autoIncrement()
    val field = reference("field_id", Fields.id)
    val multiplicity = enumeration("multiplicity", Multiplicity::class.java)
    val illustration = varchar("illustration", 100)
}

object Answers : Table(){
    val id = integer("id").primaryKey().autoIncrement()
    val field = reference("field_id", Fields.id)
    val type = enumeration("type",AnswerType::class.java)
}

object QuizContent : Table(){
    val quiz_id = reference("quiz_id", Quiz.id)
    val question_id = reference("question_id", Questions.id)
    val answer_id = reference("answer_id", Answers.id)
    val exact = bool("exact")
}

object Fields : Table(){
    val id = integer("id").primaryKey().autoIncrement()
    val french = text("french")
    val english = text("english")
}