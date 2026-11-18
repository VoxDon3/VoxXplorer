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
import ax.Z2.s;
import ax.s3.b;
import com.voxdon.xplorer.file.T;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class l
extends BaseAdapter {
    private Context a;
    private List<s> b;

    public l(Context context) {
        this.a = context;
        this.b = new ArrayList<s>();
        this.b();
    }

    public s a(int n8) {
        return this.b.get(n8);
    }

    public void b() {
        this.b.clear();
        this.b.addAll(T.e(this.a));
        this.b.addAll(T.c(this.a));
        Collections.sort(this.b, new Comparator<s>(this){
            final l q;
            {
                this.q = l8;
            }

            public int a(s s8, s s9) {
                long l8 = s8.a() - s9.a();
                long l9 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (l9 < 0) {
                    return -1;
                }
                if (l9 == false) {
                    return 0;
                }
                return 1;
            }
        });
        Object object = this.a.getString(2131952240);
        this.b.add(new s(f.Y0, 0, (String)object, "", "", "", 0L, 0L));
        List<s> list = this.b;
        object = f.W0;
        list.add(0, new s((f)((Object)object), 0, ((f)((Object)object)).M(this.a), "", "", "", 0L, 0L));
        this.notifyDataSetChanged();
    }

    public int getCount() {
        return this.b.size();
    }

    public long getItemId(int n8) {
        return n8;
    }

    public View getView(int n8, View view, ViewGroup viewGroup) {
        viewGroup = view;
        if (view == null) {
            viewGroup = ((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(2131558484, null);
        }
        s s8 = this.b.get(n8);
        view = (ImageView)viewGroup.findViewById(2131362383);
        f f8 = s8.e().d();
        view.setImageDrawable(ax.s3.b.e(this.a, f8, null));
        ((TextView)viewGroup.findViewById(2131362593)).setText((CharSequence)s8.f());
        ((TextView)viewGroup.findViewById(2131362401)).setVisibility(8);
        return viewGroup;
    }
}

