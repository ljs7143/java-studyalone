class Dictionary {
    
    private static String[] kor = {"사랑","아기","돈","미래","희망"};
    private static String[] eng = {"love","baby", "money", " future", "hope"};


    public void kor2Eng(String word){
        switch(word){
       
            case "사랑":
                System.out.println(word + "is Love");
                break;
            case  "돈":
                System.out.println(word + "is money");
                break;
            default:
                System.out.println(word +  " does not exist in dic");
                break;
        }
    }
    
}
