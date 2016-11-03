package es.iesnervion.atellez.ejerciciogrid;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {
    private TextView seleccion;
    private String [] futbolistas = {"Homer","Marge","Lisa","Bartolomé","Abraham","Davida pussy","David loser","David trabaja","David <3 Pokemon "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seleccion = (TextView) findViewById(R.id.seleccion);

        GridView gv = (GridView) findViewById(R.id.grid);
        gv.setAdapter(new ArrayAdapter<String>(this,R.layout.cell,futbolistas));

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        seleccion.setText(futbolistas[position]);
    }
}
