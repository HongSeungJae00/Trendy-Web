package com.trendy.admin.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class boardController {

	@Autowired
    private boardService boardService;
	
    @GetMapping("/board") //html 파일 이름을 지정하면 됨
    public String getBoardPage(Model model) {
        List<board> boards = boardService.getAllBoards();
        
        model.addAttribute("boards", boards);
        
        return "board"; //html 파일 이름을 지정하면 됨
    }
}