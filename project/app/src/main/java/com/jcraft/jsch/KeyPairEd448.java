/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.KeyPair;
import com.jcraft.jsch.KeyPairEdDSA;
import com.jcraft.jsch.Util;
import java.util.Arrays;

class KeyPairEd448
extends KeyPairEdDSA {
    private static int s = 57;

    KeyPairEd448(JSch.InstanceLogger instanceLogger) {
        this(instanceLogger, null, null);
    }

    KeyPairEd448(JSch.InstanceLogger instanceLogger, byte[] byArray, byte[] byArray2) {
        super(instanceLogger, byArray, byArray2);
    }

    static KeyPair J(JSch.InstanceLogger object, Buffer object2) throws JSchException {
        object2 = ((Buffer)object2).g(4, "invalid key format");
        object = new KeyPairEd448((JSch.InstanceLogger)object, (byte[])object2[1], Arrays.copyOf((byte[])object2[2], s));
        ((KeyPair)object).b = Util.c((byte[])object2[3]);
        ((KeyPair)object).a = 0;
        return object;
    }

    @Override
    String H() {
        return "Ed448";
    }

    @Override
    String I() {
        return "ssh-ed448";
    }

    @Override
    public int k() {
        return s;
    }
}

