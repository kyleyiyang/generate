class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows==0) return ans;
        ans.add(new ArrayList<Integer>(Arrays.asList((Integer)1)));
        if (numRows==1) return ans;
        ans.add(new ArrayList<Integer>(Arrays.asList(1,1)));
        if (numRows==2) return ans;
        int level = 1;
        while (level<numRows-1) {
            level++;
            List<Integer> cur = new ArrayList<>(level+1);
            cur.add(1);
            List<Integer> pre = ans.get(level-1);
            for (int i=0;i<pre.size()-1;i++) {
                cur.add(pre.get(i)+pre.get(i+1));
            }
            cur.add(1);
            ans.add(cur);
        }
        return ans;
    }
}
