/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import ax.b3.j;
import ax.c3.G;
import ax.g3.i;
import com.alphainventor.filemanager.file.m;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface c {
    public InputStream A(String var1, String var2, String var3) throws IOException;

    public boolean B(n var1);

    public List<n> C(n var1, m.f var2) throws j;

    public void D(n var1, G var2, String var3, long var4, Long var6, p var7, boolean var8, ax.u3.c var9, i var10) throws j, ax.b3.a;

    public void E(n var1, n var2, ax.u3.c var3, i var4) throws j, ax.b3.a;

    public void F(n var1, n var2, ax.u3.c var3, i var4) throws j, ax.b3.a;

    public int G(String var1, String var2);

    public String H(n var1);

    public void I(n var1) throws j;

    public InputStream J(n var1, long var2) throws j;

    public void K(Activity var1, Fragment var2, a var3);

    public boolean L();

    public boolean M(n var1);

    public boolean N(n var1);

    public boolean O();

    public void P(n var1) throws j;

    public boolean Q(n var1, n var2);

    public boolean a();

    public void b();

    public n z(String var1) throws j;

    public static interface a {
        public void B();

        public void T(boolean var1, Object var2);
    }
}

