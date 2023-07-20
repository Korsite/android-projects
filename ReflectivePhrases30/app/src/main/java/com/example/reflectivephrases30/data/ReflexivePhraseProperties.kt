package com.example.reflectivephrases30.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.reflectivephrases30.R

data class ReflexivePhraseProperties(
    @StringRes val name : Int,
    @DrawableRes val picture : Int,
    @StringRes val phrase : Int
)

val ReflexivePhraseData = listOf<ReflexivePhraseProperties>(
    ReflexivePhraseProperties(R.string.Socrates, R.drawable.socrates1, R.string.Phrase1_Scrates),
    ReflexivePhraseProperties(R.string.Socrates, R.drawable.socrates2, R.string.Phrase2_Scrates),
    ReflexivePhraseProperties(R.string.Socrates, R.drawable.socrates3, R.string.Phrase3_Scrates),

    ReflexivePhraseProperties(R.string.Aristotle, R.drawable.platon1, R.string.Phrase1_Platon),
    ReflexivePhraseProperties(R.string.Aristotle, R.drawable.platon2, R.string.Phrase2_Platon),
    ReflexivePhraseProperties(R.string.Aristotle, R.drawable.platon3, R.string.Phrase3_Platon),


    ReflexivePhraseProperties(R.string.Aristotle, R.drawable.aristoteles1, R.string.Phrase1_Aristotle),
    ReflexivePhraseProperties(R.string.Aristotle, R.drawable.aristoteles2, R.string.Phrase2_Aristotle),
    ReflexivePhraseProperties(R.string.Aristotle, R.drawable.aristoteles3, R.string.Phrase3_Aristotle),

    ReflexivePhraseProperties(R.string.Diogenes, R.drawable.diogenes1, R.string.Phrase1_Diogenes),
    ReflexivePhraseProperties(R.string.Diogenes, R.drawable.diogenes2, R.string.Phrase2_Diogenes),
    ReflexivePhraseProperties(R.string.Diogenes, R.drawable.diogenes3, R.string.Phrase3_Diogenes),

    ReflexivePhraseProperties(R.string.Epicuro, R.drawable.epicuro1, R.string.Phrase1_Epicuro),
    ReflexivePhraseProperties(R.string.Epicuro, R.drawable.epicuro2, R.string.Phrase2_Epicuro),
    ReflexivePhraseProperties(R.string.Epicuro, R.drawable.epicuro3, R.string.Phrase3_Epicuro),

    ReflexivePhraseProperties(R.string.Epicteto, R.drawable.epicteto1, R.string.Phrase1_Epicuro),
    ReflexivePhraseProperties(R.string.Epicteto, R.drawable.epicteto2, R.string.Phrase2_Epicuro),
    ReflexivePhraseProperties(R.string.Epicteto, R.drawable.epicteto3, R.string.Phrase3_Epicuro),

    ReflexivePhraseProperties(R.string.Seneca, R.drawable.seneca1, R.string.Phrase1_Seneca),
    ReflexivePhraseProperties(R.string.Seneca, R.drawable.seneca2, R.string.Phrase2_Seneca),
    ReflexivePhraseProperties(R.string.Seneca, R.drawable.seneca3, R.string.Phrase3_Seneca),

    ReflexivePhraseProperties(R.string.Democrito, R.drawable.democrito1, R.string.Phrase1_Democrito),

    ReflexivePhraseProperties(R.string.MarcoAurelio, R.drawable.aurelio1, R.string.Phrase1_Aurelio),
    ReflexivePhraseProperties(R.string.MarcoAurelio, R.drawable.aurelio2, R.string.Phrase2_Aurelio),
    ReflexivePhraseProperties(R.string.MarcoAurelio, R.drawable.aurelio3, R.string.Phrase3_Aurelio),

    ReflexivePhraseProperties(R.string.Benedetti, R.drawable.benedetti1, R.string.Phrase1_Benedetti),
    ReflexivePhraseProperties(R.string.Benedetti, R.drawable.benedetti2, R.string.Phrase2_Benedetti),

    ReflexivePhraseProperties(R.string.Churchill, R.drawable.churchill1, R.string.Phrase1_Churchill),

    ReflexivePhraseProperties(R.string.Confucio, R.drawable.confucio1, R.string.Phrase1_Confucio),

    ReflexivePhraseProperties(R.string.George, R.drawable.george1, R.string.Phrase1_George),
)