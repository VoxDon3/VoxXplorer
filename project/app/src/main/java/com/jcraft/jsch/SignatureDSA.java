/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Signature;

public interface SignatureDSA
extends Signature {
    public void c(byte[] var1, byte[] var2, byte[] var3, byte[] var4) throws Exception;

    public void h(byte[] var1, byte[] var2, byte[] var3, byte[] var4) throws Exception;
}

