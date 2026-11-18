/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.content.Context;
import ax.Q2.f;
import ax.Z2.s;
import ax.a3.U;
import ax.g3.k;
import ax.u3.B;
import com.voxdon.xplorer.file.T;
import com.voxdon.xplorer.file.W;
import java.io.InputStream;

public class H
extends W {
    static a w;

    public static U.d T0(String string, boolean bl) {
        return U.d.d0;
    }

    public static a U0(Context context) {
        if (w == null) {
            w = new a(context.getApplicationContext());
        }
        return w;
    }

    @Override
    public InputStream A(String string, String string2, String string3) {
        return super.A(string, string2, string3);
    }

    public static class a
    extends T {
        Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override
        public void a(int n8) {
        }

        @Override
        public s f(int n8) {
            return null;
        }

        @Override
        public void g(int n8, String string) {
        }

        @Override
        public void j(int n8, long l8) {
        }

        public void k(com.voxdon.xplorer.activity.a a8, String string, k k8) {
        }

        public void l(com.voxdon.xplorer.activity.a a8) {
            U u8 = U.l3(f.U0);
            B.d0(a8.getSupportFragmentManager(), u8, "serveraddress", true);
        }
    }
}

