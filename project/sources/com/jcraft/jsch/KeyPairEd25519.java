package com.jcraft.jsch;

import com.jcraft.jsch.JSch;
import java.util.Arrays;

/* loaded from: classes3.dex */
class KeyPairEd25519 extends KeyPairEdDSA {
    private static int s = 32;

    KeyPairEd25519(JSch.InstanceLogger instanceLogger) {
        this(instanceLogger, null, null);
    }

    static KeyPair J(JSch.InstanceLogger instanceLogger, Buffer buffer) throws JSchException {
        byte[][] g = buffer.g(4, "invalid key format");
        KeyPairEd25519 keyPairEd25519 = new KeyPairEd25519(instanceLogger, g[1], Arrays.copyOf(g[2], s));
        keyPairEd25519.b = Util.c(g[3]);
        keyPairEd25519.a = 0;
        return keyPairEd25519;
    }

    @Override // com.jcraft.jsch.KeyPairEdDSA
    String H() {
        return "Ed25519";
    }

    @Override // com.jcraft.jsch.KeyPairEdDSA
    String I() {
        return "ssh-ed25519";
    }

    @Override // com.jcraft.jsch.KeyPair
    public int k() {
        return s;
    }

    KeyPairEd25519(JSch.InstanceLogger instanceLogger, byte[] bArr, byte[] bArr2) {
        super(instanceLogger, bArr, bArr2);
    }
}
