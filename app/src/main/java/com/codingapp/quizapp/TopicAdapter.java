package com.codingapp.quizapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.Viewholder> {

    private List<TopicModel>topicModelList;{
        this.topicModelList=topicModelList;
    }

    public TopicAdapter(List<TopicModel> list) {
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //for increpting item layout
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.topic_item,parent,false);
        //passing layout of viewholder
        return new Viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        //calling the method
        holder.setData(topicModelList.get(position).getUrl(),topicModelList.get(position).getName(),topicModelList.get(position).getSets());
    }

    @Override
    public int getItemCount() {
        return topicModelList.size();
    }
    //passing Viewholder class
    //creating class
    class Viewholder extends RecyclerView.ViewHolder{
        //declaring variable
        private CircleImageView imageView;
        private TextView topic;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image_view);
            topic=itemView.findViewById(R.id.title);
        }

        private void setData(String url, final String topic, final int sets){ //creating a method

            Glide.with(itemView.getContext()).load(url).into(imageView); //using glide to set the image
            this.topic.setText(topic);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent setIntent=new Intent(itemView.getContext(),SetsActivity.class);
                    setIntent.putExtra("topic",topic);
                    setIntent.putExtra("sets",sets);
                    itemView.getContext().startActivity(setIntent);
                }
            });
        }
    }
}
