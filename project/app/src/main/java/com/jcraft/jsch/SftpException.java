/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

public class SftpException
extends Exception {
    public int q;

    public SftpException(int n8, String string) {
        super(string);
        this.q = n8;
    }

    public SftpException(int n8, String string, Throwable throwable) {
        super(string, throwable);
        this.q = n8;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.q);
        stringBuilder.append(": ");
        stringBuilder.append(this.getMessage());
        return stringBuilder.toString();
    }
}

