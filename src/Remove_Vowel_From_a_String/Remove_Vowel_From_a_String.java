package Remove_Vowel_From_a_String;

public  class Remove_Vowel_From_a_String {
    public static String removeVowels(String s){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e'  ||s.charAt(i)=='i'  ||s.charAt(i)=='o'  ||s.charAt(i)=='u' ){
                continue;
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String removeVowels2(String s){
        return s.replaceAll("[aeiou]","");
    }



}
