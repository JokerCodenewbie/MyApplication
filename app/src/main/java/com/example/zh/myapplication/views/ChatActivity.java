package com.example.zh.myapplication.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.zh.myapplication.R;
import com.example.zh.myapplication.adapters.ChatAdapter;
import com.example.zh.myapplication.models.ChatMsg;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZH on 2016/8/8.
 */
public class ChatActivity extends AppCompatActivity{
    private ListView msgListView;

    private EditText inputText;

    private Button send;

    private ChatAdapter adapter;

    private List<ChatMsg> msgList = new ArrayList<ChatMsg>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        initMsgs();
        adapter = new ChatAdapter(ChatActivity.this, R.layout.item_chat, msgList);
        inputText = (EditText) findViewById(R.id.chat_input_text);
        send = (Button) findViewById(R.id.chat_send_button);
        msgListView = (ListView) findViewById(R.id.chat_list);
        msgListView.setAdapter(adapter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = inputText.getText().toString();
                if (!"".equals(content)) {
                    ChatMsg msg = new ChatMsg(content, ChatMsg.TYPE_SENT);
                    msgList.add(msg);
                    adapter.notifyDataSetChanged();
                    msgListView.setSelection(msgList.size());
                    inputText.setText("");
                }
            }
        });
    }

    private void initMsgs() {
        ChatMsg msg1 = new ChatMsg("Hello guy.", ChatMsg.TYPE_RECEIVED);
        msgList.add(msg1);
        ChatMsg msg2 = new ChatMsg("Hello. Who is that?", ChatMsg.TYPE_SENT);
        msgList.add(msg2);
        ChatMsg msg3 = new ChatMsg("This is Tom. Nice talking to you. ", ChatMsg.TYPE_RECEIVED);
        msgList.add(msg3);
    }
}
