package com.example;

import io.micrometer.common.util.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/view")
public class ViewController {
    private static final String VIEW_HTML = "view_template";

    private static final List<String> texts = new ArrayList<>();

    @GetMapping
    public String getView(Model model){
        model.addAttribute("texts", texts);

        return VIEW_HTML;
    }

    @PostMapping
    public RedirectView postView(@RequestParam(name="text") String text){
        if(StringUtils.isNotEmpty(text)){
            texts.add(text);
        }

        return new RedirectView("/view");
    }
}
