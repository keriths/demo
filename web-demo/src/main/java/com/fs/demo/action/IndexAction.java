package com.fs.demo.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fanshuai on 16/9/7.
 */
@Controller
public class IndexAction {
    @RequestMapping(value = "/")
    public ModelAndView index(){
        String viewName="index";
        Map<String,Object> model = new HashMap<String,Object>();

        return new ModelAndView(viewName,model);
    }
}
