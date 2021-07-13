package com.udc.ligaudc.modelo;

import com.udc.ligaudc.R;

import java.util.ArrayList;
import java.util.List;

public class Liga {

    /**
     * lista heroes
     * @return colecciones de heroes
     */
    public List<Heroe> ligaJusticia(){
        List<Heroe> liga=new ArrayList<Heroe>();
        liga.add(new Heroe("Superman",R.drawable.superman));
        liga.add(new Heroe("Batman",R.drawable.batman));
        liga.add(new Heroe("Mujer Maravilla",R.drawable.wonder));
        liga.add(new Heroe("Aquaman",R.drawable.aquaman));
        liga.add(new Heroe("Cyborg",R.drawable.cyborg));
        liga.add(new Heroe("Flash",R.drawable.flash));
        return liga;
    }
}
