import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JsonParser {

    public static void main(String[] args) {

        String filterString = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(generateWherePart(filterString));

        System.out.println();

        String marksData = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                            "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                            "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        System.out.println(getStudentMarks(marksData));


    }

    public static String generateWherePart(String filterString) {
        /*1 . Дана строка sql-запроса "select * from students where ".
        Сформируйте часть WHERE этого запроса, используя StringBuilder.
        Данные для фильтрации приведены ниже в виде json строки.
        Если значение null, то параметр не должен попадать в запрос.
        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        */
        JSONObject jsonData = new JSONObject(filterString);
        StringBuilder wherePart = new StringBuilder();

        for (String key : jsonData.keySet()) {
            if (!"null".equals(jsonData.get(key))) {
                wherePart.append(key).append("=\"").append(jsonData.get(key)).append("\" ");
            }
        }
        return String.valueOf(wherePart).strip().replace(" ", " AND ");
    }


    public static String getStudentMarks(String jsonString) {
        /*
        3* . Дана json строка (можно сохранить в файл и читать из файла)
        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
        {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
        {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
        Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
        Студент [фамилия] получил [оценка] по предмету [предмет].
        */
        JSONArray jsonData = new JSONArray(jsonString);
        StringBuilder marksList = new StringBuilder();

        try {
            for (int i = 0; i < jsonData.length(); i++) {
                JSONObject jsonRecord = new JSONObject(jsonData.get(i).toString());
                marksList.append("Студент ").append(jsonRecord.get("фамилия"))
                        .append(" получил ").append(jsonRecord.get("оценка"))
                        .append(" по предмету ").append(jsonRecord.get("предмет")).append("\n");
            }
        } catch (JSONException e) {
            System.out.println("Некорректный формат данных");
            e.printStackTrace();
        }

        return marksList.toString();
    }
}
