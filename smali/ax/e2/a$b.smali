.class public final Lax/e2/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/e2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lax/Gb/g;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/e2/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lax/e2/a;
    .registers 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lax/f2/n;->a:Lax/f2/n$b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lax/f2/n$b;->a(Landroid/content/Context;)Lax/f2/n;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_13

    .line 13
    .line 14
    new-instance v0, Lax/e2/a$a;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lax/e2/a$a;-><init>(Lax/f2/n;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_13
    const/4 p1, 0x0

    .line 21
    return-object p1
    .line 22
.end method
