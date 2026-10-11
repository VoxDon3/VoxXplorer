/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import ax.Ha.c;
import ax.Q2.f;
import ax.Z2.a;
import ax.b3.j;
import ax.c3.A;
import ax.c3.B;
import ax.c3.K;
import ax.c3.b;
import ax.c3.d0;
import ax.c3.t;
import ax.c3.x;
import ax.c3.z;
import com.alphainventor.filemanager.file.m;
import com.alphainventor.filemanager.file.p;
import com.alphainventor.filemanager.file.y;
import java.io.File;

public abstract class n
implements Comparable<n>,
b {
    private K c0;
    private int d0;
    private long e0;
    private int f0;
    private String g0;
    private String h0;
    private z i0;
    private String j0;
    private Context q;

    public n(m m8) {
        this.q = m8.p().getApplicationContext();
        this.c0 = m8.v();
        this.d0 = -1;
    }

    public String A() {
        return ax.c3.d0.j(this.B());
    }

    public final String B() {
        String string = this.C();
        String string2 = ax.c3.d0.h(this.E());
        if (string != null && !string.equals(string2)) {
            if (this instanceof y) {
                CharSequence charSequence;
                Object object = (y)this;
                Object object2 = ((y)object).M0;
                ax.Ha.b b8 = null;
                if (object2 != null) {
                    charSequence = ((File)object2).getAbsolutePath();
                    String string3 = ((y)object).F0().getAbsolutePath();
                    object = charSequence;
                    object2 = b8;
                    if (string3.startsWith((String)charSequence)) {
                        string3 = string3.substring(((String)charSequence).length());
                        object = charSequence;
                        object2 = b8;
                        if (string3.startsWith("/")) {
                            object2 = string3.substring(1);
                            object = charSequence;
                        }
                    }
                } else {
                    object = "null";
                    object2 = b8;
                }
                b8 = c.h().f().d("GFNA LOCAL!!!").j();
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(this.P().I());
                ((StringBuilder)charSequence).append(":");
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append(":");
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(":parentPath=");
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append(":dir=");
                ((StringBuilder)charSequence).append(this.isDirectory());
                ((StringBuilder)charSequence).append(":alt=");
                ((StringBuilder)charSequence).append((String)object2);
                b8.g(((StringBuilder)charSequence).toString()).h();
                if (object2 != null) {
                    return object2;
                }
            } else {
                ax.Ha.b b9 = c.h().f().d("GFNA").j();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.P().I());
                stringBuilder.append(":");
                stringBuilder.append(string);
                stringBuilder.append(":");
                stringBuilder.append(string2);
                b9.g(stringBuilder.toString()).h();
            }
        }
        return string;
    }

    protected abstract String C();

    public p D() {
        return null;
    }

    public final String E() {
        String string = this.F();
        if (!ax.c3.d0.B(string)) {
            CharSequence charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.P().I());
            ((StringBuilder)charSequence).append("-");
            ((StringBuilder)charSequence).append(this.C());
            ((StringBuilder)charSequence).append("-");
            ((StringBuilder)charSequence).append(string);
            String string2 = ((StringBuilder)charSequence).toString();
            charSequence = string2;
            if (this instanceof y) {
                y y8 = (y)this;
                charSequence = string2;
                if (y8.F0() != null) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(string2);
                    ((StringBuilder)charSequence).append("-");
                    ((StringBuilder)charSequence).append(y8.F0().getPath());
                    charSequence = ((StringBuilder)charSequence).toString();
                }
            }
            c.h().f().b("NOT NORMALIZED PATH").g(charSequence).h();
        }
        return string;
    }

    protected abstract String F();

    public z G() {
        if (this.i0 == null) {
            this.i0 = A.g(this.A());
        }
        return this.i0;
    }

    public String H(int n8) {
        String string;
        long l8 = this.q();
        this.u(n8);
        if (this.e0 == l8 && (string = this.h0) != null) {
            return string;
        }
        this.e0 = l8;
        this.h0 = string = this.w(l8, n8);
        return string;
    }

    @SuppressLint(value={"DefaultLocale"})
    public String I(boolean bl) {
        if (this.isDirectory()) {
            int n8 = this.r(bl);
            if (n8 >= 0) {
                return this.q.getResources().getQuantityString(2131820559, n8, new Object[]{n8});
            }
            if (n8 == -1100) {
                return "";
            }
            return this.q.getString(2131952464);
        }
        long l8 = this.p();
        if (l8 == -1L) {
            return "-";
        }
        return B.i(this.q, l8);
    }

    protected Drawable J(Context context, boolean bl) {
        if (this.isDirectory()) {
            return ax.s3.b.g(context, this, this.a0(), bl);
        }
        return A.f(context, this.E(), bl);
    }

    public int K() {
        if (this.isDirectory()) {
            return 2131231320;
        }
        return A.k(this.B(), false);
    }

    public int L() {
        return this.c0.b();
    }

    public Drawable M(Context context) {
        return this.J(context, true);
    }

    public File N() {
        return new File(a.j(this.x(), this), this.B());
    }

    public y O() throws j {
        File file = this.N();
        return (y)x.f(file).z(file.getAbsolutePath());
    }

    public f P() {
        return this.c0.d();
    }

    public String Q() {
        return B.U(this.R(), this.E());
    }

    public K R() {
        return this.c0;
    }

    public String S() {
        return B.U(this.R(), this.T());
    }

    public final String T() {
        String string = this.U();
        if (!ax.c3.d0.B(string)) {
            ax.Ha.b b8 = c.h().f().b("!! PARENT PATH NOT NORMALIZED !!").j();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("location :");
            stringBuilder.append(this.P().I());
            stringBuilder.append(", parent : ");
            stringBuilder.append(string);
            stringBuilder.append(", path :");
            stringBuilder.append(this.F());
            b8.g(stringBuilder.toString()).h();
        }
        return string;
    }

    protected abstract String U();

    public String V() {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = this.isDirectory();
        char c8 = '-';
        char c9 = bl ? (char)'d' : '-';
        stringBuilder.append(c9);
        c9 = this.d() ? (char)'r' : '-';
        stringBuilder.append(c9);
        c9 = c8;
        if (this.j()) {
            c9 = 'w';
        }
        stringBuilder.append(c9);
        return stringBuilder.toString();
    }

    public String W() {
        if (this.j0 == null) {
            this.j0 = ax.c3.d0.w(this);
        }
        return this.j0;
    }

    public int X() {
        return this.d0;
    }

    public Drawable Y(Context context) {
        return this.J(context, false);
    }

    public File Z() {
        return new File(a.l(this.x(), this), this.B());
    }

    public boolean a0() {
        return this.r(true) > 0;
    }

    public boolean b0() {
        return false;
    }

    public boolean c0() {
        return false;
    }

    public void d0(int n8) {
        this.d0 = n8;
    }

    protected boolean u(int n8) {
        if (n8 != this.f0) {
            this.g0 = null;
            this.h0 = null;
            this.f0 = n8;
            return true;
        }
        return false;
    }

    protected String w(long l8, int n8) {
        if (l8 <= 0L) {
            return "";
        }
        return t.f(this.q, l8, n8);
    }

    Context x() {
        return this.q;
    }
}

