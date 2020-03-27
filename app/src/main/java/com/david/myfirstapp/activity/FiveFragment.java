package com.david.myfirstapp.activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.david.myfirstapp.R;
public class FiveFragment extends Fragment {
    public FiveFragment(){

    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_five, container, false);

    }
}
