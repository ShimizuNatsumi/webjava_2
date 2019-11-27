package jp.co.systena.tigerscave.game.controller;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.game.service.ListService;
import jp.so.systena.tigerscave.game.model.Work;

@Controller  // Viewあり。Viewを返却するアノテーション
public class GameController {

    /*
     * サーバへのリクエストはリクエストしたものだけを送る。
     * 基本は情報を保持することができないので、sessionという概念を使う。
     * 一回の注文内容をセッションに保管していくイメージ。
     */
    @Autowired
    HttpSession session;                  // セッション管理

    @Autowired
    ListService listService;

    @RequestMapping(value="/create", method = RequestMethod.GET)    // URLとのマッピング
    public ModelAndView index(ModelAndView mav, HttpServletRequest request) {

      Map<Integer,Work> work = listService.getWorkList();
      mav.addObject("works", work);
      mav.setViewName("CreateView");
      return mav;
      /*
       * mavを使うことでhtmlにデータを返して表示させて・・・
       * っていう処理を書かなくても、テンプレート内で処理してくれる
       * これがテンプレートを使う利点！
       */
    }
}
