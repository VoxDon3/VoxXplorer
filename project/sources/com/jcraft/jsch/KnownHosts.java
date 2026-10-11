package com.jcraft.jsch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Vector;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
class KnownHosts implements HostKeyRepository {
    private static final byte[] e = {32};
    private static final byte[] f = Util.v("\n");
    private JSch a;
    private String b = null;
    private Vector<HostKey> c;
    MAC d;

    class HashedHostKey extends HostKey {
        private boolean g;
        byte[] h;
        byte[] i;

        HashedHostKey(KnownHosts knownHosts, String str, byte[] bArr) throws JSchException {
            this(knownHosts, str, 0, bArr);
        }

        @Override // com.jcraft.jsch.HostKey
        boolean h(String str) {
            boolean a;
            if (!this.g) {
                return super.h(str);
            }
            try {
                synchronized (KnownHosts.this.d) {
                    KnownHosts.this.d.a(this.h);
                    byte[] v = Util.v(str);
                    KnownHosts.this.d.b(v, 0, v.length);
                    byte[] bArr = new byte[KnownHosts.this.d.d()];
                    KnownHosts.this.d.c(bArr, 0);
                    a = Util.a(this.i, bArr);
                }
                return a;
            } catch (Exception e) {
                KnownHosts.this.a.j().b(3, "an error occurred while trying to check hash for host " + str, e);
                return false;
            }
        }

        void j() {
            if (this.g) {
                return;
            }
            if (this.h == null) {
                Random random = Session.x0;
                synchronized (random) {
                    byte[] bArr = new byte[KnownHosts.this.d.d()];
                    this.h = bArr;
                    random.a(bArr, 0, bArr.length);
                }
            }
            try {
                synchronized (KnownHosts.this.d) {
                    KnownHosts.this.d.a(this.h);
                    byte[] v = Util.v(this.b);
                    KnownHosts.this.d.b(v, 0, v.length);
                    byte[] bArr2 = new byte[KnownHosts.this.d.d()];
                    this.i = bArr2;
                    KnownHosts.this.d.c(bArr2, 0);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("|1|");
                byte[] bArr3 = this.h;
                sb.append(Util.c(Util.x(bArr3, 0, bArr3.length, true)));
                sb.append("|");
                byte[] bArr4 = this.i;
                sb.append(Util.c(Util.x(bArr4, 0, bArr4.length, true)));
                this.b = sb.toString();
                this.g = true;
            } catch (Exception e) {
                KnownHosts.this.a.j().b(3, "an error occurred while trying to calculate the hash for host " + this.b, e);
                this.h = null;
                this.i = null;
            }
        }

        boolean k() {
            return this.g;
        }

        HashedHostKey(KnownHosts knownHosts, String str, int i, byte[] bArr) throws JSchException {
            this(HttpUrl.FRAGMENT_ENCODE_SET, str, i, bArr, null);
        }

        HashedHostKey(String str, String str2, int i, byte[] bArr, String str3) throws JSchException {
            super(str, str2, i, bArr, str3);
            this.g = false;
            this.h = null;
            this.i = null;
            if (!this.b.startsWith("|1|") || this.b.substring(3).indexOf("|") <= 0) {
                return;
            }
            String substring = this.b.substring(3);
            String substring2 = substring.substring(0, substring.indexOf("|"));
            String substring3 = substring.substring(substring.indexOf("|") + 1);
            this.h = Util.k(Util.v(substring2), 0, substring2.length());
            this.i = Util.k(Util.v(substring3), 0, substring3.length());
            int d = KnownHosts.this.d.d();
            if (this.h.length == d && this.i.length == d) {
                this.g = true;
            } else {
                this.h = null;
                this.i = null;
            }
        }
    }

    KnownHosts(JSch jSch) {
        this.c = null;
        this.a = jSch;
        m();
        this.c = new Vector<>();
    }

