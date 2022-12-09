// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.
package HomeWork5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Task1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> multiValueMap = new HashMap<String, ArrayList<String>>();

        multiValueMap.put("Иванов А.И.", new ArrayList<String>());
        multiValueMap.get("Иванов А.И.").add("89252103675");
        multiValueMap.get("Иванов А.И.").add("89252604655");
        multiValueMap.get("Иванов А.И.").add("89252464655");
        multiValueMap.get("Иванов А.И.").add("89255474655");
        multiValueMap.get("Иванов А.И.").add("89252623455");
        
        multiValueMap.put("Иванов Т.Г.", new ArrayList<String>());
        multiValueMap.get("Иванов Т.Г.").add("89262653623");

        multiValueMap.put("Федоров В.А.", new ArrayList<String>());
        multiValueMap.get("Федоров В.А.").add("89052624617");

        multiValueMap.put("Каменева Л.Ю.", new ArrayList<String>());
        multiValueMap.get("Каменева Л.Ю.").add("89772632621");

        System.out.print(multiValueMap);
    }
   
}

