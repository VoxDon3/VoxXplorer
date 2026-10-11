.class public Lcom/dropbox/core/android/AuthActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/dropbox/core/android/AuthActivity$b;,
        Lcom/dropbox/core/android/AuthActivity$c;
    }
.end annotation


# static fields
.field public static final c:Lcom/dropbox/core/android/AuthActivity$b;

.field private static final d:Ljava/lang/String;

.field private static e:Lcom/dropbox/core/android/AuthActivity$c;

.field private static final f:Ljava/lang/Object;

.field public static g:Landroid/content/Intent;

.field private static h:Lax/r4/a;


# instance fields
.field private a:Z

.field private b:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lcom/dropbox/core/android/AuthActivity$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/dropbox/core/android/AuthActivity$b;-><init>(Lax/Gb/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/dropbox/core/android/AuthActivity;->c:Lcom/dropbox/core/android/AuthActivity$b;

    .line 8
    .line 9
    const-class v0, Lcom/dropbox/core/android/AuthActivity;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/dropbox/core/android/AuthActivity;->d:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Lcom/dropbox/core/android/AuthActivity$a;

    .line 18
    .line 19
    invoke-direct {v0}, Lcom/dropbox/core/android/AuthActivity$a;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lcom/dropbox/core/android/AuthActivity;->e:Lcom/dropbox/core/android/AuthActivity$c;

    .line 23
    .line 24
    new-instance v0, Ljava/lang/Object;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/dropbox/core/android/AuthActivity;->f:Ljava/lang/Object;

    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic a(Lcom/dropbox/core/android/AuthActivity;Landroid/content/Intent;Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lcom/dropbox/core/android/AuthActivity;->i(Lcom/dropbox/core/android/AuthActivity;Landroid/content/Intent;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic b()Lcom/dropbox/core/android/AuthActivity$c;
    .registers 1

    .line 1
    sget-object v0, Lcom/dropbox/core/android/AuthActivity;->e:Lcom/dropbox/core/android/AuthActivity$c;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final synthetic c()Ljava/lang/Object;
    .registers 1

    .line 1
    sget-object v0, Lcom/dropbox/core/android/AuthActivity;->f:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final synthetic d()Ljava/lang/String;
    .registers 1

    .line 1
    sget-object v0, Lcom/dropbox/core/android/AuthActivity;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final synthetic e(Lax/r4/a;)V
    .registers 1

    .line 1
    sput-object p0, Lcom/dropbox/core/android/AuthActivity;->h:Lax/r4/a;

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private final f(Landroid/content/Intent;)V
    .registers 2

    .line 1
    sput-object p1, Lcom/dropbox/core/android/AuthActivity;->g:Landroid/content/Intent;

    .line 2
    .line 3
    sget-object p1, Lax/r4/b;->a:Lax/r4/b$a;

    .line 4
    .line 5
    invoke-virtual {p1}, Lax/r4/b$a;->a()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private final g()Lax/r4/b$b;
    .registers 2

    .line 1
    sget-object v0, Lax/r4/b;->a:Lax/r4/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/r4/b$a;->b()Lax/r4/b$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static final i(Lcom/dropbox/core/android/AuthActivity;Landroid/content/Intent;Ljava/lang/String;)V
    .registers 6

    .line 1
    sget-object v0, Lcom/dropbox/core/android/AuthActivity;->d:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "running startActivity in handler"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    :try_start_7
    sget-object v0, Lcom/dropbox/core/android/b;->a:Lcom/dropbox/core/android/b$a;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "getApplicationContext(...)"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, p1}, Lcom/dropbox/core/android/b$a;->a(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/pm/PackageInfo;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1e

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 26
    .line 27
    .line 28
    goto :goto_21

    .line 29
    :catch_1c
    move-exception p1

    .line 30
    goto :goto_29

    .line 31
    :cond_1e
    invoke-direct {p0, p2}, Lcom/dropbox/core/android/AuthActivity;->j(Ljava/lang/String;)V
    :try_end_21
    .catch Landroid/content/ActivityNotFoundException; {:try_start_7 .. :try_end_21} :catch_1c

    .line 32
    .line 33
    .line 34
    :goto_21
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0, p2}, Lax/r4/b$b;->m(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :goto_29
    sget-object p2, Lcom/dropbox/core/android/AuthActivity;->d:Ljava/lang/String;

    .line 43
    .line 44
    const-string v0, "Could not launch intent. User may have restricted profile"

    .line 45
    .line 46
    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 50
    .line 51
    .line 52
    return-void
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private final j(Ljava/lang/String;)V
    .registers 13

    .line 1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/Locale;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {v1, v2, v0}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lax/r4/b$b;->a()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/util/Collection;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v2, 0x0

    .line 33
    if-nez v0, :cond_32

    .line 34
    .line 35
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lax/r4/b$b;->a()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ljava/lang/String;

    .line 48
    .line 49
    :goto_30
    move-object v6, v0

    .line 50
    goto :goto_35

    .line 51
    :cond_32
    const-string v0, "0"

    .line 52
    .line 53
    goto :goto_30

    .line 54
    :goto_35
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lax/r4/b$b;->c()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lax/r4/b$b;->b()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    const-string v9, "state"

    .line 71
    .line 72
    const-string v3, "k"

    .line 73
    .line 74
    const-string v5, "n"

    .line 75
    .line 76
    const-string v7, "api"

    .line 77
    .line 78
    move-object v10, p1

    .line 79
    filled-new-array/range {v3 .. v10}, [Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Lax/tb/o;->n([Ljava/lang/Object;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Lax/r4/b$b;->l()Lax/p4/z;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-eqz v0, :cond_97

    .line 96
    .line 97
    const-string v0, "extra_query_params"

    .line 98
    .line 99
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    sget-object v0, Lax/r4/e;->a:Lax/r4/e;

    .line 103
    .line 104
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v3}, Lax/r4/b$b;->l()Lax/p4/z;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v4}, Lax/r4/b$b;->j()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v5}, Lax/r4/b$b;->g()Lax/p4/q;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-virtual {v6}, Lax/r4/b$b;->h()Lax/p4/l;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    invoke-virtual {v6}, Lax/p4/l;->c()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    const-string v7, "getCodeChallenge(...)"

    .line 141
    .line 142
    invoke-static {v6, v7}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v3, v4, v5, v6}, Lax/r4/e;->a(Lax/p4/z;Ljava/lang/String;Lax/p4/q;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    :cond_97
    invoke-virtual {v1}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v1}, Lax/r4/b$b;->f()Lax/p4/k;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-static {v1}, Lax/Gb/l;->c(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Lax/p4/k;->k()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast p1, Ljava/util/Collection;

    .line 172
    .line 173
    new-array v2, v2, [Ljava/lang/String;

    .line 174
    .line 175
    invoke-interface {p1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    check-cast p1, [Ljava/lang/String;

    .line 180
    .line 181
    const-string v2, "1/connect"

    .line 182
    .line 183
    invoke-static {v0, v1, v2, p1}, Lax/p4/n;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    new-instance v0, Landroid/content/Intent;

    .line 188
    .line 189
    const-string v1, "android.intent.action.VIEW"

    .line 190
    .line 191
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, p0}, Lcom/dropbox/core/android/AuthActivity;->h(Landroid/content/Context;)Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    if-eqz p1, :cond_d9

    .line 203
    .line 204
    new-instance p1, Landroid/content/ComponentName;

    .line 205
    .line 206
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    const-string v2, "com.voxdon.xplorer.activity.WebViewActivity"

    .line 211
    .line 212
    invoke-direct {p1, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 216
    .line 217
    .line 218
    :cond_d9
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 219
    .line 220
    .line 221
    return-void
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method


# virtual methods
.method public final h(Landroid/content/Context;)Z
    .registers 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/dropbox/core/android/AuthActivity;->b:Ljava/lang/Boolean;

    .line 7
    .line 8
    if-nez v0, :cond_35

    .line 9
    .line 10
    const-string v0, "uimode"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    instance-of v1, v0, Landroid/app/UiModeManager;

    .line 17
    .line 18
    if-eqz v1, :cond_16

    .line 19
    .line 20
    check-cast v0, Landroid/app/UiModeManager;

    .line 21
    .line 22
    goto :goto_17

    .line 23
    :cond_16
    const/4 v0, 0x0

    .line 24
    :goto_17
    if-eqz v0, :cond_25

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/app/UiModeManager;->getCurrentModeType()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x4

    .line 31
    if-ne v0, v1, :cond_25

    .line 32
    .line 33
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 34
    .line 35
    iput-object p1, p0, Lcom/dropbox/core/android/AuthActivity;->b:Ljava/lang/Boolean;

    .line 36
    .line 37
    goto :goto_35

    .line 38
    :cond_25
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v0, "android.software.leanback"

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lcom/dropbox/core/android/AuthActivity;->b:Ljava/lang/Boolean;

    .line 53
    .line 54
    :cond_35
    :goto_35
    iget-object p1, p0, Lcom/dropbox/core/android/AuthActivity;->b:Ljava/lang/Boolean;

    .line 55
    .line 56
    if-eqz p1, :cond_3e

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    return p1

    .line 63
    :cond_3e
    const/4 p1, 0x0

    .line 64
    return p1
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 5

    .line 1
    sget-object v0, Lax/r4/b;->a:Lax/r4/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/r4/b$a;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_13

    .line 8
    .line 9
    sget-object v1, Lax/r4/b$b;->n:Lax/r4/b$b$a;

    .line 10
    .line 11
    sget-object v2, Lcom/dropbox/core/android/AuthActivity;->h:Lax/r4/a;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Lax/r4/b$b$a;->a(Lax/r4/a;)Lax/r4/b$b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lax/r4/b$a;->d(Lax/r4/b$b;)V

    .line 18
    .line 19
    .line 20
    :cond_13
    const v0, 0x1030010

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/content/Context;->setTheme(I)V

    .line 24
    .line 25
    .line 26
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .registers 14

    .line 1
    const-string v0, "intent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lax/r4/b$b;->d()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_14

    .line 16
    .line 17
    invoke-direct {p0, v1}, Lcom/dropbox/core/android/AuthActivity;->f(Landroid/content/Intent;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_14
    const-string v0, "ACCESS_TOKEN"

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const-string v3, "UID"

    .line 28
    .line 29
    const-string v4, "ACCESS_SECRET"

    .line 30
    .line 31
    if-eqz v2, :cond_36

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    const-string v7, "AUTH_STATE"

    .line 46
    .line 47
    invoke-virtual {p1, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :goto_32
    move-object v11, v6

    .line 52
    move-object v6, v5

    .line 53
    move-object v5, v11

    .line 54
    goto :goto_77

    .line 55
    :cond_36
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_73

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const-string v5, "/connect"

    .line 66
    .line 67
    invoke-static {v5, v2}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_73

    .line 72
    .line 73
    :try_start_48
    const-string v2, "oauth_token"

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2
    :try_end_4e
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_48 .. :try_end_4e} :catch_6a

    .line 79
    :try_start_4e
    const-string v5, "oauth_token_secret"

    .line 80
    .line 81
    invoke-virtual {p1, v5}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5
    :try_end_54
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_4e .. :try_end_54} :catch_66

    .line 85
    :try_start_54
    const-string v6, "uid"

    .line 86
    .line 87
    invoke-virtual {p1, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v6
    :try_end_5a
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_54 .. :try_end_5a} :catch_63

    .line 91
    :try_start_5a
    const-string v7, "state"

    .line 92
    .line 93
    invoke-virtual {p1, v7}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1
    :try_end_60
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_5a .. :try_end_60} :catch_61

    .line 97
    goto :goto_32

    .line 98
    :catch_61
    nop

    .line 99
    goto :goto_6e

    .line 100
    :catch_63
    nop

    .line 101
    move-object v6, v1

    .line 102
    goto :goto_6e

    .line 103
    :catch_66
    nop

    .line 104
    move-object v5, v1

    .line 105
    :goto_68
    move-object v6, v5

    .line 106
    goto :goto_6e

    .line 107
    :catch_6a
    nop

    .line 108
    move-object v2, v1

    .line 109
    move-object v5, v2

    .line 110
    goto :goto_68

    .line 111
    :goto_6e
    move-object p1, v6

    .line 112
    move-object v6, v5

    .line 113
    move-object v5, p1

    .line 114
    move-object p1, v1

    .line 115
    goto :goto_77

    .line 116
    :cond_73
    move-object p1, v1

    .line 117
    move-object v2, p1

    .line 118
    move-object v5, v2

    .line 119
    move-object v6, v5

    .line 120
    :goto_77
    if-eqz v2, :cond_16a

    .line 121
    .line 122
    const-string v7, ""

    .line 123
    .line 124
    invoke-static {v2, v7}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    if-nez v8, :cond_16a

    .line 129
    .line 130
    if-eqz v6, :cond_16a

    .line 131
    .line 132
    invoke-static {v6, v7}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-nez v8, :cond_16a

    .line 137
    .line 138
    if-eqz v5, :cond_16a

    .line 139
    .line 140
    invoke-static {v5, v7}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-nez v8, :cond_16a

    .line 145
    .line 146
    if-eqz p1, :cond_16a

    .line 147
    .line 148
    invoke-static {p1, v7}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    if-nez v7, :cond_16a

    .line 153
    .line 154
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    invoke-virtual {v7}, Lax/r4/b$b;->d()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-static {v7, p1}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-nez p1, :cond_ab

    .line 167
    .line 168
    invoke-direct {p0, v1}, Lcom/dropbox/core/android/AuthActivity;->f(Landroid/content/Intent;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_ab
    sget-object p1, Lax/r4/g;->c0:Lax/r4/g;

    .line 173
    .line 174
    invoke-virtual {p1}, Lax/r4/g;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-static {v2, p1}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-eqz p1, :cond_cb

    .line 183
    .line 184
    new-instance v1, Landroid/content/Intent;

    .line 185
    .line 186
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, v4, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-static {p1}, Lax/Gb/l;->c(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_16a

    .line 203
    .line 204
    :cond_cb
    sget-object p1, Lax/r4/g;->d0:Lax/r4/g;

    .line 205
    .line 206
    invoke-virtual {p1}, Lax/r4/g;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-static {v2, p1}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-eqz p1, :cond_16a

    .line 215
    .line 216
    new-instance v5, Lax/r4/f;

    .line 217
    .line 218
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {p1}, Lax/r4/b$b;->h()Lax/p4/l;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-virtual {p1}, Lax/r4/b$b;->i()Lax/p4/m;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    invoke-static {v8}, Lax/Gb/l;->c(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-virtual {p1}, Lax/r4/b$b;->c()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    invoke-static {v9}, Lax/Gb/l;->c(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-virtual {p1}, Lax/r4/b$b;->f()Lax/p4/k;

    .line 253
    .line 254
    .line 255
    move-result-object v10

    .line 256
    invoke-static {v10}, Lax/Gb/l;->c(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    invoke-direct/range {v5 .. v10}, Lax/r4/f;-><init>(Ljava/lang/String;Lax/p4/l;Lax/p4/m;Ljava/lang/String;Lax/p4/k;)V

    .line 260
    .line 261
    .line 262
    const/4 p1, 0x0

    .line 263
    :try_start_106
    new-array p1, p1, [Ljava/lang/Void;

    .line 264
    .line 265
    invoke-virtual {v5, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    invoke-virtual {p1}, Landroid/os/AsyncTask;->get()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    check-cast p1, Lax/p4/h;

    .line 274
    .line 275
    if-nez p1, :cond_117

    .line 276
    .line 277
    sget-object p1, Lax/sb/t;->a:Lax/sb/t;

    .line 278
    .line 279
    goto :goto_16a

    .line 280
    :cond_117
    new-instance v2, Landroid/content/Intent;

    .line 281
    .line 282
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1}, Lax/p4/h;->a()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    invoke-virtual {v2, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1}, Lax/p4/h;->a()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-virtual {v2, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 297
    .line 298
    .line 299
    const-string v0, "REFRESH_TOKEN"

    .line 300
    .line 301
    invoke-virtual {p1}, Lax/p4/h;->c()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    invoke-virtual {v2, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 306
    .line 307
    .line 308
    const-string v0, "EXPIRES_AT"

    .line 309
    .line 310
    invoke-virtual {p1}, Lax/p4/h;->b()Ljava/lang/Long;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    const-string v5, "getExpiresAt(...)"

    .line 315
    .line 316
    invoke-static {v4, v5}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 320
    .line 321
    .line 322
    move-result-wide v4

    .line 323
    invoke-virtual {v2, v0, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1}, Lax/p4/h;->e()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 331
    .line 332
    .line 333
    const-string v0, "CONSUMER_KEY"

    .line 334
    .line 335
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    invoke-virtual {v3}, Lax/r4/b$b;->c()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 344
    .line 345
    .line 346
    const-string v0, "SCOPE"

    .line 347
    .line 348
    invoke-virtual {p1}, Lax/p4/h;->d()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    invoke-static {p1}, Lax/Gb/l;->c(Ljava/lang/Object;)V
    :try_end_166
    .catch Ljava/lang/Exception; {:try_start_106 .. :try_end_166} :catch_168

    .line 357
    .line 358
    .line 359
    move-object v1, v2

    .line 360
    goto :goto_16a

    .line 361
    :catch_168
    sget-object p1, Lax/sb/t;->a:Lax/sb/t;

    .line 362
    .line 363
    :cond_16a
    :goto_16a
    invoke-direct {p0, v1}, Lcom/dropbox/core/android/AuthActivity;->f(Landroid/content/Intent;)V

    .line 364
    .line 365
    .line 366
    return-void
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method protected onResume()V
    .registers 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1d

    .line 7
    .line 8
    if-ge v0, v1, :cond_d

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p0, v0}, Lcom/dropbox/core/android/AuthActivity;->onTopResumedActivityChanged(Z)V

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public onTopResumedActivityChanged(Z)V
    .registers 5

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_8d

    .line 6
    .line 7
    if-nez p1, :cond_a

    .line 8
    .line 9
    goto/16 :goto_8d

    .line 10
    .line 11
    :cond_a
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lax/r4/b$b;->d()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 v0, 0x0

    .line 20
    if-nez p1, :cond_8a

    .line 21
    .line 22
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lax/r4/b$b;->c()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-nez p1, :cond_20

    .line 31
    .line 32
    goto :goto_8a

    .line 33
    :cond_20
    sput-object v0, Lcom/dropbox/core/android/AuthActivity;->g:Landroid/content/Intent;

    .line 34
    .line 35
    iget-boolean p1, p0, Lcom/dropbox/core/android/AuthActivity;->a:Z

    .line 36
    .line 37
    if-eqz p1, :cond_2e

    .line 38
    .line 39
    sget-object p1, Lcom/dropbox/core/android/AuthActivity;->d:Ljava/lang/String;

    .line 40
    .line 41
    const-string v0, "onResume called again before Handler run"

    .line 42
    .line 43
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2e
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lax/r4/b$b;->l()Lax/p4/z;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-eqz p1, :cond_6a

    .line 56
    .line 57
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lax/r4/b$b;->h()Lax/p4/l;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lax/p4/l;->c()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string v0, "getCodeChallenge(...)"

    .line 70
    .line 71
    invoke-static {p1, v0}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Lax/r4/b$b;->l()Lax/p4/z;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Lax/r4/b$b;->j()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2}, Lax/r4/b$b;->g()Lax/p4/q;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {p1, v0, v1, v2}, Lax/r4/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lax/p4/q;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    goto :goto_74

    .line 107
    :cond_6a
    sget-object p1, Lcom/dropbox/core/android/AuthActivity;->c:Lcom/dropbox/core/android/AuthActivity$b;

    .line 108
    .line 109
    invoke-static {p1}, Lcom/dropbox/core/android/AuthActivity$b;->b(Lcom/dropbox/core/android/AuthActivity$b;)Lcom/dropbox/core/android/AuthActivity$c;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p1}, Lax/r4/c;->b(Lcom/dropbox/core/android/AuthActivity$c;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    :goto_74
    sget-object v0, Lax/r4/d;->a:Lax/r4/d;

    .line 118
    .line 119
    invoke-direct {p0}, Lcom/dropbox/core/android/AuthActivity;->g()Lax/r4/b$b;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v0, v1, p1, p0}, Lax/r4/d;->b(Lax/r4/b$b;Ljava/lang/String;Lcom/dropbox/core/android/AuthActivity;)Landroid/content/Intent;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    new-instance v1, Lax/q4/a;

    .line 128
    .line 129
    invoke-direct {v1, p0, v0, p1}, Lax/q4/a;-><init>(Lcom/dropbox/core/android/AuthActivity;Landroid/content/Intent;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 133
    .line 134
    .line 135
    const/4 p1, 0x1

    .line 136
    iput-boolean p1, p0, Lcom/dropbox/core/android/AuthActivity;->a:Z

    .line 137
    .line 138
    return-void

    .line 139
    :cond_8a
    :goto_8a
    invoke-direct {p0, v0}, Lcom/dropbox/core/android/AuthActivity;->f(Landroid/content/Intent;)V

    .line 140
    .line 141
    .line 142
    :cond_8d
    :goto_8d
    return-void
    .line 143
.end method
