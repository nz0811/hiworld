package com.niu.controller;

import com.niu.bean.TestBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/1/27.
 */
@Controller
public class HelloController {

    @RequestMapping("/test1")
    @ResponseBody
    public Map test1(TestBean testBean, String abc) throws IOException {
        Map<String,Object> map = new HashMap<>();
        System.out.println(abc);
        System.out.println(testBean);
        map.put("code",1);
        return map;
    }

    @RequestMapping("/test3")
    @ResponseBody
    public Map test3(TestBean testBean, String abc,MultipartFile file) throws IOException {
        Map<String,Object> map = new HashMap<>();
        System.out.println(abc);
        System.out.println(testBean);
        if(file!=null){
            File file1 = new File("d:\\"+file.getOriginalFilename());
            file.transferTo(file1);
        }
        map.put("code",1);
        return map;
    }

    @RequestMapping("/test2")
    @ResponseBody
    public Map test2(@RequestBody TestBean testBean, String abc, MultipartFile file) throws IOException {
        Map<String,Object> map = new HashMap<>();

        if(file!=null){
            File file1 = new File("d:\\"+file.getOriginalFilename());
            file.transferTo(file1);
        }
        System.out.println(abc);
        System.out.println(testBean);
        map.put("code",2);
        return map;
    }

    @RequestMapping("/test4")
    @ResponseBody
    public Map test4(@RequestBody TestBean testBean, String abc) throws IOException {
        Map<String,Object> map = new HashMap<>();
        System.out.println(abc);
        System.out.println(testBean);
        map.put("code",2);
        return map;
    }

}
