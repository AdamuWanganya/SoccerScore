package com.moringa.soccerscore;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class LeaguesArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mLeagues;
    private String[] mliveScore;

    public LeaguesArrayAdapter(Context mContext, int resource, String[] mLeagues,String[] mliveScore) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mLeagues = mLeagues;
        this.mliveScore= mliveScore;
    }
}
