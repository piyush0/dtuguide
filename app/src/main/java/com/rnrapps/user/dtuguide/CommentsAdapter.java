package com.rnrapps.user.dtuguide;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.rnrapps.user.dtuguide.Utils;

import java.util.List;


/**
 * Created by rohanagarwal94 on 20/7/16.
 */
public class CommentsAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<CommentItem> commentItems;

    public CommentsAdapter(Activity activity,List<CommentItem> commentItems) {
        this.activity = activity;
        this.commentItems = commentItems;
    }
    @Override
    public int getCount() {
        if(commentItems.size()>0)
            return commentItems.size();
        else
            return 0;
    }

    @Override
    public Object getItem(int position) {
        return commentItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.commentview, null);

        TextView from = (TextView) convertView
                .findViewById(R.id.from);
        TextView comment = (TextView) convertView
                .findViewById(R.id.comment);
        TextView commentTime = (TextView) convertView
                .findViewById(R.id.commenttime);

        if(commentItems.size()!=0) {
            CommentItem commentItem = commentItems.get(position);

            if (commentItem.getTimeStamp() != null) {
                String a = commentItem.getTimeStamp();
                commentTime.setText(Utils.getTimeFromTimestamp(a));
            }

            if (!TextUtils.isEmpty(commentItem.getComment())) {
                comment.setText(commentItem.getComment());
                comment.setVisibility(View.VISIBLE);
            } else {
                // status is empty, remove from view
                comment.setVisibility(View.GONE);
            }

            if (!TextUtils.isEmpty(commentItem.getFrom())) {
                from.setText(commentItem.getFrom());
                from.setVisibility(View.VISIBLE);
            } else {
                // status is empty, remove from view
                from.setVisibility(View.GONE);
            }
        }

        return convertView;

    }
}
