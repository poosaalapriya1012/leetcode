class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        int ans=0;
        int l=0;
        for(int r=0;r<n;r++){
            int ch=fruits[r];
            h.put(ch,h.getOrDefault(ch,0)+1);
            while(h.size()>2){
                int left=fruits[l];
                h.put(left,h.get(left)-1);
                if(h.get(left)==0){
                    h.remove(left);
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}