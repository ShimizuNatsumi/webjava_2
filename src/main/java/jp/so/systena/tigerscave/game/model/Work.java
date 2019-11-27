package jp.so.systena.tigerscave.game.model;

public class Work {

    /*
     * 基本的に名前を定義するときは型を指定する。
     * 指定せずに定義するとコンストラクタとして使える。
     */

    // 職業
    private String job;

    public String getJob() {
      return this.job;
    }

    // setter
    public void setJob(String job) {
      this.job = job;
    }

    //ID
    private int id;

    public int getId() {
      return this.id;
    }

    // setter
    public void setId(int id) {
      this.id = id;
    }

    private String selectedRadio;

    public String getSelectedRadio() {
      return this.selectedRadio;
      }

    public void setSelectedRadio(String selectedRadio) {
      this.selectedRadio = selectedRadio;
      }

}
