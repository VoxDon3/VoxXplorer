.class synthetic Lax/o4/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o4/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic a:[I

.field static final synthetic b:[I

.field static final synthetic c:[I


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 1
    invoke-static {}, Lax/o4/g$E$d;->values()[Lax/o4/g$E$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    new-array v0, v0, [I

    .line 7
    .line 8
    sput-object v0, Lax/o4/h$a;->c:[I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    :try_start_a
    sget-object v2, Lax/o4/g$E$d;->q:Lax/o4/g$E$d;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    aput v1, v0, v2
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_12} :catch_12

    .line 18
    .line 19
    :catch_12
    const/4 v0, 0x2

    .line 20
    :try_start_13
    sget-object v2, Lax/o4/h$a;->c:[I

    .line 21
    .line 22
    sget-object v3, Lax/o4/g$E$d;->c0:Lax/o4/g$E$d;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    aput v0, v2, v3
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_1d} :catch_1d

    .line 29
    .line 30
    :catch_1d
    const/4 v2, 0x3

    .line 31
    :try_start_1e
    sget-object v3, Lax/o4/h$a;->c:[I

    .line 32
    .line 33
    sget-object v4, Lax/o4/g$E$d;->d0:Lax/o4/g$E$d;

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    aput v2, v3, v4
    :try_end_28
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1e .. :try_end_28} :catch_28

    .line 40
    .line 41
    :catch_28
    invoke-static {}, Lax/o4/g$E$c;->values()[Lax/o4/g$E$c;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    array-length v3, v3

    .line 46
    new-array v3, v3, [I

    .line 47
    .line 48
    sput-object v3, Lax/o4/h$a;->b:[I

    .line 49
    .line 50
    :try_start_31
    sget-object v4, Lax/o4/g$E$c;->q:Lax/o4/g$E$c;

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    aput v1, v3, v4
    :try_end_39
    .catch Ljava/lang/NoSuchFieldError; {:try_start_31 .. :try_end_39} :catch_39

    .line 57
    .line 58
    :catch_39
    :try_start_39
    sget-object v3, Lax/o4/h$a;->b:[I

    .line 59
    .line 60
    sget-object v4, Lax/o4/g$E$c;->c0:Lax/o4/g$E$c;

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    aput v0, v3, v4
    :try_end_43
    .catch Ljava/lang/NoSuchFieldError; {:try_start_39 .. :try_end_43} :catch_43

    .line 67
    .line 68
    :catch_43
    :try_start_43
    sget-object v3, Lax/o4/h$a;->b:[I

    .line 69
    .line 70
    sget-object v4, Lax/o4/g$E$c;->d0:Lax/o4/g$E$c;

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    aput v2, v3, v4
    :try_end_4d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_43 .. :try_end_4d} :catch_4d

    .line 77
    .line 78
    :catch_4d
    invoke-static {}, Lax/o4/e$a;->values()[Lax/o4/e$a;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    array-length v3, v3

    .line 83
    new-array v3, v3, [I

    .line 84
    .line 85
    sput-object v3, Lax/o4/h$a;->a:[I

    .line 86
    .line 87
    :try_start_56
    sget-object v4, Lax/o4/e$a;->d0:Lax/o4/e$a;

    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    aput v1, v3, v4
    :try_end_5e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_56 .. :try_end_5e} :catch_5e

    .line 94
    .line 95
    :catch_5e
    :try_start_5e
    sget-object v1, Lax/o4/h$a;->a:[I

    .line 96
    .line 97
    sget-object v3, Lax/o4/e$a;->g0:Lax/o4/e$a;

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    aput v0, v1, v3
    :try_end_68
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5e .. :try_end_68} :catch_68

    .line 104
    .line 105
    :catch_68
    :try_start_68
    sget-object v0, Lax/o4/h$a;->a:[I

    .line 106
    .line 107
    sget-object v1, Lax/o4/e$a;->j0:Lax/o4/e$a;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    aput v2, v0, v1
    :try_end_72
    .catch Ljava/lang/NoSuchFieldError; {:try_start_68 .. :try_end_72} :catch_72

    .line 114
    .line 115
    :catch_72
    :try_start_72
    sget-object v0, Lax/o4/h$a;->a:[I

    .line 116
    .line 117
    sget-object v1, Lax/o4/e$a;->e0:Lax/o4/e$a;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    const/4 v2, 0x4

    .line 124
    aput v2, v0, v1
    :try_end_7d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_72 .. :try_end_7d} :catch_7d

    .line 125
    .line 126
    :catch_7d
    :try_start_7d
    sget-object v0, Lax/o4/h$a;->a:[I

    .line 127
    .line 128
    sget-object v1, Lax/o4/e$a;->h0:Lax/o4/e$a;

    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    const/4 v2, 0x5

    .line 135
    aput v2, v0, v1
    :try_end_88
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7d .. :try_end_88} :catch_88

    .line 136
    .line 137
    :catch_88
    :try_start_88
    sget-object v0, Lax/o4/h$a;->a:[I

    .line 138
    .line 139
    sget-object v1, Lax/o4/e$a;->k0:Lax/o4/e$a;

    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    const/4 v2, 0x6

    .line 146
    aput v2, v0, v1
    :try_end_93
    .catch Ljava/lang/NoSuchFieldError; {:try_start_88 .. :try_end_93} :catch_93

    .line 147
    .line 148
    :catch_93
    :try_start_93
    sget-object v0, Lax/o4/h$a;->a:[I

    .line 149
    .line 150
    sget-object v1, Lax/o4/e$a;->f0:Lax/o4/e$a;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    const/4 v2, 0x7

    .line 157
    aput v2, v0, v1
    :try_end_9e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_93 .. :try_end_9e} :catch_9e

    .line 158
    .line 159
    :catch_9e
    :try_start_9e
    sget-object v0, Lax/o4/h$a;->a:[I

    .line 160
    .line 161
    sget-object v1, Lax/o4/e$a;->i0:Lax/o4/e$a;

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    const/16 v2, 0x8

    .line 168
    .line 169
    aput v2, v0, v1
    :try_end_aa
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9e .. :try_end_aa} :catch_aa

    .line 170
    .line 171
    :catch_aa
    return-void
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
