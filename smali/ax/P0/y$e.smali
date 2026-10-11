.class public final Lax/P0/y$e;
.super Lax/P0/y$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final r:Lax/P0/y$e;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/P0/y$d$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P0/y$d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lax/P0/y$d$a;->h()Lax/P0/y$e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lax/P0/y$e;->r:Lax/P0/y$e;

    .line 11
    .line 12
    return-void
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

.method private constructor <init>(Lax/P0/y$d$a;)V
    .registers 3

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lax/P0/y$d;-><init>(Lax/P0/y$d$a;Lax/P0/y$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/y$d$a;Lax/P0/y$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/P0/y$e;-><init>(Lax/P0/y$d$a;)V

    return-void
.end method
