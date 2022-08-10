
//https://practice.geeksforgeeks.org/problems/minimum-characters-to-be-added-at-front-to-make-string-palindrome/1

 int minChar(string str){
        int i=0;
        int j=str.length()-1;
        int l = j;
        while(i<j){
            if(str[i]==str[j]){
                i++;
                j--;
            }
            else{
                i=0;
                l--;
                j=l;
            }
        }
        int front = str.length()-l-1;
        return front;
    }
