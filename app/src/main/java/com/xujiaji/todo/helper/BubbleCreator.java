package com.xujiaji.todo.helper;

import android.app.Activity;
import android.support.v4.content.ContextCompat;

import com.xujiaji.happybubble.BubbleLayout;
import com.xujiaji.happybubble.Util;
import com.xujiaji.todo.R;

/**
 * author: xujiaji
 * created on: 2018/11/29 15:48
 * description:
 */
public class BubbleCreator {

    public static BubbleLayout get(Activity activity) {
        BubbleLayout bl = new BubbleLayout(activity);
        bl.setLookLength(Util.dpToPx(activity, 13));
        bl.setLookWidth(Util.dpToPx(activity, 18));
        bl.setBubbleRadius(Util.dpToPx(activity, 5));
        bl.setShadowColor(ContextCompat.getColor(activity, R.color.colorAccent));
        return bl;
    }

    public static BubbleLayout getAmber(Activity activity) {
        BubbleLayout bl = new BubbleLayout(activity);
        bl.setBubbleColor(ContextCompat.getColor(activity, R.color.amber_800));
        bl.setShadowColor(ContextCompat.getColor(activity, R.color.overlay_dark_80));
        return bl;
    }
}
