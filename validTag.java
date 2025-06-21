public class validTag{
     public static String generateTag(String caption) {
        String arr[] = caption.trim().split("\\s+");
        StringBuilder tag= new StringBuilder("#");
        for(int i=0;i<arr.length;i++){
            StringBuilder str = new StringBuilder(arr[i].replaceAll("[^a-zA-Z]",""));
            if(i==0){
                str.setCharAt (0 , Character.toLowerCase(str.charAt(0)));
            }else{
                str.setCharAt (0 , Character.toUpperCase(str.charAt(0)));
            }
            tag.append(str);
        }
        return tag.toString();
    }


    public static void main(String[] args){
        System.out.println(generateTag("My name is"));
    }
}


