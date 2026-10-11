package com.jcraft.jsch;

import com.jcraft.jsch.JSch;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public abstract class KeyPair {
    private static final byte[] m = Util.v("openssh-key-v1\u0000");
    private static final byte[] n = Util.v("\n");
    static byte[][] o = {Util.v("Proc-Type: 4,ENCRYPTED"), Util.v("DEK-Info: DES-EDE3-CBC,")};
    private static byte[] p = Util.v(" ");
    JSch.InstanceLogger c;
    protected Cipher d;
    private KDF e;
    private HASH f;
    private HASH g;
    private byte[] h;
    int a = 0;
    protected String b = "no comment";
    protected boolean i = false;
    protected byte[] j = null;
    private byte[] k = null;
    private byte[] l = null;

    static class ASN1 {
        byte[] a;
        int b;
        int c;

        ASN1(byte[] bArr) throws ASN1Exception {
            this(bArr, 0, bArr.length);
        }

        private int c(int[] iArr) {
            int i = iArr[0];
            int i2 = i + 1;
            byte b = this.a[i];
            int i3 = b & 255;
            if ((b & 128) != 0) {
                int i4 = b & Byte.MAX_VALUE;
                i3 = 0;
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= 0) {
                        break;
                    }
                    i3 = (this.a[i2] & 255) + (i3 << 8);
                    i4 = i5;
                    i2++;
                }
            }
            iArr[0] = i2;
            return i3;
        }

        byte[] a() {
            int[] iArr = {this.b + 1};
            int c = c(iArr);
            byte[] bArr = new byte[c];
            System.arraycopy(this.a, iArr[0], bArr, 0, c);
            return bArr;
        }

        ASN1[] b() throws ASN1Exception {
            byte[] bArr = this.a;
            int i = this.b;
            byte b = bArr[i];
            int[] iArr = {i + 1};
            int c = c(iArr);
            if (b == 5) {
                return new ASN1[0];
            }
            int i2 = iArr[0];
            ArrayList arrayList = new ArrayList();
            while (c > 0) {
                int i3 = i2 + 1;
                iArr[0] = i3;
                int c2 = c(iArr);
                int i4 = iArr[0];
                int i5 = i4 - i3;
                arrayList.add(new ASN1(this.a, i2, i5 + 1 + c2));
                i2 = i4 + c2;
                c = ((c - 1) - i5) - c2;
            }
            ASN1[] asn1Arr = new ASN1[arrayList.size()];
            arrayList.toArray(asn1Arr);
            return asn1Arr;
        }

        int d() {
            return this.a[this.b] & 255;
        }

        boolean e() {
            return d() == 3;
        }

        boolean f(int i) {
            if ((i & (-256)) == 0 && (i & 64) == 0) {
                return d() == ((i | 160) & 255);
            }
            throw new IllegalArgumentException();
        }

        boolean g() {
            return d() == 2;
        }

        boolean h() {
            return d() == 5;
        }

        boolean i() {
            return d() == 6;
        }

        boolean j() {
            return d() == 4;
        }

        boolean k() {
            return d() == 48;
        }

        ASN1(byte[] bArr, int i, int i2) throws ASN1Exception {
            this.a = bArr;
            this.b = i;
            this.c = i2;
            if (i + i2 > bArr.length) {
                throw new ASN1Exception();
            }
        }
    }

    static class ASN1Exception extends Exception {
        ASN1Exception() {
        }
    }

    KeyPair(JSch.InstanceLogger instanceLogger) {
        this.c = instanceLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] A(com.jcraft.jsch.Buffer r9, int r10) {
        /*
            byte[] r0 = r9.b
            int r1 = r9.c
            r2 = 0
        L5:
            int r3 = r10 + (-1)
            if (r10 <= 0) goto L49
            r10 = r1
        La:
            int r4 = r0.length
            r5 = 10
            if (r4 <= r10) goto L3d
            int r4 = r10 + 1
            r10 = r0[r10]
            r6 = 13
            if (r10 == r6) goto L1c
            if (r10 != r5) goto L1a
            goto L1c
        L1a:
            r10 = r4
            goto La
        L1c:
            int r10 = r4 - r1
            int r10 = r10 + (-1)
            r6 = 0
            if (r2 != 0) goto L2a
            byte[] r2 = new byte[r10]
            java.lang.System.arraycopy(r0, r1, r2, r6, r10)
        L28:
            r10 = r4
            goto L3d
        L2a:
            if (r10 <= 0) goto L28
            int r7 = r2.length
            int r7 = r7 + r10
            byte[] r7 = new byte[r7]
            int r8 = r2.length
            java.lang.System.arraycopy(r2, r6, r7, r6, r8)
            int r6 = r2.length
            java.lang.System.arraycopy(r0, r1, r7, r6, r10)
            com.jcraft.jsch.Util.g(r2)
            r10 = r4
            r2 = r7
        L3d:
            int r1 = r0.length
            if (r10 >= r1) goto L46
            r1 = r0[r10]
            if (r1 != r5) goto L46
            int r10 = r10 + 1
        L46:
            r1 = r10
            r10 = r3
            goto L5
        L49:
            if (r2 == 0) goto L4d
            r9.c = r1
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.KeyPair.A(com.jcraft.jsch.Buffer, int):byte[]");
    }

    private static KeyPair B(JSch.InstanceLogger instanceLogger, byte[] bArr, String str) throws JSchException {
        Buffer buffer = new Buffer(bArr);
        buffer.E(bArr.length);
        String c = Util.c(buffer.p());
        if (str == null || str.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            str = c;
        } else if (!str.equals(c)) {
            throw new JSchException("pubkeyblob type [" + c + "] does not match expected type [" + str + "]");
        }
        if (str.equals("ssh-rsa")) {
            byte[] bArr2 = new byte[buffer.i()];
            buffer.e(bArr2);
            byte[] bArr3 = new byte[buffer.i()];
            buffer.e(bArr3);
            return new KeyPairRSA(instanceLogger, bArr3, bArr2, null);
        }
        if (str.equals("ssh-dss")) {
            byte[] bArr4 = new byte[buffer.i()];
            buffer.e(bArr4);
            byte[] bArr5 = new byte[buffer.i()];
            buffer.e(bArr5);
            byte[] bArr6 = new byte[buffer.i()];
            buffer.e(bArr6);
            byte[] bArr7 = new byte[buffer.i()];
            buffer.e(bArr7);
            return new KeyPairDSA(instanceLogger, bArr4, bArr5, bArr6, bArr7, null);
        }
        if (str.equals("ecdsa-sha2-nistp256") || str.equals("ecdsa-sha2-nistp384") || str.equals("ecdsa-sha2-nistp521")) {
            byte[] p2 = buffer.p();
            int i = buffer.i();
            buffer.c();
            int i2 = (i - 1) / 2;
            byte[] bArr8 = new byte[i2];
            byte[] bArr9 = new byte[i2];
            buffer.e(bArr8);
            buffer.e(bArr9);
            return new KeyPairECDSA(instanceLogger, p2, bArr8, bArr9, null);
        }
        if (str.equals("ssh-ed25519") || str.equals("ssh-ed448")) {
            byte[] bArr10 = new byte[buffer.i()];
            buffer.e(bArr10);
            return str.equals("ssh-ed25519") ? new KeyPairEd25519(instanceLogger, bArr10, null) : new KeyPairEd448(instanceLogger, bArr10, null);
        }
        throw new JSchException("key type " + str + " is not supported");
    }

    private static byte a(byte b) {
        return (byte) ((48 > b || b > 57) ? b - 87 : b - 48);
    }

    private byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            byte[] j = j(bArr2, bArr3);
            this.d.k(1, j, bArr3);
            Util.g(j);
            byte[] bArr4 = new byte[bArr.length];
            this.d.a(bArr, 0, bArr.length, bArr4, 0);
            return bArr4;
        } catch (Exception e) {
            if (!this.c.a().isEnabled(3)) {
                return null;
            }
            this.c.a().b(3, "failed to decrypt key", e);
            return null;
        }
    }

    private Cipher h() {
        try {
            this.d = (Cipher) Class.forName(JSch.f("3des-cbc")).asSubclass(Cipher.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
            if (this.c.a().isEnabled(3)) {
                this.c.a().b(3, "failed to create cipher", e);
            }
        }
        return this.d;
    }

    private HASH i() {
        try {
            HASH hash = (HASH) Class.forName(JSch.f("md5")).asSubclass(HASH.class).getDeclaredConstructor(null).newInstance(null);
            this.g = hash;
            hash.e();
        } catch (Exception e) {
            if (this.c.a().isEnabled(3)) {
                this.c.a().b(3, "failed to create hash", e);
            }
        }
        return this.g;
    }

    private static boolean s(byte[] bArr, int i, int i2) {
        int i3 = i + 24;
        return i3 < i2 && "OPENSSH PRIVATE KEY-----".equals(Util.c(Arrays.copyOfRange(bArr, i, i3)));
    }

    static KeyPair t(JSch.InstanceLogger instanceLogger, String str, String str2) throws JSchException {
        String str3;
        byte[] bArr;
        try {
            byte[] l = Util.l(str);
            if (str2 == null) {
                str3 = str + ".pub";
            } else {
                str3 = str2;
            }
            try {
                bArr = Util.l(str3);
            } catch (IOException e) {
                if (str2 != null) {
                    throw new JSchException(e.toString(), e);
                }
                bArr = null;
            }
            try {
                return u(instanceLogger, l, bArr);
            } finally {
                Util.g(l);
            }
        } catch (IOException e2) {
            throw new JSchException(e2.toString(), e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x03f5, code lost:
    
        if (r28 == null) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x03f7, code lost:
    
        if (r14 == 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x03f9, code lost:
    
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x03fa, code lost:
    
        if (r5 >= r11) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0400, code lost:
    
        if (r28[r5] != 45) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0403, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0407, code lost:
    
        if ((r11 - r5) == 0) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0409, code lost:
    
        r5 = r5 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x040a, code lost:
    
        if (r5 == 0) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x040c, code lost:
    
        r6 = new byte[r5];
        java.lang.System.arraycopy(r28, r12, r6, 0, r5);
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0413, code lost:
    
        if (r8 >= r5) goto L602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0415, code lost:
    
        r9 = r6[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0419, code lost:
    
        if (r9 != 10) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x043c, code lost:
    
        if (r9 != 45) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x043f, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0442, code lost:
    
        if (r8 <= 0) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0444, code lost:
    
        r8 = com.jcraft.jsch.Util.k(r6, 0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x044b, code lost:
    
        com.jcraft.jsch.Util.g(r6);
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x044e, code lost:
    
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0464, code lost:
    
        if (r15 != 4) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x046a, code lost:
    
        return w(r27, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x046b, code lost:
    
        if (r8 == null) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x046d, code lost:
    
        r6 = r8.length;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x046e, code lost:
    
        if (r6 <= 4) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0470, code lost:
    
        r6 = 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0476, code lost:
    
        if (r8[0] != 63) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0478, code lost:
    
        r6 = 111(0x6f, float:1.56E-43);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x047c, code lost:
    
        if (r8[1] != 111) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x047e, code lost:
    
        r6 = -7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0481, code lost:
    
        if (r8[2] != (-7)) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0483, code lost:
    
        r6 = -21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0489, code lost:
    
        if (r8[3] != (-21)) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x048b, code lost:
    
        r5 = new com.jcraft.jsch.Buffer(r8);
        r5.i();
        r5.i();
        r5.p();
        r6 = com.jcraft.jsch.Util.c(r5.p());
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x04a7, code lost:
    
        if (r6.equals("3des-cbc") != false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x04af, code lost:
    
        if (r6.equals("none") == false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x04b1, code lost:
    
        r5.i();
        r5.i();
        r6 = new byte[r8.length - r5.n()];
        r5.e(r6);
        r8 = r6;
        r5 = false;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0513, code lost:
    
        r10 = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0515, code lost:
    
        if (r29 == null) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x06dd, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x06df, code lost:
    
        if (r14 != 1) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x06e1, code lost:
    
        r0 = new com.jcraft.jsch.KeyPairDSA(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0718, code lost:
    
        if (r0 != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x071a, code lost:
    
        r0.i = r5;
        r0.l = r6;
        r0.a = r15;
        r0.b = r10;
        r0.d = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0724, code lost:
    
        if (r5 != false) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0726, code lost:
    
        r0.i = true;
        r0.k = r4;
        r0.j = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0732, code lost:
    
        if (r0.y(r8) != false) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0734, code lost:
    
        r0.i = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x073d, code lost:
    
        throw new com.jcraft.jsch.JSchException("invalid privatekey");
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0752, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06e8, code lost:
    
        if (r14 == 2) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x06ea, code lost:
    
        r0 = new com.jcraft.jsch.KeyPairRSA(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x06f1, code lost:
    
        if (r14 == 3) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x06f3, code lost:
    
        r0 = new com.jcraft.jsch.KeyPairECDSA(r27, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x06fa, code lost:
    
        if (r14 == 5) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x06fc, code lost:
    
        r0 = new com.jcraft.jsch.KeyPairEd25519(r27, r29, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0704, code lost:
    
        if (r14 == 6) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0706, code lost:
    
        r0 = new com.jcraft.jsch.KeyPairEd448(r27, r29, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x070f, code lost:
    
        if (r15 == 3) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0711, code lost:
    
        r0 = new com.jcraft.jsch.KeyPairPKCS8(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0717, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0517, code lost:
    
        r11 = r29.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x051a, code lost:
    
        if (r29.length <= 4) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0522, code lost:
    
        if (r29[0] != 45) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0526, code lost:
    
        if (r29[1] != 45) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x052a, code lost:
    
        if (r29[2] != 45) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0530, code lost:
    
        if (r29[3] != 45) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0532, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0533, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0536, code lost:
    
        if (r29.length <= r12) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x053e, code lost:
    
        if (r29[r12] != 10) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x054a, code lost:
    
        if (r29.length > r12) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x054c, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x054f, code lost:
    
        if (r9 == false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0555, code lost:
    
        if (r29[r12] != 10) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0557, code lost:
    
        r13 = r12 + 1;
        r20 = r9;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x055d, code lost:
    
        if (r6 >= r29.length) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x055f, code lost:
    
        r9 = r29[r6];
        r24 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0565, code lost:
    
        if (r9 != 10) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x056a, code lost:
    
        if (r9 != 58) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x056d, code lost:
    
        r6 = r24 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0576, code lost:
    
        r12 = r12 + 1;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0572, code lost:
    
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x057e, code lost:
    
        if (r29.length > r12) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0580, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0582, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0583, code lost:
    
        if (r20 == false) goto L619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0585, code lost:
    
        if (r6 >= r11) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0587, code lost:
    
        r9 = r29[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x058b, code lost:
    
        if (r9 != 10) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x059b, code lost:
    
        if (r9 != 45) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x059e, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x05a1, code lost:
    
        if (r20 == false) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x05a3, code lost:
    
        r6 = com.jcraft.jsch.Util.k(r29, r12, r6 - r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x05a8, code lost:
    
        if (r28 == null) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x05ab, code lost:
    
        if (r14 != 4) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x05ad, code lost:
    
        r0 = r6[8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x05b1, code lost:
    
        if (r0 != 100) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x05b3, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x05b8, code lost:
    
        if (r0 != 114) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x05ba, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x058d, code lost:
    
        java.lang.System.arraycopy(r29, r6 + 1, r29, r6, (r11 - r6) - 1);
        r11 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0574, code lost:
    
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x057b, code lost:
    
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x054e, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x05c4, code lost:
    
        r6 = r29[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x05ca, code lost:
    
        if (r6 != 115) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x05d0, code lost:
    
        if (r29[1] != 115) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x05d6, code lost:
    
        if (r29[2] != 104) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x05de, code lost:
    
        if (r29[3] != 45) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x05e0, code lost:
    
        if (r28 != null) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x05e4, code lost:
    
        if (r29.length <= 7) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x05e6, code lost:
    
        r0 = r29[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x05ec, code lost:
    
        if (r0 != 100) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x05ee, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x05f2, code lost:
    
        if (r0 != 114) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x05f4, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x05f8, code lost:
    
        if (r0 != 101) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x05fe, code lost:
    
        if (r29[6] != 50) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0600, code lost:
    
        r14 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0604, code lost:
    
        if (r0 != 101) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x060a, code lost:
    
        if (r29[6] != 52) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x060c, code lost:
    
        r14 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x060d, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x060e, code lost:
    
        if (r0 >= r11) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0612, code lost:
    
        if (r29[r0] != 32) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0615, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0618, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x061a, code lost:
    
        if (r0 >= r11) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x061c, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x061d, code lost:
    
        if (r6 >= r11) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0621, code lost:
    
        if (r29[r6] != 32) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0624, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x062d, code lost:
    
        r26 = r6;
        r6 = com.jcraft.jsch.Util.k(r29, r0, r6 - r0);
        r0 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0634, code lost:
    
        r9 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0636, code lost:
    
        if (r0 >= r11) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0638, code lost:
    
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0639, code lost:
    
        if (r0 >= r11) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x063f, code lost:
    
        if (r29[r0] != 10) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0642, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0645, code lost:
    
        if (r0 <= 0) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x064d, code lost:
    
        if (r29[r0 - 1] != 13) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x064f, code lost:
    
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0651, code lost:
    
        if (r9 >= r0) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0653, code lost:
    
        r10 = com.jcraft.jsch.Util.d(r29, r9, r0 - r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0633, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x065c, code lost:
    
        if (r6 != 101) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0662, code lost:
    
        if (r29[1] != 99) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0668, code lost:
    
        if (r29[2] != 100) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0670, code lost:
    
        if (r29[3] != 115) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0672, code lost:
    
        if (r28 != null) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0676, code lost:
    
        if (r29.length <= 7) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0678, code lost:
    
        r14 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0679, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x067a, code lost:
    
        if (r0 >= r11) goto L633;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x067e, code lost:
    
        if (r29[r0] != 32) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0681, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0684, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0686, code lost:
    
        if (r0 >= r11) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0688, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0689, code lost:
    
        if (r6 >= r11) goto L635;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x068d, code lost:
    
        if (r29[r6] != 32) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0690, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0699, code lost:
    
        r26 = r6;
        r6 = com.jcraft.jsch.Util.k(r29, r0, r6 - r0);
        r0 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x06a0, code lost:
    
        r9 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x06a2, code lost:
    
        if (r0 >= r11) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x06a4, code lost:
    
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x06a5, code lost:
    
        if (r0 >= r11) goto L637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x06ab, code lost:
    
        if (r29[r0] != 10) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x06ae, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x06b1, code lost:
    
        if (r0 <= 0) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x06b9, code lost:
    
        if (r29[r0 - 1] != 13) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x06bb, code lost:
    
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x06bd, code lost:
    
        if (r9 >= r0) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x06bf, code lost:
    
        r10 = com.jcraft.jsch.Util.d(r29, r9, r0 - r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x069f, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0570, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0544, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x06cf, code lost:
    
        if (r27.a().isEnabled(2) != false) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x06d1, code lost:
    
        r27.a().b(2, "failed to parse public key", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x05bd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0541, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x04e0, code lost:
    
        throw new com.jcraft.jsch.JSchException("cipher " + r6 + " is not supported for this privatekey format");
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x04e1, code lost:
    
        r5.i();
        r10 = new byte[r8.length - r5.n()];
        r5.e(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x050a, code lost:
    
        throw new com.jcraft.jsch.JSchException("cipher " + r6 + " is not supported for this privatekey format");
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x050e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0747, code lost:
    
        throw ((com.jcraft.jsch.JSchException) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0751, code lost:
    
        throw new com.jcraft.jsch.JSchException(r0.toString(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x050b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0511, code lost:
    
        r5 = r16;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0450, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0451, code lost:
    
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0454, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x044a, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x041b, code lost:
    
        if (r8 <= 0) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0423, code lost:
    
        if (r6[r8 - 1] != 13) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0425, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0428, code lost:
    
        r10 = r8 + 1;
        java.lang.System.arraycopy(r6, r10, r6, r8 - r9, r5 - r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0431, code lost:
    
        if (r9 == 0) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0433, code lost:
    
        r5 = r5 - 1;
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0437, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0427, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x045b, code lost:
    
        throw new com.jcraft.jsch.JSchException("invalid privatekey");
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0461, code lost:
    
        throw new com.jcraft.jsch.JSchException("invalid privatekey");
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0462, code lost:
    
        r8 = null;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x03df, code lost:
    
        r6 = 3;
        r6 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x03e9, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x03ea, code lost:
    
        if (r15 == 3) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x03ec, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06e1 A[Catch: NoClassDefFoundError -> 0x0450, Exception -> 0x0454, TryCatch #4 {NoClassDefFoundError -> 0x0450, blocks: (B:292:0x044b, B:295:0x0466, B:298:0x046d, B:300:0x0470, B:302:0x0478, B:304:0x047e, B:306:0x0483, B:308:0x048b, B:310:0x04a9, B:312:0x04b1, B:347:0x0517, B:350:0x051c, B:352:0x0524, B:354:0x0528, B:356:0x052c, B:359:0x0533, B:361:0x0538, B:365:0x0549, B:370:0x0551, B:372:0x0557, B:373:0x055c, B:375:0x055f, B:383:0x0576, B:379:0x056d, B:387:0x057d, B:393:0x0587, B:416:0x058d, B:398:0x059e, B:404:0x05a3, B:319:0x06e1, B:321:0x071a, B:323:0x0726, B:324:0x072e, B:326:0x0734, B:327:0x0738, B:328:0x073d, B:332:0x06ea, B:335:0x06f3, B:338:0x06fc, B:341:0x0706, B:344:0x0711, B:408:0x05ad, B:547:0x06c6, B:549:0x06d1, B:431:0x05c4, B:433:0x05cc, B:435:0x05d2, B:437:0x05d8, B:440:0x05e2, B:442:0x05e6, B:450:0x05fa, B:455:0x0606, B:460:0x0610, B:462:0x0615, B:465:0x0618, B:469:0x061f, B:471:0x0624, B:474:0x0627, B:480:0x063b, B:482:0x0642, B:486:0x0647, B:488:0x064f, B:490:0x0653, B:497:0x065e, B:499:0x0664, B:501:0x066a, B:504:0x0674, B:509:0x067c, B:511:0x0681, B:514:0x0684, B:518:0x068b, B:520:0x0690, B:523:0x0693, B:529:0x06a7, B:531:0x06ae, B:535:0x06b3, B:537:0x06bb, B:539:0x06bf, B:553:0x04c5, B:554:0x04e0, B:555:0x04e1), top: B:291:0x044b }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x071a A[Catch: NoClassDefFoundError -> 0x0450, Exception -> 0x0454, TryCatch #4 {NoClassDefFoundError -> 0x0450, blocks: (B:292:0x044b, B:295:0x0466, B:298:0x046d, B:300:0x0470, B:302:0x0478, B:304:0x047e, B:306:0x0483, B:308:0x048b, B:310:0x04a9, B:312:0x04b1, B:347:0x0517, B:350:0x051c, B:352:0x0524, B:354:0x0528, B:356:0x052c, B:359:0x0533, B:361:0x0538, B:365:0x0549, B:370:0x0551, B:372:0x0557, B:373:0x055c, B:375:0x055f, B:383:0x0576, B:379:0x056d, B:387:0x057d, B:393:0x0587, B:416:0x058d, B:398:0x059e, B:404:0x05a3, B:319:0x06e1, B:321:0x071a, B:323:0x0726, B:324:0x072e, B:326:0x0734, B:327:0x0738, B:328:0x073d, B:332:0x06ea, B:335:0x06f3, B:338:0x06fc, B:341:0x0706, B:344:0x0711, B:408:0x05ad, B:547:0x06c6, B:549:0x06d1, B:431:0x05c4, B:433:0x05cc, B:435:0x05d2, B:437:0x05d8, B:440:0x05e2, B:442:0x05e6, B:450:0x05fa, B:455:0x0606, B:460:0x0610, B:462:0x0615, B:465:0x0618, B:469:0x061f, B:471:0x0624, B:474:0x0627, B:480:0x063b, B:482:0x0642, B:486:0x0647, B:488:0x064f, B:490:0x0653, B:497:0x065e, B:499:0x0664, B:501:0x066a, B:504:0x0674, B:509:0x067c, B:511:0x0681, B:514:0x0684, B:518:0x068b, B:520:0x0690, B:523:0x0693, B:529:0x06a7, B:531:0x06ae, B:535:0x06b3, B:537:0x06bb, B:539:0x06bf, B:553:0x04c5, B:554:0x04e0, B:555:0x04e1), top: B:291:0x044b }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x06d1 A[Catch: NoClassDefFoundError -> 0x0450, Exception -> 0x0454, TryCatch #4 {NoClassDefFoundError -> 0x0450, blocks: (B:292:0x044b, B:295:0x0466, B:298:0x046d, B:300:0x0470, B:302:0x0478, B:304:0x047e, B:306:0x0483, B:308:0x048b, B:310:0x04a9, B:312:0x04b1, B:347:0x0517, B:350:0x051c, B:352:0x0524, B:354:0x0528, B:356:0x052c, B:359:0x0533, B:361:0x0538, B:365:0x0549, B:370:0x0551, B:372:0x0557, B:373:0x055c, B:375:0x055f, B:383:0x0576, B:379:0x056d, B:387:0x057d, B:393:0x0587, B:416:0x058d, B:398:0x059e, B:404:0x05a3, B:319:0x06e1, B:321:0x071a, B:323:0x0726, B:324:0x072e, B:326:0x0734, B:327:0x0738, B:328:0x073d, B:332:0x06ea, B:335:0x06f3, B:338:0x06fc, B:341:0x0706, B:344:0x0711, B:408:0x05ad, B:547:0x06c6, B:549:0x06d1, B:431:0x05c4, B:433:0x05cc, B:435:0x05d2, B:437:0x05d8, B:440:0x05e2, B:442:0x05e6, B:450:0x05fa, B:455:0x0606, B:460:0x0610, B:462:0x0615, B:465:0x0618, B:469:0x061f, B:471:0x0624, B:474:0x0627, B:480:0x063b, B:482:0x0642, B:486:0x0647, B:488:0x064f, B:490:0x0653, B:497:0x065e, B:499:0x0664, B:501:0x066a, B:504:0x0674, B:509:0x067c, B:511:0x0681, B:514:0x0684, B:518:0x068b, B:520:0x0690, B:523:0x0693, B:529:0x06a7, B:531:0x06ae, B:535:0x06b3, B:537:0x06bb, B:539:0x06bf, B:553:0x04c5, B:554:0x04e0, B:555:0x04e1), top: B:291:0x044b }] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0748  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v89 */
    /* JADX WARN: Type inference failed for: r6v90 */
    /* JADX WARN: Type inference failed for: r6v93 */
    /* JADX WARN: Type inference failed for: r6v94 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.jcraft.jsch.KeyPair u(com.jcraft.jsch.JSch.InstanceLogger r27, byte[] r28, byte[] r29) throws com.jcraft.jsch.JSchException {
        /*
            Method dump skipped, instructions count: 1875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.KeyPair.u(com.jcraft.jsch.JSch$InstanceLogger, byte[], byte[]):com.jcraft.jsch.KeyPair");
    }

    public static KeyPair v(JSch jSch, byte[] bArr, byte[] bArr2) throws JSchException {
        return u(jSch.a, bArr, bArr2);
    }

    static KeyPair w(JSch.InstanceLogger instanceLogger, byte[] bArr) throws JSchException {
        if (bArr == null) {
            throw new JSchException("invalid privatekey");
        }
        Buffer buffer = new Buffer(bArr);
        byte[] bArr2 = m;
        byte[] bArr3 = new byte[bArr2.length];
        buffer.e(bArr3);
        if (!Util.b(bArr2, bArr3)) {
            throw new JSchException("Invalid openssh v1 format.");
        }
        String c = Util.c(buffer.p());
        String c2 = Util.c(buffer.p());
        byte[] p2 = buffer.p();
        if (buffer.i() != 1) {
            throw new JSchException("We don't support having more than 1 key in the file (yet).");
        }
        byte[] p3 = buffer.p();
        KeyPair B = B(instanceLogger, p3, null);
        B.i = true ^ "none".equals(c);
        B.l = p3;
        B.a = 4;
        B.b = HttpUrl.FRAGMENT_ENCODE_SET;
        byte[] p4 = buffer.p();
        B.j = p4;
        try {
            if (!B.i) {
                if (!B.y(p4)) {
                    throw new JSchException("invalid privatekey");
                }
                Util.g(B.j);
                return B;
            }
            if (!Session.f(JSch.f(c))) {
                throw new JSchException("cipher " + c + " is not available");
            }
            try {
                Cipher cipher = (Cipher) Class.forName(JSch.f(c)).asSubclass(Cipher.class).getDeclaredConstructor(null).newInstance(null);
                B.d = cipher;
                B.k = new byte[cipher.l()];
                try {
                    Buffer buffer2 = new Buffer(p2);
                    byte[] p5 = buffer2.p();
                    int i = buffer2.i();
                    BCrypt bCrypt = (BCrypt) Class.forName(JSch.f(c2)).asSubclass(BCrypt.class).getDeclaredConstructor(null).newInstance(null);
                    bCrypt.a(p5, i);
                    B.e = bCrypt;
                    return B;
                } catch (Exception | NoClassDefFoundError e) {
                    throw new JSchException("kdf " + c2 + " is not available", e);
                }
            } catch (Exception e2) {
                e = e2;
                throw new JSchException("cipher " + c + " is not available", e);
            } catch (NoClassDefFoundError e3) {
                e = e3;
                throw new JSchException("cipher " + c + " is not available", e);
            }
        } catch (Exception e4) {
            Util.g(B.j);
            throw e4;
        }
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00e1: MOVE (r5 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:226), block:B:115:0x00e1 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0182 A[Catch: all -> 0x00e0, NoClassDefFoundError -> 0x0196, Exception -> 0x0198, NumberFormatException -> 0x019a, LOOP:3: B:57:0x0180->B:58:0x0182, LOOP_END, TryCatch #0 {all -> 0x00e0, blocks: (B:21:0x0054, B:25:0x005a, B:27:0x0060, B:29:0x008f, B:35:0x009b, B:91:0x00bf, B:61:0x01c2, B:37:0x00f3, B:41:0x0109, B:43:0x0110, B:56:0x0154, B:58:0x0182, B:60:0x019c, B:71:0x01c5, B:72:0x01cc, B:67:0x01cd, B:68:0x01d2, B:75:0x014b, B:76:0x0150, B:79:0x0124, B:82:0x012e, B:85:0x0138, B:88:0x01d3, B:89:0x01d8, B:94:0x00e7, B:95:0x00ee, B:32:0x01e2, B:33:0x01e7, B:98:0x01dc, B:99:0x01e1, B:102:0x01e8, B:104:0x01f0, B:105:0x01f7, B:106:0x01fe, B:109:0x020e, B:110:0x0211), top: B:13:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.jcraft.jsch.KeyPair x(com.jcraft.jsch.JSch.InstanceLogger r18, byte[] r19) throws com.jcraft.jsch.JSchException {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.KeyPair.x(com.jcraft.jsch.JSch$InstanceLogger, byte[]):com.jcraft.jsch.KeyPair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0032, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0034, code lost:
    
        if (r2 >= r0.length) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0036, code lost:
    
        r2 = r0[r2];
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean z(com.jcraft.jsch.Buffer r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            byte[] r0 = r10.b
            int r1 = r10.c
            r2 = r1
        L5:
            int r3 = r0.length
            r4 = 13
            r5 = 10
            r6 = 1
            r7 = 0
            if (r2 >= r3) goto L38
            r3 = r0[r2]
            if (r3 == r4) goto L32
            if (r3 != r5) goto L15
            goto L32
        L15:
            r8 = 58
            if (r3 != r8) goto L2f
            int r3 = r2 - r1
            java.lang.String r1 = com.jcraft.jsch.Util.d(r0, r1, r3)
            int r3 = r2 + 1
            int r8 = r0.length
            if (r3 >= r8) goto L2d
            r8 = r0[r3]
            r9 = 32
            if (r8 != r9) goto L2d
            int r2 = r2 + 2
            goto L3a
        L2d:
            r2 = r3
            goto L3a
        L2f:
            int r2 = r2 + 1
            goto L5
        L32:
            int r2 = r2 + r6
            int r3 = r0.length
            if (r2 >= r3) goto L38
            r2 = r0[r2]
        L38:
            r2 = r1
            r1 = r7
        L3a:
            r3 = 0
            if (r1 != 0) goto L3e
            return r3
        L3e:
            r8 = r2
        L3f:
            int r9 = r0.length
            if (r8 >= r9) goto L5e
            r9 = r0[r8]
            if (r9 == r4) goto L4c
            if (r9 != r5) goto L49
            goto L4c
        L49:
            int r8 = r8 + 1
            goto L3f
        L4c:
            int r4 = r8 - r2
            java.lang.String r7 = com.jcraft.jsch.Util.d(r0, r2, r4)
            int r2 = r8 + 1
            int r4 = r0.length
            if (r2 >= r4) goto L5e
            r0 = r0[r2]
            if (r0 != r5) goto L5e
            int r8 = r8 + 2
            r2 = r8
        L5e:
            if (r7 == 0) goto L65
            r11.put(r1, r7)
            r10.c = r2
        L65:
            if (r7 == 0) goto L68
            return r6
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.KeyPair.z(com.jcraft.jsch.Buffer, java.util.Map):boolean");
    }

    int C(byte[] bArr, byte b, int i, byte[] bArr2) {
        bArr[i] = b;
        int E = E(bArr, i + 1, bArr2.length);
        System.arraycopy(bArr2, 0, bArr, E, bArr2.length);
        return E + bArr2.length;
    }

    int D(byte[] bArr, int i, byte[] bArr2) {
        bArr[i] = 2;
        int E = E(bArr, i + 1, bArr2.length);
        System.arraycopy(bArr2, 0, bArr, E, bArr2.length);
        return E + bArr2.length;
    }

    int E(byte[] bArr, int i, int i2) {
        int c = c(i2) - 1;
        if (c == 0) {
            int i3 = i + 1;
            bArr[i] = (byte) i2;
            return i3;
        }
        bArr[i] = (byte) (c | 128);
        int i4 = i + 1 + c;
        while (c > 0) {
            bArr[(r1 + c) - 1] = (byte) (i2 & 255);
            i2 >>>= 8;
            c--;
        }
        return i4;
    }

    int F(byte[] bArr, int i, byte[] bArr2) {
        bArr[i] = 4;
        int E = E(bArr, i + 1, bArr2.length);
        System.arraycopy(bArr2, 0, bArr, E, bArr2.length);
        return E + bArr2.length;
    }

    int G(byte[] bArr, int i, int i2) {
        bArr[i] = 48;
        return E(bArr, i + 1, i2);
    }

    void b(KeyPair keyPair) {
        this.l = keyPair.l;
        this.a = keyPair.a;
        this.b = keyPair.b;
        this.d = keyPair.d;
    }

    int c(int i) {
        int i2 = 1;
        if (i <= 127) {
            return 1;
        }
        while (i > 0) {
            i >>>= 8;
            i2++;
        }
        return i2;
    }

    public boolean d(byte[] bArr) {
        boolean z = this.i;
        if (!z) {
            return true;
        }
        if (bArr == null) {
            return !z;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        byte[] bArr3 = null;
        try {
            bArr3 = e(this.j, bArr2, this.k);
            if (y(bArr3)) {
                this.i = false;
                Util.g(this.j);
            }
            Util.g(bArr2);
            Util.g(bArr3);
            return !this.i;
        } catch (Throwable th) {
            Util.g(bArr2);
            Util.g(bArr3);
            throw th;
        }
    }

    public void f() {
        Util.g(this.h);
    }

    public void finalize() {
        f();
    }

    public abstract byte[] g() throws JSchException;

    synchronized byte[] j(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        try {
            if (this.d == null) {
                this.d = h();
            }
            if (this.g == null) {
                this.g = i();
            }
            int d = this.d.d();
            bArr3 = new byte[d];
            int d2 = this.g.d();
            int i = ((d / d2) * d2) + (d % d2 == 0 ? 0 : d2);
            byte[] bArr4 = new byte[i];
            try {
                int i2 = this.a;
                byte[] bArr5 = null;
                if (i2 == 0) {
                    int i3 = 0;
                    while (i3 + d2 <= i) {
                        if (bArr5 != null) {
                            this.g.b(bArr5, 0, bArr5.length);
                        }
                        this.g.b(bArr, 0, bArr.length);
                        HASH hash = this.g;
                        int i4 = 8;
                        if (bArr2.length <= 8) {
                            i4 = bArr2.length;
                        }
                        hash.b(bArr2, 0, i4);
                        bArr5 = this.g.c();
                        System.arraycopy(bArr5, 0, bArr4, i3, bArr5.length);
                        i3 += bArr5.length;
                    }
                    System.arraycopy(bArr4, 0, bArr3, 0, d);
                } else if (i2 == 4) {
                    byte[] c = this.e.c(bArr, this.d.d() + this.d.l());
                    System.arraycopy(c, 0, bArr3, 0, d);
                    System.arraycopy(c, d, bArr2, 0, bArr2.length);
                    Util.g(c);
                } else if (i2 == 1) {
                    int i5 = 0;
                    while (i5 + d2 <= i) {
                        if (bArr5 != null) {
                            this.g.b(bArr5, 0, bArr5.length);
                        }
                        this.g.b(bArr, 0, bArr.length);
                        bArr5 = this.g.c();
                        System.arraycopy(bArr5, 0, bArr4, i5, bArr5.length);
                        i5 += bArr5.length;
                    }
                    System.arraycopy(bArr4, 0, bArr3, 0, d);
                } else if (i2 == 2) {
                    byte[] bArr6 = new byte[4];
                    this.f.b(bArr6, 0, 4);
                    this.f.b(bArr, 0, bArr.length);
                    byte[] c2 = this.f.c();
                    System.arraycopy(c2, 0, bArr3, 0, c2.length);
                    Util.g(c2);
                    bArr6[3] = 1;
                    this.f.b(bArr6, 0, 4);
                    this.f.b(bArr, 0, bArr.length);
                    byte[] c3 = this.f.c();
                    System.arraycopy(c3, 0, bArr3, c3.length, d - c3.length);
                    Util.g(c3);
                } else if (i2 == 5) {
                    byte[] c4 = this.e.c(bArr, this.d.d() + this.d.l() + 32);
                    System.arraycopy(c4, 0, bArr3, 0, d);
                    System.arraycopy(c4, d, bArr2, 0, bArr2.length);
                    Util.g(c4);
                }
            } catch (Exception e) {
                if (this.c.a().isEnabled(3)) {
                    this.c.a().b(3, "failed to generate key from passphrase", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return bArr3;
    }

    public abstract int k();

    abstract byte[] l();

    public String m() {
        return Util.c(l());
    }

    abstract byte[] n();

    public byte[] o() {
        return this.l;
    }

    public abstract byte[] p(byte[] bArr);

    public abstract byte[] q(byte[] bArr, String str);

    public boolean r() {
        return this.i;
    }

    abstract boolean y(byte[] bArr);
}
