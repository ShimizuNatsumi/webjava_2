package jp.co.systena.tigerscave.game.service;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import jp.so.systena.tigerscave.game.model.Work;

@Service
public class ListService {

  /**
   * アイテムの全件取得
   * @return map
   */
  public Map<Integer,Work> getWorkList() {
    // インスタンスを作る
    Work warrior = new Work();
    warrior.setJob("戦士");
    warrior.setId(1);

    Work witch = new Work();
    witch.setJob("魔法使い");
    witch.setId(2);

    // つくった商品をMapにつめる
    Map<Integer, Work> map = new HashMap<Integer, Work>();
    map.put(1, warrior);
    map.put(2, witch);

    // Mapを返す（ほかのクラスで使えるようにしてる）
    return map;
  }

  /**
   * idでアイテムの取得
   * @param id
   * @return map
   */
  public Map<Integer,Work> getWorkListById(int id) {

    /*
     * Mapとは
     * keyとvalueのセットを定義する。
     * LinkedHushMapを使うと、入れた順番に取り出すことができる。
     * LinkedHushMapはMapを継承している。
     */
    Map<Integer,Work> itemMap  = new HashMap<Integer, Work>();
    Map<Integer,Work> itemMapAll = this.getWorkList();

    //idで取得したアイテムをセット
    Work item = itemMapAll.get(id);

    //マップにセットする
    itemMap.put(id,item);

    return itemMap;
  }
}