package com.rubypaper.controller;

import com.rubypaper.domain.BoardVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class BoardController {
    public BoardController(){
        System.out.println("===> BoardController 생성");
    }

    @GetMapping("/getBoardList")
    public List<BoardVO> getBoardList(){
        List<BoardVO> boardList = new ArrayList<BoardVO>();
        for (int i = 1; i<=10;i++){
            BoardVO board = new BoardVO();
            board.setSeq(i);
            board.setTitle("제목"+i);
            board.setWriter("테스터");
            board.setContent(i+"번 내용입니다.");
            board.setCreateDate(new Date());
            board.setCnt(0);
            boardList.add(board);
        }

        return boardList;
    }
}
