.class public Lax/X2/J;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/Boolean;

.field private static b:Ljava/lang/Boolean;

.field private static c:Ljava/lang/Boolean;

.field private static d:Ljava/lang/Boolean;

.field private static e:Ljava/lang/Boolean;

.field private static f:Ljava/lang/Integer;

.field private static g:Ljava/lang/Integer;

.field private static h:Ljava/lang/Boolean;

.field private static i:Ljava/lang/Boolean;

.field private static j:Ljava/lang/Boolean;

.field private static k:Ljava/lang/Integer;

.field private static l:I

.field private static m:Ljava/lang/Boolean;


# direct methods
.method public static A()Z
    .registers 2

    .line 1
    sget-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    invoke-static {}, Lax/X2/J;->p()V

    .line 6
    .line 7
    .line 8
    :cond_7
    sget-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0x9

    .line 15
    .line 16
    if-ne v0, v1, :cond_13

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_13
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public static B()Z
    .registers 2

    .line 1
    sget-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    invoke-static {}, Lax/X2/J;->p()V

    .line 6
    .line 7
    .line 8
    :cond_7
    sget-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-ne v0, v1, :cond_11

    .line 16
    .line 17
    return v1

    .line 18
    :cond_11
    const/4 v0, 0x0

    .line 19
    return v0
    .line 20
    .line 21
.end method

