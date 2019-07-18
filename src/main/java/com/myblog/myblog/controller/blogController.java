package com.myblog.myblog.controller;

import com.myblog.myblog.dao.DemoInfoRepository;
import com.myblog.myblog.entity.blogEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
public class blogController {

    @Autowired
    private DemoInfoRepository demoInfoRepository;

    @CrossOrigin
    @RequestMapping(value="/find",method = RequestMethod.GET)
    public List<blogEntity>find(){

        List<blogEntity> list=demoInfoRepository.findAll();

        return list;
    }

    @CrossOrigin
    @RequestMapping(value="/save",method=RequestMethod.POST)
    public int save( @RequestBody blogEntity blog){ //@RequestBody能识别除了x-www-form-urlencode以外的所有请求
        String theme=blog.getTheme();
        String blogcontent=blog.getBlog();

        blogEntity blogInDB=new blogEntity();
        blogInDB.setBlog(blogcontent);
        blogInDB.setTheme(theme);
        demoInfoRepository.save(blog);
        return 1;
    }

    @GetMapping("/a")
    public String g(){
        return "test";
    }
}
