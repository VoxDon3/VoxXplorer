package ax.d1;

import android.net.Uri;
import ax.P0.C0906o;
import ax.P0.C0912v;
import ax.P0.L;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class i extends j {
    public static final i n;
    public final List<Uri> d;
    public final List<b> e;
    public final List<a> f;
    public final List<a> g;
    public final List<a> h;
    public final List<a> i;
    public final C0912v j;
    public final List<C0912v> k;
    public final Map<String, String> l;
    public final List<C0906o> m;

    public static final class a {
        public final Uri a;
        public final C0912v b;
        public final String c;
        public final String d;

        public a(Uri uri, C0912v c0912v, String str, String str2) {
            this.a = uri;
            this.b = c0912v;
            this.c = str;
            this.d = str2;
        }
    }

    public static final class b {
        public final Uri a;
        public final C0912v b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public b(Uri uri, C0912v c0912v, String str, String str2, String str3, String str4) {
            this.a = uri;
            this.b = c0912v;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new C0912v.b().j0("0").W("application/x-mpegURL").P(), null, null, null, null);
        }

        public b a(C0912v c0912v) {
            return new b(this.a, c0912v, this.c, this.d, this.e, this.f);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        n = new i(HttpUrl.FRAGMENT_ENCODE_SET, list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public i(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, C0912v c0912v, List<C0912v> list7, boolean z, Map<String, String> map, List<C0906o> list8) {
        super(str, list, z);
        this.d = DesugarCollections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f = DesugarCollections.unmodifiableList(list3);
        this.g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.i = DesugarCollections.unmodifiableList(list6);
        this.j = c0912v;
        this.k = list7 != null ? DesugarCollections.unmodifiableList(list7) : null;
        this.l = DesugarCollections.unmodifiableMap(map);
        this.m = DesugarCollections.unmodifiableList(list8);
    }

    private static void b(List<a> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> d(List<T> list, int i, List<L> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    L l = list2.get(i3);
                    if (l.c0 == i && l.d0 == i2) {
                        arrayList.add(t);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    public static i e(String str) {
        List singletonList = Collections.singletonList(b.b(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new i(HttpUrl.FRAGMENT_ENCODE_SET, list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    private static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // ax.h1.InterfaceC2142a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public i a(List<L> list) {
        String str = this.a;
        List<String> list2 = this.b;
        List d = d(this.e, 0, list);
        List list3 = Collections.EMPTY_LIST;
        return new i(str, list2, d, list3, d(this.g, 1, list), d(this.h, 2, list), list3, this.j, this.k, this.c, this.l, this.m);
    }
}
