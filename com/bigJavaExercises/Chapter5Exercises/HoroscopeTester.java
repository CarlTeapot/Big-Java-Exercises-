package com.bigJavaExercises.Chapter5Exercises;

import java.util.Scanner;

public class HoroscopeTester {
    public static void main(String[] args) {
    Horoscope horoscope = new Horoscope();
        System.out.println(horoscope.getDescription());
    }
}

class Horoscope {
    Scanner scanner = new Scanner(System.in);

    private int month;
    private int day;

    public Horoscope() {
        System.out.print("Enter the Month number of your birthday: ");
        month = scanner.nextInt();
        System.out.print("Enter the Day of your birthday: ");
        day = scanner.nextInt();
    }

    public String getDescription() {
      // AQUARIUS
        if (month == 1 && day >= 20)
            return "Despite the “aqua” in its name, Aquarius is actually the last air sign of the zodiac." +
                    "\nAquarius is represented by the water bearer, the mystical healer who bestows water, or life, " +
                    "\nupon the land. Accordingly, Aquarius is the most humanitarian astrological sign.";
        else if (month == 2 && day <= 18)
            return "Despite the “aqua” in its name, Aquarius is actually the last air sign of the zodiac. " +
                    "\nAquarius is represented by the water bearer, the mystical healer who bestows water, or life, upon the land.  " +
                    "\nAccordingly, Aquarius is the most humanitarian astrological sign.";
        // PISCES
        else if (month == 2 && day >= 19)
            return "Pisces, a water sign, is the last constellation of the zodiac. " +
                    "It's symbolized by two fish swimming in opposite directions," +
                    "\nrepresenting the constant division of Pisces' attention between fantasy and reality. As the final sign," +
                    "\nPisces has absorbed every lesson — the joys and the pain, the hopes and the fears — learned by all of the other signs";
        else if (month == 3 && day <= 20)
            return "Pisces, a water sign, is the last constellation of the zodiac. " +
                    "It's symbolized by two fish swimming in opposite directions," +
                    "\nrepresenting the constant division of Pisces' attention between fantasy and reality. As the final sign," +
                    "\nPisces has absorbed every lesson — the joys and the pain, the hopes and the fears — learned by all of the other signs";
        //ARIES
        else if (month == 3 && day >= 21)
            return "Aries loves to be number one, so it’s no surprise that these audacious rams are the first sign of the zodiac. " +
                    "\nBold and ambitious, Aries dives headfirst into even the most challenging situations.";
        else if (month == 4 && day <= 19)
            return "Aries loves to be number one, so it’s no surprise that these audacious rams are the first sign of the zodiac. " +
                    "\nBold and ambitious, Aries dives headfirst into even the most challenging situations.";
        // TAURUS
        else if (month == 4 && day >= 20)
            return "Taurus is an earth sign represented by the bull. Like their celestial spirit animal," +
                    "\nTaureans enjoy relaxing in serene, bucolic environments surrounded by soft sounds, soothing aromas, and succulent flavors.";
        else if (month ==5  && day <= 20)
            return "Taurus is an earth sign represented by the bull. Like their celestial spirit animal," +
                    "\nTaureans enjoy relaxing in serene, bucolic environments surrounded by soft sounds, soothing aromas, and succulent flavors.";
        // Gemini
        else if (month == 5  && day >= 21)
            return "Have you ever been so busy that you wished you could clone yourself just to get everything done? That’s the Gemini experience in a nutshell." +
                    "\nAppropriately symbolized by the celestial twins, this air sign was interested in so many pursuits that it had to double itself. ";
        else if (month == 6  && day <= 20)
            return "Have you ever been so busy that you wished you could clone yourself just to get everything done? That’s the Gemini experience in a nutshell." +
                    "\nAppropriately symbolized by the celestial twins, this air sign was interested in so many pursuits that it had to double itself. ";
        //Cancer
        else if (month == 6 && day >= 21)
            return "Cancer is a cardinal water sign. Represented by the crab, " +
                    "\nthis crustacean seamlessly weaves between the sea and shore representing Cancer’s ability to exist in both emotional and material realms. " +
                    "\nCancers are highly intuitive and their psychic abilities manifest in tangible spaces: " +
                    "\nFor instance, Cancers can effortlessly pick up the energies in a room.";
        else if (month == 7 && day <= 22)
            return "Cancer is a cardinal water sign. Represented by the crab, " +
                    "\nthis crustacean seamlessly weaves between the sea and shore representing Cancer’s ability to exist in both emotional and material realms. " +
                    "\nCancers are highly intuitive and their psychic abilities manifest in tangible spaces: " +
                    "\nFor instance, Cancers can effortlessly pick up the energies in a room.";
        //Leo
        else if (month == 7 && day >= 23)
            return "Roll out the red carpet because Leo has arrived. Leo is represented by the lion and these spirited fire signs are the kings and queens of the celestial jungle." +
                    "\nThey’re delighted to embrace their royal status: " +
                    "\nVivacious, theatrical, and passionate, Leos love to bask in the spotlight and celebrate themselves. ";
        else if (month == 8 && day <= 22 )
            return "Roll out the red carpet because Leo has arrived. Leo is represented by the lion and these spirited fire signs are the kings and queens of the celestial jungle." +
                    "\nThey’re delighted to embrace their royal status: " +
                    "\nVivacious, theatrical, and passionate, Leos love to bask in the spotlight and celebrate themselves. ";
        //Virgo
        else if (month == 8 && day >= 23)
            return "Virgo is an earth sign historically represented by the goddess of wheat and agriculture," +
                    "\nan association that speaks to Virgo’s deep-rooted presence in the material world. " +
                    "\nVirgos are logical, practical, and systematic in their approach to life." +
                    "\nThis earth sign is a perfectionist at heart and isn’t afraid to improve skills through diligent and consistent practice.";
        else if (month == 9 && day <= 22)
            return "Virgo is an earth sign historically represented by the goddess of wheat and agriculture," +
                    "\nan association that speaks to Virgo’s deep-rooted presence in the material world. " +
                    "\nVirgos are logical, practical, and systematic in their approach to life." +
                    "\nThis earth sign is a perfectionist at heart and isn’t afraid to improve skills through diligent and consistent practice.";
        //Libra
        else if (month == 9 && day >= 23)
            return "Libra is an air sign represented by the scales (interestingly, the only inanimate object of the zodiac), an association that reflects Libra's fixation on balance and harmony. " +
                    "\nLibra is obsessed with symmetry and strives to create equilibrium in all areas of life.";
        else if (month == 10 && day <= 22)
            return "Libra is an air sign represented by the scales (interestingly, the only inanimate object of the zodiac), an association that reflects Libra's fixation on balance and harmony. " +
                    "\nLibra is obsessed with symmetry and strives to create equilibrium in all areas of life.";
        //Scorpio
        else if (month == 10 && day >= 23)
            return "Scorpio is one of the most misunderstood signs of the zodiac. " +
                    "\nBecause of its incredible passion and power, Scorpio is often mistaken for a fire sign. " +
                    "\nIn fact, Scorpio is a water sign that derives its strength from the psychic, emotional realm.";
        else if (month == 11 && day <= 21)
            return "Scorpio is one of the most misunderstood signs of the zodiac. " +
                    "\nBecause of its incredible passion and power, Scorpio is often mistaken for a fire sign. " +
                    "\nIn fact, Scorpio is a water sign that derives its strength from the psychic, emotional realm.";
        //Sagittarius
        else if (month == 11 && day >= 22)
            return "Represented by the archer, Sagittarians are always on a quest for knowledge." +
                    "\nThe last fire sign of the zodiac, Sagittarius launches its many pursuits like blazing arrows," +
                    "\nchasing after geographical, intellectual, and spiritual adventures. ";
        else if (month == 12 && day <= 21)
            return "Represented by the archer, Sagittarians are always on a quest for knowledge." +
                    "\nThe last fire sign of the zodiac, Sagittarius launches its many pursuits like blazing arrows," +
                    "\nchasing after geographical, intellectual, and spiritual adventures. ";
        // Capricorn
        else if (month == 12 && day >= 22)
            return "The last earth sign of the zodiac, Capricorn is represented by the sea goat, a mythological creature with the body of a goat and tail of a fish." +
                    "\nAccordingly, Capricorns are skilled at navigating both the material and emotional realms.";
        else if (month == 1 && day <= 19)
            return "The last earth sign of the zodiac, Capricorn is represented by the sea goat, a mythological creature with the body of a goat and tail of a fish." +
                    "\nAccordingly, Capricorns are skilled at navigating both the material and emotional realms.";
        return "Error";
    }
}