package ru.netolgy;

public class Radio {
    public int numberRadio;
    public int volume;
    public  void next(){
        if(numberRadio == 9){
            numberRadio = 0;
        }
        else{
            numberRadio = numberRadio + 1;
        }
    }

    public void prev(){
        if(numberRadio == 0){
            numberRadio = 9;
        }
        else{
            numberRadio = numberRadio - 1;
        }
    }


}
