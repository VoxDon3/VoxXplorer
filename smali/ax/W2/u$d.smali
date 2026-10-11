.class synthetic Lax/W2/u$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/W2/u;
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
    .registers 7

    .line 1
    invoke-static {}, Lax/W2/h$b;->values()[Lax/W2/h$b;

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
    sput-object v0, Lax/W2/u$d;->c:[I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    :try_start_a
    sget-object v2, Lax/W2/h$b;->c0:Lax/W2/h$b;

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
    sget-object v2, Lax/W2/u$d;->c:[I

    .line 21
    .line 22
    sget-object v3, Lax/W2/h$b;->d0:Lax/W2/h$b;

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
    sget-object v3, Lax/W2/u$d;->c:[I

    .line 32
    .line 33
    sget-object v4, Lax/W2/h$b;->e0:Lax/W2/h$b;

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
    invoke-static {}, Lax/W2/j$f;->values()[Lax/W2/j$f;

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
    sput-object v3, Lax/W2/u$d;->b:[I

    .line 49
    .line 50
    :try_start_31
    sget-object v4, Lax/W2/j$f;->e0:Lax/W2/j$f;

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
    sget-object v3, Lax/W2/u$d;->b:[I

    .line 59
    .line 60
    sget-object v4, Lax/W2/j$f;->d0:Lax/W2/j$f;

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
    sget-object v3, Lax/W2/u$d;->b:[I

    .line 69
    .line 70
    sget-object v4, Lax/W2/j$f;->c0:Lax/W2/j$f;

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
    const/4 v3, 0x4

    .line 79
    :try_start_4e
    sget-object v4, Lax/W2/u$d;->b:[I

    .line 80
    .line 81
    sget-object v5, Lax/W2/j$f;->g0:Lax/W2/j$f;

    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    aput v3, v4, v5
    :try_end_58
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4e .. :try_end_58} :catch_58

    .line 88
    .line 89
    :catch_58
    const/4 v4, 0x5

    .line 90
    :try_start_59
    sget-object v5, Lax/W2/u$d;->b:[I

    .line 91
    .line 92
    sget-object v6, Lax/W2/j$f;->q:Lax/W2/j$f;

    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    aput v4, v5, v6
    :try_end_63
    .catch Ljava/lang/NoSuchFieldError; {:try_start_59 .. :try_end_63} :catch_63

    .line 99
    .line 100
    :catch_63
    invoke-static {}, Lax/W2/t$a;->values()[Lax/W2/t$a;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    array-length v5, v5

    .line 105
    new-array v5, v5, [I

    .line 106
    .line 107
    sput-object v5, Lax/W2/u$d;->a:[I

    .line 108
    .line 109
    :try_start_6c
    sget-object v6, Lax/W2/t$a;->q:Lax/W2/t$a;

    .line 110
    .line 111
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    aput v1, v5, v6
    :try_end_74
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6c .. :try_end_74} :catch_74

    .line 116
    .line 117
    :catch_74
    :try_start_74
    sget-object v1, Lax/W2/u$d;->a:[I

    .line 118
    .line 119
    sget-object v5, Lax/W2/t$a;->c0:Lax/W2/t$a;

    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    aput v0, v1, v5
    :try_end_7e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_74 .. :try_end_7e} :catch_7e

    .line 126
    .line 127
    :catch_7e
    :try_start_7e
    sget-object v0, Lax/W2/u$d;->a:[I

    .line 128
    .line 129
    sget-object v1, Lax/W2/t$a;->d0:Lax/W2/t$a;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    aput v2, v0, v1
    :try_end_88
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7e .. :try_end_88} :catch_88

    .line 136
    .line 137
    :catch_88
    :try_start_88
    sget-object v0, Lax/W2/u$d;->a:[I

    .line 138
    .line 139
    sget-object v1, Lax/W2/t$a;->e0:Lax/W2/t$a;

    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    aput v3, v0, v1
    :try_end_92
    .catch Ljava/lang/NoSuchFieldError; {:try_start_88 .. :try_end_92} :catch_92

    .line 146
    .line 147
    :catch_92
    :try_start_92
    sget-object v0, Lax/W2/u$d;->a:[I

    .line 148
    .line 149
    sget-object v1, Lax/W2/t$a;->f0:Lax/W2/t$a;

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    aput v4, v0, v1
    :try_end_9c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_92 .. :try_end_9c} :catch_9c

    .line 156
    .line 157
    :catch_9c
    return-void
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
