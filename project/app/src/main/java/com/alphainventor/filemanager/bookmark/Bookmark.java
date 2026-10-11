/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.bookmark;

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
import ax.c3.A;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.x;
import ax.r8.g;
import ax.r8.h;
import ax.r8.i;
import ax.r8.m;
import ax.r8.o;
import ax.r8.p;
import ax.r8.q;
import com.google.gson.Gson;
import com.google.gson.a;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;

public class Bookmark
implements Serializable {
    private transient K c0;
    @ax.s8.c(value="type")
    private int d0;
    @ax.s8.c(value="name")
    private String e0;
    @ax.s8.c(value="location_key")
    private final int f0;
    @ax.s8.c(value="path")
    private String g0;
    @ax.s8.c(value="file_id")
    private final String h0;
    @ax.s8.c(value="is_dir")
    private final boolean i0;
    @ax.s8.c(value="location")
    private f j0;
    @ax.s8.c(value="time_millis")
    private long k0;
    private transient long q;

    private Bookmark(int n8, String string, K k8, String string2, String string3, boolean bl, long l8) {
        this.d0 = n8;
        this.e0 = string;
        this.c0 = k8;
        this.j0 = k8.d();
        this.f0 = k8.b();
        this.g0 = string2;
        this.h0 = string3;
        this.i0 = bl;
        this.k0 = l8;
    }

    public static String J(List<Bookmark> list) {
        q<f> q8 = new q<f>(){

            public i b(f f8, Type type, p p8) {
                return new o(f8.I());
            }
        };
        return new a().d((Type)((Object)f.class), q8).b().t(list);
    }

    public static Bookmark a(Context context) {
        K k8 = d.u(context);
        return Bookmark.b(5, k8.f(context), k8, d.F(context).v().getAbsolutePath(), null, true, -1L);
    }

    private static Bookmark b(int n8, String string, K k8, String string2, String string3, boolean bl, long l8) {
        return new Bookmark(n8, string, k8, string2, string3, bl, l8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Bookmark c(Context object, Uri object2) {
        k k8;
        if (k8.getScheme() == null) return null;
        if (k8.getHost() == null) return null;
        if (k8.getPath() == null) {
            return null;
        }
        try {
            k8 = k.a((Uri)k8);
            return Bookmark.d((Context)object, k8.d(), k8.e());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public static Bookmark d(Context context, K k8, String string) {
        return Bookmark.b(5, k8.f(context), k8, string, null, true, -1L);
    }

    public static Bookmark e(Cursor cursor) {
        int n8 = cursor.getInt(cursor.getColumnIndex("type"));
        String string = cursor.getString(cursor.getColumnIndex("display_name"));
        K k8 = K.a(f.p(cursor.getString(cursor.getColumnIndex("location_name"))), cursor.getInt(cursor.getColumnIndex("location_key")));
        String string2 = cursor.getString(cursor.getColumnIndex("path"));
        Object object = cursor.getString(cursor.getColumnIndex("file_id"));
        boolean bl = cursor.getInt(cursor.getColumnIndex("is_directory")) != 0;
        object = Bookmark.b(n8, string, k8, string2, (String)object, bl, cursor.getLong(cursor.getColumnIndex("timestamp")));
        ((Bookmark)object).E(cursor.getLong(cursor.getColumnIndex("_id")));
        return object;
    }

    public static Bookmark f(Bookmark bookmark) {
        return Bookmark.b(bookmark.d0, bookmark.e0, bookmark.u(), bookmark.g0, bookmark.h0, bookmark.i0, bookmark.y());
    }

    public static Bookmark g(Context context, String string) {
        return Bookmark.d(context, x.g(string).T(), string);
    }

    public static Bookmark h(String string, K k8, String string2, String string3, boolean bl) {
        return new Bookmark(2, string, k8, string2, string3, bl, System.currentTimeMillis());
    }

    public static Bookmark i(Context context, K k8, String string) {
        return Bookmark.b(5, k8.f(context), k8, string, null, true, System.currentTimeMillis());
    }

    public static Bookmark j(K k8, String string, String string2, boolean bl, long l8) {
        return new Bookmark(3, null, k8, string, string2, bl, l8);
    }

    public static Bookmark k(Bookmark bookmark) {
        Bookmark bookmark2 = Bookmark.f(bookmark);
        bookmark2.I(4);
        if (bookmark.y() != -5L) {
            bookmark2.H(System.currentTimeMillis());
        }
        return bookmark2;
    }

    public static Bookmark l(Context context, f f8) {
        return Bookmark.n(context, K.a(f8, 0));
    }

    public static Bookmark m(Context context, f f8, int n8) {
        return Bookmark.n(context, K.a(f8, n8));
    }

    public static Bookmark n(Context context, K k8) {
        return new Bookmark(1, k8.f(context), k8, k8.e(), null, true, -1L);
    }

    public static Bookmark o(s s8) {
        Object object;
        K k8 = s8.e();
        object = TextUtils.isEmpty((CharSequence)s8.d()) ? (((com.alphainventor.filemanager.file.o)(object = x.e(k8))).a() && ((com.alphainventor.filemanager.file.o)object).w() != null ? ((com.alphainventor.filemanager.file.o)object).w() : k8.e()) : s8.d();
        return new Bookmark(1, s8.f(), k8, (String)object, (String)object, true, -1L);
    }

    public static List<Bookmark> p(String object) {
        try {
            ax.x8.a<List<Bookmark>> a8 = new h<f>(){

                public f b(i i8, Type type, g g8) throws m {
                    return f.p(i8.k());
                }
            };
            Object object2 = new a();
            object2 = ((a)object2).d((Type)((Object)f.class), a8).b();
            a8 = new ax.x8.a<List<Bookmark>>(){};
            object = (List)((Gson)object2).l((String)object, a8.d());
            return object;
        }
        catch (Exception exception) {
            c.h().b("GSON TYPE TOKEN").l(exception).h();
            return null;
        }
    }

    public boolean A() {
        return this.i0;
    }

    public boolean B(f f8, int n8) {
        return this.s() == f8 && this.t() == n8;
    }

    public boolean C(Bookmark bookmark) {
        if (bookmark == null) {
            return false;
        }
        return this.s() == bookmark.s() && this.t() == bookmark.t();
    }

    public boolean D(Bookmark bookmark) {
        if (bookmark == null) {
            return false;
        }
        return this.C(bookmark) && bookmark.w().equals(this.w());
    }

    public void E(long l8) {
        this.q = l8;
    }

    public void F(String string) {
        this.e0 = string;
    }

    public void G(String string) {
        this.g0 = string;
    }

    public void H(long l8) {
        this.k0 = l8;
    }

    public void I(int n8) {
        this.d0 = n8;
    }

    public String q() {
        return this.h0;
    }

    public Drawable r(Context context) {
        if (this.A()) {
            return ax.s3.a.c(context, 2131231319);
        }
        return A.f(context, this.w(), true);
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
        return ax.c3.d0.v(this.u(), this.g0, this.i0);
    }

    public long y() {
        return this.k0;
    }

    public int z() {
        return this.d0;
    }
}

