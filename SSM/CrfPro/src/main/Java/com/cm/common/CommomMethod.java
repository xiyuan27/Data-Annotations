package com.cm.common;

public class CommomMethod {
    //手动停用词判别
    public static boolean isStopWord(String str) {
        if(str.length()!=1)
            return false;
        String newStr = str.replaceAll("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "");
//                .replaceAll("\\d+","");
        return newStr.length()==0?true:false;
    }
}
