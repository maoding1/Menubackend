package com.example.menubackend.entity;

import lombok.Data;

import java.util.*;

@Data
public class Category {

    private final Map<String,Map<String,List<String>>>  categories = new HashMap<>();

    public Category() {
        List<String> pig = Arrays.asList("猪肉", "排骨", "猪肉末", "五花肉", "猪蹄", "瘦肉", "里脊", "猪肝", "猪排", "猪肚", "猪皮", "猪骨", "肥肠", "猪油", "猪腰", "猪耳朵", "猪心", "猪血", "猪肺", "肉末");
        List<String> chickenCategories = Arrays.asList("鸡翅", "鸡胸", "鸡腿", "鸡爪", "鸡肉", "乌鸡", "鸡胗", "土鸡", "仔鸡", "三黄鸡", "鸡肝", "老母鸡", "鸡心", "柴鸡", "童子鸡");
        List<String> beefCategories = Arrays.asList("牛肉", "牛腩", "牛排", "肥牛", "牛里脊", "牛腱", "牛尾", "牛肉末", "牛筋", "牛百叶", "牛骨", "牛肉馅");
        List<String> lambCategories = Arrays.asList("羊肉", "羊排", "羊腿", "羊肉片", "羊蝎子");
        List<String> duckCategories = Arrays.asList("鸭腿", "鸭肉", "老鸭", "鸭胗", "鸭血", "鸭掌", "鸭翅", "鸭舌", "鸭肠", "鸭脖", "鸭肝", "鸭爪");
        Map<String,List<String>> meat = new HashMap<>();
        meat.put("猪",pig);
        meat.put("鸡",chickenCategories);
        meat.put("牛",beefCategories);
        meat.put("羊", lambCategories);
        meat.put("鸭", duckCategories);


        Map<String,List<String>> vegetable = new HashMap<>();
        List<String> guoshilei = Arrays.asList("彩椒", "番茄", "南瓜", "玉米", "茄子", "黄瓜", "豇豆", "青椒", "苦瓜", "冬瓜", "丝瓜", "秋葵", "西葫芦", "毛豆", "豌豆", "四季豆", "荷兰豆", "蚕豆", "圣女果", "扁豆", "刀豆", "瓠瓜", "玉米笋", "西红柿");
        List<String> fruits = Arrays.asList("柠檬", "椰子", "草莓", "橙", "牛油果", "木瓜", "山楂", "蓝莓", "西瓜", "柚子", "火龙果", "樱桃", "榴莲", "西柚", "桃", "葡萄", "金橘", "黄桃", "百香果", "杨梅", "桔子", "荔枝", "无花果", "石榴", "杏子", "桑葚", "哈密瓜", "柿子", "李子", "青梅", "枇杷", "香瓜", "甘蔗", "覆盆子", "杨桃", "橘子", "金桔", "杏");
        List<String> gengjing = Arrays.asList("土豆", "萝卜", "紫薯", "红薯", "胡萝卜", "山药", "藕", "芋头", "笋", "茭白", "马蹄", "牛蒡", "菱角");
        List<String> yelei = Arrays.asList("芹菜", "白菜", "韭菜", "菠菜", "西兰花", "圆白菜", "花椰菜", "莴苣", "青菜", "娃娃菜", "生菜", "甘蓝", "蒜薹", "紫甘蓝", "空心菜", "油菜", "荠菜", "香椿", "茼蒿", "菜心", "芥兰", "黄花菜", "韭黄", "苋菜", "紫苏", "芥菜", "油麦菜", "豌豆苗", "苦菊", "青蒜", "鱼腥草", "马兰", "蕨菜", "西洋菜", "水芹", "儿菜", "豌豆尖", "芝麻菜", "芦蒿", "穿心莲", "孢子甘蓝", "萝卜苗", "红菜苔", "牛至", "蒿子杆", "包菜", "莴笋", "花菜", "蒜苔", "豆苗", "披萨草");
        List<String> mushroom = Arrays.asList("香菇", "杏鲍菇", "银耳", "木耳", "金针菇", "蘑菇", "茶树菇", "平菇", "松茸", "鸡腿菇", "草菇", "竹荪", "蟹味菇", "花菇", "猴头菇", "牛肝菌", "灵芝", "榛蘑", "白玉菇", "姬松茸", "滑子菇", "发菜", "白灵菇", "袖珍菇", "双孢菇", "秀珍菇");
        vegetable.put("果实类蔬菜", guoshilei);
        vegetable.put("水果", fruits);
        vegetable.put("根茎类蔬菜", gengjing);
        vegetable.put("叶类蔬菜",yelei);
        vegetable.put("菌菇", mushroom);


        Map<String,List<String>> water = new HashMap<>();
        List<String> fishCategories = Arrays.asList("海水鱼", "淡水鱼", "鱼头", "鱼干", "鱼籽", "鱼肚");
        List<String> shrimpCategories = Arrays.asList("虾仁", "海米", "虾皮", "明虾", "基围虾", "龙虾", "小龙虾", "河虾", "海虾", "皮皮虾", "北极虾", "虾干", "青虾", "草虾", "海白虾", "虾米", "大虾");
        List<String> seafoodCategories = Arrays.asList("蛤蜊", "干贝", "鲍鱼", "扇贝", "牡蛎", "青口", "蛏子", "鲜贝", "北极贝", "河蚌");
        List<String> crabCategories = Arrays.asList("梭子蟹", "大闸蟹", "蟹肉", "蟹黄");
        water.put("鱼", fishCategories);
        water.put("虾", shrimpCategories);
        water.put("贝", seafoodCategories);
        water.put("蟹", crabCategories);

        Map<String,List<String>> dannaidou = new HashMap<>();
        List<String> dan = Arrays.asList("鸡蛋", "咸蛋", "皮蛋", "鹌鹑蛋", "鸭蛋", "咸鸭蛋");
        List<String> nai = Arrays.asList("牛奶", "黄油", "巧克力", "奶油", "奶酪", "酸奶", "黑巧克力", "淡奶油", "奶油", "奶酪", "炼乳", "奶粉", "马苏里拉奶酪", "白巧克力", "酸奶油", "酥油", "芝士");
        List<String> dou = Arrays.asList("豆腐", "香干", "豆渣", "千张", "腐竹", "素鸡", "油豆皮", "豆干", "豆腐皮");
        dannaidou.put("蛋类", dan);
        dannaidou.put("奶类", nai);
        dannaidou.put("豆类", dou);

        categories.put("肉", meat);
        categories.put("蔬菜", vegetable);
        categories.put("水产", water);
        categories.put("蛋奶豆制品",dannaidou);
    }


}
