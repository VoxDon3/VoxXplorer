/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.exoplayer2.ext.ffmpeg;

import ax.P0.z;
import ax.P2.b;
import ax.S0.u;

public final class FfmpegLibrary {
    private static String a;
    private static int b;

    static {
        z.a("media3.decoder.ffmpeg");
        b = -1;
    }

    private static String a() {
        if (ax.P2.b.f()) {
            return FfmpegLibrary.exFfmpegGetVersion();
        }
        if (ax.P2.b.h()) {
            return FfmpegLibrary.fmFfmpegGetVersion();
        }
        return null;
    }

    private static boolean b(String string) {
        if (ax.P2.b.f()) {
            return FfmpegLibrary.exFfmpegHasDecoder(string);
        }
        if (ax.P2.b.h()) {
            return FfmpegLibrary.fmFfmpegHasDecoder(string);
        }
        return false;
    }

    static String c(String string) {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 1903589369: {
                if (!string.equals("audio/g711-mlaw")) break;
                n8 = 17;
                break;
            }
            case 1903231877: {
                if (!string.equals("audio/g711-alaw")) break;
                n8 = 16;
                break;
            }
            case 1556697186: {
                if (!string.equals("audio/true-hd")) break;
                n8 = 15;
                break;
            }
            case 1505942594: {
                if (!string.equals("audio/vnd.dts.hd")) break;
                n8 = 14;
                break;
            }
            case 1504891608: {
                if (!string.equals("audio/opus")) break;
                n8 = 13;
                break;
            }
            case 1504831518: {
                if (!string.equals("audio/mpeg")) break;
                n8 = 12;
                break;
            }
            case 1504619009: {
                if (!string.equals("audio/flac")) break;
                n8 = 11;
                break;
            }
            case 1504578661: {
                if (!string.equals("audio/eac3")) break;
                n8 = 10;
                break;
            }
            case 1504470054: {
                if (!string.equals("audio/alac")) break;
                n8 = 9;
                break;
            }
            case 1503095341: {
                if (!string.equals("audio/3gpp")) break;
                n8 = 8;
                break;
            }
            case 187078296: {
                if (!string.equals("audio/ac3")) break;
                n8 = 7;
                break;
            }
            case -53558318: {
                if (!string.equals("audio/mp4a-latm")) break;
                n8 = 6;
                break;
            }
            case -432837259: {
                if (!string.equals("audio/mpeg-L2")) break;
                n8 = 5;
                break;
            }
            case -432837260: {
                if (!string.equals("audio/mpeg-L1")) break;
                n8 = 4;
                break;
            }
            case -1003765268: {
                if (!string.equals("audio/vorbis")) break;
                n8 = 3;
                break;
            }
            case -1095064472: {
                if (!string.equals("audio/vnd.dts")) break;
                n8 = 2;
                break;
            }
            case -1606874997: {
                if (!string.equals("audio/amr-wb")) break;
                n8 = 1;
                break;
            }
            case -2123537834: {
                if (!string.equals("audio/eac3-joc")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return null;
            }
            case 17: {
                return "pcm_mulaw";
            }
            case 16: {
                return "pcm_alaw";
            }
            case 15: {
                return "truehd";
            }
            case 13: {
                return "opus";
            }
            case 11: {
                return "flac";
            }
            case 9: {
                return "alac";
            }
            case 8: {
                return "amrnb";
            }
            case 7: {
                return "ac3";
            }
            case 6: {
                return "aac";
            }
            case 4: 
            case 5: 
            case 12: {
                return "mp3";
            }
            case 3: {
                return "vorbis";
            }
            case 2: 
            case 14: {
                return "dca";
            }
            case 1: {
                return "amrwb";
            }
            case 0: 
            case 10: 
        }
        return "eac3";
    }

    public static int d() {
        if (!FfmpegLibrary.f()) {
            return -1;
        }
        if (b == -1) {
            b = 64;
        }
        return b;
    }

    public static String e() {
        if (!FfmpegLibrary.f()) {
            return null;
        }
        try {
            if (a == null) {
                a = FfmpegLibrary.a();
            }
            String string = a;
            return string;
        }
        catch (Error error) {
            return null;
        }
    }

    private static native String exFfmpegGetVersion();

    private static native boolean exFfmpegHasDecoder(String var0);

    public static boolean f() {
        return ax.P2.b.b();
    }

    private static native String fmFfmpegGetVersion();

    private static native boolean fmFfmpegHasDecoder(String var0);

    public static boolean g(String string) {
        if (!FfmpegLibrary.f()) {
            return false;
        }
        if ((string = FfmpegLibrary.c(string)) == null) {
            return false;
        }
        try {
            if (!FfmpegLibrary.b(string)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No ");
                stringBuilder.append(string);
                stringBuilder.append(" decoder available. Check the FFmpeg build configuration.");
                u.h("FfmpegLibrary", stringBuilder.toString());
                return false;
            }
            return true;
        }
        catch (Error error) {
            return false;
        }
    }
}

