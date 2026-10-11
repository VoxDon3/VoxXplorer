/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.bc;

import ax.yd.d;
import com.jcraft.jsch.JSchException;

public class SCrypt
implements com.jcraft.jsch.SCrypt {
    private Class<?> a;
    private byte[] b;
    private int c;
    private int d;
    private int e;

    @Override
    public byte[] c(byte[] byArray, int n8) {
        return ax.yd.d.i(byArray, this.b, this.c, this.d, this.e, n8);
    }

    @Override
    public void d(byte[] byArray, int n8, int n9, int n10) throws Exception {
        try {
            this.a = d.class;
            this.b = byArray;
            this.c = n8;
            this.d = n9;
            this.e = n10;
            return;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            throw new JSchException("scrypt unavailable", noClassDefFoundError);
        }
    }
}

