package com.stringutils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

    public class StringUtils {
        static String reverse(String s){
            int n=s.length();
            char[] str=new char[n];
            str=s.toCharArray();
            int left=0;int right=str.length-1;
            while(left<right){
                swap(str,left,right);
                left++;right--;
            }
            return new String(str);
        }

        static void  swap(char[]str, int left, int right){
            char temp=str[left];
            str[left]=str[right];
            str[right]=temp;
        }
        static boolean isPalindrome(String s){
            String temp=s;
            String str=reverse(s);
            if(str.equals(temp)){
                return true;
            }
            return false;
        }
        static int noOfvowels(String s){
            int cnt=0;
            for(char c:s.toCharArray()){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                    cnt++;
                }
            }
            return cnt;
        }
        static String removeDups(String s){
            StringBuilder sb=new StringBuilder();
            HashSet<Character> set=new HashSet<>();
            for(char c : s.toCharArray()){
                if(!set.contains(c)){
                    set.add(c);
                    sb.append(c);
                }
            }
            return sb.toString();
        }
        static HashMap<Character,Integer> charFreq(String s){
            HashMap<Character,Integer>map=new HashMap<>();
            for(char c : s.toCharArray()){
                if(c ==' '){
                    continue;
                }
                map.put(c,map.getOrDefault(c,0)+1);
            }
            for(char c: map.keySet()){
                System.out.println(c + ":"+ map.get(c));
            }
            return map;
        }
        static String capitalize(String s){
            String[] words=s.split(" ");
            StringBuilder sb=new StringBuilder();
            for(String word: words){
                char first= Character.toUpperCase(word.charAt(0));
                String rest=word.substring(1);
                sb.append(first).append(rest).append(" ");
            }
            return sb.toString();
        }
        static boolean validAnagram(String s,String t){
            char[]a =s.toCharArray();
            char[]b =t.toCharArray();
            Arrays.sort(a);Arrays.sort(b);
            return Arrays.equals(a,b);
        }
        static String printAtoN(int n){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<n;i++){
                char c=(char)(i+'a');
                sb.append(c);
            }
            return sb.toString();
        }
        static String stringcompression(String s){
            StringBuilder sb=new StringBuilder();int cnt=1;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i-1)==s.charAt(i)){
                    cnt++;
                }
                else{
                    sb.append(s.charAt(i-1)).append(cnt);
                    cnt=1;
                }
            }
            sb.append(s.charAt(s.length()-1)).append(cnt);
            return sb.toString();
        }
    }
