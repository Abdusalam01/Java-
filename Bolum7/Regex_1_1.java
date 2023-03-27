public class Regex_1_1 {
    public static void main(String[] args) {
        String pattern = "[abc]def";
        //Basiangacinda a,b,c den herhangi biri olmal, ve sonrasa def seklinde gelmelidir 
        //adef. bdef. cdef
        System.out .println("adef" .matches(pattern));
        System.out .println("cdef".matches(pattern));
        System.out .println("asdf" .matches(pattern));
    }
}
