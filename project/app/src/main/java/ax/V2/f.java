/*
 * Decompiled with CFR 0.152.
 */
package ax.V2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import ax.V2.d;
import ax.c3.K;
import ax.g3.c;
import ax.s3.b;
import com.voxdon.xplorer.bookmark.Bookmark;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class f
extends BaseAdapter {
    private List<Bookmark> a;
    private Context b;
    private d c;
    private K d;
    private String e;

    public f(Context context, d d8) {
        this.b = context;
        this.a = new ArrayList<Bookmark>();
        this.c = d8;
    }

    private List<Bookmark> c(List<Bookmark> list) {
        Object object;
        ArrayList<K> arrayList = new ArrayList<K>();
        ArrayList<Bookmark> arrayList2 = new ArrayList<Bookmark>();
        Object object2 = list.iterator();
        while (object2.hasNext()) {
            object = object2.next().u();
            if (arrayList.contains(object)) continue;
            arrayList.add((K)object);
        }
        int n8 = arrayList.size();
        int n9 = 0;
        block1: while (n9 < n8) {
            object = arrayList.get(n9);
            int n10 = n9 + 1;
            object2 = object;
            Iterator<Bookmark> iterator = list.iterator();
            while (true) {
                n9 = n10;
                if (!iterator.hasNext()) continue block1;
                object = iterator.next();
                if (!((K)object2).equals(((Bookmark)object).u())) continue;
                arrayList2.add((Bookmark)object);
            }
        }
        return arrayList2;
    }

    private void e(Bookmark bookmark) {
        this.a.remove(bookmark);
    }

    public void d(K object, String object2) {
        this.d = object;
        this.e = object2;
        List<Bookmark> list = this.c.h(5, 3, false);
        Iterator<Bookmark> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object3 = iterator.next();
            K k8 = ((Bookmark)object3).u();
            object3 = ((Bookmark)object3).w();
            if (!k8.equals(object) || object3 == null || !((String)object3).equals(object2)) continue;
            iterator.remove();
        }
        object = this.c(list);
        this.a.clear();
        object2 = object.iterator();
        while (object2.hasNext()) {
            object = (Bookmark)object2.next();
            if (!((Bookmark)object).A()) continue;
            this.a.add((Bookmark)object);
        }
        this.notifyDataSetChanged();
    }

    public int getCount() {
        return this.a.size();
    }

    public Object getItem(int n8) {
        return this.a.get(n8);
    }

    public long getItemId(int n8) {
        return n8;
    }

    public View getView(int n8, View object, ViewGroup viewGroup) {
        Bookmark bookmark = (Bookmark)this.getItem(n8);
        viewGroup = object;
        if (object == null) {
            viewGroup = ((LayoutInflater)this.b.getSystemService("layout_inflater")).inflate(2131558580, null);
        }
        ((ImageView)viewGroup.findViewById(2131362383)).setImageDrawable(bookmark.r(this.b));
        ((TextView)viewGroup.findViewById(2131362677)).setText((CharSequence)bookmark.x());
        if (n8 != 0 && bookmark.s() == ((Bookmark)this.getItem(n8 - 1)).s()) {
            viewGroup.findViewById(2131362463).setVisibility(8);
        } else {
            viewGroup.findViewById(2131362463).setVisibility(0);
            String string = ax.Q2.f.H(this.b, bookmark.u());
            object = ax.Q2.f.G(this.b, bookmark.u());
            ((TextView)viewGroup.findViewById(2131362460)).setText((CharSequence)string);
            string = ax.s3.b.j(this.b, bookmark.s(), false);
            ((ImageView)viewGroup.findViewById(2131362461)).setImageDrawable((Drawable)string);
            ((ImageView)viewGroup.findViewById(2131362461)).setVisibility(0);
            if (object != null) {
                string = (TextView)viewGroup.findViewById(2131362773);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("(");
                stringBuilder.append((String)object);
                stringBuilder.append(")");
                string.setText((CharSequence)stringBuilder.toString());
            } else {
                ((TextView)viewGroup.findViewById(2131362773)).setText((CharSequence)"");
            }
        }
        viewGroup.findViewById(2131362040).setOnClickListener((View.OnClickListener)new c(this, bookmark){
            final Bookmark c;
            final f d;
            {
                this.d = f8;
                this.c = bookmark;
            }

            @Override
            public void a(View view) {
                this.d.c.p(this.c);
                this.d.e(this.c);
                this.d.notifyDataSetChanged();
            }
        });
        viewGroup.findViewById(2131362040).setOnKeyListener(new View.OnKeyListener(this){
            final f a;
            {
                this.a = f8;
            }

            public boolean onKey(View view, int n8, KeyEvent keyEvent) {
                if (n8 == 21 && keyEvent.getAction() == 0) {
                    for (view = view.getParent(); view != null && !(view instanceof ListView); view = view.getParent()) {
                    }
                    if (view instanceof ListView) {
                        view = (ListView)view;
                        view.setItemsCanFocus(false);
                        view.setDescendantFocusability(131072);
                        view.requestFocus();
                    }
                    return true;
                }
                return false;
            }
        });
        return viewGroup;
    }
}

