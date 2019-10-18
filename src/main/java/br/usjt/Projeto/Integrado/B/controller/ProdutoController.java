package br.usjt.Projeto.Integrado.B.controller;

import br.usjt.Projeto.Integrado.B.model.Produto;
import br.usjt.Projeto.Integrado.B.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping("adicionar")
    public ModelAndView adicionar() {
        ModelAndView produtoMV = new ModelAndView("produto/adicionar");
        Produto produto = new Produto();
        produtoMV.addObject("produto", produto);
        return produtoMV;
    }

    @PostMapping("adicionar")
    public ModelAndView adicionar(Produto produto) {
        produtoService.adicionar(produto);
        return new ModelAndView("produto/exibir");
    }


}
