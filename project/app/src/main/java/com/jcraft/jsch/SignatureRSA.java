/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Signature;

public interface SignatureRSA
extends Signature {
    public void b(byte[] var1, byte[] var2) throws Exception;

    public void g(byte[] var1, byte[] var2) throws Exception;
}

