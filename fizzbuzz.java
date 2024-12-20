//  class fizzbuzz {
//     public static void main(String[] args) {
//         int sum = 5;
//         for (int i = 0; i < 10;  i++){
//             System.out.println("iの数" + i);
//             sum = sum + i;
//         }
//         System.out.println(sum);
//     }
// }

class  fizzbuzz {
    public static  void main(String[] args) {
        for(int i = 1; i < 100; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("fizz"+ i);
            }
            else if(i % 3 == 0){
                System.out.println("buzz" + i);
            } else if(i % 5 == 0){
                System.out.println("fizzbuzz" + i);
            }else{
                System.out.println(i);
            }
        }
    }
}
