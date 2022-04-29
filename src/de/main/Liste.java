package de.main;

public class Liste{

     private String listName;
     private String Einkauf[] = new String[100];

    public void print(){
       for (int i = 0; i < Einkauf.length; i++){
           if(this.Einkauf[i] == null){
               continue;
                }
           System.out.println(this.Einkauf[i]);
            }
        }
    public void add(String s){
        Loop : for (int i = 0; i < this.Einkauf.length; i++) {
            if(this.Einkauf[i] == null){
                this.Einkauf[i] = s;
                break Loop;
            }
        }
    }
    public void delete(){
        for (int i = 0; i < this.Einkauf.length; i++){
            Einkauf[i] = null;
        }
    }
    public Liste(String name){
        this.listName = name;
    }

    public String getListName() {
        return listName;
    }
}
