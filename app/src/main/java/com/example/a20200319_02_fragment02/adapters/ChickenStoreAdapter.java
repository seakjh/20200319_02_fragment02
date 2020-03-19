package com.example.a20200319_02_fragment02.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.a20200319_02_fragment02.R;
import com.example.a20200319_02_fragment02.datas.ChickenStore;
import com.example.a20200319_02_fragment02.datas.Room;

import java.util.List;

public class ChickenStoreAdapter extends ArrayAdapter<ChickenStore> {

    Context mContext;
    List<ChickenStore> mList;
    LayoutInflater inflater;

    public ChickenStoreAdapter(@NonNull Context context, int resource, @NonNull List<ChickenStore> objects) {
        super(context, resource, objects);

        mContext = context;
        mList = objects;
        inflater = LayoutInflater.from(mContext);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

//        Log.d("getView실행", position + "번줄");

        View row = convertView; // 한 줄이라는 의미를 강화 : 변수 이름 변경

        if (row == null){
//            Log.d("row == null실행", position+"번줄");
            row = inflater.inflate(R.layout.chicken_store_list_item, null);

        }

        ChickenStore chickenStore = mList.get(position);


        TextView chickenStoreTxt = row.findViewById(R.id.chickenStoreTxt);

        chickenStoreTxt.setText(chickenStore.getStoreName());

//        반영이 끝난  row를 화면에 뿌리도록 결과로 지적
        return row; // row변수에 담긴 xml을 화면에 뿌려라
    }
}
