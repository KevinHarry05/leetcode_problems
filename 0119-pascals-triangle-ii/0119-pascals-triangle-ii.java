class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        res.add(1);
        for(int i=1;i<=rowIndex;i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1;j<res.size();j++) {
                row.add(res.get(j-1)+res.get(j));
            }
            row.add(1);
            res=row;
        }
        return res;
    }
}