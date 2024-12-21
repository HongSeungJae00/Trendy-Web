package com.trendy.admin.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unused")
public class boardService {
	@Autowired
    private boardRepository boardRepository;

    public List<board> getAllBoards() {
        return boardRepository.findAllByOrderByNoticeEventIdDesc();
    }
}