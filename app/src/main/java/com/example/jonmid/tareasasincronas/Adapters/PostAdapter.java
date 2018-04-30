package com.example.jonmid.tareasasincronas.Adapters;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.jonmid.tareasasincronas.Models.Post;
import com.example.jonmid.tareasasincronas.R;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    List<Post> postList = new ArrayList<>();
    Context context;

    public PostAdapter(List<Post> postList, Context context) {
        this.postList = postList;
        this.context = context;
    }

    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View item2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item2, parent, false);

        PostAdapter.ViewHolder viewHolder = new PostAdapter.ViewHolder(item2);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolder holder, int position) {
        holder.id_post.setText(String.valueOf(postList.get(position).getId()));
        holder.id_title.setText(postList.get(position).getTitle());
        holder.id_body.setText(postList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView id_post;
        TextView id_title;
        TextView id_body;

        public ViewHolder(View item) {
            super(item);

            id_post = (TextView) item.findViewById(R.id.id_post);
            id_title = (TextView) item.findViewById(R.id.id_title);
            id_body = (TextView) item.findViewById(R.id.id_body);
        }
    }
}