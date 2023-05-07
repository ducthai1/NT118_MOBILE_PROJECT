package com.example.yumfood.customer.store_detail.order_tab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yumfood.R;
import com.example.yumfood.models.Store;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StoreOrderTabFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StoreOrderTabFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Store storedetail;

    public StoreOrderTabFragment() {
        // Required empty public constructor
    }

    public StoreOrderTabFragment(Store storedetail) {
        this.storedetail = storedetail;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment StoreDetailOrderTabFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StoreOrderTabFragment newInstance(String param1, String param2) {
        StoreOrderTabFragment fragment = new StoreOrderTabFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_store_order_tab, container, false);
    }
}