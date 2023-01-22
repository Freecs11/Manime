package com.manime.views;

import com.manime.service.MangaService;
import com.manime.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewsController {

    @Autowired
    private MangaService mangaService;

    @Autowired
    private TaskService taskService;

    @GetMapping("/mangas")
    public ModelAndView mangas() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("mangas");
        modelAndView.addObject("mangas", mangaService.findAll());
        return modelAndView;
    }


    @GetMapping("/")
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        modelAndView.addObject("tasks", taskService.findAll());
        return modelAndView;
    }


}

