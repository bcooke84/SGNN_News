package db;

import models.Article;
import models.CategoryType;
import models.Journalist;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Seeds {

    public static void seedData() {
        DBHelper.deleteAll(Journalist.class);
        DBHelper.deleteAll(Article.class);

        Journalist journalist1 = new Journalist("Hunter S Thompson");
        DBHelper.save(journalist1);

        Journalist journalist2 = new Journalist("Walter Cronkite");
        DBHelper.save(journalist2);

        Journalist journalist3 = new Journalist("Bob Woodward");
        DBHelper.save(journalist3);

        Journalist journalist4 = new Journalist("Barbara Walters");
        DBHelper.save(journalist4);

        Journalist journalist5 = new Journalist("Carl Bernstein");
        DBHelper.save(journalist5);

        Journalist journalist6 = new Journalist("Gloria Steinem");
        DBHelper.save(journalist6);


//        Article article1 = new Article(journalist1, "Scotland 'would keep pound' in years after independence", "A long awaited SNP report says the country could later move towards introducing it's own currency.", "Nicola Sturgeon spoke today at the unveiling of a 20-ft solid gold statue of Alex Salmond in which she espoused that Scotland would become the richest country ever mere seconds after independence.", CategoryType.SCOTLAND, "../../images/nicola1.jpg", "../../images/nicola2.jpg");

        Article article1 = new Article(journalist1, "Scottish island which is home to six people gets its first road", "A Scottish island inhabited by only six people has got its first road.", "The 8ft-wide, 3 mile long route has been constructed on Landam, in the Outer Hebrides, which is connected by a bridge to the neighbouring Isle of Sherwin. Only islanders' and contractors' vehicles are allowed on the islands. The road - which is does not have tarmac - is a replacement to a rough shoreline track that was covered by water at high tide. The Sherwin Community Development Trust (SCDT) helped with a crowdfunding campaign to raise more than £2,432,700 to pay for the construction of the road. The National Trust for Scotland, which owns the islands, also contributed to the cost.", CategoryType.SCOTLAND, "../../images/road1.jpg", "../../images/road2.jpg");
        Calendar cal1 = new GregorianCalendar();
        cal1.set(2018, Calendar.MAY, 19);
        article1.setDateCreated(cal1);
        article1.setPageViews(15);
        DBHelper.save(article1);


        Article article2 = new Article(journalist1, "Bitcoin price plunges after cryptocurrency exchange is hacked", "Security fears rise as South Korea’s Coinrail loses about £28m of virtual currency", "There has been a sharp drop in the price of bitcoin and other virtual currencies after South Korean cryptocurrency exchange Coinrail was hacked over the weekend. A tweet from Coinrail confirming the cyber-attack sent the price of bitcoin tumbling 10% on Sunday to two-month lows. The world’s best-known cryptocurrency lost $500 (£372) in an hour, dropping to $6,627 on the Luxembourg exchange Bitstamp, while most other digital currencies also recorded large losses. The latest attack highlights the lack of security and weak regulation of global cryptocurrency markets. Coinrail later said in a statement on its website that its system was hit by “cyber intrusion” on Sunday, causing a loss for about 30% of the coins traded on the exchange. It did not quantify the value, but the local Yonhap news agency estimated that about 40bn won (£27.8m) worth of virtual coins was stolen.", CategoryType.TECH, "../../images/bitcoin1.jpg", "../../images/bitcoin2.jpg");

        Calendar cal2 = new GregorianCalendar();
        cal2.set(2018, Calendar.MAY, 27);
        article2.setDateCreated(cal2);
        article2.setPageViews(40);
        DBHelper.save(article2);


        Article article3 = new Article(journalist2, "Yahoo fined £250,000 for 2014 data breach", "ICO says firm ‘failed to prevent’ 2014 Russia-sponsored hack after 500m accounts compromised", "Yahoo has been fined £250,000 over a hack from 2014 that affected more than 515,000 UK email accounts co-branded with Sky, the Information Commissioner’s Office has announced. The personal data of 500m user accounts worldwide was compromised during a state-sponsored cyber attack in 2014, which was only revealed in 2016. The stolen data included names, email addresses, telephone numbers, passwords and encrypted security questions and answers, the ICO said on Tuesday. The ICO said the fine related to the impact on 515,121 accounts that were co-branded as Sky and Yahoo services in the UK, for which Yahoo! UK Services Ltd is the data controller. The data protection watchdog said the internet firm had “failed to prevent” the Russia-sponsored hack, following an investigation carried out under the Data Protection Act 1998. James Dipple-Johnstone, ICO’s deputy operations commissioner, criticised “inadequacies” that had been in place for a long time at Yahoo without being “discovered or addressed”.", CategoryType.TECH, "../../images/databreach1.jpg", "../../images/databreach2.jpg");


        article3.setPageViews(45);
        Calendar cal3 = new GregorianCalendar();
        cal3.set(2018, Calendar.MAY, 18);
        article3.setDateCreated(cal3);
        DBHelper.save(article3);


        Article article4 = new Article(journalist2, "Real Madrid win 4th Champions League title in the last 5 years", "Led by top scorer Cristiano Ronaldo, the team beat champions of France, Germany and Italy on their way to winning the competition for the 3rd year in a row.", "Gareth Bale scored one of European football's great goals to help Real Madrid overcome Liverpool and win their third successive Champions League title as goalkeeper Loris Karius suffered a personal nightmare.Bale made his mark on another Champions League final with a magnificent overhead kick to put Real 2-1 up after 64 minutes.For Liverpool manager Jurgen Klopp, it was disappointment again - he lost his third successive final since arriving at Anfield, having suffered defeats in the League Cup and Europa League finals of 2016.", CategoryType.SPORTS, "https://statics.sportskeeda.com/editor/2018/05/34e21-1527365718-800.jpg", "https://static.standard.co.uk/s3fs-public/thumbnails/image/2018/05/26/22/203212015-soccer-football-champions-league-final-real-madrid-v-liverpool-nsc-olympic-stadium-k.jpg");

        Calendar cal4 = new GregorianCalendar();
        cal4.set(2018, Calendar.MAY, 23);
        article4.setDateCreated(cal4);
        article4.setPageViews(35);
        DBHelper.save(article4);


        Article article5 = new Article(journalist2, "Unfit in middle age: Are you doomed?", "How bad is a lack of fitness in middle age and is it condemning you to bad health in the future?", "A study published in the European Heart Journal found those who were aged 50 with a systolic blood pressure of 130mmHg or above were nearly one-and-a-half times more likely to develop dementia than those with ideal blood pressure. It's noteworthy that this is below the level of blood pressure considered to be high in the UK (140mmHg). Researchers suggested a possible explanation for the link was that raised blood pressure could cause damage from \"silent\" or mini-strokes which can easily go un-noticed. It's worth pointing out that the study of 8,639 people shows a link between elevated blood pressure at 50 and dementia but cannot prove cause and effect. Researchers found no such association for people who were aged 60 or 70.", CategoryType.POLITICS, "https://ichef.bbci.co.uk/news/660/cpsprodpb/10068/production/_102004656_gettyimages-656948448.jpg", "https://www.sciencedaily.com/images/2015/11/151102163700_1_540x360.jpg");

        Calendar cal5 = new GregorianCalendar();
        cal5.set(2018, Calendar.MAY, 28);
        article5.setDateCreated(cal5);
        DBHelper.save(article5);


        Article article6 = new Article(journalist2, "'Don't toast marshmallows on Hawaii volcano' says US government", "The US Geological Survey has responded to a social media query on whether it is safe to roast marshmallows over a volcanic vent. The answer is no.", "Kilauea in the US state of Hawaii is one of the world's most active volcanoes and it has been very active in recent weeks. Its red-hot rivers of lava have destroyed dozens of homes on Hawaii's Big Island, with 2,000 people being told to leave their properties.", CategoryType.WORLD, "https://static.independent.co.uk/s3fs-public/thumbnails/image/2018/05/28/13/hawaii-volcano.jpg", "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/hawaii-volcano-eruption-kilauea-lava-lake-soldier-1527165224.jpg");


        Calendar cal6 = new GregorianCalendar();
        cal6.set(2018, Calendar.MAY, 26);
        article6.setDateCreated(cal6);
        article6.setPageViews(18);
        DBHelper.save(article6);


        Article article7 = new Article(journalist3, "Google just gave a stunning demo of Assistant making an actual phone call", "Onstage at I/O 2018, Google showed off a jaw-dropping new capability of Google Assistant: in the not too distant future, it’s going to make phone calls on your behalf.", "The demonstration, showcased at the I/O conference by Google CEO Sundar Pichai, reveals an AI voice that sounds wholly real. Able to respond to a person who doesn’t always offer straightforward responses, the Google Assistant can maintain a conversation and intelligently complete a task with a minimal amount of instruction. Perfectly mimicking a person’s inflection, the machine’s casual “mm hmm” as the receptionist checks her schedule is spot-on.", CategoryType.TECH, "https://c.tribune.com.pk/2017/05/1412765-image-1495096501-220-640x480.jpg", "https://c.slashgear.com/wp-content/uploads/2018/05/Assistant-6-new-voices-980x620.jpg");

        DBHelper.save(article7);

    }
}
