/*
 * Decompiled with CFR 0.152.
 */
package ax.d1;

import android.net.Uri;
import ax.P0.L;
import ax.P0.o;
import ax.P0.v;
import ax.d1.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class i
extends j {
    public static final i n;
    public final List<Uri> d;
    public final List<b> e;
    public final List<a> f;
    public final List<a> g;
    public final List<a> h;
    public final List<a> i;
    public final v j;
    public final List<v> k;
    public final Map<String, String> l;
    public final List<o> m;

    static {
        List list = Collections.EMPTY_LIST;
        n = new i("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public i(String list, List<String> list2, List<b> list3, List<a> list4, List<a> list5, List<a> list6, List<a> list7, v v8, List<v> list8, boolean bl, Map<String, String> map, List<o> list9) {
        super((String)((Object)list), list2, bl);
        this.d = java.util.DesugarCollections.unmodifiableList(ax.d1.i.f(list3, list4, list5, list6, list7));
        this.e = java.util.DesugarCollections.unmodifiableList(list3);
        this.f = java.util.DesugarCollections.unmodifiableList(list4);
        this.g = java.util.DesugarCollections.unmodifiableList(list5);
        this.h = java.util.DesugarCollections.unmodifiableList(list6);
        this.i = java.util.DesugarCollections.unmodifiableList(list7);
        this.j = v8;
        list = list8 != null ? java.util.DesugarCollections.unmodifiableList(list8) : null;
        this.k = list;
        this.l = java.util.DesugarCollections.unmodifiableMap(map);
        this.m = java.util.DesugarCollections.unmodifiableList(list9);
    }

    private static void b(List<a> list, List<Uri> list2) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            Uri uri = list.get((int)i8).a;
            if (uri == null || list2.contains(uri)) continue;
            list2.add(uri);
        }
    }

    private static <T> List<T> d(List<T> list, int n8, List<L> list2) {
        ArrayList<T> arrayList = new ArrayList<T>(list2.size());
        block0: for (int i8 = 0; i8 < list.size(); ++i8) {
            T t8 = list.get(i8);
            for (int i9 = 0; i9 < list2.size(); ++i9) {
                L l8 = list2.get(i9);
                if (l8.c0 != n8 || l8.d0 != i8) continue;
                arrayList.add(t8);
                continue block0;
            }
        }
        return arrayList;
    }

    public static i e(String object) {
        List<b> list = Collections.singletonList(ax.d1.i$b.b(Uri.parse((String)object)));
        object = Collections.EMPTY_LIST;
        return new i("", (List<String>)object, list, (List<a>)object, (List<a>)object, (List<a>)object, (List<a>)object, null, null, false, Collections.EMPTY_MAP, (List<o>)object);
    }

    private static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList<Uri> arrayList = new ArrayList<Uri>();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            Uri uri = list.get((int)i8).a;
            if (arrayList.contains(uri)) continue;
            arrayList.add(uri);
        }
        ax.d1.i.b(list2, arrayList);
        ax.d1.i.b(list3, arrayList);
        ax.d1.i.b(list4, arrayList);
        ax.d1.i.b(list5, arrayList);
        return arrayList;
    }

    public i c(List<L> list) {
        String string = this.a;
        List<String> list2 = this.b;
        List<b> list3 = ax.d1.i.d(this.e, 0, list);
        List list4 = Collections.EMPTY_LIST;
        return new i(string, list2, list3, list4, ax.d1.i.d(this.g, 1, list), ax.d1.i.d(this.h, 2, list), list4, this.j, this.k, this.c, this.l, this.m);
    }

    public static final class a {
        public final Uri a;
        public final v b;
        public final String c;
        public final String d;

        public a(Uri uri, v v8, String string, String string2) {
            this.a = uri;
            this.b = v8;
            this.c = string;
            this.d = string2;
        }
    }

    public static final class b {
        public final Uri a;
        public final v b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public b(Uri uri, v v8, String string, String string2, String string3, String string4) {
            this.a = uri;
            this.b = v8;
            this.c = string;
            this.d = string2;
            this.e = string3;
            this.f = string4;
        }

        public static b b(Uri uri) {
            return new b(uri, new v.b().j0("0").W("application/x-mpegURL").P(), null, null, null, null);
        }

        public b a(v v8) {
            return new b(this.a, v8, this.c, this.d, this.e, this.f);
        }
    }
}

