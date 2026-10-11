.class public Lax/r3/e;
.super Lax/ea/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/r3/e$a;,
        Lax/r3/e$b;
    }
.end annotation


# direct methods
.method public constructor <init>(Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/ea/a;-><init>(Z)V

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
    .line 22
.end method


# virtual methods
.method public a(Lax/ea/c;)Landroid/graphics/Bitmap;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lax/ea/a;->a(Lax/ea/c;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method protected e(Ljava/io/InputStream;Lax/ea/c;)Lax/ea/a$b;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {p1, v2, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lax/ea/c;->l()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_4a

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, Lax/ea/a;->h(Ljava/io/InputStream;Lax/ea/c;)Ljava/io/InputStream;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v2, 0x0

    .line 24
    :try_start_17
    new-instance v3, Lax/y0/a;

    .line 25
    .line 26
    invoke-direct {v3, p1}, Lax/y0/a;-><init>(Ljava/io/InputStream;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Lax/y0/a;->y()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const-string v5, "Orientation"

    .line 34
    .line 35
    invoke-virtual {v3, v5, v1}, Lax/y0/a;->l(Ljava/lang/String;I)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v5, 0x2

    .line 40
    if-ne v3, v5, :cond_2a

    .line 41
    .line 42
    goto :goto_2b

    .line 43
    :cond_2a
    const/4 v1, 0x0

    .line 44
    :goto_2b
    new-instance v3, Lax/r3/e$a;

    .line 45
    .line 46
    invoke-direct {v3, p0, v4, v1}, Lax/r3/e$a;-><init>(Lax/r3/e;IZ)V
    :try_end_30
    .catch Ljava/lang/RuntimeException; {:try_start_17 .. :try_end_30} :catch_36
    .catchall {:try_start_17 .. :try_end_30} :catchall_34

    .line 47
    .line 48
    .line 49
    :goto_30
    invoke-static {p1}, Lax/ka/c;->a(Ljava/io/Closeable;)V

    .line 50
    .line 51
    .line 52
    goto :goto_4f

    .line 53
    :catchall_34
    move-exception p2

    .line 54
    goto :goto_46

    .line 55
    :catch_36
    :try_start_36
    invoke-virtual {p0, p1, p2}, Lax/ea/a;->h(Ljava/io/InputStream;Lax/ea/c;)Ljava/io/InputStream;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-wide/16 v3, -0x1

    .line 60
    .line 61
    invoke-static {p1, v3, v4}, Lax/C3/a;->a(Ljava/io/InputStream;J)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    new-instance v3, Lax/r3/e$a;

    .line 66
    .line 67
    invoke-direct {v3, p0, p2, v2}, Lax/r3/e$a;-><init>(Lax/r3/e;IZ)V
    :try_end_45
    .catchall {:try_start_36 .. :try_end_45} :catchall_34

    .line 68
    .line 69
    .line 70
    goto :goto_30

    .line 71
    :goto_46
    invoke-static {p1}, Lax/ka/c;->a(Ljava/io/Closeable;)V

    .line 72
    .line 73
    .line 74
    throw p2

    .line 75
    :cond_4a
    new-instance v3, Lax/r3/e$a;

    .line 76
    .line 77
    invoke-direct {v3, p0}, Lax/r3/e$a;-><init>(Lax/r3/e;)V

    .line 78
    .line 79
    .line 80
    :goto_4f
    new-instance p1, Lax/r3/e$b;

    .line 81
    .line 82
    new-instance p2, Lax/ca/e;

    .line 83
    .line 84
    iget v1, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 85
    .line 86
    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 87
    .line 88
    iget v2, v3, Lax/ea/a$a;->a:I

    .line 89
    .line 90
    invoke-direct {p2, v1, v0, v2}, Lax/ca/e;-><init>(III)V

    .line 91
    .line 92
    .line 93
    invoke-direct {p1, p0, p2, v3}, Lax/r3/e$b;-><init>(Lax/r3/e;Lax/ca/e;Lax/ea/a$a;)V

    .line 94
    .line 95
    .line 96
    return-object p1
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
.end method
