package com.jcraft.jsch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* loaded from: classes3.dex */
class UserAuthPublicKey extends UserAuth {
    UserAuthPublicKey() {
    }

    private boolean b(Session session, List<Identity> list, List<String> list2, List<String> list3) throws Exception {
        ArrayList arrayList;
        boolean z;
        boolean z2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        byte[] bArr;
        ArrayList arrayList4;
        int i;
        ArrayList arrayList5;
        ArrayList arrayList6;
        List<String> list4 = list3;
        boolean z3 = false;
        if (session.f0 >= session.e0) {
            return false;
        }
        boolean equals = session.w("enable_pubkey_auth_query").equals("yes");
        boolean equals2 = session.w("try_additional_pubkey_algorithms").equals("yes");
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        for (String str : list2) {
            if (str.equals("ssh-rsa") || str.equals("rsa-sha2-256") || str.equals("rsa-sha2-512") || str.equals("ssh-rsa-sha224@ssh.com") || str.equals("ssh-rsa-sha256@ssh.com") || str.equals("ssh-rsa-sha384@ssh.com") || str.equals("ssh-rsa-sha512@ssh.com")) {
                arrayList7.add(str);
            } else {
                arrayList8.add(str);
            }
        }
        byte[] v = Util.v(this.d);
        for (Identity identity : list) {
            if (session.f0 >= session.e0) {
                return z3;
            }
            c(session, identity);
            String b = identity.b();
            if (b.equals("ssh-rsa")) {
                arrayList = new ArrayList(arrayList7);
            } else if (arrayList8.contains(b)) {
                arrayList = new ArrayList(1);
                arrayList.add(b);
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                z = equals;
                z2 = equals2;
                arrayList2 = arrayList7;
                arrayList3 = arrayList8;
                bArr = v;
                if (session.A().isEnabled(0)) {
                    session.A().a(0, b + " cannot be used as public key type for identity " + identity.getName());
                }
            } else {
                while (!arrayList.isEmpty() && session.f0 < session.e0) {
                    byte[] d = identity.d();
                    if (d != null && equals) {
                        Iterator it = arrayList.iterator();
                        int i2 = 51;
                        while (true) {
                            if (!it.hasNext()) {
                                z = equals;
                                z2 = equals2;
                                arrayList2 = arrayList7;
                                arrayList3 = arrayList8;
                                i = i2;
                                arrayList4 = null;
                                break;
                            }
                            String str2 = (String) it.next();
                            it.remove();
                            if (list4.contains(str2)) {
                                z = equals;
                                if (!(identity instanceof AgentIdentity)) {
                                    boolean z4 = equals2;
                                    if (session.A().isEnabled(0)) {
                                        session.A().a(0, str2 + " not available for identity " + identity.getName());
                                    }
                                    equals = z;
                                    equals2 = z4;
                                }
                            } else {
                                z = equals;
                            }
                            z2 = equals2;
                            this.b.c();
                            this.c.s((byte) 50);
                            this.c.y(v);
                            this.c.y(Util.v("ssh-connection"));
                            this.c.y(Util.v("publickey"));
                            this.c.s((byte) 0);
                            this.c.y(Util.v(str2));
                            this.c.y(d);
                            session.m0(this.b);
                            while (true) {
                                Buffer M = session.M(this.c);
                                this.c = M;
                                i = M.h() & 255;
                                if (i == 60) {
                                    arrayList2 = arrayList7;
                                    if (session.A().isEnabled(0)) {
                                        Logger A = session.A();
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(str2);
                                        arrayList3 = arrayList8;
                                        sb.append(" preauth success");
                                        A.a(0, sb.toString());
                                    } else {
                                        arrayList3 = arrayList8;
                                    }
                                    arrayList4 = new ArrayList(1);
                                    arrayList4.add(str2);
                                } else {
                                    arrayList5 = arrayList7;
                                    arrayList6 = arrayList8;
                                    if (i == 51) {
                                        if (session.A().isEnabled(0)) {
                                            session.A().a(0, str2 + " preauth failure");
                                        }
                                    } else if (i == 53) {
                                        this.c.i();
                                        this.c.c();
                                        this.c.c();
                                        byte[] p = this.c.p();
                                        this.c.p();
                                        String c = Util.c(p);
                                        UserInfo userInfo = this.a;
                                        if (userInfo != null) {
                                            userInfo.d(c);
                                        }
                                        arrayList7 = arrayList5;
                                        arrayList8 = arrayList6;
                                    } else if (session.A().isEnabled(0)) {
                                        session.A().a(0, str2 + " preauth failure command (" + i + ")");
                                    }
                                }
                            }
                            i2 = i;
                            equals = z;
                            equals2 = z2;
                            arrayList7 = arrayList5;
                            arrayList8 = arrayList6;
                        }
                        if (i != 60) {
                            equals = z;
                            break;
                        }
                    } else {
                        z = equals;
                        z2 = equals2;
                        arrayList2 = arrayList7;
                        arrayList3 = arrayList8;
                        arrayList4 = null;
                    }
                    if (!identity.c()) {
                        if (d == null) {
                            d = identity.d();
                        }
                        if (d != null) {
                            if (arrayList4 == null) {
                                arrayList4 = arrayList;
                            }
                            if (!arrayList4.isEmpty()) {
                                Iterator it2 = arrayList4.iterator();
                                while (it2.hasNext() && session.f0 < session.e0) {
                                    String str3 = (String) it2.next();
                                    it2.remove();
                                    if (!list4.contains(str3) || (identity instanceof AgentIdentity)) {
                                        this.b.c();
                                        this.c.s((byte) 50);
                                        this.c.y(v);
                                        this.c.y(Util.v("ssh-connection"));
                                        this.c.y(Util.v("publickey"));
                                        this.c.s((byte) 1);
                                        this.c.y(Util.v(str3));
                                        this.c.y(d);
                                        byte[] C = session.C();
                                        int length = C.length;
                                        byte[] bArr2 = new byte[(this.c.c + r6) - 5];
                                        Iterator it3 = it2;
                                        bArr2[0] = (byte) (length >>> 24);
                                        bArr2[1] = (byte) (length >>> 16);
                                        bArr2[2] = (byte) (length >>> 8);
                                        bArr2[3] = (byte) length;
                                        bArr = v;
                                        System.arraycopy(C, 0, bArr2, 4, length);
                                        System.arraycopy(this.c.b, 5, bArr2, length + 4, r3.c - 5);
                                        byte[] a = identity.a(bArr2, str3);
                                        if (a != null) {
                                            this.c.y(a);
                                            session.m0(this.b);
                                            while (true) {
                                                Buffer M2 = session.M(this.c);
                                                this.c = M2;
                                                int h = M2.h() & 255;
                                                if (h == 52) {
                                                    if (!session.A().isEnabled(0)) {
                                                        return true;
                                                    }
                                                    session.A().a(0, str3 + " auth success");
                                                    return true;
                                                }
                                                if (h == 53) {
                                                    this.c.i();
                                                    this.c.c();
                                                    this.c.c();
                                                    byte[] p2 = this.c.p();
                                                    this.c.p();
                                                    String c2 = Util.c(p2);
                                                    UserInfo userInfo2 = this.a;
                                                    if (userInfo2 != null) {
                                                        userInfo2.d(c2);
                                                    }
                                                } else if (h == 51) {
                                                    this.c.i();
                                                    this.c.c();
                                                    this.c.c();
                                                    byte[] p3 = this.c.p();
                                                    if (this.c.c() != 0) {
                                                        throw new JSchPartialAuthException(Util.c(p3));
                                                    }
                                                    session.f0++;
                                                    if (session.A().isEnabled(0)) {
                                                        session.A().a(0, str3 + " auth failure");
                                                    }
                                                    if (session.f0 >= session.e0) {
                                                        return false;
                                                    }
                                                    if (!z2) {
                                                        break;
                                                    }
                                                } else if (session.A().isEnabled(0)) {
                                                    session.A().a(0, str3 + " auth failure command (" + h + ")");
                                                }
                                            }
                                        } else if (session.A().isEnabled(0)) {
                                            session.A().a(0, str3 + " signature failure");
                                        }
                                        list4 = list3;
                                        it2 = it3;
                                        v = bArr;
                                    } else if (session.A().isEnabled(0)) {
                                        session.A().a(0, str3 + " not available for identity " + identity.getName());
                                    }
                                }
                                list4 = list3;
                                equals = z;
                                v = v;
                                equals2 = z2;
                                arrayList7 = arrayList2;
                                arrayList8 = arrayList3;
                            }
                        }
                    }
                    equals = z;
                    break;
                }
                z = equals;
                z2 = equals2;
                arrayList2 = arrayList7;
                arrayList3 = arrayList8;
                bArr = v;
            }
            list4 = list3;
            equals = z;
            v = bArr;
            equals2 = z2;
            arrayList7 = arrayList2;
            arrayList8 = arrayList3;
            z3 = false;
        }
        return false;
    }

