class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result = new ArrayList<>();
        result.add(folder[0]);
        int pointer=0;
        for(int i=1;i<folder.length;i++){
            String prev =folder[pointer]+'/' ;
            String curr=folder[i];
            if(!curr.startsWith(prev)){
                result.add(curr);
                pointer=i;
            }
        }
        return result;
    }
}
