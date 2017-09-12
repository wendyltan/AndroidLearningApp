package xyz.wendyltanpcy.fragmentbestpractice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Wendy on 2017/9/6.
 */

public class NewsContentFragment extends Fragment {

    private View mView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.news_content_frag,container,false);
        return mView;
    }

    public void refresh(String newsTitle,String newsContent){
        View visibilityLayout = mView.findViewById(R.id.visibility_layout);
        visibilityLayout.setVisibility(View.VISIBLE);
        TextView newsTitleText = (TextView) mView.findViewById(R.id.news_title);
        TextView newsContentText = (TextView) mView.findViewById(R.id.news_content);
        newsTitleText.setText(newsTitle);
        newsContentText.setText(newsContent);
    }
}
