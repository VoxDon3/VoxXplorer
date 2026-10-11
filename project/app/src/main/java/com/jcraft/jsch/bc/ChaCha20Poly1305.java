/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.bc;

import ax.Dd.k;
import ax.Dd.l;
import ax.xd.b;
import ax.y9.a;
import ax.zd.d;
import com.jcraft.jsch.Cipher;
import java.nio.ByteBuffer;
import javax.crypto.AEADBadTagException;

public class ChaCha20Poly1305
implements Cipher {
    private b a;
    private b b;
    private k c;
    private k d;
    private int e;
    private d f;

    private static boolean b(byte[] byArray, byte[] byArray2) {
        if (byArray.length != byArray2.length) {
            return false;
        }
        int n8 = 0;
        for (int i8 = 0; i8 < byArray.length; ++i8) {
            n8 |= byArray[i8] ^ byArray2[i8];
        }
        return n8 == 0;
    }

    @Override
    public void a(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) throws Exception {
        this.a.g(byArray, n8, n9, byArray2, n10);
    }

    @Override
    public int d() {
        return 64;
    }

    @Override
    public void e(int n8) throws Exception {
        Object object = ByteBuffer.allocate(8);
        ((ByteBuffer)object).putLong(0, n8);
        b b8 = this.a;
        n8 = this.e;
        boolean bl = true;
        boolean bl2 = n8 == 0;
        b8.e(bl2, new l(this.c, ((ByteBuffer)object).array(), 0, ((ByteBuffer)object).array().length));
        b8 = this.b;
        bl2 = this.e == 0 ? bl : false;
        b8.e(bl2, new l(this.d, ((ByteBuffer)object).array(), 0, ((ByteBuffer)object).array().length));
        object = new byte[64];
        this.b.g((byte[])object, 0, 64, (byte[])object, 0);
        this.f.e(new k((byte[])object, 0, 32));
    }

    @Override
    public /* synthetic */ void f(byte[] byArray, int n8, int n9) {
        ax.y9.a.f(this, byArray, n8, n9);
    }

    @Override
    public int g() {
        return 16;
    }

    @Override
    public void h(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) throws Exception {
        if (this.e == 1) {
            byte[] byArray3 = new byte[16];
            System.arraycopy(byArray, n9, byArray3, 0, 16);
            byte[] byArray4 = new byte[16];
            this.f.b(byArray, n8, n9);
            this.f.c(byArray4, 0);
            if (!ChaCha20Poly1305.b(byArray3, byArray4)) {
                throw new AEADBadTagException("Tag mismatch");
            }
        }
        this.b.g(byArray, n8 + 4, n9 - 4, byArray2, n10 + 4);
        if (this.e == 0) {
            this.f.b(byArray2, n10, n9);
            this.f.c(byArray2, n9);
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public void k(int n8, byte[] object, byte[] object2) throws Exception {
        object2 = object;
        if (((byte[])object).length > 64) {
            object2 = new byte[64];
            System.arraycopy(object, 0, object2, 0, 64);
        }
        byte[] byArray = new byte[32];
        object = new byte[32];
        System.arraycopy(object2, 32, byArray, 0, 32);
        System.arraycopy(object2, 0, object, 0, 32);
        this.e = n8;
        try {
            object2 = new k;
            object2(byArray, 0, 32);
            this.c = object2;
            object2 = new k;
            object2((byte[])object, 0, 32);
            this.d = object2;
            object = new b;
            object();
            this.a = object;
            object = new b;
            object();
            this.b = object;
            object = new d;
            object();
            this.f = object;
            return;
        }
        catch (Exception exception) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            throw exception;
        }
    }

    @Override
    public int l() {
        return 8;
    }

    @Override
    public boolean m() {
        return true;
    }
}

