public class Strings {
    public static void main (String args[]){
        // String sentence="My name is Tony";
        // String substrings=sentence.substring(11);
        // System.out.println(substrings);
        // StringBuilder sb=new StringBuilder("Naksh");
        // sb.insert(0,'S');
        // System.out.println(sb);
        // sb.delete(0,2);
        // System.out.println(sb);

        // int arr[]={1,2,3,4,5};
        // int n=arr.length;
        // for(int i=0;i<n/2;i++){
        //     int temp=arr[i];
        //     arr[i]=arr[n-i-1];
        //     arr[n-i-1]=temp;
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }



        StringBuilder sb=new StringBuilder("hello");
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-i-1;
            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);

            sb.setCharAt(front,backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }  
}
