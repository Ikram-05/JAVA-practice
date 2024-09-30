class Voting{
    public static void main(String[] args)
     {
        int age=27;
        boolean voterid=true;
        if(age>=18 )
        {
            if(voterid==true)
            {
                System.out.println("eligible for vote");
            }
            else{
                System.out.println("Not eligible for vote");
                System.out.println("Voter ID not availabe");
            }
        }
        else
        {
            System.out.println("Not Eligible for voting");
        }
    }
}