    private void g(String str) throws JSchException {
        this.c.addElement(new HostKey(str, -1, null));
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public String a() {
        return this.b;
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public void b(HostKey hostKey, UserInfo userInfo) {
        int i = hostKey.c;
        String c = hostKey.c();
        synchronized (this.c) {
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                try {
                    this.c.elementAt(i2).h(c);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.c.addElement(hostKey);
        r(userInfo);
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public int c(String str, byte[] bArr) {
        if (str == null) {
            return 1;
        }
        try {
            HostKey hostKey = new HostKey(str, 0, bArr);
            synchronized (this.c) {
                int i = 1;
                for (int i2 = 0; i2 < this.c.size(); i2++) {
                    try {
                        HostKey elementAt = this.c.elementAt(i2);
                        if (elementAt.h(str) && elementAt.c == hostKey.c) {
                            if (Util.a(elementAt.d, bArr)) {
                                return 0;
                            }
                            i = 2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return (i == 1 && str.startsWith("[") && str.indexOf("]:") > 1) ? c(str.substring(1, str.indexOf("]:")), bArr) : i;
            }
        } catch (Exception e2) {
            this.a.j().b(0, "exception while trying to read key while checking host '" + str + "'", e2);
            return 1;
        }
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public void d(String str, String str2, byte[] bArr) {
        boolean z;
        synchronized (this.c) {
            int i = 0;
            z = false;
            while (i < this.c.size()) {
                try {
                    HostKey elementAt = this.c.elementAt(i);
                    if (str != null) {
                        if (elementAt.h(str)) {
                            if (str2 != null) {
                                if (elementAt.f().equals(str2)) {
                                    if (bArr != null && !Util.a(bArr, elementAt.d)) {
                                    }
                                }
                            }
                        }
                        i++;
                    }
                    String c = elementAt.c();
                    if (str != null && !c.equals(str) && (!(elementAt instanceof HashedHostKey) || !((HashedHostKey) elementAt).k())) {
                        elementAt.b = j(c, str);
                        z = true;
                        i++;
                    }
                    this.c.removeElement(elementAt);
                    i--;
                    z = true;
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            try {
                p();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public HostKey[] e(String str, String str2) {
        HostKey[] hostKeyArr;
        synchronized (this.c) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.c.size(); i++) {
                    HostKey elementAt = this.c.elementAt(i);
                    if (elementAt.c != -1) {
                        if (str != null) {
                            if (elementAt.h(str)) {
                                if (str2 != null && !elementAt.f().equals(str2)) {
                                }
                            }
                        }
                        arrayList.add(elementAt);
                    }
                }
                int size = arrayList.size();
                hostKeyArr = new HostKey[size];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    hostKeyArr[i2] = (HostKey) arrayList.get(i2);
                }
                if (str != null && str.startsWith("[") && str.indexOf("]:") > 1) {
                    HostKey[] e2 = e(str.substring(1, str.indexOf("]:")), str2);
                    if (e2.length > 0) {
                        HostKey[] hostKeyArr2 = new HostKey[e2.length + size];
                        System.arraycopy(hostKeyArr, 0, hostKeyArr2, 0, size);
                        System.arraycopy(e2, 0, hostKeyArr2, size, e2.length);
                        hostKeyArr = hostKeyArr2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hostKeyArr;
    }

    MAC h(String str) throws IllegalArgumentException {
        try {
            return (MAC) Class.forName(str).asSubclass(MAC.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e2) {
            this.a.j().b(3, "unable to instantiate HMAC-class " + str, e2);
            throw new IllegalArgumentException("instantiation of " + str + " lead to an error", e2);
        }
    }

    HostKey i(String str, byte[] bArr) throws JSchException {
        HashedHostKey hashedHostKey = new HashedHostKey(this, str, bArr);
        hashedHostKey.j();
        return hashedHostKey;
    }

    String j(String str, String str2) {
        int length = str2.length();
        int length2 = str.length();
        int i = 0;
        while (i < length2) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                break;
            }
            if (str2.equals(str.substring(i, indexOf))) {
                return str.substring(0, i) + str.substring(indexOf + 1);
            }
            i = indexOf + 1;
        }
        if (str.endsWith(str2) && length2 - i == length) {
            return str.substring(0, length == length2 ? 0 : (length2 - length) - 1);
        }
        return str;
    }

    void k(OutputStream outputStream) {
        try {
            synchronized (this.c) {
                for (int i = 0; i < this.c.size(); i++) {
                    try {
                        l(outputStream, this.c.elementAt(i));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Exception e2) {
            this.a.j().b(3, "unable to dump known hosts", e2);
        }
    }

    void l(OutputStream outputStream, HostKey hostKey) throws IOException {
        String e2 = hostKey.e();
        String c = hostKey.c();
        String f2 = hostKey.f();
        String b = hostKey.b();
        if (f2.equals("UNKNOWN")) {
            outputStream.write(Util.v(c));
            outputStream.write(f);
            return;
        }
        if (e2.length() != 0) {
            outputStream.write(Util.v(e2));
            outputStream.write(e);
        }
        outputStream.write(Util.v(c));
        byte[] bArr = e;
        outputStream.write(bArr);
        outputStream.write(Util.v(f2));
        outputStream.write(bArr);
        outputStream.write(Util.v(hostKey.d()));
        if (b != null) {
            outputStream.write(bArr);
            outputStream.write(Util.v(b));
        }
        outputStream.write(f);
    }

    MAC m() throws IllegalArgumentException {
        if (this.d == null) {
            this.d = h(JSch.f("hmac-sha1"));
        }
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0105, code lost:
    
        r13 = r8[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0107, code lost:
    
        if (r13 == 32) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0109, code lost:
    
        if (r13 != 9) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x010e, code lost:
    
        r7.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0111, code lost:
    
        if (r3 >= r0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0113, code lost:
    
        r13 = r3 + 1;
        r3 = r8[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0117, code lost:
    
        if (r3 != 13) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0126, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x011a, code lost:
    
        if (r3 != 10) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x011d, code lost:
    
        if (r3 == 32) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x011f, code lost:
    
        if (r3 != 9) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0122, code lost:
    
        r7.append((char) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0128, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0129, code lost:
    
        r13 = r7.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0131, code lost:
    
        if (r13.length() != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0133, code lost:
    
        g(com.jcraft.jsch.Util.d(r8, 0, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x013b, code lost:
    
        if (r3 >= r0) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x013d, code lost:
    
        r14 = r8[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x013f, code lost:
    
        if (r14 == 32) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0141, code lost:
    
        if (r14 != 9) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0146, code lost:
    
        if (r3 >= r0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0148, code lost:
    
        r7.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x014b, code lost:
    
        if (r3 >= r0) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x014d, code lost:
    
        r9 = r3 + 1;
        r3 = r8[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0151, code lost:
    
        if (r3 != 13) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x015b, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0154, code lost:
    
        if (r3 != 10) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0157, code lost:
    
        r7.append((char) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x015d, code lost:
    
        r0 = r7.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0163, code lost:
    
        r2 = r12;
        r3 = r11;
        r16.c.addElement(new com.jcraft.jsch.KnownHosts.HashedHostKey(r16, r2, r3, r6, com.jcraft.jsch.Util.k(com.jcraft.jsch.Util.v(r13), 0, r13.length()), r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0162, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0143, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x010b, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x00f7, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x008c, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x017f, code lost:
    
        g(com.jcraft.jsch.Util.d(r8, 0, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r3 >= r0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        r11 = r8[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r11 == 32) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r11 != 9) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
    
        if (r11 != 35) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
    
        g(com.jcraft.jsch.Util.d(r8, 0, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r3 < r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        g(com.jcraft.jsch.Util.d(r8, 0, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        r7.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        if (r3 >= r0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0066, code lost:
    
        r11 = r3 + 1;
        r3 = r8[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
    
        if (r3 == 32) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
    
        if (r3 != 9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
    
        r7.append((char) r3);
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0076, code lost:
    
        r11 = r7.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007a, code lost:
    
        if (r3 >= r0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0080, code lost:
    
        if (r11.length() != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0084, code lost:
    
        if (r3 >= r0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
    
        r12 = r8[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0088, code lost:
    
        if (r12 == 32) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008a, code lost:
    
        if (r12 != 9) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r12 = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0097, code lost:
    
        if (r11.charAt(0) != '@') goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
    
        r7.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009c, code lost:
    
        if (r3 >= r0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
    
        r12 = r3 + 1;
        r3 = r8[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a2, code lost:
    
        if (r3 == 32) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a4, code lost:
    
        if (r3 != 9) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
    
        r7.append((char) r3);
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ad, code lost:
    
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ae, code lost:
    
        r12 = r7.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b2, code lost:
    
        if (r3 >= r0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b8, code lost:
    
        if (r12.length() != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bb, code lost:
    
        if (r3 >= r0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bd, code lost:
    
        r13 = r8[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bf, code lost:
    
        if (r13 == 32) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c1, code lost:
    
        if (r13 != 9) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c6, code lost:
    
        r12 = r11;
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c3, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ca, code lost:
    
        g(com.jcraft.jsch.Util.d(r8, 0, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00d3, code lost:
    
        r7.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00d6, code lost:
    
        if (r3 >= r0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00d8, code lost:
    
        r13 = r3 + 1;
        r3 = r8[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00dc, code lost:
    
        if (r3 == 32) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00de, code lost:
    
        if (r3 != 9) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00e1, code lost:
    
        r7.append((char) r3);
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00e7, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00e8, code lost:
    
        r13 = r7.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00f0, code lost:
    
        if (com.jcraft.jsch.HostKey.i(r13) == (-1)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f2, code lost:
    
        r6 = com.jcraft.jsch.HostKey.i(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00f8, code lost:
    
        if (r3 < r0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00fa, code lost:
    
        g(com.jcraft.jsch.Util.d(r8, 0, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0103, code lost:
    
        if (r3 >= r0) goto L186;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void n(java.io.InputStream r17) throws com.jcraft.jsch.JSchException {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.KnownHosts.n(java.io.InputStream):void");
    }

    void o(String str) throws JSchException {
        try {
            this.b = str;
            n(new FileInputStream(Util.h(str)));
        } catch (FileNotFoundException unused) {
        }
    }

    void p() throws IOException {
        String str = this.b;
        if (str != null) {
            q(str);
        }
    }

    synchronized void q(String str) throws IOException {
        if (str == null) {
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(Util.h(str));
        try {
            k(fileOutputStream);
            fileOutputStream.close();
        } finally {
        }
    }

    void r(UserInfo userInfo) {
        boolean z;
        String a = a();
        if (a == null) {
            return;
        }
        File file = new File(Util.h(a));
        if (file.exists()) {
            z = true;
        } else {
            z = false;
            if (userInfo != null) {
                boolean g = userInfo.g(a + " does not exist.\nAre you sure you want to create it?");
                file = file.getParentFile();
                if (g && file != null && !file.exists()) {
                    g = userInfo.g("The parent directory " + file + " does not exist.\nAre you sure you want to create it?");
                    if (g) {
                        if (file.mkdirs()) {
                            userInfo.d(file + " has been succesfully created.\nPlease check its access permission.");
                        } else {
                            userInfo.d(file + " has not been created.");
                            g = false;
                        }
                    }
                }
                if (file != null) {
                    z = g;
                }
            }
        }
        if (z) {
            try {
                q(a);
            } catch (Exception e2) {
                this.a.j().b(3, "unable to sync known host file " + file.getPath(), e2);
            }
        }
    }
}
