class Pattern{
    public static void main(String args[]){
         int K = 1;
          for(int i = 1; i <= 5; i++){
             for(int j = 1; j <= 5; j++){
                 System.out.print(K + " ");
                 K = K + 2;
             }
             System.out.println("");
         }
         int X = 2;
         for(int i = 1; i <= 5; i++){
             for(int j = 1; j <= 5; j++){
                 System.out.print(X + " ");
                 X = X + 2;
             }
             System.out.println("");
         }
         for(char i = 'E'; i >= 'A'; i--){
             for(char j = 'E'; j >= 'A'; j--){
                 System.out.print(i + " ");
             }
             System.out.println("");
         }
         for(char i = 'E'; i >= 'A'; i--){
             for(char j = 'E'; j >= 'A'; j--){
                 System.out.print(j + " ");
             }
             System.out.println("");
         }
         char ch = 'A';
         for(int i = 'A'; i <= 'E'; i++){
             for(int j = 'A'; j <= 'E'; j++){
                 System.out.print(ch + "");
                 ch++;
             }
             System.out.println("");
         }
        for(int i = 5; i >= 1; i--){
            for(int j = 5; j >= i; j--){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        for(int i = 5; i >= 1; i--){
            for(int j = i; j <= 5; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        for(char i = 'A'; i <= 'E'; i++){
            for(char j = 'A'; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        for(char i = 'A'; i <= 'E'; i++){
            for(int j = 1; j <= (i - 'A' + 1); j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        for(char i = 'E'; i >= 'A'; i--){
            for(char j = 'E'; j >= i; j--){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        for(char i = 'E'; i >= 'A'; i--){
            for(char j = 'E'; j >= i; j--){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}