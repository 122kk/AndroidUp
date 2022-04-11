package com.example.kj.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private ListView lv;
    private String[] titles = {"桌子", "苹果", "蛋糕", "线衣", "猕猴桃", "围巾"};
    private int[] icons = {R.drawable.table, R.drawable.apple, R.drawable.cake,R.drawable.wireclothes, R.drawable.kiwifruit, R.drawable.scarf};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lv=findViewById(R.id.lv2);
        MyBaseAdapter myBaseAdapter=new MyBaseAdapter();
        lv.setAdapter(myBaseAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);

            }
        });
    }

    class MyBaseAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public Object getItem(int position) {
            return titles[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder=null;
            if (convertView==null){
                convertView=View.inflate(Main2Activity.this,R.layout.title_item,null);
                holder=new ViewHolder();
                holder.tv_tile=convertView.findViewById(R.id.tv_title);
                holder.iv_tile=convertView.findViewById(R.id.iv2_title);
                convertView.setTag(holder);
            }else {
                holder= (ViewHolder) convertView.getTag();
            }
            holder.iv_tile.setBackgroundResource(icons[position]);
            holder.tv_tile.setText(titles[position]);
            return convertView;
        }
    }
    class ViewHolder{
        TextView tv_tile;
        ImageView iv_tile;
    }
}