.method public static C(Lax/c3/K;)Z
    .registers 3

    .line 1
    sget-object v0, Lax/X2/J;->b:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_28

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_24

    .line 10
    .line 11
    new-instance v0, Ljava/io/File;

    .line 12
    .line 13
    invoke-virtual {p0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v1, ".MetaEcfsFile"

    .line 18
    .line 19
    invoke-static {p0, v1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    sput-object p0, Lax/X2/J;->b:Ljava/lang/Boolean;

    .line 35
    .line 36
    goto :goto_28

    .line 37
    :cond_24
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 38
    .line 39
    sput-object p0, Lax/X2/J;->b:Ljava/lang/Boolean;

    .line 40
    .line 41
    :cond_28
    :goto_28
    sget-object p0, Lax/X2/J;->b:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0
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

.method public static D(Landroid/content/Context;)Z
    .registers 3

    .line 1
    sget-object v0, Lax/X2/J;->i:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_2a

    .line 4
    .line 5
    const-string v0, "uimode"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/app/UiModeManager;

    .line 12
    .line 13
    if-eqz v0, :cond_1a

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/app/UiModeManager;->getCurrentModeType()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x4

    .line 20
    if-ne v0, v1, :cond_1a

    .line 21
    .line 22
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    sput-object p0, Lax/X2/J;->i:Ljava/lang/Boolean;

    .line 25
    .line 26
    goto :goto_2a

    .line 27
    :cond_1a
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string v0, "android.software.leanback"

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    sput-object p0, Lax/X2/J;->i:Ljava/lang/Boolean;

    .line 42
    .line 43
    :cond_2a
    :goto_2a
    sget-object p0, Lax/X2/J;->i:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0
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

.method public static E()Z
    .registers 2

    .line 1
    sget-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    invoke-static {}, Lax/X2/J;->p()V

    .line 6
    .line 7
    .line 8
    :cond_7
    sget-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    if-ne v0, v1, :cond_13

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_13
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public static F()Z
    .registers 2

    .line 1
    sget-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    invoke-static {}, Lax/X2/J;->p()V

    .line 6
    .line 7
    .line 8
    :cond_7
    sget-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x3

    .line 15
    if-ne v0, v1, :cond_12

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_12
    const/4 v0, 0x0

    .line 20
    return v0
    .line 21
.end method

.method public static G()Z
    .registers 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method private static a()Ljava/util/HashSet;
    .registers 135
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v2, 0x1a

    .line 9
    .line 10
    const-string v3, "ES2N_sprout"

    .line 11
    .line 12
    const-string v4, "ES2_sprout"

    .line 13
    .line 14
    if-ne v1, v2, :cond_98

    .line 15
    .line 16
    const-string v1, "Expanse"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    const-string v1, "brady_f"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    const-string v1, "A3A_XL_4G"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    const-string v1, "SHIFT6m"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    const-string v1, "Hi9Air"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    const-string v1, "V3_Viper"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    const-string v1, "CatS41"

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    const-string v1, "BV9000Pro-F"

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    const-string v1, "CP-W5s"

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    const-string v1, "S55"

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    const-string v1, "M20_4G"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    const-string v1, "CO2_sprout"

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    const-string v1, "WP2"

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    const-string v1, "K8"

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    const-string v1, "AS160"

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    const-string v1, "NE1"

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    const-string v1, "manning"

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    const-string v1, "marino_f"

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    const-string v1, "CO2N_sprout"

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    const-string v1, "CUBOT_X18_Plus"

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    const-string v1, "Plume_L2"

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    const-string v1, "V0250WW"

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    const-string v1, "Doppio_SL558"

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    const-string v1, "BV8000Pro"

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    const-string v1, "VK7000"

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    const-string v1, "S99"

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    return-object v0

    .line 153
    :cond_98
    const/16 v2, 0x1b

    .line 154
    .line 155
    if-ne v1, v2, :cond_134

    .line 156
    .line 157
    const-string v1, "VFD720"

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    const-string v1, "LT_C2200"

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    const-string v1, "V0350WW"

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    const-string v1, "U3A_PLUS_4G"

    .line 173
    .line 174
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    const-string v1, "Plume_L1_Plus"

    .line 178
    .line 179
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    const-string v1, "VFD527"

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    const-string v1, "LeLift"

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    const-string v1, "GM6_d_sprout"

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    const-string v1, "GM6_s_sprout"

    .line 204
    .line 205
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    const-string v1, "Infinix-X572"

    .line 209
    .line 210
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    const-string v1, "Infinix-X571"

    .line 214
    .line 215
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    const-string v1, "HWDUA-M"

    .line 219
    .line 220
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    const-string v1, "HWDRA-M"

    .line 224
    .line 225
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    const-string v1, "HWDRA-MG"

    .line 229
    .line 230
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    const-string v1, "TECNO-CA7"

    .line 234
    .line 235
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    const-string v1, "TECNO-CA8"

    .line 239
    .line 240
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    const-string v1, "NOA_N7"

    .line 244
    .line 245
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    const-string v1, "FRT"

    .line 249
    .line 250
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    const-string v1, "HWCAG-L6737M"

    .line 254
    .line 255
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    const-string v1, "U5A_PLUS_4G"

    .line 259
    .line 260
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    const-string v1, "VFD620"

    .line 264
    .line 265
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    const-string v1, "W_C200SN"

    .line 269
    .line 270
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    const-string v1, "iris65"

    .line 274
    .line 275
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    const-string v1, "Z50"

    .line 279
    .line 280
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    const-string v1, "S9"

    .line 284
    .line 285
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    const-string v1, "P639F10"

    .line 289
    .line 290
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    const-string v1, "A3A"

    .line 294
    .line 295
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    const-string v1, "cactus"

    .line 299
    .line 300
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    const-string v1, "cereus"

    .line 304
    .line 305
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    return-object v0

    .line 309
    :cond_134
    const/16 v2, 0x18

    .line 310
    .line 311
    if-eq v1, v2, :cond_13e

    .line 312
    .line 313
    const/16 v2, 0x19

    .line 314
    .line 315
    if-ne v1, v2, :cond_13d

    .line 316
    .line 317
    goto :goto_13e

    .line 318
    :cond_13d
    return-object v0

    .line 319
    :cond_13e
    :goto_13e
    const-string v133, "Selfie"

    .line 320
    .line 321
    const-string v134, "vkworld_S8"

    .line 322
    .line 323
    const-string v3, "Slide_Wings_4GP"

    .line 324
    .line 325
    const-string v4, "TECNO-i7"

    .line 326
    .line 327
    const-string v5, "v3953"

    .line 328
    .line 329
    const-string v6, "Grand_XL"

    .line 330
    .line 331
    const-string v7, "U5_3G"

    .line 332
    .line 333
    const-string v8, "LIVE_6plus"

    .line 334
    .line 335
    const-string v9, "KOOLNEE_K1"

    .line 336
    .line 337
    const-string v10, "C5s"

    .line 338
    .line 339
    const-string v11, "KEMPLER_8_PLUS"

    .line 340
    .line 341
    const-string v12, "C9"

    .line 342
    .line 343
    const-string v13, "P637F10"

    .line 344
    .line 345
    const-string v14, "Ilium_L1120"

    .line 346
    .line 347
    const-string v15, "HS6737MT"

    .line 348
    .line 349
    const-string v16, "Q17"

    .line 350
    .line 351
    const-string v17, "Q11"

    .line 352
    .line 353
    const-string v18, "WE_T1"

    .line 354
    .line 355
    const-string v19, "mickey6t"

    .line 356
    .line 357
    const-string v20, "Bharat_5"

    .line 358
    .line 359
    const-string v21, "DW55B8L"

    .line 360
    .line 361
    const-string v22, "QY77"

    .line 362
    .line 363
    const-string v23, "GOME"

    .line 364
    .line 365
    const-string v24, "ML-JI11-M7_3G_PLUS"

    .line 366
    .line 367
    const-string v25, "EB50B1L"

    .line 368
    .line 369
    const-string v26, "BV8000Pro_RU"

    .line 370
    .line 371
    const-string v27, "Phantom6-Plus"

    .line 372
    .line 373
    const-string v28, "TELMA_F1_4G"

    .line 374
    .line 375
    const-string v29, "TECNO-WX3"

    .line 376
    .line 377
    const-string v30, "TECNO-WX3P"

    .line 378
    .line 379
    const-string v31, "Pixi5-10_4G"

    .line 380
    .line 381
    const-string v32, "Kylin_5_0S"

    .line 382
    .line 383
    const-string v33, "TECNO-LA6"

    .line 384
    .line 385
    const-string v34, "X557"

    .line 386
    .line 387
    const-string v35, "TECNO-WX4"

    .line 388
    .line 389
    const-string v36, "ZTE_BLADE_V0820"

    .line 390
    .line 391
    const-string v37, "SENSEIT_A150"

    .line 392
    .line 393
    const-string v38, "v3961"

    .line 394
    .line 395
    const-string v39, "ELEMENT_PRO"

    .line 396
    .line 397
    const-string v40, "A10"

    .line 398
    .line 399
    const-string v41, "Aquaris_A45_sprout"

    .line 400
    .line 401
    const-string v42, "ComioC2"

    .line 402
    .line 403
    const-string v43, "Ilium_L920"

    .line 404
    .line 405
    const-string v44, "SDQ_52004L"

    .line 406
    .line 407
    const-string v45, "Z60"

    .line 408
    .line 409
    const-string v46, "S530"

    .line 410
    .line 411
    const-string v47, "Impress_Energy"

    .line 412
    .line 413
    const-string v48, "ELEGANCE02A-S17A"

    .line 414
    .line 415
    const-string v49, "Alpha"

    .line 416
    .line 417
    const-string v50, "Active"

    .line 418
    .line 419
    const-string v51, "elsa6_na"

    .line 420
    .line 421
    const-string v52, "BL7000"

    .line 422
    .line 423
    const-string v53, "S1a"

    .line 424
    .line 425
    const-string v54, "P8_3D"

    .line 426
    .line 427
    const-string v55, "MIX_2"

    .line 428
    .line 429
    const-string v56, "K5"

    .line 430
    .line 431
    const-string v57, "62S"

    .line 432
    .line 433
    const-string v58, "GLAM"

    .line 434
    .line 435
    const-string v59, "Impress_Lion_4G"

    .line 436
    .line 437
    const-string v60, "Alpha_X"

    .line 438
    .line 439
    const-string v61, "Ilium_X520"

    .line 440
    .line 441
    const-string v62, "MS50L_4G"

    .line 442
    .line 443
    const-string v63, "Impress_Luck"

    .line 444
    .line 445
    const-string v64, "N5702L"

    .line 446
    .line 447
    const-string v65, "CatS41"

    .line 448
    .line 449
    const-string v66, "XT1663"

    .line 450
    .line 451
    const-string v67, "C5a"

    .line 452
    .line 453
    const-string v68, "K3"

    .line 454
    .line 455
    const-string v69, "G3312"

    .line 456
    .line 457
    const-string v70, "G3311"

    .line 458
    .line 459
    const-string v71, "G3313"

    .line 460
    .line 461
    const-string v72, "H3311"

    .line 462
    .line 463
    const-string v73, "H3321"

    .line 464
    .line 465
    const-string v74, "H4311"

    .line 466
    .line 467
    const-string v75, "H4331"

    .line 468
    .line 469
    const-string v76, "marino_f"

    .line 470
    .line 471
    const-string v77, "1601"

    .line 472
    .line 473
    const-string v78, "1714"

    .line 474
    .line 475
    const-string v79, "Orsa"

    .line 476
    .line 477
    const-string v80, "U20_Plus"

    .line 478
    .line 479
    const-string v81, "CLEVER"

    .line 480
    .line 481
    const-string v82, "M2"

    .line 482
    .line 483
    const-string v83, "P8_Max"

    .line 484
    .line 485
    const-string v84, "S8"

    .line 486
    .line 487
    const-string v85, "S8_Pro"

    .line 488
    .line 489
    const-string v86, "S8_Pro1"

    .line 490
    .line 491
    const-string v87, "S8_pro1"

    .line 492
    .line 493
    const-string v88, "K350t"

    .line 494
    .line 495
    const-string v89, "V2"

    .line 496
    .line 497
    const-string v90, "V3"

    .line 498
    .line 499
    const-string v91, "V4"

    .line 500
    .line 501
    const-string v92, "P6000"

    .line 502
    .line 503
    const-string v93, "K5000"

    .line 504
    .line 505
    const-string v94, "GS170"

    .line 506
    .line 507
    const-string v95, "manning"

    .line 508
    .line 509
    const-string v96, "Power_3"

    .line 510
    .line 511
    const-string v97, "Power_3S"

    .line 512
    .line 513
    const-string v98, "BV8000Pro"

    .line 514
    .line 515
    const-string v99, "BV9000"

    .line 516
    .line 517
    const-string v100, "BV9000-F"

    .line 518
    .line 519
    const-string v101, "BV9000Pro-F"

    .line 520
    .line 521
    const-string v102, "MIX"

    .line 522
    .line 523
    const-string v103, "MIX2"

    .line 524
    .line 525
    const-string v104, "LRExplore"

    .line 526
    .line 527
    const-string v105, "S2_PRO"

    .line 528
    .line 529
    const-string v106, "t816_gq_ulefone"

    .line 530
    .line 531
    const-string v107, "t777_dg_m1_65_n"

    .line 532
    .line 533
    const-string v108, "MS50L"

    .line 534
    .line 535
    const-string v109, "cedric"

    .line 536
    .line 537
    const-string v110, "D0070WW"

    .line 538
    .line 539
    const-string v111, "TECNO-F2"

    .line 540
    .line 541
    const-string v112, "TECNO-F3"

    .line 542
    .line 543
    const-string v113, "TECNO-F3-13M"

    .line 544
    .line 545
    const-string v114, "TECNO-K7"

    .line 546
    .line 547
    const-string v115, "INOI_2"

    .line 548
    .line 549
    const-string v116, "INOI_2_LITE"

    .line 550
    .line 551
    const-string v117, "INOI_3_LITE"

    .line 552
    .line 553
    const-string v118, "INOI_6_Lite"

    .line 554
    .line 555
    const-string v119, "Infinix-X571"

    .line 556
    .line 557
    const-string v120, "Infinix-X572"

    .line 558
    .line 559
    const-string v121, "Infinix-X559"

    .line 560
    .line 561
    const-string v122, "Infinix-X559C"

    .line 562
    .line 563
    const-string v123, "Infinix-X603"

    .line 564
    .line 565
    const-string v124, "S16"

    .line 566
    .line 567
    const-string v125, "M555i"

    .line 568
    .line 569
    const-string v126, "A3A_XL_3G"

    .line 570
    .line 571
    const-string v127, "PIXI5-6_4G"

    .line 572
    .line 573
    const-string v128, "U5A_PLUS_3G"

    .line 574
    .line 575
    const-string v129, "U17"

    .line 576
    .line 577
    const-string v130, "TB-7304I"

    .line 578
    .line 579
    const-string v131, "TB-7304X"

    .line 580
    .line 581
    const-string v132, "Riga"

    .line 582
    .line 583
    filled-new-array/range {v3 .. v134}, [Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    invoke-static {v0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    return-object v0
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method public static b()I
    .registers 4

    .line 1
    sget-object v0, Lax/X2/J;->k:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_9
    const/16 v0, 0x64

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sput-object v1, Lax/X2/J;->k:Ljava/lang/Integer;

    .line 17
    .line 18
    :try_start_11
    new-instance v1, Ljava/util/Scanner;

    .line 19
    .line 20
    new-instance v2, Ljava/io/File;

    .line 21
    .line 22
    const-string v3, "/proc/cpuinfo"

    .line 23
    .line 24
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, v2}, Ljava/util/Scanner;-><init>(Ljava/io/File;)V

    .line 28
    .line 29
    .line 30
    :cond_1d
    :goto_1d
    invoke-virtual {v1}, Ljava/util/Scanner;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_62

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/Scanner;->nextLine()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "Hardware"

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_30

    .line 47
    .line 48
    goto :goto_1d

    .line 49
    :cond_30
    const-string v3, "Qualcomm"

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_42

    .line 56
    .line 57
    const/4 v2, 0x1

    .line 58
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    sput-object v2, Lax/X2/J;->k:Ljava/lang/Integer;

    .line 63
    .line 64
    goto :goto_1d

    .line 65
    :catch_40
    move-exception v1

    .line 66
    goto :goto_66

    .line 67
    :cond_42
    const-string v3, "Hardware: MT"

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_52

    .line 74
    .line 75
    const/4 v2, 0x3

    .line 76
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    sput-object v2, Lax/X2/J;->k:Ljava/lang/Integer;

    .line 81
    .line 82
    goto :goto_1d

    .line 83
    :cond_52
    const-string v3, "Amlogic"

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_1d

    .line 90
    .line 91
    const/4 v2, 0x4

    .line 92
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    sput-object v2, Lax/X2/J;->k:Ljava/lang/Integer;

    .line 97
    .line 98
    goto :goto_1d

    .line 99
    :cond_62
    invoke-virtual {v1}, Ljava/util/Scanner;->close()V
    :try_end_65
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_65} :catch_40

    .line 100
    .line 101
    .line 102
    goto :goto_69

    .line 103
    :goto_66
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 104
    .line 105
    .line 106
    :goto_69
    sget-object v1, Lax/X2/J;->k:Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-ne v1, v0, :cond_7e

    .line 113
    .line 114
    invoke-static {}, Lax/X2/J;->B()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_7e

    .line 119
    .line 120
    const/4 v0, 0x2

    .line 121
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    sput-object v0, Lax/X2/J;->k:Ljava/lang/Integer;

    .line 126
    .line 127
    :cond_7e
    sget-object v0, Lax/X2/J;->k:Ljava/lang/Integer;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    return v0
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
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method public static c()I
    .registers 4

    .line 1
    invoke-static {}, Lax/X2/J;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    if-nez v0, :cond_f

    .line 11
    .line 12
    invoke-static {}, Lax/u3/b;->f()V

    .line 13
    .line 14
    .line 15
    return v1

    .line 16
    :cond_f
    sget-object v0, Lax/X2/J;->f:Ljava/lang/Integer;

    .line 17
    .line 18
    if-nez v0, :cond_6c

    .line 19
    .line 20
    :try_start_13
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v0, :cond_54

    .line 23
    .line 24
    const-string v1, "/"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    array-length v1, v0

    .line 31
    const/4 v3, 0x4

    .line 32
    if-lt v1, v3, :cond_4e

    .line 33
    .line 34
    const/4 v1, 0x3

    .line 35
    aget-object v0, v0, v1

    .line 36
    .line 37
    const-string v1, "R"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_48

    .line 44
    .line 45
    const-string v1, "-"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-ltz v1, :cond_42

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Lax/X2/J;->f:Ljava/lang/Integer;

    .line 63
    .line 64
    goto :goto_6c

    .line 65
    :catch_40
    move-exception v0

    .line 66
    goto :goto_5a

    .line 67
    :cond_42
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_48
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 74
    .line 75
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_4e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 82
    .line 83
    .line 84
    throw v0

    .line 85
    :cond_54
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 88
    .line 89
    .line 90
    throw v0
    :try_end_5a
    .catch Ljava/lang/NumberFormatException; {:try_start_13 .. :try_end_5a} :catch_65
    .catch Ljava/lang/IllegalArgumentException; {:try_start_13 .. :try_end_5a} :catch_40

    .line 91
    :goto_5a
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 92
    .line 93
    .line 94
    const-string v0, "UNKNOWN CHROME OS FINGER PRINT 2"

    .line 95
    .line 96
    invoke-static {v0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sput-object v2, Lax/X2/J;->f:Ljava/lang/Integer;

    .line 100
    .line 101
    goto :goto_6c

    .line 102
    :catch_65
    const-string v0, "UNKNOWN CHROME OS FINGER PRINT 1"

    .line 103
    .line 104
    invoke-static {v0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    sput-object v2, Lax/X2/J;->f:Ljava/lang/Integer;

    .line 108
    .line 109
    :cond_6c
    :goto_6c
    sget-object v0, Lax/X2/J;->f:Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    return v0
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
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method public static d()Z
    .registers 2

    .line 1
    invoke-static {}, Lax/X2/J;->E()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x18

    .line 10
    .line 11
    if-eq v0, v1, :cond_12

    .line 12
    .line 13
    :cond_c
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v1, 0x19

    .line 16
    .line 17
    if-ne v0, v1, :cond_14

    .line 18
    .line 19
    :cond_12
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_14
    const/4 v0, 0x0

    .line 22
    return v0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public static e()Z
    .registers 4

    .line 1
    sget-object v0, Lax/X2/J;->j:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_3a

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    if-lt v0, v1, :cond_32

    .line 10
    .line 11
    invoke-static {}, Lax/X2/J;->B()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_32

    .line 16
    .line 17
    invoke-static {}, Lax/X2/I;->a()Landroid/os/LocaleList;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    :goto_15
    invoke-static {v0}, Lax/Y/k;->a(Landroid/os/LocaleList;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-ge v1, v2, :cond_32

    .line 27
    .line 28
    invoke-static {v0, v1}, Lax/Y/n;->a(Landroid/os/LocaleList;I)Ljava/util/Locale;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v3, "en"

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2f

    .line 43
    .line 44
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 45
    .line 46
    sput-object v2, Lax/X2/J;->j:Ljava/lang/Boolean;

    .line 47
    .line 48
    :cond_2f
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_15

    .line 51
    :cond_32
    sget-object v0, Lax/X2/J;->j:Ljava/lang/Boolean;

    .line 52
    .line 53
    if-nez v0, :cond_3a

    .line 54
    .line 55
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 56
    .line 57
    sput-object v0, Lax/X2/J;->j:Ljava/lang/Boolean;

    .line 58
    .line 59
    :cond_3a
    sget-object v0, Lax/X2/J;->j:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    return v0
    .line 66
    .line 67
    .line 68
.end method

.method public static f()Z
    .registers 2

    .line 1
    invoke-static {}, Lax/X2/J;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    if-ne v0, v1, :cond_e

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_e
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static g()Z
    .registers 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    return v0
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

.method public static h()Z
    .registers 2

    .line 1
    invoke-static {}, Lax/X2/J;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x17

    .line 10
    .line 11
    if-ne v0, v1, :cond_e

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_e
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static i()Z
    .registers 1

    .line 1
    invoke-static {}, Lax/X2/J;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
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

.method public static j()Z
    .registers 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-ne v0, v1, :cond_e

    .line 6
    .line 7
    invoke-static {}, Lax/X2/J;->A()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_e
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static k()Z
    .registers 4

    .line 1
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "SM-T870"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v1, :cond_1f

    .line 12
    .line 13
    const-string v1, "SM-T875"

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1f

    .line 20
    .line 21
    const-string v1, "SM-T876B"

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1d

    .line 28
    .line 29
    goto :goto_1f

    .line 30
    :cond_1d
    const/4 v0, 0x0

    .line 31
    goto :goto_20

    .line 32
    :cond_1f
    :goto_1f
    const/4 v0, 0x1

    .line 33
    :goto_20
    invoke-static {}, Lax/X2/J;->B()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2f

    .line 38
    .line 39
    invoke-static {}, Lax/X2/Q;->z0()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2f

    .line 44
    .line 45
    if-eqz v0, :cond_2f

    .line 46
    .line 47
    return v2

    .line 48
    :cond_2f
    return v3
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

.method public static l()Z
    .registers 2

    .line 1
    sget-object v0, Lax/X2/J;->a:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_1d

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x1a

    .line 8
    .line 9
    if-ge v0, v1, :cond_16

    .line 10
    .line 11
    const-string v0, "samsung"

    .line 12
    .line 13
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_16

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_17

    .line 23
    :cond_16
    const/4 v0, 0x0

    .line 24
    :goto_17
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lax/X2/J;->a:Ljava/lang/Boolean;

    .line 29
    .line 30
    :cond_1d
    sget-object v0, Lax/X2/J;->a:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    return v0
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

.method public static m()Z
    .registers 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-lt v0, v1, :cond_1a

    .line 6
    .line 7
    const/16 v1, 0x19

    .line 8
    .line 9
    if-gt v0, v1, :cond_1a

    .line 10
    .line 11
    invoke-static {}, Lax/X2/J;->b()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_18

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-eq v0, v1, :cond_18

    .line 20
    .line 21
    const/16 v1, 0x64

    .line 22
    .line 23
    if-ne v0, v1, :cond_1a

    .line 24
    .line 25
    :cond_18
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_1a
    const/4 v0, 0x0

    .line 28
    return v0
    .line 29
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public static n()Z
    .registers 2

    .line 1
    sget-object v0, Lax/X2/J;->d:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_22

    .line 4
    .line 5
    invoke-static {}, Lax/X2/J;->F()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1e

    .line 10
    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v1, 0x1a

    .line 14
    .line 15
    if-lt v0, v1, :cond_16

    .line 16
    .line 17
    const/16 v1, 0x1c

    .line 18
    .line 19
    if-gt v0, v1, :cond_16

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_17

    .line 23
    :cond_16
    const/4 v0, 0x0

    .line 24
    :goto_17
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lax/X2/J;->d:Ljava/lang/Boolean;

    .line 29
    .line 30
    goto :goto_22

    .line 31
    :cond_1e
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 32
    .line 33
    sput-object v0, Lax/X2/J;->d:Ljava/lang/Boolean;

    .line 34
    .line 35
    :cond_22
    :goto_22
    sget-object v0, Lax/X2/J;->d:Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    return v0
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

.method public static o()Z
    .registers 2

    .line 1
    invoke-static {}, Lax/X2/J;->F()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    if-ne v0, v1, :cond_e

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_e
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static p()V
    .registers 3

    .line 1
    sget-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_be

    .line 4
    .line 5
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 6
    .line 7
    const/16 v1, 0x64

    .line 8
    .line 9
    if-nez v0, :cond_11

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v2, "samsung"

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_25

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 36
    .line 37
    return-void

    .line 38
    :cond_25
    const-string v2, "huawei"

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_35

    .line 45
    .line 46
    const/4 v0, 0x2

    .line 47
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 52
    .line 53
    return-void

    .line 54
    :cond_35
    const-string v2, "xiaomi"

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_45

    .line 61
    .line 62
    const/4 v0, 0x3

    .line 63
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 68
    .line 69
    return-void

    .line 70
    :cond_45
    const-string v2, "lg"

    .line 71
    .line 72
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_55

    .line 77
    .line 78
    const/4 v0, 0x5

    .line 79
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sput-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 84
    .line 85
    return-void

    .line 86
    :cond_55
    const-string v2, "motorola"

    .line 87
    .line 88
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_65

    .line 93
    .line 94
    const/4 v0, 0x6

    .line 95
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sput-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 100
    .line 101
    return-void

    .line 102
    :cond_65
    const-string v2, "oppo"

    .line 103
    .line 104
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_75

    .line 109
    .line 110
    const/4 v0, 0x7

    .line 111
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    sput-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 116
    .line 117
    return-void

    .line 118
    :cond_75
    const-string v2, "oneplus"

    .line 119
    .line 120
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_85

    .line 125
    .line 126
    const/4 v0, 0x4

    .line 127
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    sput-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 132
    .line 133
    return-void

    .line 134
    :cond_85
    const-string v2, "wiko"

    .line 135
    .line 136
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-eqz v2, :cond_96

    .line 141
    .line 142
    const/16 v0, 0x8

    .line 143
    .line 144
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    sput-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 149
    .line 150
    return-void

    .line 151
    :cond_96
    const-string v2, "realme"

    .line 152
    .line 153
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_a7

    .line 158
    .line 159
    const/16 v0, 0x9

    .line 160
    .line 161
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    sput-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 166
    .line 167
    return-void

    .line 168
    :cond_a7
    const-string v2, "vivo"

    .line 169
    .line 170
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_b8

    .line 175
    .line 176
    const/16 v0, 0xa

    .line 177
    .line 178
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    sput-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 183
    .line 184
    return-void

    .line 185
    :cond_b8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    sput-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 190
    .line 191
    :cond_be
    return-void
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method public static q()Z
    .registers 2

    .line 1
    sget-object v0, Lax/X2/J;->e:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_19

    .line 4
    .line 5
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_12

    .line 8
    .line 9
    const-string v1, ".+_cheets|cheets_.+"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_12

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_13

    .line 19
    :cond_12
    const/4 v0, 0x0

    .line 20
    :goto_13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lax/X2/J;->e:Ljava/lang/Boolean;

    .line 25
    .line 26
    :cond_19
    sget-object v0, Lax/X2/J;->e:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    return v0
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

.method public static r()Z
    .registers 2

    .line 1
    sget-object v0, Lax/X2/J;->c:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_19

    .line 4
    .line 5
    invoke-static {}, Lax/X2/J;->a()Ljava/util/HashSet;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_15

    .line 16
    .line 17
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 18
    .line 19
    sput-object v0, Lax/X2/J;->c:Ljava/lang/Boolean;

    .line 20
    .line 21
    goto :goto_19

    .line 22
    :cond_15
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 23
    .line 24
    sput-object v0, Lax/X2/J;->c:Ljava/lang/Boolean;

    .line 25
    .line 26
    :cond_19
    :goto_19
    sget-object v0, Lax/X2/J;->c:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    return v0
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

.method public static s(Landroid/content/Context;)Z
    .registers 3

    .line 1
    if-nez p0, :cond_4

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_4
    sget-object v0, Lax/X2/J;->h:Ljava/lang/Boolean;

    .line 6
    .line 7
    if-nez v0, :cond_34

    .line 8
    .line 9
    :try_start_8
    new-instance v0, Landroid/content/Intent;

    .line 10
    .line 11
    const-string v1, "android.intent.action.OPEN_DOCUMENT_TREE"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0}, Lax/u3/B;->K(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    sput-object p0, Lax/X2/J;->h:Ljava/lang/Boolean;
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_19} :catch_1a

    .line 25
    .line 26
    goto :goto_34

    .line 27
    :catch_1a
    move-exception p0

    .line 28
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "QUERY ACTIVITY"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0, p0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 47
    .line 48
    .line 49
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 50
    .line 51
    sput-object p0, Lax/X2/J;->h:Ljava/lang/Boolean;

    .line 52
    .line 53
    :cond_34
    :goto_34
    sget-object p0, Lax/X2/J;->h:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    return p0
    .line 60
    .line 61
.end method

.method public static t()Z
    .registers 2

    .line 1
    sget-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    invoke-static {}, Lax/X2/J;->p()V

    .line 6
    .line 7
    .line 8
    :cond_7
    sget-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    if-ne v0, v1, :cond_12

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_12
    const/4 v0, 0x0

    .line 20
    return v0
    .line 21
.end method

.method public static u(Landroid/content/Context;)Z
    .registers 3

    .line 1
    const-string v0, "px3 (1024x600 O)"

    .line 2
    .line 3
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    return v1

    .line 13
    :cond_c
    invoke-static {p0}, Lax/X2/J;->D(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_13

    .line 18
    .line 19
    return v1

    .line 20
    :cond_13
    const/4 p0, 0x0

    .line 21
    return p0
    .line 22
.end method

.method public static v()Z
    .registers 2

    .line 1
    sget-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    invoke-static {}, Lax/X2/J;->p()V

    .line 6
    .line 7
    .line 8
    :cond_7
    sget-object v0, Lax/X2/J;->g:Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x5

    .line 15
    if-ne v0, v1, :cond_12

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_12
    const/4 v0, 0x0

    .line 20
    return v0
    .line 21
.end method

.method private static w(Landroid/content/Context;)I
    .registers 6

    .line 1
    sget v0, Lax/X2/J;->l:I

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return v0

    .line 6
    :cond_5
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    const-string v1, "/storage/emulated/0/Android/media/com.cxinventor.file.explorer"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_15

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 20
    .line 21
    .line 22
    :cond_15
    new-instance v1, Ljava/io/File;

    .line 23
    .line 24
    const-string v2, "deleteparam_test"

    .line 25
    .line 26
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x3

    .line 30
    :try_start_1d
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_29

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 37
    .line 38
    .line 39
    goto :goto_29

    .line 40
    :catchall_27
    move-exception p0

    .line 41
    goto :goto_67

    .line 42
    :cond_29
    :goto_29
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {p0, v2}, Lax/c3/M;->e(Landroid/content/Context;Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v3
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_34} :catch_61
    .catchall {:try_start_1d .. :try_end_34} :catchall_27

    .line 53
    const-string v4, "what case is this?"

    .line 54
    .line 55
    if-nez v3, :cond_3e

    .line 56
    .line 57
    :try_start_38
    invoke-static {v4}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    sput v0, Lax/X2/J;->l:I

    .line 61
    .line 62
    goto :goto_5d

    .line 63
    :cond_3e
    const/4 v3, 0x0

    .line 64
    invoke-static {p0, v2, v3, v3}, Lax/c3/M;->j(Landroid/content/Context;Ljava/lang/String;ZZ)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    const/4 v3, 0x1

    .line 69
    if-lt p0, v3, :cond_58

    .line 70
    .line 71
    new-instance p0, Ljava/io/File;

    .line 72
    .line 73
    invoke-direct {p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-eqz p0, :cond_54

    .line 81
    .line 82
    sput v3, Lax/X2/J;->l:I

    .line 83
    .line 84
    goto :goto_5d

    .line 85
    :cond_54
    const/4 p0, 0x2

    .line 86
    sput p0, Lax/X2/J;->l:I

    .line 87
    .line 88
    goto :goto_5d

    .line 89
    :cond_58
    invoke-static {v4}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    sput v0, Lax/X2/J;->l:I
    :try_end_5d
    .catch Ljava/lang/Exception; {:try_start_38 .. :try_end_5d} :catch_61
    .catchall {:try_start_38 .. :try_end_5d} :catchall_27

    .line 93
    .line 94
    :goto_5d
    :try_start_5d
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_60
    .catch Ljava/lang/Exception; {:try_start_5d .. :try_end_60} :catch_64

    .line 95
    .line 96
    .line 97
    goto :goto_64

    .line 98
    :catch_61
    :try_start_61
    sput v0, Lax/X2/J;->l:I
    :try_end_63
    .catchall {:try_start_61 .. :try_end_63} :catchall_27

    .line 99
    .line 100
    goto :goto_5d

    .line 101
    :catch_64
    :goto_64
    sget p0, Lax/X2/J;->l:I

    .line 102
    .line 103
    return p0

    .line 104
    :goto_67
    :try_start_67
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_6a
    .catch Ljava/lang/Exception; {:try_start_67 .. :try_end_6a} :catch_6a

    .line 105
    .line 106
    .line 107
    :catch_6a
    throw p0
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

.method public static x(Landroid/content/Context;)Z
    .registers 3

    .line 1
    invoke-static {}, Lax/X2/Q;->W()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-static {p0}, Lax/X2/J;->w(Landroid/content/Context;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/4 v0, 0x1

    .line 14
    if-eq p0, v0, :cond_10

    .line 15
    .line 16
    return v0

    .line 17
    :cond_10
    return v1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static y(Landroid/content/Context;)Z
    .registers 4

    .line 1
    sget-object v0, Lax/X2/J;->m:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_9
    new-instance v0, Ljava/io/File;

    .line 11
    .line 12
    const-string v1, "/storage/emulated/0/Android/media/com.cxinventor.file.explorer"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_19

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 24
    .line 25
    .line 26
    :cond_19
    new-instance v1, Ljava/io/File;

    .line 27
    .line 28
    const-string v2, "mediastore_update_test"

    .line 29
    .line 30
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :try_start_20
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {p0, v0}, Lax/c3/M;->e(Landroid/content/Context;Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_35

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 47
    .line 48
    .line 49
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 50
    .line 51
    sput-object p0, Lax/X2/J;->m:Ljava/lang/Boolean;

    .line 52
    .line 53
    goto :goto_50

    .line 54
    :cond_35
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {p0, v0}, Lax/c3/M;->e(Landroid/content/Context;Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_47

    .line 66
    .line 67
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 68
    .line 69
    sput-object p0, Lax/X2/J;->m:Ljava/lang/Boolean;

    .line 70
    .line 71
    goto :goto_50

    .line 72
    :cond_47
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    sput-object p0, Lax/X2/J;->m:Ljava/lang/Boolean;
    :try_end_4b
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_4b} :catch_4c

    .line 75
    .line 76
    goto :goto_50

    .line 77
    :catch_4c
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 78
    .line 79
    sput-object p0, Lax/X2/J;->m:Ljava/lang/Boolean;

    .line 80
    .line 81
    :goto_50
    sget-object p0, Lax/X2/J;->m:Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    return p0
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

.method public static z()Z
    .registers 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ne v0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    return v0
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
