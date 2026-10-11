.class public final Lax/M3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/util/List;Ljava/io/InputStream;Lax/Q3/b;)I
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/M3/f;",
            ">;",
            "Ljava/io/InputStream;",
            "Lax/Q3/b;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, -0x1

    .line 2
    if-nez p1, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_10

    .line 10
    .line 11
    new-instance v1, Lax/X3/l;

    .line 12
    .line 13
    invoke-direct {v1, p1, p2}, Lax/X3/l;-><init>(Ljava/io/InputStream;Lax/Q3/b;)V

    .line 14
    .line 15
    .line 16
    move-object p1, v1

    .line 17
    :cond_10
    const/high16 v1, 0x500000

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->mark(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_19
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_38

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lax/M3/f;

    .line 37
    .line 38
    :try_start_25
    invoke-interface {v1, p1, p2}, Lax/M3/f;->b(Ljava/io/InputStream;Lax/Q3/b;)I

    .line 39
    .line 40
    .line 41
    move-result v1
    :try_end_29
    .catchall {:try_start_25 .. :try_end_29} :catchall_33

    .line 42
    if-eq v1, v0, :cond_2f

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 45
    .line 46
    .line 47
    return v1

    .line 48
    :cond_2f
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 49
    .line 50
    .line 51
    goto :goto_19

    .line 52
    :catchall_33
    move-exception p0

    .line 53
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_38
    return v0
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

.method public static b(Ljava/util/List;Ljava/io/InputStream;Lax/Q3/b;)Lax/M3/f$a;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/M3/f;",
            ">;",
            "Ljava/io/InputStream;",
            "Lax/Q3/b;",
            ")",
            "Lax/M3/f$a;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    if-nez p1, :cond_5

    .line 2
    .line 3
    sget-object p0, Lax/M3/f$a;->j0:Lax/M3/f$a;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_5
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_11

    .line 11
    .line 12
    new-instance v0, Lax/X3/l;

    .line 13
    .line 14
    invoke-direct {v0, p1, p2}, Lax/X3/l;-><init>(Ljava/io/InputStream;Lax/Q3/b;)V

    .line 15
    .line 16
    .line 17
    move-object p1, v0

    .line 18
    :cond_11
    const/high16 p2, 0x500000

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->mark(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :goto_1a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_3b

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    check-cast p2, Lax/M3/f;

    .line 38
    .line 39
    :try_start_26
    invoke-interface {p2, p1}, Lax/M3/f;->c(Ljava/io/InputStream;)Lax/M3/f$a;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    sget-object v0, Lax/M3/f$a;->j0:Lax/M3/f$a;
    :try_end_2c
    .catchall {:try_start_26 .. :try_end_2c} :catchall_36

    .line 44
    .line 45
    if-eq p2, v0, :cond_32

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 48
    .line 49
    .line 50
    return-object p2

    .line 51
    :cond_32
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 52
    .line 53
    .line 54
    goto :goto_1a

    .line 55
    :catchall_36
    move-exception p0

    .line 56
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 57
    .line 58
    .line 59
    throw p0

    .line 60
    :cond_3b
    sget-object p0, Lax/M3/f$a;->j0:Lax/M3/f$a;

    .line 61
    .line 62
    return-object p0
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

.method public static c(Ljava/util/List;Ljava/nio/ByteBuffer;)Lax/M3/f$a;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/M3/f;",
            ">;",
            "Ljava/nio/ByteBuffer;",
            ")",
            "Lax/M3/f$a;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    if-nez p1, :cond_5

    .line 2
    .line 3
    sget-object p0, Lax/M3/f$a;->j0:Lax/M3/f$a;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_5
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1e

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lax/M3/f;

    .line 21
    .line 22
    invoke-interface {v0, p1}, Lax/M3/f;->a(Ljava/nio/ByteBuffer;)Lax/M3/f$a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Lax/M3/f$a;->j0:Lax/M3/f$a;

    .line 27
    .line 28
    if-eq v0, v1, :cond_9

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1e
    sget-object p0, Lax/M3/f$a;->j0:Lax/M3/f$a;

    .line 32
    .line 33
    return-object p0
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method
