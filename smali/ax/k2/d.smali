.class public final Lax/k2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/o2/h;
.implements Lax/k2/g;
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/k2/d$a;,
        Lax/k2/d$c;,
        Lax/k2/d$b;
    }
.end annotation


# instance fields
.field public final c0:Lax/k2/c;

.field private final d0:Lax/k2/d$a;

.field private final q:Lax/o2/h;


# direct methods
.method public constructor <init>(Lax/o2/h;Lax/k2/c;)V
    .registers 4

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "autoCloser"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lax/k2/d;->q:Lax/o2/h;

    .line 15
    .line 16
    iput-object p2, p0, Lax/k2/d;->c0:Lax/k2/c;

    .line 17
    .line 18
    invoke-virtual {p0}, Lax/k2/d;->a()Lax/o2/h;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p2, p1}, Lax/k2/c;->k(Lax/o2/h;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, Lax/k2/d$a;

    .line 26
    .line 27
    invoke-direct {p1, p2}, Lax/k2/d$a;-><init>(Lax/k2/c;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lax/k2/d;->d0:Lax/k2/d$a;

    .line 31
    .line 32
    return-void
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


# virtual methods
.method public a()Lax/o2/h;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/k2/d;->q:Lax/o2/h;

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

.method public close()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/k2/d;->d0:Lax/k2/d$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/k2/d$a;->close()V

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

.method public g0()Lax/o2/g;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/k2/d;->d0:Lax/k2/d$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/k2/d$a;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/k2/d;->d0:Lax/k2/d$a;

    .line 7
    .line 8
    return-object v0
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

.method public getDatabaseName()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/k2/d;->q:Lax/o2/h;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/o2/h;->getDatabaseName()Ljava/lang/String;

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

.method public setWriteAheadLoggingEnabled(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/k2/d;->q:Lax/o2/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/o2/h;->setWriteAheadLoggingEnabled(Z)V

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
