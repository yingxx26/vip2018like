package com.tl.service;/*
 * ━━━━━━如来保佑━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━永无BUG━━━━━━
 * 图灵学院-悟空老师
 * www.jiagouedu.com
 * 悟空老师QQ：245553999
 */

import java.util.Collection;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        LikeSearch<String> search=new LikeSearch<String>();
        search.put("湖南","湖南");
        search.put("湖北","湖北");
        Collection<String> search1 = search.search("北", 10);
        for(Iterator it=search1.iterator();it.hasNext();){
            System.out.println(it.next());


        }
        char a='中';

    }

}
