.class public final synthetic Lax/Z0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$b;


# instance fields
.field public final synthetic a:Lax/Z0/u0;

.field public final synthetic b:Lax/P0/H;


# direct methods
.method public synthetic constructor <init>(Lax/Z0/u0;Lax/P0/H;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/j;->a:Lax/Z0/u0;

    iput-object p2, p0, Lax/Z0/j;->b:Lax/P0/H;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lax/P0/r;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/Z0/j;->a:Lax/Z0/u0;

    iget-object v1, p0, Lax/Z0/j;->b:Lax/P0/H;

    check-cast p1, Lax/Z0/c;

    invoke-static {v0, v1, p1, p2}, Lax/Z0/u0;->S0(Lax/Z0/u0;Lax/P0/H;Lax/Z0/c;Lax/P0/r;)V

    return-void
.end method
