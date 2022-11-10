package com.Bikkadit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Bikkadit.entity.Book;

@Controller
public class BookController {
	
	@GetMapping(value = "/gettingBookData")
	public String getBook(Model model) {

		Book b = new Book();
		b.setBookId(111);
		b.setBookName("Java");
		b.setBookPrice(123.00);

		model.addAttribute("book", b);

		return "ok";
	}
}
