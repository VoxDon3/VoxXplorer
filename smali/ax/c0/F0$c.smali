.class Lax/c0/F0$c;
.super Lax/c0/F0$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/c0/F0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# static fields
.field private static e:Ljava/lang/reflect/Field;

.field private static f:Z

.field private static g:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "Landroid/view/WindowInsets;",
            ">;"
        }
    .end annotation
.end field

.field private static h:Z


# instance fields
.field private c:Landroid/view/WindowInsets;

.field private d:Lax/T/b;


# direct methods
.method static constructor <clinit>()V
    .registers 0

    .line 1
    return-void
    .line 2
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

.method constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/c0/F0$f;-><init>()V

    .line 2
    invoke-static {}, Lax/c0/F0$c;->i()Landroid/view/WindowInsets;

    move-result-object v0

    iput-object v0, p0, Lax/c0/F0$c;->c:Landroid/view/WindowInsets;

    return-void
.end method

.method constructor <init>(Lax/c0/F0;)V
    .registers 2

    .line 3
    invoke-direct {p0, p1}, Lax/c0/F0$f;-><init>(Lax/c0/F0;)V

    .line 4
    invoke-virtual {p1}, Lax/c0/F0;->u()Landroid/view/WindowInsets;

    move-result-object p1

    iput-object p1, p0, Lax/c0/F0$c;->c:Landroid/view/WindowInsets;

    return-void
.end method

.method private static i()Landroid/view/WindowInsets;
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-boolean v1, Lax/c0/F0$c;->f:Z

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    const-class v3, Landroid/view/WindowInsets;

    .line 6
    .line 7
    const-string v4, "WindowInsetsCompat"

    .line 8
    .line 9
    if-nez v1, :cond_1b

    .line 10
    .line 11
    :try_start_a
    const-string v1, "CONSUMED"

    .line 12
    .line 13
    invoke-virtual {v3, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sput-object v1, Lax/c0/F0$c;->e:Ljava/lang/reflect/Field;
    :try_end_12
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_a .. :try_end_12} :catch_13

    .line 18
    .line 19
    goto :goto_19

    .line 20
    :catch_13
    move-exception v1

    .line 21
    const-string v5, "Could not retrieve WindowInsets.CONSUMED field"

    .line 22
    .line 23
    invoke-static {v4, v5, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 24
    .line 25
    .line 26
    :goto_19
    sput-boolean v2, Lax/c0/F0$c;->f:Z

    .line 27
    .line 28
    :cond_1b
    sget-object v1, Lax/c0/F0$c;->e:Ljava/lang/reflect/Field;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    if-eqz v1, :cond_34

    .line 32
    .line 33
    :try_start_20
    invoke-virtual {v1, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Landroid/view/WindowInsets;

    .line 38
    .line 39
    if-eqz v1, :cond_34

    .line 40
    .line 41
    new-instance v6, Landroid/view/WindowInsets;

    .line 42
    .line 43
    invoke-direct {v6, v1}, Landroid/view/WindowInsets;-><init>(Landroid/view/WindowInsets;)V
    :try_end_2d
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_20 .. :try_end_2d} :catch_2e

    .line 44
    .line 45
    .line 46
    return-object v6

    .line 47
    :catch_2e
    move-exception v1

    .line 48
    const-string v6, "Could not get value from WindowInsets.CONSUMED field"

    .line 49
    .line 50
    invoke-static {v4, v6, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 51
    .line 52
    .line 53
    :cond_34
    sget-boolean v1, Lax/c0/F0$c;->h:Z

    .line 54
    .line 55
    if-nez v1, :cond_4d

    .line 56
    .line 57
    :try_start_38
    new-array v1, v2, [Ljava/lang/Class;

    .line 58
    .line 59
    const-class v6, Landroid/graphics/Rect;

    .line 60
    .line 61
    aput-object v6, v1, v0

    .line 62
    .line 63
    invoke-virtual {v3, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    sput-object v1, Lax/c0/F0$c;->g:Ljava/lang/reflect/Constructor;
    :try_end_44
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_38 .. :try_end_44} :catch_45

    .line 68
    .line 69
    goto :goto_4b

    .line 70
    :catch_45
    move-exception v1

    .line 71
    const-string v3, "Could not retrieve WindowInsets(Rect) constructor"

    .line 72
    .line 73
    invoke-static {v4, v3, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 74
    .line 75
    .line 76
    :goto_4b
    sput-boolean v2, Lax/c0/F0$c;->h:Z

    .line 77
    .line 78
    :cond_4d
    sget-object v1, Lax/c0/F0$c;->g:Ljava/lang/reflect/Constructor;

    .line 79
    .line 80
    if-eqz v1, :cond_67

    .line 81
    .line 82
    :try_start_51
    new-instance v3, Landroid/graphics/Rect;

    .line 83
    .line 84
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 85
    .line 86
    .line 87
    new-array v2, v2, [Ljava/lang/Object;

    .line 88
    .line 89
    aput-object v3, v2, v0

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Landroid/view/WindowInsets;
    :try_end_60
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_51 .. :try_end_60} :catch_61

    .line 96
    .line 97
    return-object v0

    .line 98
    :catch_61
    move-exception v0

    .line 99
    const-string v1, "Could not invoke WindowInsets(Rect) constructor"

    .line 100
    .line 101
    invoke-static {v4, v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 102
    .line 103
    .line 104
    :cond_67
    return-object v5
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


# virtual methods
.method b()Lax/c0/F0;
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/c0/F0$f;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/c0/F0$c;->c:Landroid/view/WindowInsets;

    .line 5
    .line 6
    invoke-static {v0}, Lax/c0/F0;->v(Landroid/view/WindowInsets;)Lax/c0/F0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lax/c0/F0$f;->b:[Lax/T/b;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lax/c0/F0;->q([Lax/T/b;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lax/c0/F0$c;->d:Lax/T/b;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lax/c0/F0;->t(Lax/T/b;)V

    .line 18
    .line 19
    .line 20
    return-object v0
    .line 21
.end method

.method e(Lax/T/b;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/c0/F0$c;->d:Lax/T/b;

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

.method g(Lax/T/b;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/c0/F0$c;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    if-eqz v0, :cond_12

    .line 4
    .line 5
    iget v1, p1, Lax/T/b;->a:I

    .line 6
    .line 7
    iget v2, p1, Lax/T/b;->b:I

    .line 8
    .line 9
    iget v3, p1, Lax/T/b;->c:I

    .line 10
    .line 11
    iget p1, p1, Lax/T/b;->d:I

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lax/c0/F0$c;->c:Landroid/view/WindowInsets;

    .line 18
    .line 19
    :cond_12
    return-void
    .line 20
    .line 21
    .line 22
.end method
