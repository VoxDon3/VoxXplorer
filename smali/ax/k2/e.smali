.class public final Lax/k2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/o2/h$c;


# instance fields
.field private final a:Lax/o2/h$c;

.field private final b:Lax/k2/c;


# direct methods
.method public constructor <init>(Lax/o2/h$c;Lax/k2/c;)V
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
    iput-object p1, p0, Lax/k2/e;->a:Lax/o2/h$c;

    .line 15
    .line 16
    iput-object p2, p0, Lax/k2/e;->b:Lax/k2/c;

    .line 17
    .line 18
    return-void
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


# virtual methods
.method public bridge synthetic a(Lax/o2/h$b;)Lax/o2/h;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/k2/e;->b(Lax/o2/h$b;)Lax/k2/d;

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

.method public b(Lax/o2/h$b;)Lax/k2/d;
    .registers 4

    .line 1
    const-string v0, "configuration"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lax/k2/d;

    .line 7
    .line 8
    iget-object v1, p0, Lax/k2/e;->a:Lax/o2/h$c;

    .line 9
    .line 10
    invoke-interface {v1, p1}, Lax/o2/h$c;->a(Lax/o2/h$b;)Lax/o2/h;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p0, Lax/k2/e;->b:Lax/k2/c;

    .line 15
    .line 16
    invoke-direct {v0, p1, v1}, Lax/k2/d;-><init>(Lax/o2/h;Lax/k2/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
    .line 22
.end method
