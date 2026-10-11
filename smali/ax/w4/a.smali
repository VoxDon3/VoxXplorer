.class public abstract Lax/w4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/w4/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Lax/w4/a;
.end method

.method public abstract b()Lax/w4/a;
.end method

.method public abstract c(Ljava/lang/String;)Lax/w4/a;
.end method

.method public d(Lax/w4/b;)Lax/w4/a;
    .registers 3

    .line 1
    if-nez p1, :cond_8

    .line 2
    .line 3
    const-string p1, "null"

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lax/w4/a;->f(Ljava/lang/String;)Lax/w4/a;

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_8
    invoke-virtual {p1}, Lax/w4/b;->b()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, v0}, Lax/w4/a;->c(Ljava/lang/String;)Lax/w4/a;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lax/w4/b;->a(Lax/w4/a;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lax/w4/a;->b()Lax/w4/a;

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public e(Ljava/lang/String;)Lax/w4/a;
    .registers 2

    .line 1
    if-nez p1, :cond_8

    .line 2
    .line 3
    const-string p1, "null"

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lax/w4/a;->f(Ljava/lang/String;)Lax/w4/a;

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_8
    invoke-static {p1}, Lax/w4/f;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Lax/w4/a;->f(Ljava/lang/String;)Lax/w4/a;

    .line 14
    .line 15
    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public abstract f(Ljava/lang/String;)Lax/w4/a;
.end method
