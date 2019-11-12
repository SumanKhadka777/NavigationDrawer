package com.suman.navigationdrawer.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.suman.navigationdrawer.R;
import com.suman.navigationdrawer.adapter.ContactsAdapter;
import com.suman.navigationdrawer.model.Contacts;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactsFragment extends Fragment {
    private RecyclerView recyclerView;

    public ContactsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_contacts, container, false);


        recyclerView=view.findViewById(R.id.recycleview);
        //making list
        List<Contacts> contactsList=new ArrayList<>();
        contactsList.add(new Contacts("anthrax", "9845895452", R.drawable.anth));
        contactsList.add(new Contacts("Lamb of god", "9845203157", R.drawable.log));
        contactsList.add(new Contacts("venom", "9812457820", R.drawable.ven));
        contactsList.add(new Contacts("lambofgod", "9845895452", R.drawable.log));
        contactsList.add(new Contacts("anthrax", "9845203157", R.drawable.anth));
        contactsList.add(new Contacts("venom", "9812457820", R.drawable.ven));
        ContactsAdapter contactsAdapter=new ContactsAdapter(getContext(), contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return  view;

    }

}