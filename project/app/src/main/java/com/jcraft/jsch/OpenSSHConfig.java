/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import ax.d1.h;
import ax.y9.d;
import com.jcraft.jsch.ConfigRepository;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Util;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Vector;
import java.util.function.Function;

public class OpenSSHConfig
implements ConfigRepository {
    private static final Set<String> e = (Set)j.Stream._CC.of((Object[])new String[]{"KexAlgorithms", "Ciphers", "HostKeyAlgorithms", "MACs", "PubkeyAcceptedAlgorithms", "PubkeyAcceptedKeyTypes"}).map((Function)new d()).collect(j.Collectors.toSet());
    private static final Hashtable<String, String> f;
    private final Hashtable<String, Vector<String[]>> c;
    private final Vector<String> d;

    static {
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        f = hashtable;
        hashtable.put("kex", "KexAlgorithms");
        hashtable.put("server_host_key", "HostKeyAlgorithms");
        hashtable.put("cipher.c2s", "Ciphers");
        hashtable.put("cipher.s2c", "Ciphers");
        hashtable.put("mac.c2s", "Macs");
        hashtable.put("mac.s2c", "Macs");
        hashtable.put("compression.s2c", "Compression");
        hashtable.put("compression.c2s", "Compression");
        hashtable.put("compression_level", "CompressionLevel");
        hashtable.put("MaxAuthTries", "NumberOfPasswordPrompts");
    }

    public static /* synthetic */ String b(String string) {
        return string.toUpperCase(Locale.ROOT);
    }

    @Override
    public ConfigRepository.Config a(String string) {
        return new MyConfig(this, string);
    }

    class MyConfig
    implements ConfigRepository.Config {
        private String a;
        private Vector<Vector<String[]>> b;
        final OpenSSHConfig c;

        MyConfig(OpenSSHConfig openSSHConfig, String string) {
            this.c = openSSHConfig;
            Object object = new Vector<Vector>();
            this.b = object;
            this.a = string;
            ((Vector)object).addElement((Vector)openSSHConfig.c.get(""));
            object = Util.v(string);
            if (openSSHConfig.d.size() > 1) {
                for (int i8 = 1; i8 < openSSHConfig.d.size(); ++i8) {
                    String[] stringArray = ((String)openSSHConfig.d.elementAt(i8)).split("[ \t]");
                    for (int i9 = 0; i9 < stringArray.length; ++i9) {
                        boolean bl;
                        string = stringArray[i9].trim();
                        if (string.startsWith("!")) {
                            string = string.substring(1).trim();
                            bl = true;
                        } else {
                            bl = false;
                        }
                        if (Util.r(Util.v(string), (byte[])object)) {
                            if (bl) continue;
                            this.b.addElement((Vector)openSSHConfig.c.get(openSSHConfig.d.elementAt(i8)));
                            continue;
                        }
                        if (!bl) continue;
                        this.b.addElement((Vector)openSSHConfig.c.get(openSSHConfig.d.elementAt(i8)));
                    }
                }
            }
        }

        private String e(String object) {
            int n8;
            Object object2;
            Object object3 = f.get(object) != null ? (String)f.get(object) : object;
            String string = ((String)object3).toUpperCase(Locale.ROOT);
            int n9 = 0;
            object3 = null;
            int n10 = 0;
            while (true) {
                object2 = object3;
                if (n10 >= this.b.size()) break;
                Vector<String[]> vector = this.b.elementAt(n10);
                n8 = 0;
                while (true) {
                    object2 = object3;
                    if (n8 >= vector.size()) break;
                    object2 = vector.elementAt(n8);
                    if (object2[0].toUpperCase(Locale.ROOT).equals(string)) {
                        object2 = object2[1];
                        break;
                    }
                    ++n8;
                }
                if (object2 != null) break;
                ++n10;
                object3 = object2;
            }
            if (e.contains(string) && object2 != null && (((String)object2).startsWith("+") || ((String)object2).startsWith("-") || ((String)object2).startsWith("^"))) {
                object = JSch.f((String)object).trim();
                if (((String)object2).startsWith("+")) {
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append((String)object);
                    ((StringBuilder)object3).append(",");
                    ((StringBuilder)object3).append(((String)object2).substring(1).trim());
                    return ((StringBuilder)object3).toString();
                }
                if (((String)object2).startsWith("-")) {
                    object = (List)java.util.DesugarArrays.stream((Object[])Util.u((String)object, ",")).collect(j.Collectors.toList());
                    object3 = Util.u(((String)object2).substring(1).trim(), ",");
                    n8 = ((Object)object3).length;
                    for (n10 = n9; n10 < n8; ++n10) {
                        object.remove(((String)object3[n10]).trim());
                    }
                    return h.a(",", (Iterable)object);
                }
                if (((String)object2).startsWith("^")) {
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append(((String)object2).substring(1).trim());
                    ((StringBuilder)object3).append(",");
                    ((StringBuilder)object3).append((String)object);
                    return ((StringBuilder)object3).toString();
                }
            }
            return object2;
        }

        private String[] f(String object) {
            String[] stringArray = ((String)object).toUpperCase(Locale.ROOT);
            object = new Vector();
            for (int i8 = 0; i8 < this.b.size(); ++i8) {
                Vector<String[]> vector = this.b.elementAt(i8);
                for (int i9 = 0; i9 < vector.size(); ++i9) {
                    Object object2 = vector.elementAt(i9);
                    if (!object2[0].toUpperCase(Locale.ROOT).equals(stringArray) || (object2 = object2[1]) == null) continue;
                    ((Vector)object).remove(object2);
                    ((Vector)object).addElement(object2);
                }
            }
            stringArray = new String[((Vector)object).size()];
            ((Vector)object).toArray(stringArray);
            return stringArray;
        }

        @Override
        public int a() {
            String string = this.e("Port");
            try {
                int n8 = Integer.parseInt(string);
                return n8;
            }
            catch (NumberFormatException numberFormatException) {
                return -1;
            }
        }

        @Override
        public String[] b(String string) {
            return this.f(string);
        }

        @Override
        public String c() {
            return this.e("User");
        }

        @Override
        public String d() {
            return this.e("Hostname");
        }

        @Override
        public String getValue(String string) {
            if (!string.equals("compression.s2c") && !string.equals("compression.c2s")) {
                return this.e(string);
            }
            if ((string = this.e(string)) != null && !string.equals("no")) {
                return "zlib@openssh.com,zlib,none";
            }
            return "none,zlib@openssh.com,zlib";
        }
    }
}

