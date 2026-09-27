import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        

    //Brute force Approach

        // for(int i =0;i<nums.length;i++)
        // {
        //     for(int j =i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //             return true;
        //         }
        //     }
        // }
        // return false;

    //HashSet Approach

HashSet<Integer> set = new HashSet<>();

for(int num :nums)
{
    if(set.contains(num))
    {
        return true;
    }
    set.add(num);//add number to the HashSet
}
return false;
    }
}