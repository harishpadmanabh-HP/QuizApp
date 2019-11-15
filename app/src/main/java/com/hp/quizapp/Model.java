package com.hp.quizapp;

import java.util.List;

public class Model {

    /**
     * response_code : 0
     * results : [{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"What does a milliner make and sell?","correct_answer":"Hats","incorrect_answers":["Shoes","Belts","Shirts"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"In a standard set of playing cards, which is the only king without a moustache?","correct_answer":"Hearts","incorrect_answers":["Spades","Diamonds","Clubs"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"Which river flows through the Scottish city of Glasgow?","correct_answer":"Clyde","incorrect_answers":["Tay","Dee","Tweed"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"What name represents the letter &quot;M&quot; in the NATO phonetic alphabet?","correct_answer":"Mike","incorrect_answers":["Matthew","Mark","Max"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"A doctor with a PhD is a doctor of what?","correct_answer":"Philosophy","incorrect_answers":["Psychology","Phrenology","Physical Therapy"]},{"category":"General Knowledge","type":"boolean","difficulty":"medium","question":"The US emergency hotline is 911 because of the September 11th terrorist attacks.","correct_answer":"False","incorrect_answers":["True"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"Scotch whisky and Drambuie make up which cocktail?","correct_answer":"Rusty Nail","incorrect_answers":["Screwdriver","Sex on the Beach","Manhattan"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"In the Morse code, which letter is indicated by 3 dots? ","correct_answer":"S","incorrect_answers":["O","A","C"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"What does the &quot;G&quot; mean in &quot;G-Man&quot;?","correct_answer":"Government","incorrect_answers":["Going","Ghost","Geronimo"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"Which language is NOT Indo-European?","correct_answer":"Hungarian","incorrect_answers":["Russian","Greek","Latvian"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"Which essential condiment is also known as Japanese horseradish?","correct_answer":"Wasabi ","incorrect_answers":["Mentsuyu","Karashi","Ponzu"]},{"category":"General Knowledge","type":"boolean","difficulty":"medium","question":"The vapor produced by e-cigarettes is actually water.","correct_answer":"False","incorrect_answers":["True"]},{"category":"General Knowledge","type":"boolean","difficulty":"medium","question":"The sum of all the numbers on a roulette wheel is 666.","correct_answer":"True","incorrect_answers":["False"]},{"category":"General Knowledge","type":"boolean","difficulty":"medium","question":"The word &quot;news&quot; originates from the first letters of the 4 main directions on a compass (North, East, West, South).","correct_answer":"False","incorrect_answers":["True"]},{"category":"General Knowledge","type":"boolean","difficulty":"medium","question":"The bikini is named after the &quot;Bikini Atoll&quot;, an island where the United States conducted tests on atomic bombs.","correct_answer":"True","incorrect_answers":["False"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"Which of these companies does NOT manufacture automobiles?","correct_answer":"Ducati","incorrect_answers":["Nissan","GMC","Fiat"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"What was the destination of the missing flight MH370?","correct_answer":"Beijing","incorrect_answers":["Kuala Lumpur","Singapore","Tokyo"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"A factiod is what?","correct_answer":"A falsehood","incorrect_answers":["Useless trivia","A tiny fact","A scientific figure"]},{"category":"General Knowledge","type":"boolean","difficulty":"medium","question":"Cucumbers are usually more than 90% water.","correct_answer":"True","incorrect_answers":["False"]},{"category":"General Knowledge","type":"boolean","difficulty":"medium","question":"You are allowed to sell your soul on eBay.","correct_answer":"False","incorrect_answers":["True"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"What did the Spanish autonomous community of Catalonia ban in 2010, that took effect in 2012?","correct_answer":"Bullfighting","incorrect_answers":["Fiestas","Flamenco","Mariachi"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"Which of these is the name of a Japanese system of alternative medicine, literally meaning &quot;finger pressure&quot;?","correct_answer":"Shiatsu","incorrect_answers":["Ukiyo","Majime","Ikigai"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"What is the name given to Indian food cooked over charcoal in a clay oven?","correct_answer":"Tandoori","incorrect_answers":["Biryani","Pani puri","Tiki masala"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"What is the German word for &quot;spoon&quot;?","correct_answer":"L&ouml;ffel","incorrect_answers":["Gabel","Messer","Essst&auml;bchen"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"What is the Italian word for &quot;tomato&quot;?","correct_answer":"Pomodoro","incorrect_answers":["Aglio","Cipolla","Peperoncino"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"On average, Americans consume 100 pounds of what per second?","correct_answer":"Chocolate","incorrect_answers":["Potatoes","Donuts","Cocaine"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"What character was once considered to be the 27th letter of the alphabet?","correct_answer":"Ampersand","incorrect_answers":["Interrobang","Tilde","Pilcrow"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"When was Nintendo founded?","correct_answer":"September 23rd, 1889","incorrect_answers":["October 19th, 1891","March 4th, 1887","December 27th, 1894"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"The new One World Trade Center in Manhattan, New York City was designed by which architect? ","correct_answer":"David Childs","incorrect_answers":["Bjarke Ingels","Michael Arad","Fumihiko Maki"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"What direction does the Statue of Liberty face?","correct_answer":"Southeast","incorrect_answers":["Southwest","Northwest","Northeast"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"What year was Apple Inc. founded?","correct_answer":"1976","incorrect_answers":["1978","1980","1974"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"In what year was McDonald&#039;s founded?","correct_answer":"1955","incorrect_answers":["1964","1951","1947"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"Which of the General Mills Corporation&#039;s monster cereals was the last to be released in the 1970&#039;s?","correct_answer":"Fruit Brute","incorrect_answers":["Count Chocula","Franken Berry","Boo-Berry"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"Which iconic Disneyland attraction was closed in 2017 to be remodeled as a &quot;Guardians of the Galaxy&quot; themed ride?","correct_answer":"Twilight Zone Tower of Terror","incorrect_answers":["The Haunted Mansion","Pirates of the Caribbean","Peter Pan&#039;s Flight"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"Apple co-founder Steve Jobs died from complications of which form of cancer?","correct_answer":"Pancreatic","incorrect_answers":["Bone","Liver","Stomach"]},{"category":"General Knowledge","type":"boolean","difficulty":"medium","question":"&quot;Santa Claus&quot; is a variety of melon.","correct_answer":"True","incorrect_answers":["False"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"Computer manufacturer Compaq was acquired for $25 billion dollars in 2002 by which company?","correct_answer":"Hewlett-Packard","incorrect_answers":["Toshiba","Asus","Dell"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"Which slogan did the fast food company, McDonald&#039;s, use before their &quot;I&#039;m Lovin&#039; It&quot; slogan?","correct_answer":"We Love to See You Smile","incorrect_answers":["Why Pay More!?","Have It Your Way","Making People Happy Through Food"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"What was the original name of the search engine &quot;Google&quot;?","correct_answer":"BackRub","incorrect_answers":["CatMassage","SearchPro","Netscape Navigator"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"The website &quot;Shut Up &amp; Sit Down&quot; reviews which form of media?","correct_answer":"Board Games","incorrect_answers":["Television Shows","Video Games","Films"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"Whose greyscale face is on the kappa emoticon on Twitch?","correct_answer":"Josh DeSeno","incorrect_answers":["Justin DeSeno","John DeSeno","Jimmy DeSeno"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"Which of these words means &quot;idle spectator&quot;?","correct_answer":"Gongoozler","incorrect_answers":["Gossypiboma","Jentacular","Meupareunia"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"Which company&#039;s original slogan was &quot;Don&#039;t be evil&quot;?","correct_answer":"Google","incorrect_answers":["Apple","Yahoo","Microsoft"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"What is the currency of Poland?","correct_answer":"Złoty","incorrect_answers":["Ruble","Euro","Krone"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"What is the star sign of someone born on Valentines day?","correct_answer":"Aquarius","incorrect_answers":["Pisces","Capricorn","Scorpio"]},{"category":"General Knowledge","type":"boolean","difficulty":"medium","question":"Popcorn was invented in 1871 by Frederick W. Rueckheim in the USA where he sold the snack on the streets of Chicago.","correct_answer":"False","incorrect_answers":["True"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"What was the name given to Japanese military dictators who ruled the country through the 12th and 19th Century?","correct_answer":"Shogun","incorrect_answers":["Ninja","Samurai","Shinobi"]},{"category":"General Knowledge","type":"boolean","difficulty":"medium","question":"The British organisation CAMRA stands for The Campaign for Real Ale.","correct_answer":"True","incorrect_answers":["False"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"A statue of Charles Darwin sits in what London museum?","correct_answer":"Natural History Museum","incorrect_answers":["Tate","British Museum","Science Museum"]},{"category":"General Knowledge","type":"multiple","difficulty":"medium","question":"What is the highest number of Michelin stars a restaurant can receive?","correct_answer":"Three","incorrect_answers":["Four","Five","Six"]}]
     */

    private int response_code;
    private List<ResultsBean> results;

    public int getResponse_code() {
        return response_code;
    }

    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * category : General Knowledge
         * type : multiple
         * difficulty : medium
         * question : What does a milliner make and sell?
         * correct_answer : Hats
         * incorrect_answers : ["Shoes","Belts","Shirts"]
         */

        private String category;
        private String type;
        private String difficulty;
        private String question;
        private String correct_answer;
        private List<String> incorrect_answers;

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public void setDifficulty(String difficulty) {
            this.difficulty = difficulty;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getCorrect_answer() {
            return correct_answer;
        }

        public void setCorrect_answer(String correct_answer) {
            this.correct_answer = correct_answer;
        }

        public List<String> getIncorrect_answers() {
            return incorrect_answers;
        }

        public void setIncorrect_answers(List<String> incorrect_answers) {
            this.incorrect_answers = incorrect_answers;
        }
    }
}
