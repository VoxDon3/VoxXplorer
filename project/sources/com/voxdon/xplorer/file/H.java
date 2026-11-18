package com.voxdon.xplorer.file;

import android.content.Context;
import ax.a3.U;
import ax.u3.C3180B;
import java.io.InputStream;

/* loaded from: classes.dex */
public class H extends W {
    static a w;

    public static U.d T0(String str, boolean z) {
        return U.d.ERROR;
    }

    public static a U0(Context context) {
        if (w == null) {
            w = new a(context.getApplicationContext());
        }
        return w;
    }

    @Override // com.voxdon.xplorer.file.W, com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream A(String str, String str2, String str3) {
        return super.A(str, str2, str3);
    }

    public static class a extends T {
        Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.voxdon.xplorer.file.T
        public void a(int i) {
        }

        @Override // com.voxdon.xplorer.file.T
        public ax.Z2.s f(int i) {
            return null;
        }

        @Override // com.voxdon.xplorer.file.T
        public void g(int i, String str) {
        }

        @Override // com.voxdon.xplorer.file.T
        public void j(int i, long j) {
        }

        public void l(com.voxdon.xplorer.activity.a aVar) {
            C3180B.d0(aVar.getSupportFragmentManager(), ax.a3.U.l3(ax.Q2.f.U0), "serveraddress", true);
        }

        public void k(com.voxdon.xplorer.activity.a aVar, String str, ax.g3.k kVar) {
        }
    }
}
