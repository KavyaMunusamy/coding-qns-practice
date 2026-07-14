class DistinctPermutation{
    static ArrayList<String> findPermutation(String s) {
        ArrayList<String> res = new ArrayList<>();
        permut(s,"",res);
        return res;
    }
    private static void permut(String s,String out,ArrayList<String> res){
        if(s.length() == 0){
            res.add(out);
            return;
        }
        Set<Character> st = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(st.contains(c)){
                continue;
            }
            st.add(c);
            String rem = s.substring(0,i) + s.substring(i+1);
            permut(rem,out+c,res);
        }
    }
}
