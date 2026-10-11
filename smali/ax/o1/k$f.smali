.class final Lax/o1/k$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/f1/x$d;
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o1/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "f"
.end annotation


# instance fields
.field final synthetic c0:Lax/o1/k;

.field private final q:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lax/o1/k;Lax/f1/x;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/o1/k$f;->c0:Lax/o1/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lax/S0/d0;->B(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lax/o1/k$f;->q:Landroid/os/Handler;

    .line 11
    .line 12
    invoke-interface {p2, p0, p1}, Lax/f1/x;->k(Lax/f1/x$d;Landroid/os/Handler;)V

    .line 13
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
.end method

.method private b(J)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/o1/k$f;->c0:Lax/o1/k;

    .line 2
    .line 3
    iget-object v1, v0, Lax/o1/k;->x2:Lax/o1/k$f;

    .line 4
    .line 5
    if-ne p0, v1, :cond_28

    .line 6
    .line 7
    invoke-static {v0}, Lax/o1/k;->b2(Lax/o1/k;)Lax/f1/x;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    goto :goto_28

    .line 14
    :cond_d
    const-wide v0, 0x7fffffffffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v2, p1, v0

    .line 20
    .line 21
    if-nez v2, :cond_1c

    .line 22
    .line 23
    iget-object p1, p0, Lax/o1/k$f;->c0:Lax/o1/k;

    .line 24
    .line 25
    invoke-static {p1}, Lax/o1/k;->c2(Lax/o1/k;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    :try_start_1c
    iget-object v0, p0, Lax/o1/k$f;->c0:Lax/o1/k;

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, Lax/o1/k;->J2(J)V
    :try_end_21
    .catch Landroidx/media3/exoplayer/s; {:try_start_1c .. :try_end_21} :catch_22

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_22
    move-exception p1

    .line 36
    iget-object p2, p0, Lax/o1/k$f;->c0:Lax/o1/k;

    .line 37
    .line 38
    invoke-static {p2, p1}, Lax/o1/k;->d2(Lax/o1/k;Landroidx/media3/exoplayer/s;)V

    .line 39
    .line 40
    .line 41
    :cond_28
    :goto_28
    return-void
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


# virtual methods
.method public a(Lax/f1/x;JJ)V
    .registers 6

    .line 1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 p4, 0x1e

    .line 4
    .line 5
    if-ge p1, p4, :cond_19

    .line 6
    .line 7
    iget-object p1, p0, Lax/o1/k$f;->q:Landroid/os/Handler;

    .line 8
    .line 9
    const/16 p4, 0x20

    .line 10
    .line 11
    shr-long p4, p2, p4

    .line 12
    .line 13
    long-to-int p5, p4

    .line 14
    long-to-int p3, p2

    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-static {p1, p2, p5, p3}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p2, p0, Lax/o1/k$f;->q:Landroid/os/Handler;

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    invoke-direct {p0, p2, p3}, Lax/o1/k$f;->b(J)V

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

.method public handleMessage(Landroid/os/Message;)Z
    .registers 4

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_6
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 8
    .line 9
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 10
    .line 11
    invoke-static {v0, p1}, Lax/S0/d0;->C1(II)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-direct {p0, v0, v1}, Lax/o1/k$f;->b(J)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
.end method
