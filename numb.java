class xyz
{
    public static void main(String a)
    {
        int l=a.length();
        char ch=' ';
        for(int i=0;i<l;i++)
        {
            ch=a.charAt(i);
            if(Character.isWhitespace(ch))
            {
                System.out.println();
            }
            else{
                System.out.println(ch);
            }
        }
    }
}
