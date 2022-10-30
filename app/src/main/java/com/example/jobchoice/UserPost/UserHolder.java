package com.example.jobchoice.UserPost;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jobchoice.R;

public class UserHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    TextView companyName_txtview;
    TextView jobTitle_txtview;
    TextView requirement_txtview;
    TextView salary_txtview;
    UserItemClickListener userItemClickListener;

    UserHolder(@NonNull View itemView){
        super(itemView);
        companyName_txtview = itemView.findViewById(R.id.companyName_txtview);
        jobTitle_txtview = itemView.findViewById(R.id.jobTitle_txtview);
        requirement_txtview = itemView.findViewById(R.id.requirement_txtview);
        salary_txtview = itemView.findViewById(R.id.salary_txtview);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.userItemClickListener.onItemClickListener(view,getLayoutPosition());
    }

    public void setItemClickListener(UserItemClickListener ic){
        this.userItemClickListener = ic;
    }
}
