/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.viewer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import ax.u3.b;
import java.util.ArrayList;
import java.util.List;

public class d
extends ArrayAdapter<a> {
    static List<a> b;
    LayoutInflater a = LayoutInflater.from((Context)this.getContext());

    public d(Context context) {
        super(context, 0, d.b());
    }

    static List<a> b() {
        if (b == null) {
            ArrayList<a> arrayList = new ArrayList<a>();
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

    public static int c(float f8) {
        List<a> list = d.b();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            if (list.get((int)i8).b != f8) continue;
            return i8;
        }
        ax.u3.b.f();
        return d.c(1.0f);
    }

    View a(int n8, View object, ViewGroup viewGroup, int n9) {
        View view = object;
        if (object == null) {
            view = this.a.inflate(n9, viewGroup, false);
        }
        object = (a)this.getItem(n8);
        ((TextView)view).setText((CharSequence)object.a);
        return view;
    }

    public View getDropDownView(int n8, View view, ViewGroup viewGroup) {
        return this.a(n8, view, viewGroup, 2131558582);
    }

    public View getView(int n8, View view, ViewGroup viewGroup) {
        return this.a(n8, view, viewGroup, 2131558581);
    }

    public static class a {
        public String a;
        public float b;

        a(String string, float f8) {
            this.a = string;
            this.b = f8;
        }
    }
}

