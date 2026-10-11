/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import ax.Q2.f;
import ax.V2.d;
import ax.s3.b;
import com.alphainventor.filemanager.bookmark.Bookmark;
import java.util.List;

public class j
extends BaseAdapter
implements d.b {
    Context a;
    d b;
    List<Bookmark> c;

    public j(Context context, d d8) {
        this.a = context;
        this.b = d8;
        this.c = d8.h(4, 2, true);
    }

    @Override
    public void a() {
        this.c = this.b.h(4, 2, true);
        this.notifyDataSetChanged();
    }

    public Bookmark b(int n8) {
        if (n8 >= this.c.size()) {
            return null;
        }
        return this.c.get(n8);
    }

    public int getCount() {
        return Math.min(this.c.size(), 4);
    }

    public long getItemId(int n8) {
        return n8;
    }

    public View getView(int n8, View view, ViewGroup object) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
        if (view == null) {
            view = layoutInflater.inflate(2131558481, (ViewGroup)object, false);
        }
        layoutInflater = object.getContext();
        object = this.b(n8);
        ((ImageView)view.findViewById(2131362383)).setImageDrawable(ax.s3.b.d((Context)layoutInflater, ((Bookmark)object).s()));
        ((TextView)view.findViewById(2131362963)).setText((CharSequence)f.H((Context)layoutInflater, ((Bookmark)object).u()));
        ((TextView)view.findViewById(2131362677)).setText((CharSequence)((Bookmark)object).x());
        return view;
    }
}

