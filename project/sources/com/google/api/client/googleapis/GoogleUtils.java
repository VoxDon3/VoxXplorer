package com.google.api.client.googleapis;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class GoogleUtils {
    public static final String a;
    public static final Integer b;
    public static final Integer c;
    public static final Integer d;
    static final Pattern e;

    static {
        String a2 = a();
        a = a2;
        Pattern compile = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)(-SNAPSHOT)?");
        e = compile;
        Matcher matcher = compile.matcher(a2);
        matcher.find();
        b = Integer.valueOf(Integer.parseInt(matcher.group(1)));
        c = Integer.valueOf(Integer.parseInt(matcher.group(2)));
        d = Integer.valueOf(Integer.parseInt(matcher.group(3)));
    }

    private GoogleUtils() {
    }

    private static String a() {
        String str = null;
        try {
            InputStream resourceAsStream = GoogleUtils.class.getResourceAsStream("google-api-client.properties");
            if (resourceAsStream != null) {
                try {
                    Properties properties = new Properties();
                    properties.load(resourceAsStream);
                    str = properties.getProperty("google-api-client.version");
                } finally {
                }
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException unused) {
        }
        return str == null ? "unknown-version" : str;
    }
}
