package com.example.GreenFrogTable.controller;

import com.example.GreenFrogTable.entity.Board;
import com.example.GreenFrogTable.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/")
    public String getAllBoards(Model model) {
        List<Board> boards = boardService.getAllBoards();
        model.addAttribute("boards", boards);
        return "board_list";
    }

    @GetMapping("/board/{id}")
    public String getBoardById(@PathVariable Long id, Model model) {
        Board board = boardService.getBoardById(id);
        model.addAttribute("board", board);
        return "board_view";
    }

    @GetMapping("/newBoard")
    public String showNewBoardForm(Model model) {
        model.addAttribute("board", new Board());
        return "board_write";
    }

    @PostMapping("/newBoard")
    public String addNewBoard(@ModelAttribute Board board) {
        if (board.getTitle() == null || board.getContent() == null) {
            return "error";
        }
        boardService.saveBoard(board);
        return "redirect:/";
    }

    @GetMapping("/board/edit/{id}")
    public String showEditBoardForm(@PathVariable Long id, Model model) {
        Board board = boardService.getBoardById(id);
        model.addAttribute("board", board);
        return "board_edit";
    }

    @PostMapping("/board/edit/{id}")
    public String editBoard(@PathVariable Long id, @ModelAttribute Board board) {
        board.setId(id);
        boardService.saveBoard(board);
        return "redirect:/";
    }

    @GetMapping("/board/delete/{id}")
    public String deleteBoard(@PathVariable Long id) {
        boardService.deleteBoard(id);
        return "redirect:/";
    }
}