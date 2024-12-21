package com.trendy.admin.board;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface boardRepository extends JpaRepository<board, Integer> {
	List<board> findAllByOrderByNoticeEventIdDesc();
}