package usjt.br.servicedeskccp3anbua;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ChamadosAdapter extends ArrayAdapter <Chamado> {

    List<Chamado> chamados;
    private Context context;
    public ChamadosAdapter(List<Chamado> chamados, Context context){
        super(context, -1, chamados);
        this.chamados = chamados;
        this.context = context;
    }

    @Override
    public int getCount() {
        return chamados.size();
    }

    @Override
    public Chamado getItem(int i) {
        return chamados.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Chamado deInteresse = chamados.get(i);
        TextView filaDoItemTextView;
        TextView descricaoDoItemTextView;
        ViewHolder vh;
        if(view == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.list_item, viewGroup, false);
            filaDoItemTextView = view.findViewById(R.id.filaDoItemTextView);
            descricaoDoItemTextView = view.findViewById(R.id.descricaoDoItemTextView);
            vh = new ViewHolder();
            vh.filaDoItemTextView = filaDoItemTextView;
            vh.descricaoDoItemTextView = descricaoDoItemTextView;
            view.setTag(vh);
        }

        vh = (ViewHolder) view.getTag();
        vh.filaDoItemTextView.setText(deInteresse.getFila());
        vh.descricaoDoItemTextView.setText(deInteresse.getDescricao());
        return view;
    }

    private class ViewHolder{
        TextView filaDoItemTextView;
        TextView descricaoDoItemTextView;
    }
}
