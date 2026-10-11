.class Lax/W2/C$c;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/W2/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field h:Lax/X2/L;

.field final synthetic i:Lax/W2/C;


# direct methods
.method public constructor <init>(Lax/W2/C;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/C$c;->i:Lax/W2/C;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->f0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Lax/X2/L;

    .line 9
    .line 10
    invoke-direct {p1}, Lax/X2/L;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lax/W2/C$c;->h:Lax/X2/L;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private x()J
    .registers 4

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lax/W2/C$c;->i:Lax/W2/C;

    .line 4
    .line 5
    invoke-static {v1}, Lax/W2/C;->y0(Lax/W2/C;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lax/X2/Q;->P1()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2e

    .line 21
    .line 22
    :try_start_15
    iget-object v1, p0, Lax/W2/C$c;->i:Lax/W2/C;

    .line 23
    .line 24
    invoke-static {v1}, Lax/W2/C;->y0(Lax/W2/C;)Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, p0, Lax/W2/C$c;->h:Lax/X2/L;

    .line 33
    .line 34
    invoke-static {v1, v2}, Lax/X2/v;->l(Ljava/lang/String;Lax/X2/L;)Lax/X2/L;

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lax/W2/C$c;->h:Lax/X2/L;

    .line 38
    .line 39
    iget-wide v0, v1, Lax/X2/L;->a:J
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_28} :catch_29

    .line 40
    .line 41
    return-wide v0

    .line 42
    :catch_29
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    return-wide v0

    .line 47
    :cond_2e
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    return-wide v0
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

.method private z()Z
    .registers 11

    .line 1
    iget-object v0, p0, Lax/W2/C$c;->i:Lax/W2/C;

    .line 2
    .line 3
    invoke-static {v0}, Lax/W2/C;->y0(Lax/W2/C;)Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    :cond_e
    :goto_e
    invoke-virtual {p0}, Lax/u3/q;->isCancelled()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v5, 0x0

    .line 20
    if-eqz v4, :cond_16

    .line 21
    .line 22
    return v5

    .line 23
    :cond_16
    const-wide/16 v6, 0x5dc

    .line 24
    .line 25
    :try_start_18
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_1b} :catch_1c

    .line 26
    .line 27
    .line 28
    goto :goto_1d

    .line 29
    :catch_1c
    nop

    .line 30
    :goto_1d
    invoke-direct {p0}, Lax/W2/C$c;->x()J

    .line 31
    .line 32
    .line 33
    move-result-wide v6

    .line 34
    const-wide/16 v8, 0x0

    .line 35
    .line 36
    cmp-long v4, v6, v8

    .line 37
    .line 38
    if-nez v4, :cond_33

    .line 39
    .line 40
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    sub-long/2addr v6, v2

    .line 45
    const-wide/16 v8, 0x2710

    .line 46
    .line 47
    cmp-long v4, v6, v8

    .line 48
    .line 49
    if-lez v4, :cond_e

    .line 50
    .line 51
    return v5

    .line 52
    :cond_33
    cmp-long v4, v0, v6

    .line 53
    .line 54
    if-nez v4, :cond_39

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    return v0

    .line 58
    :cond_39
    iget-object v0, p0, Lax/W2/C$c;->i:Lax/W2/C;

    .line 59
    .line 60
    invoke-virtual {v0}, Lax/W2/j;->w()Lax/W2/v;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0, v6, v7}, Lax/W2/v;->e0(J)V

    .line 65
    .line 66
    .line 67
    move-wide v0, v6

    .line 68
    goto :goto_e
.end method


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/C$c;->w([Ljava/lang/Void;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected o()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/C$c;->i:Lax/W2/C;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/W2/j;->g0()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/C$c;->y(Ljava/lang/Boolean;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Boolean;
    .registers 5

    .line 1
    invoke-direct {p0}, Lax/W2/C$c;->z()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_12

    .line 6
    .line 7
    iget-object v0, p0, Lax/W2/C$c;->i:Lax/W2/C;

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/W2/j;->w()Lax/W2/v;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lax/W2/v$b;->c0:Lax/W2/v$b;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {v0, v1, v2}, Lax/W2/v;->c(Lax/W2/v$b;I)V

    .line 17
    .line 18
    .line 19
    :cond_12
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
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
.end method

.method protected y(Ljava/lang/Boolean;)V
    .registers 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_22

    .line 6
    .line 7
    iget-object p1, p0, Lax/W2/C$c;->i:Lax/W2/C;

    .line 8
    .line 9
    invoke-virtual {p1}, Lax/W2/j;->k0()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lax/W2/C$c;->i:Lax/W2/C;

    .line 13
    .line 14
    new-instance v0, Lax/W2/C$d;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lax/W2/C$d;-><init>(Lax/W2/C;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, Lax/W2/C;->x0(Lax/W2/C;Lax/W2/C$d;)Lax/W2/C$d;

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lax/W2/C$c;->i:Lax/W2/C;

    .line 23
    .line 24
    invoke-static {p1}, Lax/W2/C;->w0(Lax/W2/C;)Lax/W2/C$d;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x0

    .line 29
    new-array v0, v0, [Ljava/lang/Void;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lax/u3/q;->h([Ljava/lang/Object;)Lax/u3/q;

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    iget-object p1, p0, Lax/W2/C$c;->i:Lax/W2/C;

    .line 36
    .line 37
    invoke-virtual {p1}, Lax/W2/j;->o()V

    .line 38
    .line 39
    .line 40
    return-void
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
