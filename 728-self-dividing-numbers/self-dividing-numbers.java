class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<Integer>();

        for(int i=left; i<=right; i++) {
            int num = i;
            boolean flag = true;
            while(num != 0) {
                int dividingNum = num%10;
                if(dividingNum == 0 || i % dividingNum != 0){
                    flag = false;
                    break;
                }

                num = num/10;
            }

            if(flag == true) ans.add(i);
        }

        return ans;
    }
}