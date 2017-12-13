package me.degunawan.viewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {

    ArrayList<Artikel> kumpulanArtikel = new ArrayList<>();
    RecyclerView recyclerView;

    ArtikelListAdapter adapter;

    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_news, container, false);

        for (int i = 0; i < 10;i++) {
            kumpulanArtikel.add(new Artikel(
                    "21758",
                    "keseruan-dalam-indonesia-developer-summit-5a28d4b386c02",
                    "Keseruan dalam Indonesia Developer Summit",
                    "Hadyan Palupi",
                    "https://www.gravatar.com/avatar/40f9e32f2092f161bf30704385516418?s=100",
                    "Akhir November yang lalu, tepatnya pada tanggal 21-23 November telah terlaksana sebuah event besar yang bernama **Indonesia Developer Summit** yang..",
                    "12 Dec 2017",
                    "http://www.codepolitan.com/keseruan-dalam-indonesia-developer-summit-5a28d4b386c02",
                    "https://static.cdn-cdpl.com/270x135/b8e29e8f0b15aab3473fed5df06c9186/devsummit-cover-review.jpg",
                    ""
            ));
        }

        recyclerView = v.findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new ArtikelListAdapter(kumpulanArtikel, getContext());
        recyclerView.setAdapter(adapter);

        return v;
    }

}
