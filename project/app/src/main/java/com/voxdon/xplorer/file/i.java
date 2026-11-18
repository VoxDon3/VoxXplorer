/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.annotation.TargetApi;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import ax.Ha.c;
import ax.Q2.f;
import ax.b3.j;
import ax.b3.t;
import ax.c3.d0;
import ax.c3.k;
import ax.c3.l;
import ax.c3.v;
import ax.c3.x;
import ax.u3.b;
import com.voxdon.xplorer.FileManagerApp;
import com.voxdon.xplorer.file.g;
import com.voxdon.xplorer.file.h;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;

@TargetApi(value=21)
public class i
extends k {
    private String m0;
    private String n0;
    private String o0;
    private String p0;
    private String q0;
    private boolean r0;
    private boolean s0;
    private boolean t0;
    private boolean u0;
    private long v0;
    private long w0;
    private Uri x0;

    public i(h h8, String string) throws j {
        super(h8);
        this.x0 = h8.p0();
        this.n0 = string;
        this.q0 = d0.h(string);
        this.r0 = false;
        this.s0 = false;
        this.u0 = true;
        this.t0 = true;
        this.v0 = -1L;
        this.w0 = 0L;
    }

    public i(h object, String string, Cursor object2) throws j {
        super((m)object);
        Object object3;
        Object object4;
        boolean bl;
        this.x0 = ((h)object).p0();
        l l8 = new l((Cursor)object2);
        this.o0 = object = l8.a;
        if (object != null && ((String)object).endsWith("/")) {
            object = ((String)object).replaceAll(".$", "_");
            bl = true;
        } else {
            bl = false;
        }
        object2 = g.q(this.x(), this.R(), this.x0, (String)object, string, l8);
        if (!d0.I(string, (String)object2)) {
            object = c.h().b("invalid file document file path");
            object4 = new StringBuilder();
            ((StringBuilder)object4).append("parentPath:");
            ((StringBuilder)object4).append(string);
            ((StringBuilder)object4).append(",docId:");
            ((StringBuilder)object4).append(l8.a);
            ((ax.Ha.b)object).g(((StringBuilder)object4).toString());
        } else {
            object = d0.n(string, (String)object2).substring(1);
            if (((String)object).contains("/")) {
                object = ((String)object).replaceAll("/", "_");
                object2 = d0.Q(string, (String)object);
                if (((String)object).length() > 12) {
                    object4 = c.h().f().b("DOCUMENT FILE NAME FIXED UNUSUAL").j();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("file:");
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append(",");
                    ((StringBuilder)object).append(l8.b);
                    ((StringBuilder)object).append(",");
                    ((StringBuilder)object).append(l8.a);
                    ((StringBuilder)object).append(",");
                    ((StringBuilder)object).append(this.x0);
                    ((ax.Ha.b)object4).g(((StringBuilder)object).toString()).h();
                }
                bl = true;
            }
        }
        if (TextUtils.isEmpty((CharSequence)l8.b)) {
            object = c.h().f().b("empty document displayname");
            object4 = new StringBuilder();
            ((StringBuilder)object4).append("docid:");
            ((StringBuilder)object4).append(l8.a);
            ((StringBuilder)object4).append(",root:");
            ((StringBuilder)object4).append(this.x0);
            ((ax.Ha.b)object).g(((StringBuilder)object4).toString()).h();
            object = null;
        } else {
            object = l8.b.contains("/") ? d0.Q(string, l8.b.replaceAll("/", "_")) : d0.Q(string, l8.b);
        }
        if (object != null && !((String)object).equals(object2) && !"/".equals(object2)) {
            object4 = new StringBuilder();
            ((StringBuilder)object4).append("DOCUMENT FILE NAME CONFLICT:");
            ((StringBuilder)object4).append(string);
            ((StringBuilder)object4).append(",");
            ((StringBuilder)object4).append(l8.b);
            ((StringBuilder)object4).append(",");
            ((StringBuilder)object4).append((String)object);
            ((StringBuilder)object4).append(",");
            ((StringBuilder)object4).append((String)object2);
            FileManagerApp.b(((StringBuilder)object4).toString());
            if (!bl) {
                object4 = c.h().f().b("DOCUMENT FILE NAME CONFLICT 1").j();
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("file:");
                ((StringBuilder)object3).append(string);
                ((StringBuilder)object3).append(",");
                ((StringBuilder)object3).append(l8.b);
                ((StringBuilder)object3).append(",");
                ((StringBuilder)object3).append(l8.a);
                ((StringBuilder)object3).append(",");
                ((StringBuilder)object3).append(this.x0);
                ((ax.Ha.b)object4).g(((StringBuilder)object3).toString()).h();
            }
        }
        if (object2 == null) {
            object3 = c.h().f().b("DOCUMENT FILE PATH NULL");
            object4 = new StringBuilder();
            ((StringBuilder)object4).append("file:");
            ((StringBuilder)object4).append(string);
            ((StringBuilder)object4).append(",");
            ((StringBuilder)object4).append(l8.b);
            ((StringBuilder)object4).append(",");
            ((StringBuilder)object4).append((String)object);
            ((StringBuilder)object4).append(",");
            ((StringBuilder)object4).append((String)object2);
            ((ax.Ha.b)object3).g(((StringBuilder)object4).toString()).h();
        }
        this.n0 = object2;
        this.q0 = d0.h((String)object2);
        this.r0 = true;
        this.s0 = l8.d();
        this.u0 = l8.b();
        this.t0 = l8.a();
        this.v0 = l8.d;
        this.w0 = l8.e;
    }

    @Override
    protected String C() {
        return this.q0;
    }

    @Override
    protected String F() {
        return this.n0;
    }

    @Override
    protected String U() {
        return d0.r(this.n0);
    }

    @Override
    public boolean d() {
        return this.t0;
    }

    @Override
    public ParcelFileDescriptor e0(boolean bl) throws j {
        if (bl) {
            return g.o(this.x(), this.n0(), "r");
        }
        return g.o(this.x(), this.n0(), "rw");
    }

    @Override
    public boolean h() {
        return this.C().startsWith(".");
    }

    @Override
    public boolean i0() {
        return true;
    }

    @Override
    public boolean isDirectory() {
        return this.s0;
    }

    @Override
    public boolean j() {
        return this.u0;
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public boolean k0() {
        return true;
    }

    @Override
    public boolean l() {
        return false;
    }

    public int l0(n n8) {
        try {
            int n9 = this.n0.compareTo(((i)n8).n0);
            return n9;
        }
        catch (ClassCastException classCastException) {
            return -1;
        }
    }

    public String m0() {
        return this.o0;
    }

    @Override
    public boolean n() {
        return this.r0;
    }

    public Uri n0() throws j {
        if (f.c0(this.P())) {
            return g.e(this.R(), this.x0, this.E());
        }
        if (this.P() == f.h1) {
            if (this.o0 != null) {
                return DocumentsContract.buildDocumentUriUsingTree((Uri)this.p0(), (String)this.o0);
            }
            throw new t("no doc id");
        }
        b.f();
        throw new j("not reachable");
    }

    public Uri o0() throws j {
        if (f.c0(this.P())) {
            return g.e(this.R(), this.x0, this.T());
        }
        if (this.P() == f.h1) {
            if (this.p0 == null) {
                this.p0 = ((i)x.e(this.R()).z(this.T())).m0();
            }
            return DocumentsContract.buildDocumentUriUsingTree((Uri)this.p0(), (String)this.p0);
        }
        b.f();
        throw new j("not reachable");
    }

    @Override
    public long p() {
        return this.w0;
    }

    public Uri p0() {
        return this.x0;
    }

    @Override
    public long q() {
        return this.v0;
    }

    public void q0(String string) {
        this.p0 = string;
    }

    @Override
    public int r(boolean bl) {
        if (!this.s0) {
            return -2;
        }
        return this.X();
    }

    @Override
    public String s() {
        if (this.m0 == null) {
            this.m0 = v.e(this, "application/octet-stream");
        }
        return this.m0;
    }

    @Override
    public String t() {
        return this.n0;
    }
}

