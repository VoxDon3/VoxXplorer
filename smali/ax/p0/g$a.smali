.class public final Lax/p0/g$a;
.super Lax/r0/y$a;
.source "SourceFile"

# interfaces
.implements Lax/r0/T;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/p0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/r0/y$a<",
        "Lax/p0/g;",
        "Lax/p0/g$a;",
        ">;",
        "Lax/r0/T;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 2

    .line 2
    invoke-static {}, Lax/p0/g;->J()Lax/p0/g;

    move-result-object v0

    invoke-direct {p0, v0}, Lax/r0/y$a;-><init>(Lax/r0/y;)V

    return-void
.end method

.method synthetic constructor <init>(Lax/p0/e;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/p0/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public C(Ljava/lang/Iterable;)Lax/p0/g$a;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Ljava/lang/String;",
            ">;)",
            "Lax/p0/g$a;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/r0/y$a;->w()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/r0/y$a;->c0:Lax/r0/y;

    .line 5
    .line 6
    check-cast v0, Lax/p0/g;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lax/p0/g;->K(Lax/p0/g;Ljava/lang/Iterable;)V

    .line 9
    .line 10
    .line 11
    return-object p0
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
