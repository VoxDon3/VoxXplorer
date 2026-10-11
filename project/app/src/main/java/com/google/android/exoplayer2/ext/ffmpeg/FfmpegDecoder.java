/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.exoplayer2.ext.ffmpeg;

import ax.P2.b;
import java.nio.ByteBuffer;

public class FfmpegDecoder {
    boolean a;

    FfmpegDecoder(boolean bl) {
        this.a = bl;
    }

    private native int exFfmpegDecode(long var1, ByteBuffer var3, int var4, ByteBuffer var5, int var6, int var7);

    private native int exFfmpegGetChannelCount(long var1);

    private native int exFfmpegGetSampleRate(long var1);

    private native long exFfmpegInitialize(String var1, byte[] var2, boolean var3, int var4, int var5);

    private native void exFfmpegRelease(long var1);

    private native long exFfmpegReset(long var1, byte[] var3);

    private native int fmFfmpegDecode(long var1, ByteBuffer var3, int var4, ByteBuffer var5, int var6, int var7);

    private native int fmFfmpegGetChannelCount(long var1);

    private native int fmFfmpegGetSampleRate(long var1);

    private native long fmFfmpegInitialize(String var1, byte[] var2, boolean var3, int var4, int var5);

    private native void fmFfmpegRelease(long var1);

    private native long fmFfmpegReset(long var1, byte[] var3);

    int a(long l8, ByteBuffer byteBuffer, int n8, ByteBuffer byteBuffer2, int n9, int n10) {
        if (this.a) {
            return this.exFfmpegDecode(l8, byteBuffer, n8, byteBuffer2, n9, n10);
        }
        if (b.h()) {
            return this.fmFfmpegDecode(l8, byteBuffer, n8, byteBuffer2, n9, n10);
        }
        return -2;
    }

    int b(long l8) {
        if (this.a) {
            return this.exFfmpegGetChannelCount(l8);
        }
        if (b.h()) {
            return this.fmFfmpegGetChannelCount(l8);
        }
        return 0;
    }

    int c(long l8) {
        if (this.a) {
            return this.exFfmpegGetSampleRate(l8);
        }
        if (b.h()) {
            return this.fmFfmpegGetSampleRate(l8);
        }
        return 0;
    }

    long d(String string, byte[] byArray, boolean bl, int n8, int n9) {
        if (this.a) {
            return this.exFfmpegInitialize(string, byArray, bl, n8, n9);
        }
        if (b.h()) {
            return this.fmFfmpegInitialize(string, byArray, bl, n8, n9);
        }
        return 0L;
    }

    void e(long l8) {
        if (this.a) {
            this.exFfmpegRelease(l8);
            return;
        }
        if (b.h()) {
            this.fmFfmpegRelease(l8);
        }
    }

    long f(long l8, byte[] byArray) {
        if (this.a) {
            return this.exFfmpegReset(l8, byArray);
        }
        if (b.h()) {
            return this.fmFfmpegReset(l8, byArray);
        }
        return 0L;
    }
}

