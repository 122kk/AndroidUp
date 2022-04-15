package com.jay.fragmentdemo;



import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_index,tv_licai,tv_live,tv_message,tv_my;
    private FrameLayout fragment_first;

    private newFragment fg1,fg2,fg3,fg4,fg5;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        init();
        tv_index.performClick();//模拟一次点击，既进去后选择第一项
    }

    private void init() {
        tv_index=findViewById(R.id.tv_index);
        tv_licai=findViewById(R.id.tv_licai);
        tv_live=findViewById(R.id.tv_live);
        tv_message=findViewById(R.id.tv_message);
        tv_my=findViewById(R.id.tv_my);

        fragment_first=findViewById(R.id.fragment_first);

        tv_my.setOnClickListener(this);
        tv_message.setOnClickListener(this);
        tv_live.setOnClickListener(this);
        tv_licai.setOnClickListener(this);
        tv_index.setOnClickListener(this);
    }
	//重置所有文本的选中状态
    private void setSelected(){
        tv_index.setSelected(false);
        tv_licai.setSelected(false);
        tv_live.setSelected(false);
        tv_message.setSelected(false);
        tv_my.setSelected(false);
    }



	//隐藏所有Fragment
    private void hideAllFragmentdemo(FragmentTransaction fragmentTransaction){
        if (fg1!=null)fragmentTransaction.hide(fg1);
        if (fg2!=null)fragmentTransaction.hide(fg2);
        if (fg3!=null)fragmentTransaction.hide(fg3);
        if (fg4!=null)fragmentTransaction.hide(fg4);
        if (fg5!=null)fragmentTransaction.hide(fg5);
    }





    @Override
    public void onClick(View v) {
        FragmentTransaction fTransaction=fragmentManager.beginTransaction();
        hideAllFragmentdemo(fTransaction);
        switch (v.getId()){
            case R.id.tv_index:
                setSelected();
                tv_index.setSelected(true);
                if (fg1==null){
                    fg1=new newFragment(R.drawable.weixin1);
                    fTransaction.add(R.id.fragment_first,fg1);
                }else{
                    fTransaction.show(fg1);
                }
                break;
            case R.id.tv_licai:
                setSelected();
                tv_licai.setSelected(true);
                if (fg2==null){
                    fg2=new newFragment(R.drawable.weixin2);
                    fTransaction.add(R.id.fragment_first,fg2);
                }else{
                    fTransaction.show(fg2);
                }
                break;

            case R.id.tv_live:
                setSelected();
                tv_live.setSelected(true);
                if (fg3==null){
                    fg3=new newFragment(R.drawable.weixin3);
                    fTransaction.add(R.id.fragment_first,fg3);
                }else{
                    fTransaction.show(fg3);
                }
                break;
            case R.id.tv_message:
                setSelected();
                tv_message.setSelected(true);
                if (fg4==null){
                    fg4=new newFragment(R.drawable.weixin4);
                    fTransaction.add(R.id.fragment_first,fg4);
                }else{
                    fTransaction.show(fg4);
                }
                break;
            case R.id.tv_my:
                setSelected();
                tv_my.setSelected(true);
                if (fg5==null){
                    fg5=new newFragment(R.drawable.weixin5);
                    fTransaction.add(R.id.fragment_first,fg5);
                }else{
                    fTransaction.show(fg5);
                }
                break;
        }
        fTransaction.commit();

    }
}
