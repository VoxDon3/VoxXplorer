/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import ax.y9.c;
import com.jcraft.jsch.ConfigRepository;
import com.jcraft.jsch.HostKeyRepository;
import com.jcraft.jsch.Identity;
import com.jcraft.jsch.IdentityFile;
import com.jcraft.jsch.IdentityRepository;
import com.jcraft.jsch.IdentityRepositoryWrapper;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.JavaVersion;
import com.jcraft.jsch.KnownHosts;
import com.jcraft.jsch.LocalIdentityRepository;
import com.jcraft.jsch.Logger;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.Util;
import com.jcraft.jsch.Version;
import java.util.Hashtable;
import java.util.Vector;

public class JSch {
    public static final String g = Version.a();
    static Hashtable<String, String> h;
    static final Logger i;
    static Logger j;
    final InstanceLogger a;
    private Vector<Session> b;
    private IdentityRepository c;
    private IdentityRepository d;
    private ConfigRepository e;
    private HostKeyRepository f;

    static {
        Object object = new Hashtable<String, String>();
        h = object;
        ((Hashtable)object).put("kex", Util.p("jsch.kex", "curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group-exchange-sha256,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256"));
        h.put("server_host_key", Util.p("jsch.server_host_key", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256"));
        h.put("prefer_known_host_key_types", Util.p("jsch.prefer_known_host_key_types", "yes"));
        h.put("enable_strict_kex", Util.p("jsch.enable_strict_kex", "yes"));
        h.put("require_strict_kex", Util.p("jsch.require_strict_kex", "no"));
        h.put("enable_server_sig_algs", Util.p("jsch.enable_server_sig_algs", "yes"));
        h.put("enable_ext_info_in_auth", Util.p("jsch.enable_ext_info_in_auth", "yes"));
        h.put("cipher.s2c", Util.p("jsch.cipher", "aes128-ctr,aes192-ctr,aes256-ctr,aes128-gcm@openssh.com,aes256-gcm@openssh.com"));
        h.put("cipher.c2s", Util.p("jsch.cipher", "aes128-ctr,aes192-ctr,aes256-ctr,aes128-gcm@openssh.com,aes256-gcm@openssh.com"));
        h.put("mac.s2c", Util.p("jsch.mac", "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1"));
        h.put("mac.c2s", Util.p("jsch.mac", "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1"));
        h.put("compression.s2c", Util.p("jsch.compression", "none"));
        h.put("compression.c2s", Util.p("jsch.compression", "none"));
        h.put("lang.s2c", Util.p("jsch.lang", ""));
        h.put("lang.c2s", Util.p("jsch.lang", ""));
        h.put("dhgex_min", Util.p("jsch.dhgex_min", "2048"));
        h.put("dhgex_max", Util.p("jsch.dhgex_max", "8192"));
        h.put("dhgex_preferred", Util.p("jsch.dhgex_preferred", "3072"));
        h.put("compression_level", Util.p("jsch.compression_level", "6"));
        h.put("diffie-hellman-group-exchange-sha1", "com.jcraft.jsch.DHGEX1");
        h.put("diffie-hellman-group1-sha1", "com.jcraft.jsch.DHG1");
        h.put("diffie-hellman-group14-sha1", "com.jcraft.jsch.DHG14");
        h.put("diffie-hellman-group-exchange-sha256", "com.jcraft.jsch.DHGEX256");
        h.put("diffie-hellman-group14-sha256", "com.jcraft.jsch.DHG14256");
        h.put("diffie-hellman-group15-sha512", "com.jcraft.jsch.DHG15");
        h.put("diffie-hellman-group16-sha512", "com.jcraft.jsch.DHG16");
        h.put("diffie-hellman-group17-sha512", "com.jcraft.jsch.DHG17");
        h.put("diffie-hellman-group18-sha512", "com.jcraft.jsch.DHG18");
        h.put("diffie-hellman-group14-sha256@ssh.com", "com.jcraft.jsch.DHG14256");
        h.put("diffie-hellman-group14-sha224@ssh.com", "com.jcraft.jsch.DHG14224");
        h.put("diffie-hellman-group15-sha256@ssh.com", "com.jcraft.jsch.DHG15256");
        h.put("diffie-hellman-group15-sha384@ssh.com", "com.jcraft.jsch.DHG15384");
        h.put("diffie-hellman-group16-sha512@ssh.com", "com.jcraft.jsch.DHG16");
        h.put("diffie-hellman-group16-sha384@ssh.com", "com.jcraft.jsch.DHG16384");
        h.put("diffie-hellman-group18-sha512@ssh.com", "com.jcraft.jsch.DHG18");
        h.put("ecdsa-sha2-nistp256", "com.jcraft.jsch.jce.SignatureECDSA256");
        h.put("ecdsa-sha2-nistp384", "com.jcraft.jsch.jce.SignatureECDSA384");
        h.put("ecdsa-sha2-nistp521", "com.jcraft.jsch.jce.SignatureECDSA521");
        h.put("ecdh-sha2-nistp256", "com.jcraft.jsch.DHEC256");
        h.put("ecdh-sha2-nistp384", "com.jcraft.jsch.DHEC384");
        h.put("ecdh-sha2-nistp521", "com.jcraft.jsch.DHEC521");
        h.put("ecdh-sha2-nistp", "com.jcraft.jsch.jce.ECDHN");
        h.put("curve25519-sha256", "com.jcraft.jsch.DH25519");
        h.put("curve25519-sha256@libssh.org", "com.jcraft.jsch.DH25519");
        h.put("curve448-sha512", "com.jcraft.jsch.DH448");
        h.put("dh", "com.jcraft.jsch.jce.DH");
        h.put("3des-cbc", "com.jcraft.jsch.jce.TripleDESCBC");
        h.put("hmac-sha1", "com.jcraft.jsch.jce.HMACSHA1");
        h.put("hmac-sha1-96", "com.jcraft.jsch.jce.HMACSHA196");
        h.put("hmac-sha2-256", "com.jcraft.jsch.jce.HMACSHA256");
        h.put("hmac-sha2-512", "com.jcraft.jsch.jce.HMACSHA512");
        h.put("hmac-md5", "com.jcraft.jsch.jce.HMACMD5");
        h.put("hmac-md5-96", "com.jcraft.jsch.jce.HMACMD596");
        h.put("hmac-sha1-etm@openssh.com", "com.jcraft.jsch.jce.HMACSHA1ETM");
        h.put("hmac-sha1-96-etm@openssh.com", "com.jcraft.jsch.jce.HMACSHA196ETM");
        h.put("hmac-sha2-256-etm@openssh.com", "com.jcraft.jsch.jce.HMACSHA256ETM");
        h.put("hmac-sha2-512-etm@openssh.com", "com.jcraft.jsch.jce.HMACSHA512ETM");
        h.put("hmac-md5-etm@openssh.com", "com.jcraft.jsch.jce.HMACMD5ETM");
        h.put("hmac-md5-96-etm@openssh.com", "com.jcraft.jsch.jce.HMACMD596ETM");
        h.put("sha-1", "com.jcraft.jsch.jce.SHA1");
        h.put("sha-224", "com.jcraft.jsch.jce.SHA224");
        h.put("sha-256", "com.jcraft.jsch.jce.SHA256");
        h.put("sha-384", "com.jcraft.jsch.jce.SHA384");
        h.put("sha-512", "com.jcraft.jsch.jce.SHA512");
        h.put("md5", "com.jcraft.jsch.jce.MD5");
        h.put("sha1", "com.jcraft.jsch.jce.SHA1");
        h.put("sha224", "com.jcraft.jsch.jce.SHA224");
        h.put("sha256", "com.jcraft.jsch.jce.SHA256");
        h.put("sha384", "com.jcraft.jsch.jce.SHA384");
        h.put("sha512", "com.jcraft.jsch.jce.SHA512");
        h.put("signature.dss", "com.jcraft.jsch.jce.SignatureDSA");
        h.put("ssh-rsa", "com.jcraft.jsch.jce.SignatureRSA");
        h.put("rsa-sha2-256", "com.jcraft.jsch.jce.SignatureRSASHA256");
        h.put("rsa-sha2-512", "com.jcraft.jsch.jce.SignatureRSASHA512");
        h.put("keypairgen.dsa", "com.jcraft.jsch.jce.KeyPairGenDSA");
        h.put("keypairgen.rsa", "com.jcraft.jsch.jce.KeyPairGenRSA");
        h.put("keypairgen.ecdsa", "com.jcraft.jsch.jce.KeyPairGenECDSA");
        h.put("random", "com.jcraft.jsch.jce.Random");
        h.put("none", "com.jcraft.jsch.CipherNone");
        h.put("aes128-gcm@openssh.com", "com.jcraft.jsch.jce.AES128GCM");
        h.put("aes256-gcm@openssh.com", "com.jcraft.jsch.jce.AES256GCM");
        h.put("aes128-cbc", "com.jcraft.jsch.jce.AES128CBC");
        h.put("aes192-cbc", "com.jcraft.jsch.jce.AES192CBC");
        h.put("aes256-cbc", "com.jcraft.jsch.jce.AES256CBC");
        h.put("rijndael-cbc@lysator.liu.se", "com.jcraft.jsch.jce.AES256CBC");
        h.put("chacha20-poly1305@openssh.com", "com.jcraft.jsch.bc.ChaCha20Poly1305");
        h.put("aes128-ctr", "com.jcraft.jsch.jce.AES128CTR");
        h.put("aes192-ctr", "com.jcraft.jsch.jce.AES192CTR");
        h.put("aes256-ctr", "com.jcraft.jsch.jce.AES256CTR");
        h.put("3des-ctr", "com.jcraft.jsch.jce.TripleDESCTR");
        h.put("userauth.none", "com.jcraft.jsch.UserAuthNone");
        h.put("userauth.password", "com.jcraft.jsch.UserAuthPassword");
        h.put("userauth.keyboard-interactive", "com.jcraft.jsch.UserAuthKeyboardInteractive");
        h.put("userauth.publickey", "com.jcraft.jsch.UserAuthPublicKey");
        h.put("userauth.gssapi-with-mic", "com.jcraft.jsch.UserAuthGSSAPIWithMIC");
        h.put("gssapi-with-mic.krb5", "com.jcraft.jsch.jgss.GSSContextKrb5");
        h.put("zlib", "com.jcraft.jsch.jzlib.Compression");
        h.put("zlib@openssh.com", "com.jcraft.jsch.jzlib.Compression");
        h.put("pbkdf", "com.jcraft.jsch.jce.PBKDF");
        h.put("pbkdf2-hmac-sha1", "com.jcraft.jsch.jce.PBKDF2HMACSHA1");
        h.put("pbkdf2-hmac-sha224", "com.jcraft.jsch.jce.PBKDF2HMACSHA224");
        h.put("pbkdf2-hmac-sha256", "com.jcraft.jsch.jce.PBKDF2HMACSHA256");
        h.put("pbkdf2-hmac-sha384", "com.jcraft.jsch.jce.PBKDF2HMACSHA384");
        h.put("pbkdf2-hmac-sha512", "com.jcraft.jsch.jce.PBKDF2HMACSHA512");
        h.put("bcrypt", "com.jcraft.jsch.jbcrypt.JBCrypt");
        h.put("argon2", "com.jcraft.jsch.bc.Argon2");
        h.put("scrypt", "com.jcraft.jsch.bc.SCrypt");
        if (JavaVersion.a() >= 11) {
            h.put("xdh", "com.jcraft.jsch.jce.XDH");
        } else {
            h.put("xdh", "com.jcraft.jsch.bc.XDH");
        }
        if (JavaVersion.a() >= 15) {
            h.put("keypairgen.eddsa", "com.jcraft.jsch.jce.KeyPairGenEdDSA");
            h.put("ssh-ed25519", "com.jcraft.jsch.jce.SignatureEd25519");
            h.put("ssh-ed448", "com.jcraft.jsch.jce.SignatureEd448");
        } else {
            h.put("keypairgen.eddsa", "com.jcraft.jsch.bc.KeyPairGenEdDSA");
            h.put("ssh-ed25519", "com.jcraft.jsch.bc.SignatureEd25519");
            h.put("ssh-ed448", "com.jcraft.jsch.bc.SignatureEd448");
        }
        h.put("keypairgen_fromprivate.eddsa", "com.jcraft.jsch.bc.KeyPairGenEdDSA");
        h.put("StrictHostKeyChecking", "ask");
        h.put("HashKnownHosts", "no");
        h.put("PreferredAuthentications", Util.p("jsch.preferred_authentications", "gssapi-with-mic,publickey,keyboard-interactive,password"));
        h.put("PubkeyAcceptedAlgorithms", Util.p("jsch.client_pubkey", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256"));
        h.put("PubkeyAcceptedAlgorithmsOldServer", Util.p("jsch.client_pubkey", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,ssh-rsa,rsa-sha2-256,rsa-sha2-512,ssh-dss"));
        h.put("enable_pubkey_auth_query", Util.p("jsch.enable_pubkey_auth_query", "yes"));
        h.put("try_additional_pubkey_algorithms", Util.p("jsch.try_additional_pubkey_algorithms", "yes"));
        h.put("enable_auth_none", Util.p("jsch.enable_auth_none", "yes"));
        h.put("use_sftp_write_flush_workaround", Util.p("jsch.use_sftp_write_flush_workaround", "yes"));
        h.put("CheckCiphers", Util.p("jsch.check_ciphers", "chacha20-poly1305@openssh.com"));
        h.put("CheckMacs", Util.p("jsch.check_macs", ""));
        h.put("CheckKexes", Util.p("jsch.check_kexes", "sntrup761x25519-sha512@openssh.com,curve25519-sha256,curve25519-sha256@libssh.org,curve448-sha512"));
        h.put("CheckSignatures", Util.p("jsch.check_signatures", "ssh-ed25519,ssh-ed448"));
        h.put("FingerprintHash", Util.p("jsch.fingerprint_hash", "sha256"));
        h.put("MaxAuthTries", Util.p("jsch.max_auth_tries", "6"));
        h.put("ClearAllForwardings", "no");
        i = object = new Logger(){

            @Override
            public void a(int n8, String string) {
            }

            @Override
            public /* synthetic */ void b(int n8, String string, Throwable throwable) {
                ax.y9.c.a(this, n8, string, throwable);
            }

            @Override
            public boolean isEnabled(int n8) {
                return false;
            }
        };
        j = object;
    }

    public JSch() {
        Object object = new InstanceLogger();
        this.a = object;
        this.b = new Vector();
        this.c = object = new LocalIdentityRepository((InstanceLogger)object);
        this.d = object;
        this.e = null;
        this.f = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String f(String string) {
        Hashtable<String, String> hashtable = h;
        synchronized (hashtable) {
            String string2 = string;
            try {
                if (!string.equals("PubkeyAcceptedKeyTypes")) return h.get(string2);
                string2 = "PubkeyAcceptedAlgorithms";
                return h.get(string2);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static Logger k() {
        return j;
    }

    public static void n(String string, String string2) {
        if (string.equals("PubkeyAcceptedKeyTypes")) {
            h.put("PubkeyAcceptedAlgorithms", string2);
            return;
        }
        h.put(string, string2);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Identity identity, byte[] object) throws JSchException {
        Object object2;
        block11: {
            RuntimeException var1_4;
            block12: {
                if (object == null) break block11;
                object2 = new byte[((byte[])object).length];
                System.arraycopy(object, 0, object2, 0, ((byte[])object).length);
                try {
                    identity.e((byte[])object2);
                }
                catch (Throwable throwable) {
                    object = object2;
                }
                Util.g(object2);
                break block11;
                break block12;
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            Util.g(object);
            throw var1_4;
        }
        if ((object = (Object)this.d) instanceof LocalIdentityRepository) {
            ((LocalIdentityRepository)object).e(identity);
            return;
        }
        if (identity instanceof IdentityFile && !identity.c()) {
            this.d.b(((IdentityFile)identity).g().g());
            return;
        }
        synchronized (this) {
            try {
                object2 = this.d;
                if (!(object2 instanceof IdentityRepositoryWrapper)) {
                    object = new IdentityRepositoryWrapper;
                    object((IdentityRepository)object2);
                    this.p((IdentityRepository)object);
                }
                // MONITOREXIT @DISABLED, blocks:[2, 4] lbl32 : MonitorExitStatement: MONITOREXIT : this
                ((IdentityRepositoryWrapper)this.d).e(identity);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void b(String string) throws JSchException {
        this.c(string, null);
    }

    public void c(String string, byte[] byArray) throws JSchException {
        this.a(IdentityFile.h(string, null, this.a), byArray);
    }

    public void d(String string, byte[] byArray, byte[] byArray2, byte[] byArray3) throws JSchException {
        this.a(IdentityFile.i(string, byArray, byArray2, this.a), byArray3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void e(Session session) {
        Vector<Session> vector = this.b;
        synchronized (vector) {
            this.b.addElement(session);
            return;
        }
    }

    public ConfigRepository g() {
        return this.e;
    }

    public HostKeyRepository h() {
        if (this.f == null) {
            this.f = new KnownHosts(this);
        }
        return this.f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public IdentityRepository i() {
        synchronized (this) {
            return this.d;
        }
    }

    public Logger j() {
        return this.a.a();
    }

    public Session l(String string, String string2, int n8) throws JSchException {
        if (string2 != null) {
            return new Session(this, string, string2, n8);
        }
        throw new JSchException("host must not be null.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected boolean m(Session session) {
        Vector<Session> vector = this.b;
        synchronized (vector) {
            return this.b.remove(session);
        }
    }

    public void o(HostKeyRepository hostKeyRepository) {
        this.f = hostKeyRepository;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void p(IdentityRepository identityRepository) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    if (identityRepository == null) {
                        try {
                            this.d = this.c;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.d = identityRepository;
                }
                return;
            }
            throw throwable2;
        }
    }

    static class InstanceLogger {
        private Logger a;

        private InstanceLogger() {
        }

        Logger a() {
            Logger logger;
            Logger logger2 = logger = this.a;
            if (logger == null) {
                logger2 = j;
            }
            return logger2;
        }
    }
}

