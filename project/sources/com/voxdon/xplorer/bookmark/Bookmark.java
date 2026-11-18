package com.voxdon.xplorer.bookmark;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import ax.Ha.c;
import ax.Q2.f;
import ax.U2.d;
import ax.Z2.k;
import ax.Z2.s;
import ax.c3.C1808A;
import ax.c3.C1835x;
import ax.c3.K;
import ax.c3.d0;
import ax.r8.AbstractC3000i;
import ax.r8.C3004m;
import ax.r8.C3006o;
import ax.r8.InterfaceC2998g;
import ax.r8.InterfaceC2999h;
import ax.r8.InterfaceC3007p;
import ax.r8.InterfaceC3008q;
import ax.s3.C3045a;
import ax.s8.InterfaceC3061c;
import ax.x8.C3475a;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.R;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes.dex */
public class Bookmark implements Serializable {
    private transient K c0;

    @InterfaceC3061c("type")
    private int d0;

    @InterfaceC3061c("name")
    private String e0;

    @InterfaceC3061c("location_key")
    private final int f0;

    @InterfaceC3061c("path")
    private String g0;

    @InterfaceC3061c("file_id")
    private final String h0;

    @InterfaceC3061c("is_dir")
    private final boolean i0;

    @InterfaceC3061c("location")
    private f j0;

    @InterfaceC3061c("time_millis")
    private long k0;
    private transient long q;

    class a extends C3475a<List<Bookmark>> {
        a() {
        }
    }

    private Bookmark(int i, String str, K k, String str2, String str3, boolean z, long j) {
        this.d0 = i;
        this.e0 = str;
        this.c0 = k;
        this.j0 = k.d();
        this.f0 = k.b();
        this.g0 = str2;
        this.h0 = str3;
        this.i0 = z;
        this.k0 = j;
    }

    public static String J(List<Bookmark> list) {
        return new com.google.gson.a().d(f.class, new InterfaceC3008q<f>() { // from class: com.voxdon.xplorer.bookmark.Bookmark.1
            @Override // ax.r8.InterfaceC3008q
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC3000i a(f fVar, Type type, InterfaceC3007p interfaceC3007p) {
                return new C3006o(fVar.I());
            }
        }).b().t(list);
    }

    public static Bookmark a(Context context) {
        K u = d.u(context);
        return b(5, u.f(context), u, d.F(context).v().getAbsolutePath(), null, true, -1L);
    }

    private static Bookmark b(int i, String str, K k, String str2, String str3, boolean z, long j) {
        return new Bookmark(i, str, k, str2, str3, z, j);
    }

    public static Bookmark c(Context context, Uri uri) {
        if (uri.getScheme() != null && uri.getHost() != null && uri.getPath() != null) {
            try {
                k a2 = k.a(uri);
                return d(context, a2.d(), a2.e());
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static Bookmark d(Context context, K k, String str) {
        return b(5, k.f(context), k, str, null, true, -1L);
    }

    public static Bookmark e(Cursor cursor) {
        Bookmark b = b(cursor.getInt(cursor.getColumnIndex("type")), cursor.getString(cursor.getColumnIndex("display_name")), K.a(f.p(cursor.getString(cursor.getColumnIndex("location_name"))), cursor.getInt(cursor.getColumnIndex("location_key"))), cursor.getString(cursor.getColumnIndex("path")), cursor.getString(cursor.getColumnIndex("file_id")), cursor.getInt(cursor.getColumnIndex("is_directory")) != 0, cursor.getLong(cursor.getColumnIndex("timestamp")));
        b.E(cursor.getLong(cursor.getColumnIndex("_id")));
        return b;
    }

    public static Bookmark f(Bookmark bookmark) {
        return b(bookmark.d0, bookmark.e0, bookmark.u(), bookmark.g0, bookmark.h0, bookmark.i0, bookmark.y());
    }

    public static Bookmark g(Context context, String str) {
        return d(context, C1835x.g(str).T(), str);
    }

    public static Bookmark h(String str, K k, String str2, String str3, boolean z) {
        return new Bookmark(2, str, k, str2, str3, z, System.currentTimeMillis());
    }

    public static Bookmark i(Context context, K k, String str) {
        return b(5, k.f(context), k, str, null, true, System.currentTimeMillis());
    }

    public static Bookmark j(K k, String str, String str2, boolean z, long j) {
        return new Bookmark(3, null, k, str, str2, z, j);
    }

    public static Bookmark k(Bookmark bookmark) {
        Bookmark f = f(bookmark);
        f.I(4);
        if (bookmark.y() != -5) {
            f.H(System.currentTimeMillis());
        }
        return f;
    }

    public static Bookmark l(Context context, f fVar) {
        return n(context, K.a(fVar, 0));
    }

    public static Bookmark m(Context context, f fVar, int i) {
        return n(context, K.a(fVar, i));
    }

    public static Bookmark n(Context context, K k) {
        return new Bookmark(1, k.f(context), k, k.e(), null, true, -1L);
    }

    public static Bookmark o(s sVar) {
        String d;
        K e = sVar.e();
        if (TextUtils.isEmpty(sVar.d())) {
            C3596o e2 = C1835x.e(e);
            d = (!e2.a() || e2.w() == null) ? e.e() : e2.w();
        } else {
            d = sVar.d();
        }
        String str = d;
        return new Bookmark(1, sVar.f(), e, str, str, true, -1L);
    }

    public static List<Bookmark> p(String str) {
        try {
            return (List) new com.google.gson.a().d(f.class, new InterfaceC2999h<f>() { // from class: com.voxdon.xplorer.bookmark.Bookmark.2
                @Override // ax.r8.InterfaceC2999h
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public f a(AbstractC3000i abstractC3000i, Type type, InterfaceC2998g interfaceC2998g) throws C3004m {
                    return f.p(abstractC3000i.k());
                }
            }).b().l(str, new a().d());
        } catch (Exception e) {
            c.h().b("GSON TYPE TOKEN").l(e).h();
            return null;
        }
    }

    public boolean A() {
        return this.i0;
    }

    public boolean B(f fVar, int i) {
        return s() == fVar && t() == i;
    }

    public boolean C(Bookmark bookmark) {
        return bookmark != null && s() == bookmark.s() && t() == bookmark.t();
    }

    public boolean D(Bookmark bookmark) {
        return bookmark != null && C(bookmark) && bookmark.w().equals(w());
    }

    public void E(long j) {
        this.q = j;
    }

    public void F(String str) {
        this.e0 = str;
    }

    public void G(String str) {
        this.g0 = str;
    }

    public void H(long j) {
        this.k0 = j;
    }

    public void I(int i) {
        this.d0 = i;
    }

    public String q() {
        return this.h0;
    }

    public Drawable r(Context context) {
        return A() ? C3045a.c(context, R.drawable.icon_folder_full) : C1808A.f(context, w(), true);
    }

    public f s() {
        return this.j0;
    }

    public int t() {
        return this.f0;
    }

    public K u() {
        if (this.c0 == null) {
            this.c0 = K.a(this.j0, this.f0);
        }
        return this.c0;
    }

    public String v() {
        return this.e0;
    }

    public String w() {
        return this.g0;
    }

    public String x() {
        if (this.g0 == null) {
            return null;
        }
        return d0.v(u(), this.g0, Boolean.valueOf(this.i0));
    }

    public long y() {
        return this.k0;
    }

    public int z() {
        return this.d0;
    }
}
