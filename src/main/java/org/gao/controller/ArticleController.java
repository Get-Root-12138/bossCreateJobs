package org.gao.controller;


import jakarta.servlet.http.HttpServletResponse;
import org.gao.pojo.Result;
import org.gao.utils.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @GetMapping("list")
//    @RequestHeader(name = "Authorization") String token, HttpServletResponse response
    public Result<String> list(){

//        try {
//            Map<String, Object> claims = JwtUtil.parseToken(token);
//            return Result.success("所有的文章数据...");
//        } catch (Exception e) {
//            response.setStatus(401);
//            return Result.error("未登录");
//        }

        return Result.success("所有的文章数据...");


    }
}
