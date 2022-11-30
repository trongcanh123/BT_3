
package com.example.bkt3;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.bkt3.Thi;

import java.util.ArrayList;

public class MyArrayAdapter  extends ArrayAdapter<Thi> {
    Activity context;
    int Layout;
    ArrayList <Thi> mylist;

    public MyArrayAdapter( Activity context, int layout, ArrayList<Thi> mylist) {
        super(context, layout, mylist);
        this.context = context;
        Layout = layout;
        this.mylist = mylist;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // tạo để chứa  layout
        LayoutInflater layoutInflater = context.getLayoutInflater();
        // đặt Layout lên đế để tạo thành view
        convertView= layoutInflater.inflate(Layout, null);
        //lấy 1 phần tử trong mảng
        Thi congan = mylist.get(position);
        //khai báo tham chieu id
        ImageView  imageView= convertView.findViewById(R.id.img);
        imageView.setImageResource(congan.getHinh());
        TextView textView= convertView.findViewById(R.id.txtname);
        textView.setText(congan.getTenThi());
        textView.setText(congan.getHinh());
        //  textView1.setText(congan.getCapbac());
        return convertView;
    }
}

