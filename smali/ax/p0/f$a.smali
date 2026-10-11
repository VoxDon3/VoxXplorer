.class public final Lax/p0/f$a;
.super Lax/r0/y$a;
.source "SourceFile"

# interfaces
.implements Lax/r0/T;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/p0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/r0/y$a<",
        "Lax/p0/f;",
        "Lax/p0/f$a;",
        ">;",
        "Lax/r0/T;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 2

    .line 2
    invoke-static {}, Lax/p0/f;->J()Lax/p0/f;

    move-result-object v0

    invoke-direct {p0, v0}, Lax/r0/y$a;-><init>(Lax/r0/y;)V

    return-void
.end method

.method synthetic constructor <init>(Lax/p0/e;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/p0/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public C(Ljava/lang/String;Lax/p0/h;)Lax/p0/f$a;
    .registers 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lax/r0/y$a;->w()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lax/r0/y$a;->c0:Lax/r0/y;

    .line 11
    .line 12
    check-cast v0, Lax/p0/f;

    .line 13
    .line 14
    invoke-static {v0}, Lax/p0/f;->K(Lax/p0/f;)Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p0
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
