package ixtapa.com.mx.ixtapazihua.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.getbase.floatingactionbutton.FloatingActionButton;

import ixtapa.com.mx.ixtapazihua.R;

/**
 * Created by HP-PC on 20/12/2016.
 */

public class TabHome extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saved){
        final View view = inflater.inflate(R.layout.tabhome, container, false);


         final FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.Button_shared);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "http://www.ixtapa.com.mx/");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));            }
        });
        return view;
    }
}
