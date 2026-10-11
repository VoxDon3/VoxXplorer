.class public Lax/X2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/reflect/Method;

.field private static b:Z


# direct methods
.method public static a(Landroid/os/ParcelFileDescriptor;J)Ljava/lang/Long;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget-boolean v2, Lax/X2/q;->b:Z

    .line 4
    .line 5
    if-nez v2, :cond_38

    .line 6
    .line 7
    :try_start_6
    const-class v2, Landroid/os/ParcelFileDescriptor;

    .line 8
    .line 9
    const-string v3, "seekTo"

    .line 10
    .line 11
    new-array v4, v1, [Ljava/lang/Class;

    .line 12
    .line 13
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    aput-object v5, v4, v0

    .line 16
    .line 17
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sput-object v2, Lax/X2/q;->a:Ljava/lang/reflect/Method;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_19
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_19} :catch_1c
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_19} :catch_1a

    .line 24
    .line 25
    .line 26
    goto :goto_36

    .line 27
    :catch_1a
    move-exception v2

    .line 28
    goto :goto_1d

    .line 29
    :catch_1c
    move-exception v2

    .line 30
    :goto_1d
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 31
    .line 32
    .line 33
    new-instance v2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v3, "API is not available on api level "

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v2}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :goto_36
    sput-boolean v1, Lax/X2/q;->b:Z

    .line 56
    .line 57
    :cond_38
    sget-object v2, Lax/X2/q;->a:Ljava/lang/reflect/Method;

    .line 58
    .line 59
    if-eqz v2, :cond_60

    .line 60
    .line 61
    :try_start_3c
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 62
    .line 63
    .line 64
    move-result-object p1
    :try_end_40
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3c .. :try_end_40} :catch_4f
    .catch Ljava/lang/IllegalAccessException; {:try_start_3c .. :try_end_40} :catch_4f
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3c .. :try_end_40} :catch_4f

    .line 65
    :try_start_40
    new-array p2, v1, [Ljava/lang/Object;

    .line 66
    .line 67
    aput-object p1, p2, v0
    :try_end_44
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_40 .. :try_end_44} :catch_4f
    .catch Ljava/lang/IllegalAccessException; {:try_start_40 .. :try_end_44} :catch_4d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_40 .. :try_end_44} :catch_4b

    .line 68
    .line 69
    :try_start_44
    invoke-virtual {v2, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, Ljava/lang/Long;
    :try_end_4a
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_44 .. :try_end_4a} :catch_4f
    .catch Ljava/lang/IllegalAccessException; {:try_start_44 .. :try_end_4a} :catch_4f
    .catch Ljava/lang/IllegalArgumentException; {:try_start_44 .. :try_end_4a} :catch_4f

    .line 74
    .line 75
    return-object p0

    .line 76
    :catch_4b
    move-exception p0

    .line 77
    goto :goto_50

    .line 78
    :catch_4d
    move-exception p0

    .line 79
    goto :goto_50

    .line 80
    :catch_4f
    move-exception p0

    .line 81
    :goto_50
    const-string p1, "CompatV15"

    .line 82
    .line 83
    const-string p2, "Failed to invoke seekTo via reflection"

    .line 84
    .line 85
    invoke-static {p1, p2, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 86
    .line 87
    .line 88
    const/4 p1, 0x0

    .line 89
    sput-object p1, Lax/X2/q;->a:Ljava/lang/reflect/Method;

    .line 90
    .line 91
    new-instance p1, Ljava/io/IOException;

    .line 92
    .line 93
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_60
    new-instance p0, Ljava/io/IOException;

    .line 98
    .line 99
    const-string p1, "Cannot invoke seekTo via reflection"

    .line 100
    .line 101
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p0
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
.end method
