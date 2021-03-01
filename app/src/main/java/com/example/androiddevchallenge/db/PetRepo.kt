package com.example.androiddevchallenge.db

import com.example.androiddevchallenge.R

class PetRepo {
    val cerberus = PetObj(
        "1",
        "Cerberus",
        450,
        "In Greek mythology, Cerberus (/ˈsɜːrbərəs/;[2] Greek: Κέρβερος Kérberos [ˈkerberos]), often referred to as the hound of Hades, is a multi-headed dog that guards the gates of the Underworld to prevent the dead from leaving. He was the offspring of the monsters Echidna and Typhon, and was usually described as having three heads, a serpent for a tail, and snakes protruding from multiple parts of his body. Cerberus is primarily known for his capture by Heracles, one of Heracles' twelve labours.",
        R.drawable.cerberus,
        Gender.Undefined,
        "Undefined"
    )

    val aralez = PetObj(
        "2",
        "Aralez",
        76,
        "Aralezes (also Aralezner in plural; in Armenian: Արալեզ) are dog-like creatures, or spirits, in Armenian cultural beliefs or in the Armenian mythology, who live in the sky, or on mount Massis (Mount Ararat), according to other imaginations. They were praised with Ara the Beautiful and Shamiram (Semiramis) in Old Armenia. Armenians believed that aralezes descended from the sky to lick the wounds of dead heroes so they could relive or resurrect.",
        R.drawable.aralez,
        Gender.Female,
        "Legendary creature"
    )

    val cadejo = PetObj(
        "3",
        "Cadejo",
        365,
        "Similar to the Okuri-Inu, the Cadejo of Central American folklore might help or eat you. The legend speaks of two demons, a black Cadejo and a white Cadejo. One protects travelers from harm and theft. The other leads to bad decisions and danger and stands on two legs and throws punches like a human. Unfortunately, legends disagree on which Cadejo is which, and turning your back or speaking to either makes you go mad. So the upside of meeting one is pretty small.",
        R.drawable.cadejo,
        Gender.Undefined,
        "Spiritus Maleficus"
    )

    val okuri = PetObj(
        "4",
        "Okuri-Inu",
        896,
        "This demon dog of Japanese mythology is a good news/bad news monster. The good news: his ferocity keeps other demons away while he's following you. The bad news: If you stumble while walking, he's going to eat you up. But all isn't lost. You can fool the demon if you pretend you stopped on purpose to take a rest by saying, \"This is exhausting,\" or, \"Sure am glad I stopped on purpose and went face first into the ground so I could check out this mud puddle,\" or something like that.",
        R.drawable.okuri,
        Gender.Female,
        "Spirutus Animalicus"
    )

    val anubis = PetObj(
        "5",
        "Anubis",
        110,
        "Anubis or Inpu, Anpu in Ancient Egyptian (/əˈnjuːbɪs/;[1] Ancient Greek: Ἄνουβις, Egyptian: inpw, Coptic: ⲁⲛⲟⲩⲡ Anoup) is the Greek name of the god of death, mummification, embalming, the afterlife, cemeteries, tombs, and the Underworld, in ancient Egyptian religion, usually depicted as a canine or a man with a canine head. Archeologists have identified Anubis's sacred animal as an Egyptian canid, the African golden wolf. The African wolf was formerly called the \"African golden jackal\", until a 2015 genetic analysis updated the taxonomy and the common name for the species.[2][3][4] As a result, Anubis is often referred to as having a \"jackal\" head, but this \"jackal\" is now more properly called a \"wolf\".",
        R.drawable.anubis,
        Gender.Male,
        "Wolfus Emperatus"
    )

    internal val listOfPets = listOf(
        cerberus, aralez, cadejo, okuri, anubis
    )

    internal fun getPetById(id: String): PetObj? {
        return listOfPets.find { it.id == id }
    }
}