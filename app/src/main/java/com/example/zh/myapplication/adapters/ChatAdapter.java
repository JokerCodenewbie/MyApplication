package com.example.zh.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.zh.myapplication.R;
import com.example.zh.myapplication.models.ChatMsg;

import java.util.List;

/**
 * Created by ZH on 2016/8/8.
 */
public class ChatAdapter extends ArrayAdapter<ChatMsg> {
    private int resourceId;

    public ChatAdapter(Context context, int textViewResourceId, List<ChatMsg> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ChatMsg msg = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder();
            viewHolder.leftLayout = (LinearLayout) view.findViewById(R.id.chat_left_layout);
            viewHolder.rightLayout = (LinearLayout) view.findViewById(R.id.chat_right_layout);
            viewHolder.leftMsg = (TextView) view.findViewById(R.id.chat_left_text);
            viewHolder.rightMsg = (TextView) view.findViewById(R.id.chat_right_text);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        if (msg.getType() == ChatMsg.TYPE_RECEIVED) {
            viewHolder.leftLayout.setVisibility(View.VISIBLE);
            viewHolder.rightLayout.setVisibility(View.GONE);
            viewHolder.leftMsg.setText(msg.getContent());
        } else if(msg.getType() == ChatMsg.TYPE_SENT) {
            viewHolder.rightLayout.setVisibility(View.VISIBLE);
            viewHolder.leftLayout.setVisibility(View.GONE);
            viewHolder.rightMsg.setText(msg.getContent());
        }
        return view;
    }

    class ViewHolder {

        LinearLayout leftLayout;

        LinearLayout rightLayout;

        TextView leftMsg;

        TextView rightMsg;

    }
}
