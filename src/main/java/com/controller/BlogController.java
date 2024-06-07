package com.controller;

import com.model.Blog;
import com.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/blogs")
public class BlogController {

    private final BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/")
    public String getAllBlogs(Model model) {
        List<Blog> blogs = blogService.getAllBlogs();
        model.addAttribute("blogs", blogs);
        return "blogs-list";
    }

    @GetMapping("/add")
    public String addBlogForm(Model model) {
        model.addAttribute("blog", new Blog());
        return "add-blog-form";
    }

    @PostMapping("/add")
    public String addBlogSubmit(@ModelAttribute Blog blog) {
        blogService.addBlog(blog);
        return "redirect:/blogs/";
    }

    @GetMapping("/delete/{id}")
    public String deleteBlog(@PathVariable long id) {
        blogService.deleteBlog(id);
        return "redirect:/blogs/";
    }
}
