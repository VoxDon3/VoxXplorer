package com.voxdon.xplorer.viewer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import ax.u3.C3184b;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d extends ArrayAdapter<a> {
    static List<a> b;
    LayoutInflater a;

    public static class a {
        public String a;
        public float b;

        a(String str, float f) {
            this.a = str;
            this.b = f;
        }
    }

    public d(Context context) {
        super(context, 0, b());
        this.a = LayoutInflater.from(getContext());
    }

    static List<a> b() {
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            b = arrayList;
            arrayList.add(new a("0.25X", 0.25f));
            b.add(new a("0.5X", 0.5f));
            b.add(new a("0.75X", 0.75f));
            b.add(new a("1X", 1.0f));
            b.add(new a("1.25X", 1.25f));
            b.add(new a("1.5X", 1.5f));
            b.add(new a("1.75X", 1.75f));
            b.add(new a("2X", 2.0f));
        }
        return b;
    }

    public static int c(float f) {
        List<a> b2 = b();
        for (int i = 0; i < b2.size(); i++) {
            if (b2.get(i).b == f) {
                return i;
            }
        }
        C3184b.f();
        return c(1.0f);
    }

    View a(int i, View view, ViewGroup viewGroup, int i2) {
        if (view == null) {
            view = this.a.inflate(i2, viewGroup, false);
        }
        ((TextView) view).setText(((a) getItem(i)).a);
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.item_video_player_speed_dropdown);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.item_video_player_speed);
    }
}
