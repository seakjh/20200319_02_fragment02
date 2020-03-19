package com.example.a20200319_02_fragment02.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.a20200319_02_fragment02.R;
import com.example.a20200319_02_fragment02.datas.Room;

import java.util.List;

public class RoomAdapter extends ArrayAdapter<Room> {

    Context mContext; // 어느 화면에서 어댑터를 쓰는지 보관
    List<Room> mList; // (액티비티에서 보내주는)방 목록 파일을 보관하는 변수
    LayoutInflater inflater; // xml => 객체화 시켜주는 클래스

    public RoomAdapter(@NonNull Context context, int resource, @NonNull List<Room> objects) {
        super(context, resource, objects);

        mContext = context;
        mList = objects;
        inflater = LayoutInflater.from(mContext);

    }

//    getview : 각각의 줄을 그려주는 메소드
//    목록 : 0~9 까지 있다? -> 0번 그림때 실행 , 1번그림때 실행....
//    실행될때마다 몇번 줄을 그리러 있는건지 : position에 담겨있음
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView; // 한 줄이라는 의미를 강화 : 변수 이름 변경

//        row : 한줄 이 없다? => 새로 xml => java로 그려줘야함(inflate)
//        리스트뷰ㅢ 재활용성(이론)에서 다시 설명
        if (row == null){
            row = inflater.inflate(R.layout.room_list_item, null);

        }

        return row; // row변수에 담긴 xml을 화면에 뿌려라
    }
}
