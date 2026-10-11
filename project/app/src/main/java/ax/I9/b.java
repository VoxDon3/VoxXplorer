/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.H9.m;
import ax.I9.u;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class b
extends u {
    private ArrayList<u> h = new ArrayList();
    private final LinkedHashMap<String, m> i = new LinkedHashMap();

    public void A(m m8, String string) {
        ((AbstractMap)this.i).put(string.toLowerCase(), m8);
    }

    @Override
    public void j() {
        ArrayList<u> arrayList = this.h;
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            u u8 = arrayList.get(i8);
            u8.j();
        }
    }

    @Override
    public void k(int n8, int n9) {
        ArrayList<u> arrayList = this.h;
        int n10 = arrayList.size();
        for (int i8 = 0; i8 < n10; ++i8) {
            u u8 = arrayList.get(i8);
            u8.k(n8, n9);
        }
    }

    @Override
    public m o(String string) {
        m m8 = super.o(string);
        if (m8 == null) {
            return this.i.get(string.toLowerCase());
        }
        return m8;
    }

    @Override
    public void w(boolean bl) {
        super.w(bl);
        ArrayList<u> arrayList = this.h;
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            u u8 = arrayList.get(i8);
            u8.w(bl);
        }
    }

    @Override
    public void x(ax.D9.b b8) {
        super.x(b8);
        ArrayList<u> arrayList = this.h;
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            u u8 = arrayList.get(i8);
            u8.x(b8);
        }
    }

    public void z(u u8) {
        this.h.add(u8);
        u8.v(this);
        u8.w(this.t());
    }
}

