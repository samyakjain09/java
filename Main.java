// public class main {

//     public static boolean isPalindrome(String name) {
//         int n = name.length();

//         for (int i = 0; i < n / 2; i++) {
//             if (name.charAt(i) != name.charAt(n - i - 1)) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String name = "race car";
//         System.out.println(isPalindrome(name));
//     }
// }
public class Main{
    public static float getshortestpath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char n=path.charAt(i);
            if(n=='S'){
                y--;
            }
            else if(n=='N') {
                y++;
            }
            else if(n=='W'){
                x--;
            }
            else{
                x++;
            }
           
        }
        int g =x*x;
        int h=y*y;
        float a =(float)Math.sqrt(g+h);
        System.out.println(a);
        return a;
    }
    public static void main(String[] args){
        String path="WNEENESENNN";
        getshortestpath(path);
    }
}