package com.rubypaper.controller;

import com.rubypaper.domain.BoardVO;
import com.rubypaper.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    public BoardController(){
        System.out.println("===> BoardController 생성");
    }

    @GetMapping("/getBoardList")
    public List<BoardVO> getBoardList(){
        return boardService.getBoardList();
    }

    @GetMapping("/hello")
    public String hello(String name){
        return boardService.hello(name);
    }

    @GetMapping("/getBoard")
    public BoardVO getBoard(){
        return boardService.getBoard();
    }
}
