package com.example.zh.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.zh.myapplication.models.Demo;
import com.example.zh.myapplication.R;

import java.util.List;

/**
 * Created by ZH on 2016/8/3.
 */
public class DemoAdapter extends ArrayAdapter<Demo> {
    private int resourceId;

    public DemoAdapter(Context context, int textViewResourceId,
                        List<Demo> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Demo demo = getItem(position);//获取当前项的Fruit实例
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder();
            viewHolder.demoDescription = (TextView) view.findViewById(R.id.demo_desciption);
            viewHolder.demoName = (TextView) view.findViewById(R.id.demo_name);
            view.setTag(viewHolder);//将ViewHolder存储在view中
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();//重新获取ViewHolder
        }
        viewHolder.demoDescription.setText(demo.getDemoDescription());
        viewHolder.demoName.setText(demo.getDemoName());
        return view;
    }

    class ViewHolder {

        TextView demoDescription;

        TextView demoName;

    }
}
