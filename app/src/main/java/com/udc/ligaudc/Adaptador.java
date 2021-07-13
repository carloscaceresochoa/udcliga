package com.udc.ligaudc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.udc.ligaudc.modelo.Heroe;

import java.util.List;

public class Adaptador extends BaseAdapter {
    /**
     * lista de heroes
     */
    private List<Heroe> heroes;
    /**
     * actividad contexto
     */
    private Context context;
    /**
     * referencia layout
     */
    private LayoutInflater layoutInflater;

    public Adaptador(List<Heroe> heroes, Context context) {
        this.heroes = heroes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return heroes.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    /**
     * metodo sirve para enlazar el layout heroe con la lista de heroe
     * @param position
     * @param convertView
     * @param parent
     * @return
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView heroetext;
        ImageView heroeimage;
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.heroe,parent,false);
        heroetext=view.findViewById(R.id.textoheroe);
        heroeimage=view.findViewById(R.id.imagenheroe);
        heroetext.setText(heroes.get(position).getNombre());
        heroeimage.setImageResource(heroes.get(position).getImagen());
        return view;

    }
}
