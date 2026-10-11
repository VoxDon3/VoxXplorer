/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jzlib;

import ax.z9.a;
import ax.z9.b;
import ax.z9.c;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.jzlib.Deflater;
import com.jcraft.jsch.jzlib.GZIPException;
import com.jcraft.jsch.jzlib.Inflater;
import com.jcraft.jsch.jzlib.ZStream;
import java.io.UncheckedIOException;
import java.util.function.Supplier;

public class Compression
implements com.jcraft.jsch.Compression {
    private final int a;
    private Deflater b;
    private Inflater c;
    private byte[] d = new byte[4096];
    private byte[] e;
    private Session f;

    public Compression() {
        this.a = 52;
    }

    public static /* synthetic */ String e(int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("compress: deflate returnd ");
        stringBuilder.append(n8);
        return stringBuilder.toString();
    }

    public static /* synthetic */ String f(int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("compress: deflate returnd ");
        stringBuilder.append(n8);
        return stringBuilder.toString();
    }

    public static /* synthetic */ String g(Compression compression) {
        compression.getClass();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("zlib using ");
        stringBuilder.append(compression.getClass().getCanonicalName());
        return stringBuilder.toString();
    }

    private void i(int n8, Supplier<String> supplier) {
        Object object = this.f;
        object = object == null ? JSch.k() : ((Session)object).A();
        if (!object.isEnabled(n8)) {
            return;
        }
        object.a(n8, supplier.get());
    }

    @Override
    public void a() {
        this.e = null;
        ZStream zStream = this.c;
        if (zStream != null) {
            ((Inflater)zStream).f();
            this.c = null;
        }
        if ((zStream = this.b) != null) {
            ((Deflater)zStream).g();
            this.b = null;
        }
        this.f = null;
    }

    @Override
    public byte[] b(byte[] object, int n8, int[] nArray) {
        int n9;
        Object object2 = this.b;
        ((ZStream)object2).a = object;
        ((ZStream)object2).b = n8;
        ((ZStream)object2).c = nArray[0] - n8;
        do {
            object2 = this.b;
            ((ZStream)object2).e = this.d;
            ((ZStream)object2).f = 0;
            ((ZStream)object2).g = 4096;
            n9 = ((Deflater)object2).f(1);
            if (n9 != 0) {
                this.i(2, new a(n9));
                object2 = object;
                n9 = n8;
            } else {
                int n10 = 4096 - this.b.g;
                int n11 = ((byte[])object).length;
                n9 = n8 + n10;
                int n12 = n9 + 52;
                object2 = object;
                if (n11 < n12) {
                    object2 = new byte[n12 * 2];
                    System.arraycopy(object, 0, object2, 0, ((byte[])object).length);
                }
                System.arraycopy(this.d, 0, object2, n8, n10);
            }
            object = object2;
            n8 = n9;
        } while (this.b.g == 0);
        nArray[0] = n9;
        return object2;
    }

    @Override
    public byte[] c(byte[] object, int n8, int[] nArray) {
        Object object2 = this.c;
        ((ZStream)object2).a = object;
        ((ZStream)object2).b = n8;
        ((ZStream)object2).c = nArray[0];
        int n9 = 0;
        while (true) {
            object2 = this.c;
            ((ZStream)object2).e = this.d;
            ((ZStream)object2).f = 0;
            ((ZStream)object2).g = 4096;
            int n10 = ((Inflater)object2).h(1);
            if (n10 == -5) break;
            if (n10 != 0) {
                this.i(2, new b(n10));
                return null;
            }
            byte[] byArray = this.e;
            n10 = byArray.length;
            int n11 = n9 + 4096;
            int n12 = this.c.g;
            if (n10 < n11 - n12) {
                int n13;
                n10 = n13 = byArray.length * 2;
                if (n13 < n11 - n12) {
                    n10 = n11 - n12;
                }
                object2 = new byte[n10];
                System.arraycopy(byArray, 0, object2, 0, n9);
                this.e = (byte[])object2;
            }
            System.arraycopy(this.d, 0, this.e, n9, 4096 - this.c.g);
            nArray[0] = n9 += 4096 - this.c.g;
        }
        if (n9 > ((byte[])object).length - n8) {
            object2 = new byte[n9 + n8];
            System.arraycopy(object, 0, object2, 0, n8);
            System.arraycopy(this.e, 0, object2, n8, n9);
            object = object2;
        } else {
            System.arraycopy(this.e, 0, object, n8, n9);
        }
        nArray[0] = n9;
        return object;
    }

    @Override
    public void d(int n8, int n9, Session session) {
        this.f = session;
        this.h(n8, n9);
    }

    public void h(int n8, int n9) throws UncheckedIOException {
        if (n8 == 1) {
            try {
                Deflater deflater;
                this.b = deflater = new Deflater(n9);
            }
            catch (GZIPException gZIPException) {
                throw new UncheckedIOException(gZIPException);
            }
        } else if (n8 == 0) {
            this.c = new Inflater();
            this.e = new byte[4096];
        }
        this.i(0, new c(this));
    }
}

