package com.example.android.fragments1;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    FragmentInterface myinterface;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        final EditText editText1 = (EditText) view.findViewById(R.id.editText1);


        Button btn1 = (Button) view.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Button Click == "+editText1.getText().toString(),Toast.LENGTH_SHORT).show();
                myinterface.doSomeWork(editText1.getText().toString());
            }
        });


        //MainActivity main = (MainActivity) getActivity();
        //main.hello();

        return view;
        //return inflater.inflate(R.layout.fragment_blank, container, false);
    }


    public interface FragmentInterface {

        void doSomeWork(String data);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myinterface = (FragmentInterface) context;
    }
}
