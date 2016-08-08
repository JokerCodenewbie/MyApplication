package com.example.zh.myapplication.models;

/**
 * Created by ZH on 2016/8/8.
 */
public class ChatMsg {
        public static final int TYPE_RECEIVED = 0;

        public static final int TYPE_SENT = 1;

        private String content;

        private int type;

        public ChatMsg(String content, int type) {
            this.content = content;
            this.type = type;
        }

        public String getContent() {
            return content;
        }

        public int getType() {
            return type;
        }

}
