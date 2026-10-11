/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.AgentIdentity;
import com.jcraft.jsch.Identity;
import com.jcraft.jsch.IdentityRepositoryWrapper;
import com.jcraft.jsch.JSchAuthCancelException;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.JSchPartialAuthException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserAuth;
import com.jcraft.jsch.UserInfo;
import com.jcraft.jsch.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

class UserAuthPublicKey
extends UserAuth {
    UserAuthPublicKey() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean b(Session var1_1, List<Identity> var2_2, List<String> var3_3, List<String> var4_4) throws Exception {
        var13_5 = var4_4;
        if (var1_1.f0 >= var1_1.e0) {
            return false;
        }
        var10_6 = var1_1.w("enable_pubkey_auth_query").equals("yes");
        var9_7 = var1_1.w("try_additional_pubkey_algorithms").equals("yes");
        var16_8 = new ArrayList<String>();
        var15_9 = new ArrayList<ArrayList<String>>();
        var11_10 = var3_3.iterator();
        while (var11_10.hasNext()) {
            var3_3 = var11_10.next();
            if (!(var3_3.equals("ssh-rsa") || var3_3.equals("rsa-sha2-256") || var3_3.equals("rsa-sha2-512") || var3_3.equals("ssh-rsa-sha224@ssh.com") || var3_3.equals("ssh-rsa-sha256@ssh.com") || var3_3.equals("ssh-rsa-sha384@ssh.com") || var3_3.equals("ssh-rsa-sha512@ssh.com"))) {
                var15_9.add(var3_3);
                continue;
            }
            var16_8.add(var3_3);
        }
        var14_11 = Util.v(this.d);
        var19_12 = var2_2.iterator();
        block1: while (var19_12.hasNext()) {
            block39: {
                block40: {
                    var20_20 = var19_12.next();
                    if (var1_1.f0 >= var1_1.e0) {
                        return false;
                    }
                    this.c((Session)var1_1, var20_20);
                    var17_18 = var20_20.b();
                    if (var17_18.equals("ssh-rsa")) {
                        var12_17 = new ArrayList<String>((Collection<String>)var16_8);
                    } else if (var15_9.contains(var17_18)) {
                        var12_17 = new ArrayList<E>(1);
                        var12_17.add(var17_18);
                    } else {
                        var12_17 = null;
                    }
                    if (var12_17 == null) break block39;
                    var7_15 = var10_6;
                    var8_16 = var9_7;
                    var3_3 = var16_8;
                    var11_10 = var15_9;
                    var2_2 = var14_11;
                    if (!var12_17.isEmpty()) break block40;
                    break block39;
                }
                while (!var12_17.isEmpty() && var1_1.f0 < var1_1.e0) {
                    block42: {
                        block41: {
                            var18_19 /* !! */  = var20_20.d();
                            if (var18_19 /* !! */  != null && var7_15) {
                                var16_8 = var12_17.iterator();
                                var5_13 = 51;
                                var14_11 = var3_3;
                                while (var16_8.hasNext()) {
                                    block38: {
                                        var15_9 = (String)var16_8.next();
                                        var16_8.remove();
                                        if (var13_5.contains(var15_9) && !(var20_20 instanceof AgentIdentity)) {
                                            if (!var1_1.A().isEnabled(0)) continue;
                                            var17_18 = var1_1.A();
                                            var3_3 = new StringBuilder();
                                            var3_3.append((String)var15_9);
                                            var3_3.append(" not available for identity ");
                                            var3_3.append(var20_20.getName());
                                            var17_18.a(0, var3_3.toString());
                                            continue;
                                        }
                                        this.b.c();
                                        this.c.s((byte)50);
                                        this.c.y((byte[])var2_2);
                                        this.c.y(Util.v("ssh-connection"));
                                        this.c.y(Util.v("publickey"));
                                        this.c.s((byte)0);
                                        this.c.y(Util.v((String)var15_9));
                                        this.c.y(var18_19 /* !! */ );
                                        var1_1.m0(this.b);
                                        var3_3 = var11_10;
                                        var11_10 = var14_11;
                                        while (true) {
                                            this.c = var14_11 = var1_1.M(this.c);
                                            var5_13 = var14_11.h() & 255;
                                            if (var5_13 == 60) {
                                                var14_11 = var1_1.A();
                                                if (var14_11.isEnabled(0)) {
                                                    var14_11 = var1_1.A();
                                                    var16_8 = new StringBuilder();
                                                    var16_8.append((String)var15_9);
                                                    var16_8.append(" preauth success");
                                                    var14_11.a(0, var16_8.toString());
                                                }
                                                var16_8 = new ArrayList<E>(1);
                                                var16_8.add(var15_9);
                                                var15_9 = var3_3;
                                                var14_11 = var11_10;
lbl94:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            if (var5_13 == 51) {
                                                if (var1_1.A().isEnabled(0)) {
                                                    var14_11 = var1_1.A();
                                                    var17_18 = new StringBuilder();
                                                    var17_18.append((String)var15_9);
                                                    var17_18.append(" preauth failure");
                                                    var14_11.a(0, var17_18.toString());
                                                }
                                                break block38;
                                            }
                                            if (var5_13 != 53) break;
                                            this.c.i();
                                            this.c.c();
                                            this.c.c();
                                            var14_11 = this.c.p();
                                            this.c.p();
                                            var17_18 = Util.c((byte[])var14_11);
                                            var14_11 = this.a;
                                            if (var14_11 == null) continue;
                                            var14_11.d((String)var17_18);
                                        }
                                        if (var1_1.A().isEnabled(0)) {
                                            var14_11 = var1_1.A();
                                            var17_18 = new StringBuilder();
                                            var17_18.append((String)var15_9);
                                            var17_18.append(" preauth failure command (");
                                            var17_18.append(var5_13);
                                            var17_18.append(")");
                                            var14_11.a(0, var17_18.toString());
                                        }
                                    }
                                    var14_11 = var11_10;
                                    var11_10 = var3_3;
                                }
                                var16_8 = null;
                                var15_9 = var11_10;
                                ** continue;
                                var9_7 = var8_16;
                                var10_6 = var7_15;
                                var8_16 = var10_6;
                                var7_15 = var9_7;
                                var11_10 = var14_11;
                                var3_3 = var15_9;
                                if (var5_13 != 60) {
                                    var3_3 = var15_9;
                                    var12_17 = var14_11;
                                    var7_15 = var9_7;
                                    var8_16 = var10_6;
lbl151:
                                    // 4 sources

                                    while (true) {
                                        var11_10 = var3_3;
                                        var14_11 = var2_2;
                                        var10_6 = var8_16;
                                        var3_3 = var13_5;
lbl156:
                                        // 2 sources

                                        while (true) {
                                            var13_5 = var3_3;
                                            var9_7 = var7_15;
                                            var16_8 = var12_17;
                                            var15_9 = var11_10;
                                            continue block1;
                                            break;
                                        }
                                        break;
                                    }
                                }
                            } else {
                                var9_7 = var7_15;
                                var7_15 = var8_16;
                                var14_11 = var3_3;
                                var3_3 = var11_10;
                                var16_8 = null;
                                var11_10 = var14_11;
                                var8_16 = var9_7;
                            }
                            if (!var20_20.c()) break block41;
                            var12_17 = var11_10;
                            ** GOTO lbl151
                        }
                        var17_18 = var18_19 /* !! */ ;
                        if (var18_19 /* !! */  == null) {
                            var17_18 = var20_20.d();
                        }
                        if (var17_18 != null) break block42;
                        var12_17 = var11_10;
                        ** GOTO lbl151
                    }
                    var14_11 = var16_8;
                    if (var16_8 == null) {
                        var14_11 = var12_17;
                    }
                    if (var14_11.isEmpty()) {
                        var12_17 = var11_10;
                        ** continue;
                    }
                    var16_8 = var14_11.iterator();
                    block8: while (var16_8.hasNext() && var1_1.f0 < var1_1.e0) {
                        block43: {
                            block44: {
                                var14_11 = (String)var16_8.next();
                                var16_8.remove();
                                if (var13_5.contains(var14_11) && !(var20_20 instanceof AgentIdentity)) {
                                    if (!var1_1.A().isEnabled(0)) continue;
                                    var18_19 /* !! */  = (byte[])var1_1.A();
                                    var15_9 = new StringBuilder();
                                    var15_9.append((String)var14_11);
                                    var15_9.append(" not available for identity ");
                                    var15_9.append(var20_20.getName());
                                    var18_19 /* !! */ .a(0, var15_9.toString());
                                    continue;
                                }
                                this.b.c();
                                this.c.s((byte)50);
                                this.c.y((byte[])var2_2);
                                this.c.y(Util.v("ssh-connection"));
                                this.c.y(Util.v("publickey"));
                                this.c.s((byte)1);
                                this.c.y(Util.v((String)var14_11));
                                this.c.y((byte[])var17_18);
                                var18_19 /* !! */  = var1_1.C();
                                var6_14 = var18_19 /* !! */ .length;
                                var5_13 = var6_14 + 4;
                                var13_5 = new byte[this.c.c + var5_13 - 5];
                                var13_5[0] = (byte)(var6_14 >>> 24);
                                var13_5[1] = (byte)(var6_14 >>> 16);
                                var13_5[2] = (byte)(var6_14 >>> 8);
                                var13_5[3] = (byte)var6_14;
                                var15_9 = var2_2;
                                System.arraycopy(var18_19 /* !! */ , 0, var13_5, 4, var6_14);
                                var2_2 = this.c;
                                System.arraycopy(var2_2.b, 5, var13_5, var5_13, var2_2.c - 5);
                                var2_2 = var20_20.a((byte[])var13_5, (String)var14_11);
                                if (var2_2 == null) {
                                    if (var1_1.A().isEnabled(0)) {
                                        var13_5 = var1_1.A();
                                        var2_2 = new StringBuilder();
                                        var2_2.append((String)var14_11);
                                        var2_2.append(" signature failure");
                                        var13_5.a(0, var2_2.toString());
                                    }
lbl233:
                                    // 6 sources

                                    while (true) {
                                        var13_5 = var4_4;
                                        var2_2 = var15_9;
                                        continue block8;
                                        break;
                                    }
                                }
                                this.c.y((byte[])var2_2);
                                var1_1.m0(this.b);
                                while (true) {
                                    this.c = var2_2 = var1_1.M(this.c);
                                    var5_13 = var2_2.h() & 255;
                                    if (var5_13 == 52) {
                                        if (var1_1.A().isEnabled(0)) {
                                            var2_2 = var1_1.A();
                                            var1_1 = new StringBuilder();
                                            var1_1.append((String)var14_11);
                                            var1_1.append(" auth success");
                                            var2_2.a(0, var1_1.toString());
                                        }
                                        return true;
                                    }
                                    if (var5_13 != 53) break;
                                    this.c.i();
                                    this.c.c();
                                    this.c.c();
                                    var2_2 = this.c.p();
                                    this.c.p();
                                    var2_2 = Util.c((byte[])var2_2);
                                    var13_5 = this.a;
                                    if (var13_5 == null) continue;
                                    var13_5.d((String)var2_2);
                                }
                                if (var5_13 != 51) break block43;
                                this.c.i();
                                this.c.c();
                                this.c.c();
                                var2_2 = this.c.p();
                                if (this.c.c() != 0) break block44;
                                ++var1_1.f0;
                                if (var1_1.A().isEnabled(0)) {
                                    var13_5 = var1_1.A();
                                    var2_2 = new StringBuilder();
                                    var2_2.append((String)var14_11);
                                    var2_2.append(" auth failure");
                                    var13_5.a(0, var2_2.toString());
                                }
                                if (var1_1.f0 >= var1_1.e0) {
                                    return false;
                                }
                                var10_6 = var8_16;
                                var14_11 = var15_9;
                                var9_7 = var7_15;
                                var13_5 = var11_10;
                                var2_2 = var3_3;
                                if (var7_15) ** GOTO lbl233
lbl293:
                                // 4 sources

                                while (true) {
                                    var3_3 = var4_4;
                                    var7_15 = var9_7;
                                    var12_17 = var13_5;
                                    var11_10 = var2_2;
                                    ** continue;
                                    break;
                                }
                            }
                            throw new JSchPartialAuthException(Util.c((byte[])var2_2));
                        }
                        if (!var1_1.A().isEnabled(0)) ** GOTO lbl233
                        var2_2 = var1_1.A();
                        var13_5 = new StringBuilder();
                        var13_5.append((String)var14_11);
                        var13_5.append(" auth failure command (");
                        var13_5.append(var5_13);
                        var13_5.append(")");
                        var2_2.a(0, var13_5.toString());
                        ** continue;
                    }
                    var13_5 = var4_4;
                    var9_7 = var7_15;
                    var14_11 = var11_10;
                    var11_10 = var3_3;
                    var7_15 = var8_16;
                    var8_16 = var9_7;
                    var3_3 = var14_11;
                }
                var10_6 = var7_15;
                var14_11 = var2_2;
                var9_7 = var8_16;
                var13_5 = var3_3;
                var2_2 = var11_10;
                ** GOTO lbl293
            }
            var7_15 = var10_6;
            var8_16 = var9_7;
            var3_3 = var14_11;
            var10_6 = var7_15;
            var14_11 = var3_3;
            var9_7 = var8_16;
            var13_5 = var16_8;
            var2_2 = var15_9;
            if (!var1_1.A().isEnabled(0)) ** GOTO lbl293
            var11_10 = var1_1.A();
            var2_2 = new StringBuilder();
            var2_2.append((String)var17_18);
            var2_2.append(" cannot be used as public key type for identity ");
            var2_2.append(var20_20.getName());
            var11_10.a(0, var2_2.toString());
            var10_6 = var7_15;
            var14_11 = var3_3;
            var9_7 = var8_16;
            var13_5 = var16_8;
            var2_2 = var15_9;
            ** continue;
        }
        return false;
    }

    private void c(Session object, Identity identity) throws JSchException {
        block5: {
            Object var7_7;
            int n8;
            int n9 = 5;
            do {
                Object object2;
                block8: {
                    block6: {
                        block7: {
                            boolean bl = identity.c();
                            var7_7 = null;
                            if (!bl) break block6;
                            if (this.a == null) break block7;
                            if (identity.c()) {
                                UserInfo userInfo = this.a;
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append("Passphrase for ");
                                ((StringBuilder)object2).append(identity.getName());
                                if (!userInfo.a(((StringBuilder)object2).toString())) {
                                    throw new JSchAuthCancelException("publickey");
                                }
                            }
                            if ((object2 = this.a.b()) == null) break block6;
                            object2 = Util.v((String)object2);
                            break block8;
                        }
                        throw new JSchException("USERAUTH fail");
                    }
                    object2 = null;
                }
                if ((!identity.c() || object2 != null) && identity.e((byte[])object2)) {
                    if (object2 != null && ((Session)object).z() instanceof IdentityRepositoryWrapper) {
                        ((IdentityRepositoryWrapper)((Session)object).z()).f();
                    }
                    object = object2;
                    break block5;
                }
                Util.g(object2);
                n9 = n8 = n9 - 1;
            } while (n8 != 0);
            object = var7_7;
        }
        Util.g((byte[])object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean a(Session session) throws Exception {
        super.a(session);
        Vector<Identity> vector = session.z().a();
        synchronized (vector) {
            Throwable throwable2;
            block14: {
                List<Object> list;
                Object object;
                Object object2;
                try {
                    if (vector.size() <= 0) {
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block14;
                }
                Object object3 = session.w("PubkeyAcceptedAlgorithms");
                if (session.A().isEnabled(0)) {
                    object2 = session.A();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("PubkeyAcceptedAlgorithms = ");
                    ((StringBuilder)object).append((String)object3);
                    object2.a(0, ((StringBuilder)object).toString());
                }
                if (!(object2 = (object2 = session.E()) != null && ((String[])object2).length > 0 ? Arrays.asList(object2) : Collections.EMPTY_LIST).isEmpty() && session.A().isEnabled(0)) {
                    object = session.A();
                    list = new List<Object>();
                    ((StringBuilder)((Object)list)).append("Signature algorithms unavailable for non-agent identities = ");
                    ((StringBuilder)((Object)list)).append(object2);
                    object.a(0, ((StringBuilder)((Object)list)).toString());
                }
                if ((object = Arrays.asList(Util.u((String)object3, ","))).isEmpty()) {
                    return false;
                }
                String[] stringArray = session.B();
                if (stringArray != null && stringArray.length > 0) {
                    CharSequence charSequence;
                    ArrayList<String> arrayList = new ArrayList<String>();
                    list = new List<Object>();
                    object3 = object.iterator();
                    block4: while (object3.hasNext()) {
                        charSequence = (String)object3.next();
                        int n8 = stringArray.length;
                        for (int i8 = 0; i8 < n8; ++i8) {
                            if (!((String)charSequence).equals(stringArray[i8])) continue;
                            arrayList.add((String)charSequence);
                            continue block4;
                        }
                        list.add(charSequence);
                    }
                    if (!arrayList.isEmpty() && session.A().isEnabled(0)) {
                        object3 = session.A();
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append("PubkeyAcceptedAlgorithms in server-sig-algs = ");
                        ((StringBuilder)charSequence).append(arrayList);
                        object3.a(0, ((StringBuilder)charSequence).toString());
                    }
                    if (!list.isEmpty() && session.A().isEnabled(0)) {
                        object3 = session.A();
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append("PubkeyAcceptedAlgorithms not in server-sig-algs = ");
                        ((StringBuilder)charSequence).append(list);
                        object3.a(0, ((StringBuilder)charSequence).toString());
                    }
                    object3 = object;
                    if (arrayList.isEmpty()) return this.b(session, (List<Identity>)vector, (List<String>)object3, (List<String>)object2);
                    object3 = object;
                    if (list.isEmpty()) return this.b(session, (List<Identity>)vector, (List<String>)object3, (List<String>)object2);
                    if (!this.b(session, vector, arrayList, (List<String>)object2)) return this.b(session, vector, list, (List<String>)object2);
                    return true;
                }
                if (session.A().isEnabled(0)) {
                    object3 = session.A();
                    list = new List<Object>();
                    ((StringBuilder)((Object)list)).append("No server-sig-algs found, using PubkeyAcceptedAlgorithms = ");
                    ((StringBuilder)((Object)list)).append(object);
                    object3.a(0, ((StringBuilder)((Object)list)).toString());
                }
                list = session.w("PubkeyAcceptedAlgorithmsOldServer");
                object3 = object;
                if (list == null) return this.b(session, (List<Identity>)vector, (List<String>)object3, (List<String>)object2);
                list = Arrays.asList(Util.u(list, ","));
                object3 = object;
                if (list.isEmpty()) return this.b(session, (List<Identity>)vector, (List<String>)object3, (List<String>)object2);
                object3 = list;
                return this.b(session, (List<Identity>)vector, (List<String>)object3, (List<String>)object2);
            }
            throw throwable2;
        }
    }
}

