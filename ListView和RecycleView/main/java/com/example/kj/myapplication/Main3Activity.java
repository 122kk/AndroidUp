package com.example.kj.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private RecyclerView id_recyclerview;
    private HomeAdapter mAdapter;
    private String[] names = {"小猫", "哈士奇", "小黄鸭", "小鹿", "老虎"};
    private int[] icons = {R.drawable.cat, R.drawable.siberianhusky,
            R.drawable.yellowduck, R.drawable.fawn, R.drawable.tiger};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        id_recyclerview=findViewById(R.id.id_recyclerview);
        id_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        mAdapter=new HomeAdapter();
        id_recyclerview.setAdapter(mAdapter);
    }
    class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>{

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            MyViewHolder holder=new MyViewHolder(LayoutInflater.from(Main3Activity.this).inflate(R.layout.title_item, parent,false));
            return holder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.iv2.setBackgroundResource(icons[position]);
            holder.tv2.setText(names[position]);
        }

        @Override
        public int getItemCount() {
            return names.length;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView tv2;
            ImageView iv2;
            public MyViewHolder(View itemView) {
                super(itemView);
                tv2=itemView.findViewById(R.id.tv_title);
                iv2=itemView.findViewById(R.id.iv2_title);
            }
        }
    }
}
