package com.voxdon.xplorer.file;

import ax.j9.C2339b;
import com.voxdon.xplorer.file.Q;

/* loaded from: classes.dex */
public class P {
    public Q.c a;
    public C2339b b;
    public ax.pb.r c;
    public String d;
    public String e;
    public int f;
    public boolean g;
    public String h;
    public boolean i;

    public P(C2339b c2339b, String str, int i) {
        this.b = c2339b;
        this.e = str;
        this.f = i;
        this.a = Q.c.SMB2AND3;
    }

    public void a(String str) {
        this.d = str;
    }

    public P(C2339b c2339b, String str, int i, ax.pb.r rVar) {
        this.b = c2339b;
        this.e = str;
        this.f = i;
        this.a = Q.c.SMB1AND2;
        this.c = rVar;
    }

    public P(ax.pb.r rVar) {
        this.c = rVar;
        this.a = Q.c.SMB1;
    }
}
