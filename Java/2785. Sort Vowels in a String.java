/*
Given a 0-indexed string s, permute s to get a new string t such that:

All consonants remain in their original places. More formally, if there is an index i with 0 <= i < s.length such that s[i] is a consonant, then t[i] = s[i].
The vowels must be sorted in the nondecreasing order of their ASCII values. More formally, for pairs of indices i, j with 0 <= i < j < s.length such that s[i] and s[j] are vowels, then t[i] must not have a higher ASCII value than t[j].
Return the resulting string.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in lowercase or uppercase. Consonants comprise all letters that are not vowels.
*/

class Solution {
    public static boolean isVowel(Character ch){
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            return true;
        }
        return false;
    }
    public String sortVowels(String s) {
        ArrayList<Character>li=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                li.add(s.charAt(i));
            }else{
                continue;
            }
        }

        Collections.sort(li);
        StringBuilder sb=new StringBuilder();

        int i=0;
        int j=0;

        while(i<s.length()){
            if(isVowel(s.charAt(i))){
                sb.append(li.get(j));
                j++;
            }else{
                sb.append(s.charAt(i));
            }
            i++;
        }
        return sb.toString();

    }
}
