.class final Lax/i1/d0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/i1/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field public final a:Lax/P0/v;

.field public final b:Lax/b1/w$b;


# direct methods
.method private constructor <init>(Lax/P0/v;Lax/b1/w$b;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/i1/d0$c;->a:Lax/P0/v;

    .line 4
    iput-object p2, p0, Lax/i1/d0$c;->b:Lax/b1/w$b;

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/v;Lax/b1/w$b;Lax/i1/d0$a;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2}, Lax/i1/d0$c;-><init>(Lax/P0/v;Lax/b1/w$b;)V

    return-void
.end method
