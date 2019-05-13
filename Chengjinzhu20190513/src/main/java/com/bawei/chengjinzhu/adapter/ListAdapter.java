package com.bawei.chengjinzhu.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.chengjinzhu.R;
import com.bawei.chengjinzhu.bean.Bean;
import com.bumptech.glide.Glide;

import java.util.List;

/*作者:程金柱
 *时间:2019年5月13日09:20:27
 * 功能:listview的适配器
 */
public class ListAdapter extends BaseAdapter {
   private List<Bean> list;
   private Context context;

    public ListAdapter(List<Bean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //多条目优化
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        switch (getItemViewType(position)){
            case 1:
                Handler2 handler2;
                if (convertView==null){
                    convertView=View.inflate(context, R.layout.item2,null);
                    handler2=new Handler2();
                    handler2.image1=convertView.findViewById(R.id.image1);
                    handler2.image2=convertView.findViewById(R.id.image2);
                    handler2.image3=convertView.findViewById(R.id.image3);
                    handler2.title2=convertView.findViewById(R.id.title2);
                    convertView.setTag(handler2);
                }else {
                    handler2= (Handler2) convertView.getTag();
                }
                handler2.title2.setText(list.get(position).getTitle());
                Glide.with(handler2.image1).load(list.get(position).getImage().get(0));
                Glide.with(handler2.image2).load(list.get(position).getImage().get(1));
                Glide.with(handler2.image3).load(list.get(position).getImage().get(2));
                break;
            case 2:
                Handler1 handler1;
                if (convertView==null){
                    convertView=View.inflate(context,R.layout.item2,null);
                    handler1=new Handler1();
                    handler1.image=convertView.findViewById(R.id.image);
                    handler1.title=convertView.findViewById(R.id.title);
                    convertView.setTag(handler1);
                }else {
                    handler1= (Handler1) convertView.getTag();
                }
                handler1.title.setText(list.get(position).getTitle());
                Glide.with(handler1.image).load(list.get(position).getImage().get(0));
                break;
        }

        return null;
    }
    class Handler1{
        ImageView image;
        TextView title;
    }
    class Handler2{
        ImageView image1;
        ImageView image2;
        ImageView image3;
        TextView title2;
    }

    @Override
    public int getItemViewType(int position) {
        //如果类表中的长度大于一返回1
        if (list.get(position).getImage().size()>1){
            return 1;
        }

        return 2;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }
}
