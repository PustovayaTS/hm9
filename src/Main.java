import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        TelephoneDirectory directory = new TelephoneDirectory();

        directory.addMap("Ваня Иванов","+79536567432");
        directory.addMap("Петя Петров","+79996567521");
        directory.addMap("Александр Пушкин","+79136567401");
        directory.addMap("Андрей Горбунов","+79536568888");
        directory.addMap("Глеб Глебов","+79056567433");
        directory.addMap("Антон Антонов","+79176572245");
        directory.addMap("Яков Зайцев","+79136567409");
        directory.addMap("Анастасия Золоторева","+79536563697");
        directory.addMap("Иван Герасимов","+79226567528");
        directory.addMap("Даша Кудрявцева","+79668257437");
        directory.addMap("Сергей Рукавников","+79536567475");
        directory.addMap("Яна Петрова","+79166567999");
        directory.addMap("Наташа Иванова","+79536567777");
        directory.addMap("Ирина Пушкина","+79136567413");
        directory.addMap("Полина Горбунова","+79536567632");
        directory.addMap("Антонина Глебова","+79056784032");
        directory.addMap("Дарина Антонова","+79530607455");
        directory.addMap("Татьяна Зайцева","+79666569889");
        directory.addMap("Дмитрий Золоторев","+79886567400");
        directory.addMap("Лена Герасимова","+79058740641");


        System.out.println(directory.getDirectory());
        System.out.println(directory.getValue("Татьяна Зайцева"));
    }


}