/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

public interface ConfigRepository {
    public static final Config a = new Config(){

        @Override
        public int a() {
            return -1;
        }

        @Override
        public String[] b(String string) {
            return null;
        }

        @Override
        public String c() {
            return null;
        }

        @Override
        public String d() {
            return null;
        }

        @Override
        public String getValue(String string) {
            return null;
        }
    };
    public static final ConfigRepository b = new ConfigRepository(){

        @Override
        public Config a(String string) {
            return a;
        }
    };

    public Config a(String var1);

    public static interface Config {
        public int a();

        public String[] b(String var1);

        public String c();

        public String d();

        public String getValue(String var1);
    }
}

