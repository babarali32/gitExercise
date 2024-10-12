public class gitMan {
    public static void main(String[] args) {
        String word="levls";
        StringBuilder obj=new StringBuilder(word);
        String reverse=obj.reverse().toString();
        if (word.equals(reverse)){
            System.out.println("word is palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}