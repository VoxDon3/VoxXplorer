/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

public class d
extends BaseAdapter {
    e a;
    private int b = -1;
    private boolean c;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public d(e e8, LayoutInflater layoutInflater, boolean bl, int n8) {
        this.d = bl;
        this.e = layoutInflater;
        this.a = e8;
        this.f = n8;
        this.a();
    }

    void a() {
        g g8 = this.a.v();
        if (g8 != null) {
            ArrayList<g> arrayList = this.a.z();
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                if (arrayList.get(i8) != g8) continue;
                this.b = i8;
                return;
            }
        }
        this.b = -1;
    }

    public e b() {
        return this.a;
    }

    public g c(int n8) {
        ArrayList<g> arrayList = this.d ? this.a.z() : this.a.E();
        int n9 = this.b;
        int n10 = n8;
        if (n9 >= 0) {
            n10 = n8;
            if (n8 >= n9) {
                n10 = n8 + 1;
            }
        }
        return arrayList.get(n10);
    }

    public void d(boolean bl) {
        this.c = bl;
    }

    public int getCount() {
        ArrayList<g> arrayList = this.d ? this.a.z() : this.a.E();
        if (this.b < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public long getItemId(int n8) {
        return n8;
    }

    public View getView(int n8, View object, ViewGroup object2) {
        View view = object;
        if (object == null) {
            view = this.e.inflate(this.f, (ViewGroup)object2, false);
        }
        int n9 = this.c(n8).getGroupId();
        int n10 = n8 - 1;
        n10 = n10 >= 0 ? this.c(n10).getGroupId() : n9;
        object2 = (ListMenuItemView)view;
        boolean bl = this.a.G() && n9 != n10;
        ((ListMenuItemView)object2).setGroupDividerEnabled(bl);
        object = (k.a)view;
        if (this.c) {
            ((ListMenuItemView)object2).setForceShowIcon(true);
        }
        object.e(this.c(n8), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        this.a();
        super.notifyDataSetChanged();
    }
}

