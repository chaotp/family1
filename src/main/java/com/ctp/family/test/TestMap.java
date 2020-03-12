package com.ctp.family.test;

import com.alibaba.fastjson.JSON;
import com.ctp.family.entity.Student;

import java.util.*;

/**
 * ClassName:16338
 * package:com.ctp.springbootdemo.test
 * Description:TODO
 *
 * @date:2020/1/13 - 17:46
 * @Author:chaotianpeng
 */
public class TestMap {
    public static void main(String[] args) {
        Student p1=new Student("26","老大");
        Student p2=new Student("25","老二");
        Student p3=new Student("24","老三");
        Student p4=new Student("23","老四");
        Student p5=new Student("22","老五");
        Student p6=new Student("21","老六");
        Map<String,Student> map=new HashMap<String,Student>(16);
        HashSet<Student> set =new HashSet<Student>();
        List<Student> list =new ArrayList<Student>();
        map.put("1",p1);
        map.put("2",p2);
        map.put("3",p3);
        map.put("4",p4);
        map.put("5",p5);
        map.put("6",p6);
        set.add(p6);
        set.add(p1);
        set.add(p3);
        set.add(p2);
        set.add(p5);
        set.add(p4);
        //map排序
        forMap(map);
        //set排序放到Treeset中
        itSet(set);
        //set排序放到List中
        list.addAll(set);

    }
    public void listSet(List<Student> list){
        System.out.println("-----------遍历-set-放到list-----------");
        list.sort(
                new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return Integer.parseInt(o1.getAge())-Integer.parseInt(o2.getAge());
                    }
                }
        );
        System.out.println(JSON.toJSONString(list));
    }
    public  static void itSet(HashSet<Student> set){
        System.out.println("-----------遍历-set-放到TreeSet-----------");
        TreeSet<Student> set1=new TreeSet<Student>(
                new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return Integer.parseInt(o1.getAge()) - Integer.parseInt(o2.getAge());
                    }
                }
        );
        set1.addAll(set);
        Iterator<Student> iterator = set1.iterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(JSON.toJSONString(next));
        }
    }
    public  static Map<String,Student>  forMap(Map<String,Student> forMap){
        System.out.println("-----------遍历map-while------------");
        Iterator<Map.Entry<String, Student>> iterator = forMap.entrySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next().getKey();
            Student value = iterator.next().getValue();
            System.out.println(key+ "   "+JSON.toJSONString(value));
        }
        System.out.println("-----------遍历map-while------------");
        Iterator<String> iterator1 = forMap.keySet().iterator();
        while (iterator1.hasNext()){
            String next = iterator1.next();
            System.out.println(JSON.toJSONString(next+"  "+JSON.toJSONString(forMap.get(next))));
        }
        return null;
    }
}
