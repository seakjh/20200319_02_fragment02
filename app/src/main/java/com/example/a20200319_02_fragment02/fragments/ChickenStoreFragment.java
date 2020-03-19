package com.example.a20200319_02_fragment02.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.a20200319_02_fragment02.R;
import com.example.a20200319_02_fragment02.adapters.ChickenStoreAdapter;
import com.example.a20200319_02_fragment02.adapters.RoomAdapter;
import com.example.a20200319_02_fragment02.databinding.FragmentRoomListBinding;
import com.example.a20200319_02_fragment02.databinding.FragmentStoreChickenBinding;
import com.example.a20200319_02_fragment02.datas.ChickenStore;
import com.example.a20200319_02_fragment02.datas.Room;

import java.util.ArrayList;
import java.util.List;

public class ChickenStoreFragment extends Fragment {

    List<ChickenStore> chickenStoreList = new ArrayList<>();

    ChickenStoreAdapter adapter = null;

    FragmentStoreChickenBinding binding = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_store_chicken, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        adapter = new ChickenStoreAdapter(getActivity(), R.layout.chicken_store_list_item, chickenStoreList);

//        adapter클래스는 리스트뷰의 재료로서 역할을 함.
//        리스트뷰의 어댑터 => 방금만든 adapter 변수라고 명시.

        binding.chickenListView.setAdapter(adapter);

//        방목록이 비어있어서 아무것도 출력되지 않는다
//        목록이 방을 여러개 추가하고, 어댑터 새로고침

        chickenStoreList.add(new ChickenStore("아 몰라"));

//        어댑터에게 내용 변경이 있었다고 새로고침
        adapter.notifyDataSetChanged();

    }
}
