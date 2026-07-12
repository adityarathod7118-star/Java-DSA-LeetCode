class Solution {
    public boolean isSameAfterReversals(int num) {
        int rem = 0;
        int ans= 0;
        int y = num; // this line i saw.
        if(num == 0)
        {
            return true;
        }
        while(num>0)
        {
            rem = num % 10;
            // if(rem!=0) // No need of the if as while converting the reverse the zero will be ignored auto matically.
            // {
            ans = ans*10 + rem;
            // }
            num = num / 10;
        }
        int rems=0;
        int result = 0;
        while(ans>0)
        {
            rems = ans % 10;
            result = result*10 + rems;
            ans = ans/10;
        }
        if(result == y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}