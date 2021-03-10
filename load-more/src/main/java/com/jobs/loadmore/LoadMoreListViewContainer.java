package com.jobs.loadmore;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

/**
 * @author huqiu.lhq
 */
public class LoadMoreListViewContainer extends LoadMoreAbsListViewContainerBase {

    private ListView mListView;

    public LoadMoreListViewContainer(Context context) {
        super(context);
    }

    public LoadMoreListViewContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void addFooterView(View view) {
        mListView.addFooterView(view);
    }

    @Override
    protected void removeFooterView(View view) {
        mListView.removeFooterView(view);
    }

    @Override
    protected AbsListView retrieveAbsListView() {
        mListView = (ListView) getChildAt(0);
        return mListView;
    }
    //最后一页，且显示 已经到底等等..
    public void loadMoreShowEnd(){
        loadMoreFinish(false,false);
    }
    //最后一页，但是不显示到底等内容
    public void loadMoreNotShowEnd(){
        loadMoreFinish(true,false);
    }
    //没有到底 仍可加载下一页
    public void loadMoreNotEnding(){
        loadMoreFinish(false,true);
    }
}
