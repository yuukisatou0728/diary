package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;


@Data
public class NewDiaryForm {
	//新規投稿された日記の本文
	@NotNull
	@Size(min=3,max=150,message="文字数は３〜１５０文字です。")
	private String newdiary;
}