package com.trendy.admin.board;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class boardDTO {
	private int notice_event_id;
    private String type;
    private String title;
    private String content;
    
    public int getNotice_Id() {
        return this.notice_event_id;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }
    public void setTitle(String title) {
    	this.title = title;
    }
    public String getTitle() {
    	return this.title;
    }
    public void setContent(String content) {
    	this.content = content;
    }
    public String getContent() {
    	return this.content;
    }
}