    private void c(Session session, Identity identity) throws JSchException {
        byte[] bArr;
        byte[] bArr2;
        int i = 5;
        while (true) {
            bArr = null;
            if (identity.c()) {
                if (this.a == null) {
                    throw new JSchException("USERAUTH fail");
                }
                if (identity.c()) {
                    if (!this.a.a("Passphrase for " + identity.getName())) {
                        throw new JSchAuthCancelException("publickey");
                    }
                }
                String b = this.a.b();
                if (b != null) {
                    bArr2 = Util.v(b);
                    if ((identity.c() || bArr2 != null) && identity.e(bArr2)) {
                        if (bArr2 != null && (session.z() instanceof IdentityRepositoryWrapper)) {
                            ((IdentityRepositoryWrapper) session.z()).f();
                        }
                        bArr = bArr2;
                    } else {
                        Util.g(bArr2);
                        i--;
                        if (i == 0) {
                            break;
                        }
                    }
                }
            }
            bArr2 = null;
            if (identity.c()) {
            }
            if (bArr2 != null) {
                ((IdentityRepositoryWrapper) session.z()).f();
            }
            bArr = bArr2;
        }
        Util.g(bArr);
    }

    @Override // com.jcraft.jsch.UserAuth
    public boolean a(Session session) throws Exception {
        super.a(session);
        Vector<Identity> a = session.z().a();
        synchronized (a) {
            try {
                if (a.size() <= 0) {
                    return false;
                }
                String w = session.w("PubkeyAcceptedAlgorithms");
                if (session.A().isEnabled(0)) {
                    session.A().a(0, "PubkeyAcceptedAlgorithms = " + w);
                }
                String[] E = session.E();
                List<String> asList = (E == null || E.length <= 0) ? Collections.EMPTY_LIST : Arrays.asList(E);
                if (!asList.isEmpty() && session.A().isEnabled(0)) {
                    session.A().a(0, "Signature algorithms unavailable for non-agent identities = " + asList);
                }
                List<String> asList2 = Arrays.asList(Util.u(w, ","));
                if (asList2.isEmpty()) {
                    return false;
                }
                String[] B = session.B();
                if (B == null || B.length <= 0) {
                    if (session.A().isEnabled(0)) {
                        session.A().a(0, "No server-sig-algs found, using PubkeyAcceptedAlgorithms = " + asList2);
                    }
                    String w2 = session.w("PubkeyAcceptedAlgorithmsOldServer");
                    if (w2 != null) {
                        List<String> asList3 = Arrays.asList(Util.u(w2, ","));
                        if (!asList3.isEmpty()) {
                            asList2 = asList3;
                        }
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : asList2) {
                        int length = B.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                arrayList2.add(str);
                                break;
                            }
                            if (str.equals(B[i])) {
                                arrayList.add(str);
                                break;
                            }
                            i++;
                        }
                    }
                    if (!arrayList.isEmpty() && session.A().isEnabled(0)) {
                        session.A().a(0, "PubkeyAcceptedAlgorithms in server-sig-algs = " + arrayList);
                    }
                    if (!arrayList2.isEmpty() && session.A().isEnabled(0)) {
                        session.A().a(0, "PubkeyAcceptedAlgorithms not in server-sig-algs = " + arrayList2);
                    }
                    if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                        if (b(session, a, arrayList, asList)) {
                            return true;
                        }
                        return b(session, a, arrayList2, asList);
                    }
                }
                return b(session, a, asList2, asList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
