public class changeCase {
    public static void main(String[] args) {
        String str = "   Siddhesh Dambe";
        String res = snakeCase(str);
        System.out.println(res);
        res = camelCase(str);
        System.out.println(res);
        res = PascalCase(str);
        System.out.println(res);
        res = kebabCase(str);
        System.out.println(res);

    }

    static String snakeCase(String str){
//        snake_case
        String str1 = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                str1 = str1 + "_";
            }else{
                str1 = str1 + Character.toLowerCase(str.charAt(i));
            }
        }
        return str1;
    }

    static String kebabCase(String str){
//        kebab-case
        String str1 = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                str1 = str1 + "-";
            }else{
                str1 = str1 + Character.toLowerCase(str.charAt(i));
            }
        }
        return str1;
    }

    static String camelCase(String str){
//        camelCase
        int prev = 0;
        int firstLetter= 0;
        String str1 = "";
        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch ==' '){
                prev=1;
                continue;
            }else{
                if(firstLetter==0){
                    str1 += Character.toLowerCase(ch);
                    firstLetter++;
                    prev = 0;
                }else if(prev==1){
                    str1 += Character.toUpperCase(ch);
                    prev=0;
                }else {
                    str1+= Character.toLowerCase(ch);
                }
            }
        }

        return str1;
    }

    static String PascalCase(String str){
        int prev = 0;
        int firstLetter= 0;
        String str1 = "";
        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch ==' '){
                prev=1;
                continue;
            }else{
                if(firstLetter==0){
                    str1 += Character.toUpperCase(ch);
                    firstLetter++;
                    prev = 0;
                }else if(prev==1){
                    str1 += Character.toUpperCase(ch);
                    prev=0;
                }else {
                    str1+= Character.toLowerCase(ch);
                }
            }
        }
        return str1;
    }
}
