package com.zhangge.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangge.entity.Article;
import com.zhangge.entity.Channel;
import com.zhangge.entity.Slide;
import com.zhangge.entity.User;
import com.zhangge.service.ArticleService;
import com.zhangge.service.SlideService;
import com.zhangge.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private SlideService slideService;

	@Autowired
	private ArticleService articleService;

	@RequestMapping("/index.do")
	private String login(Model model) {
		List<Channel> channel = userService.queryChannel();
		model.addAttribute("channel", channel);
		List<Slide> slide = slideService.querySlide();
		model.addAttribute("slide", slide);
		List<Article> article = articleService.queryArticle();
		// 从文章中获取抽取热点文章数据
		List<Article> articlelist = new ArrayList<Article>();
		for (Article a : article) {
			if (a.getHot() == 1) {
				articlelist.add(a);
			}
		}
		model.addAttribute("articlelist", articlelist);
		model.addAttribute("article", article);
		return "home";
	}

	@RequestMapping("/login.do")
	private String toLogin() {
		return "passport/login";
	}

	@RequestMapping("userlogin.do")
	private String userLogin(User user, HttpServletRequest request) {
		User user2 = userService.login(user);
		if (user2 != null) {
			request.getSession().setAttribute("user", user2);
			return "redirect:index.do";
		} else {
			return "redirect:login.do";
		}
	}

	@RequestMapping("/logout.do")
	private String logout(HttpSession session) {
		session.invalidate();
		return "redirect:index.do";
	}

	/**
	 * 个人主页跳转
	 */
	@RequestMapping("toMyHome.do")
	private String toMyHome() {
		return "user-space/home";
	}

	@RequestMapping("/usermanager.do")
	private String usermanager() {
		return "admin/user-manage";
	}

}
