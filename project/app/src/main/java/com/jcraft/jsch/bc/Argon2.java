/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.bc;

import ax.Dd.b;
import ax.yd.a;
import com.jcraft.jsch.JSchException;

public class Argon2
implements com.jcraft.jsch.Argon2 {
    private a a;

    @Override
    public void b(byte[] object, int n8, int n9, byte[] object2, byte[] byArray, int n10, int n11, int n12) throws Exception {
        int n13;
        if (n9 != 0) {
            n13 = 1;
            if (n9 != 1) {
                n13 = 2;
                if (n9 != 2) {
                    throw new JSchException("Invalid argon2 type.");
                }
            }
        } else {
            n13 = 0;
        }
        n9 = 16;
        if (n12 != 16) {
            n9 = 19;
            if (n12 != 19) {
                throw new JSchException("Invalid argon2 version.");
            }
        }
        try {
            b.b b8 = new b.b(n13);
            object2 = b8.f((byte[])object).b((byte[])object2).g(byArray).c(n8).d(n10).e(n11).h(n9).a();
            object = new a;
            ((a)object)();
            this.a = object;
            ((a)object).q((b)object2);
            return;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            throw new JSchException("argon2 unavailable", noClassDefFoundError);
        }
    }

    @Override
    public byte[] c(byte[] byArray, int n8) {
        byte[] byArray2 = new byte[n8];
        this.a.i(byArray, byArray2);
        return byArray2;
    }
}

